/*************************************************************************************
 *
 * Generated on Wed May 22 17:38:21 CEST 2013 by Spray AddConnectionFromDslFeature.xtend
 * 
 * This file is an extension point: copy to "src" folder to manually add code to this
 * extension point.
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.conceptmap.features;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.MmFactory;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.PropertyContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.impl.MmFactoryImpl;
import org.eclipse.graphiti.mm.impl.PropertyImpl;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.spray.examples.conceptmap.shapes.ArrowConnectionShapeConnection;
import org.eclipselabs.spray.examples.conceptmap.styles.ConceptmapDefaultStyle;
import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

import ConceptMapDSL.ArrowConnection;
import ConceptMapDSL.ConceptMapDSLPackage;

public class MyconceptmapAddArrowConnectionFeature extends MyconceptmapAddArrowConnectionFeatureBase {
	private static final String MULTI_RENDERING_KEY = "spray.multirendering.key";
	
    public MyconceptmapAddArrowConnectionFeature(IFeatureProvider fp) {
        super(fp);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        // TODO: Domain object
        ArrowConnection addedDomainObject = (ArrowConnection) context.getNewObject();
        ISprayStyle style = new ConceptmapDefaultStyle();
        ISprayConnection connection = new ArrowConnectionShapeConnection(getFeatureProvider());
        Connection result = (Connection) connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());

        /* ************** update the connections between start and endanchor ********************************/
        updateConnections(addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
        
        // create link and wire it
        peService.setPropertyValue(result, PROPERTY_MODEL_TYPE, ConceptMapDSLPackage.Literals.ARROW_CONNECTION.getName());
        link(result, addedDomainObject);
        for (ConnectionDecorator conDecorator : result.getConnectionDecorators()) {
            link(conDecorator, addedDomainObject);
        }

        setDoneChanges(true);
        updatePictogramElement(result);

        return result;
    }
    
    /**
     * This function updates the rendering of the connections with these start and endpoints
     *  so that every connection should be visible.
     */
    public static void updateConnections(Anchor startAnchor, Anchor endAnchor) {
    	/*
    	 * There are several steps to do:
    	 * 	1. compute the center between both anchors
    	 * 	2. compute the vector of the connection between start- and endanchor
    	 * 	3. compute the rthogonal vector to the connection.
    	 * 	4. compute all connections between start- and endanchor
    	 * 	5. add the bendpoints alongside the orthogonal vector starting from the center(1.).
    	 * 		therefore use the normalized orthogonal vector and set the bendpoint ~10px away from the center.
    	 * 		in the list of connections (4.), move the even connections along the orthogonal vector, the odd the opposite direction. 
    	 */
    	
    	// the connections will have a distance of ~movement_factor pixels.
    	final int MOVEMENT_FACTOR = 10;
    	
    	/* ***************** 1 *****************************************/
    	// we need to include width and height to the computation since we get x and y from the top left corner of the element, which is connected to this anchor
    	int startAnchorX = startAnchor.getParent().getGraphicsAlgorithm().getX() + startAnchor.getParent().getGraphicsAlgorithm().getWidth() / 2;
    	int startAnchorY = startAnchor.getParent().getGraphicsAlgorithm().getY() + startAnchor.getParent().getGraphicsAlgorithm().getHeight() / 2;
    	int endAnchorX = endAnchor.getParent().getGraphicsAlgorithm().getX() + endAnchor.getParent().getGraphicsAlgorithm().getWidth() / 2;
    	int endAnchorY = endAnchor.getParent().getGraphicsAlgorithm().getY() + endAnchor.getParent().getGraphicsAlgorithm().getHeight() / 2;
    	
    	int centerX = (startAnchorX + endAnchorX) / 2;
    	int centerY = (startAnchorY + endAnchorY) / 2;
    	
    	/* ***************** 2 *****************************************/
    	// for the vector we need the steps we have to go from startanchor until we arrive at endanchor
    	int vectorX = startAnchorX - endAnchorX;
    	int vectorY = startAnchorY - endAnchorY;
    	
    	/* ***************** 3 *****************************************/
    	// to get the orthogonal vector we need to switch x and y and negate one of them.
    	int orthogonalVectorX = -vectorY;
    	int orthogonalVectorY = vectorX;
    	
    	
    	/* ***************** 4 *****************************************/
    	EList<Connection> equalConnections = getEqualConnections(startAnchor, endAnchor);
    	
    	/* ***************** 5 *****************************************/
    	// move the connections between start- and endanchor if there is more than 1.
    	// we need to clear the bendpoints first to prevent errors when deleting connections.
    	// if there are more than 2 connections we need to move the 3. and 4. MOVEMENT_FACTOR * 2 pixles, the 5. and 6. MOVEMENT_FACTOR * 3 pixles and so on.
    	//		therefore for the connection with index i we use the formula: MOVEMENT_FACTOR * ((i/2) + 1)
    	if(equalConnections.size() > 1) {
    		for(int i = 0; i < equalConnections.size(); i++) {
    			if(!(equalConnections.get(i) instanceof FreeFormConnection)) {
    				//we can not add bendpoints to manhattan-connections
    				continue;
    			}
    			FreeFormConnection connection = (FreeFormConnection) equalConnections.get(i);
    			
    			// delete our bendpoint if the connection has this property.
    			Property theProperty;
    			for(int j = 0; j < connection.getProperties().size(); j++) {
    				Property p = connection.getProperties().get(j);
    				if(p.getKey().equals(MULTI_RENDERING_KEY)) {
    					connection.getProperties().remove(p);
    					//remove from index 0, since our bendpoint was moved there
    					connection.getBendpoints().remove(0);
    					break;
    				}
    			}
    			
    			int orthx, orthy, move;
    			if(i % 2 == 0) {
    				orthx = orthogonalVectorX;
    				orthy = orthogonalVectorY;
    			} else {
    				orthx = -orthogonalVectorX;
    				orthy = -orthogonalVectorY;
    			}
    			move = MOVEMENT_FACTOR * ((i/2) + 1);
    			Point bendpoint = getBendPoint(centerX, centerY, orthx, orthy, move);
    			
    			connection.getBendpoints().add(bendpoint);
    			//move to index 0 to be able to delete it afterwards.
    			connection.getBendpoints().move(0, bendpoint);
    			
    			Property bendProperty = MmFactoryImpl.eINSTANCE.createProperty();
    			bendProperty.setKey(MULTI_RENDERING_KEY);
    			bendProperty.setValue("true");
    			
    			connection.getProperties().add(bendProperty);
    		}
    	}	
    }
    
    
    /**
     * Computes the connections which have startAnchor at one side and endAnchor at the other.
     */
    private static EList<Connection> getEqualConnections(Anchor startAnchor, Anchor endAnchor) {
    	EList<Connection> equalConnections = new BasicEList<Connection>();
    	
    	for(Connection sout : startAnchor.getOutgoingConnections()) {
    		for(Connection ein : endAnchor.getIncomingConnections()) {
    			if(!sout.equals(ein) && 
    					sout.getStart().equals(ein.getStart()) && 
    					sout.getEnd().equals(ein.getEnd())) {
    				if(!equalConnections.contains(sout)) equalConnections.add(sout);
    				if(!equalConnections.contains(ein)) equalConnections.add(ein);
    			}
    		}
    		for(Connection eout : endAnchor.getOutgoingConnections()) {
    			if(!sout.equals(eout) && 
    					sout.getStart().equals(eout.getEnd()) && 
    					sout.getEnd().equals(eout.getStart())) {
    				if(!equalConnections.contains(sout)) equalConnections.add(sout);
    				if(!equalConnections.contains(eout)) equalConnections.add(eout);
    			}
    		}
    	}
    	
    	for(Connection sin : startAnchor.getIncomingConnections()) {
    		for(Connection eout : endAnchor.getOutgoingConnections()) {
    			if(!eout.equals(sin) && 
    					eout.getStart().equals(sin.getStart()) && 
    					eout.getEnd().equals(sin.getEnd())) {
    				if(!equalConnections.contains(eout)) equalConnections.add(eout);
    				if(!equalConnections.contains(sin)) equalConnections.add(sin);
    			}
    		}
    		for(Connection ein : endAnchor.getIncomingConnections()) {
    			if(!sin.equals(ein) && 
    					sin.getStart().equals(ein.getEnd()) && 
    					sin.getEnd().equals(ein.getStart())) {
    				if(!equalConnections.contains(sin)) equalConnections.add(sin);
    				if(!equalConnections.contains(ein)) equalConnections.add(ein);
    			}
    		}
    	}
    	
    	return equalConnections;    	
    }
    
    private static Point getBendPoint(int centerX, int centerY, int orthogonalVectorX, int orthogonalVectorY, int movementFactor) {
    	double normalVectorMagnitude = Math.sqrt(orthogonalVectorX*orthogonalVectorX + orthogonalVectorY*orthogonalVectorY);
    	
    	// normalized vector = vector * (1.0 / |vector|)
    	// bendpoint = center of connection + movementFactor pixels in direction of the normalized vector)
    	int bendx = (int) (centerX + ( (double) orthogonalVectorX * (1.0 / normalVectorMagnitude) * movementFactor));
    	int bendy = (int) (centerY + ( (double) orthogonalVectorY * (1.0 / normalVectorMagnitude) * movementFactor));
    	
    	return Graphiti.getGaCreateService().createPoint(bendx, bendy);
    }
}
