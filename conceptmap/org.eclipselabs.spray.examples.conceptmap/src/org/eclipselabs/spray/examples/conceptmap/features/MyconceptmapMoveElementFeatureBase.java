/*************************************************************************************
 *
 * Generated on Wed May 22 09:12:14 CEST 2013 by Spray MoveFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.conceptmap.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.spray.examples.conceptmap.shapes.ElementShapeShape;
import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayDiagramLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayFitLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayTopLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;

/*
 * update 22.05.2013: 
 * 		update all connections
 * 		lines 93-96
 */
public abstract class MyconceptmapMoveElementFeatureBase extends DefaultMoveShapeFeature {

    SprayLayoutManager layoutManager;

    public MyconceptmapMoveElementFeatureBase(final IFeatureProvider fp) {
        super(fp);
        layoutManager = new ElementShapeShape(fp).getShapeLayout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canMoveShape(IMoveShapeContext context) {
        Shape sourceShape = (Shape) context.getPictogramElement();
        ContainerShape targetContainer = context.getTargetContainer();
        Object source = getBusinessObjectForPictogramElement(sourceShape);
        Object target = getBusinessObjectForPictogramElement(targetContainer);
        // check whether it can move in the same container
        if (sourceShape.eContainer() == targetContainer) {
            if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFixedLayoutManager)) {
                return true;
            }
            if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayTopLayoutManager)) {
                return true;
            }
            if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayDiagramLayoutManager)) {
                return true;
            }
            if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFitLayoutManager)) {
                return true;
            }
            return false;
        }
        return super.canMoveShape(context);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveShape(IMoveShapeContext context) {
        PictogramElement sourceShape = context.getPictogramElement();
        ContainerShape targetContainer = context.getTargetContainer();
        ContainerShape sourceContainer = context.getSourceContainer();
        Object sourceParent = getBusinessObjectForPictogramElement(sourceContainer);
        Object source = getBusinessObjectForPictogramElement(sourceShape);
        Object target = getBusinessObjectForPictogramElement(targetContainer);
        if (sourceShape.eContainer() == targetContainer) {
            super.moveShape(context);
            final Diagram diagram = this.getDiagram();
            ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(diagram);
            // TODO: Fixme: Need to layout twice, probably because this is a fit within a fit layout
            //  Only neccesary when contents is moved to xcoordinates < 0
            mgr.layout();
            mgr.layout();
            
            /* ************* update all connections ********************************/
            for(Connection connection : diagram.getConnections()) {
            	MyconceptmapAddArrowConnectionFeatureBase.updateConnections(connection.getStart(), connection.getEnd());
            }

            return;
        }
    }
}
