/*************************************************************************************
 *
 * Generated on Sat May 11 14:04:02 CEST 2013 by Spray AddShapeFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.mindmap.features;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
import org.eclipselabs.spray.runtime.graphiti.shape.ISprayShape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.examples.mindmap.shapes.StartElementShapeShape;
import org.eclipselabs.spray.examples.mindmap.styles.MindmapDefaultStyle;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

import MindmapDSL.StartElement;
import MindmapDSL.StartElement;

@SuppressWarnings("unused")
public abstract class MymindmapAddStartElementFeatureBase extends AbstractAddFeature {
    protected final static String typeOrAliasName = "StartElement";
    protected Diagram             targetDiagram   = null;

    public MymindmapAddStartElementFeatureBase(final IFeatureProvider fp) {
        super(fp);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canAdd(final IAddContext context) {
    	// get all elements
    	Diagram diagram = getDiagram();
    	EList<Shape> diagramElements = diagram.getChildren();
    	
    	Iterator<Shape> iterator = diagramElements.iterator();
    	while (iterator.hasNext()) {
    		// get current element
    		Shape elementShape = iterator.next();
    		EObject element = getBusinessObjectForPictogramElement(elementShape);
    		// check if a instance of StartElement already exists
    		if (element instanceof StartElement) {
    			return false;
    		}
    	}
          	
    	final EObject newObject = (EObject) context.getNewObject();
    	if (newObject instanceof StartElement) {
          // check if user wants to add to a diagram
          if (context.getTargetContainer() instanceof Diagram) {
              return true;
          } else if (context.getTargetContainer() instanceof ContainerShape) {
              // OLD STUFF
              final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
              // NEW stuff
          } else {
        	  return false;
          }
    	}
    	return true;    	
    	
    	
// old Code from canAdd()    	   	
    	
//    	final EObject newObject = (EObject) context.getNewObject();
//        if (newObject instanceof StartElement) {
//            // check if user wants to add to a diagram
//            if (context.getTargetContainer() instanceof Diagram) {
//                return true;
//            } else if (context.getTargetContainer() instanceof ContainerShape) {
//                // OLD STUFF
//                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
//                // NEW stuff
//            }
//        }
//        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictogramElement add(final IAddContext context) {
    	final StartElement addedModelElement = (StartElement) context.getNewObject();
        // NEW stuff
        Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        final ContainerShape targetContainer = context.getTargetContainer();
        final ISprayStyle style = new MindmapDefaultStyle();
        final ISprayShape shape = new StartElementShapeShape(getFeatureProvider());
        final ContainerShape conShape = shape.getShape(targetContainer, style);
        final IGaService gaService = Graphiti.getGaService();
        gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
        link(conShape, addedModelElement);
        linkShapes(conShape, addedModelElement);

        setDoneChanges(true);
        updatePictogramElement(conShape);
        layout(conShape);

        return conShape;
    }

    protected void linkShapes(ContainerShape conShape, StartElement addedModelElement) {
        link(conShape, addedModelElement);
        for (Shape childShape : conShape.getChildren()) {
            if (childShape instanceof ContainerShape) {
                linkShapes((ContainerShape) childShape, addedModelElement);
            } else {
                link(childShape, addedModelElement);
            }
        }
    }
}
