/**
 */
package PetrinetDSL.impl;

import PetrinetDSL.Node;
import PetrinetDSL.PTEdge;
import PetrinetDSL.PetrinetDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetrinetDSL.impl.PTEdgeImpl#getFromPlace <em>From Place</em>}</li>
 *   <li>{@link PetrinetDSL.impl.PTEdgeImpl#getToTransition <em>To Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTEdgeImpl extends EdgeImpl implements PTEdge {
	/**
	 * The cached value of the '{@link #getFromPlace() <em>From Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPlace()
	 * @generated
	 * @ordered
	 */
	protected Node fromPlace;

	/**
	 * The cached value of the '{@link #getToTransition() <em>To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransition()
	 * @generated
	 * @ordered
	 */
	protected Node toTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetDSLPackage.Literals.PT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFromPlace() {
		if (fromPlace != null && fromPlace.eIsProxy()) {
			InternalEObject oldFromPlace = (InternalEObject)fromPlace;
			fromPlace = (Node)eResolveProxy(oldFromPlace);
			if (fromPlace != oldFromPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.PT_EDGE__FROM_PLACE, oldFromPlace, fromPlace));
			}
		}
		return fromPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFromPlace() {
		return fromPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPlace(Node newFromPlace) {
		Node oldFromPlace = fromPlace;
		fromPlace = newFromPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.PT_EDGE__FROM_PLACE, oldFromPlace, fromPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getToTransition() {
		if (toTransition != null && toTransition.eIsProxy()) {
			InternalEObject oldToTransition = (InternalEObject)toTransition;
			toTransition = (Node)eResolveProxy(oldToTransition);
			if (toTransition != oldToTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.PT_EDGE__TO_TRANSITION, oldToTransition, toTransition));
			}
		}
		return toTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetToTransition() {
		return toTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTransition(Node newToTransition) {
		Node oldToTransition = toTransition;
		toTransition = newToTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.PT_EDGE__TO_TRANSITION, oldToTransition, toTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetDSLPackage.PT_EDGE__FROM_PLACE:
				if (resolve) return getFromPlace();
				return basicGetFromPlace();
			case PetrinetDSLPackage.PT_EDGE__TO_TRANSITION:
				if (resolve) return getToTransition();
				return basicGetToTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetDSLPackage.PT_EDGE__FROM_PLACE:
				setFromPlace((Node)newValue);
				return;
			case PetrinetDSLPackage.PT_EDGE__TO_TRANSITION:
				setToTransition((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetDSLPackage.PT_EDGE__FROM_PLACE:
				setFromPlace((Node)null);
				return;
			case PetrinetDSLPackage.PT_EDGE__TO_TRANSITION:
				setToTransition((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetDSLPackage.PT_EDGE__FROM_PLACE:
				return fromPlace != null;
			case PetrinetDSLPackage.PT_EDGE__TO_TRANSITION:
				return toTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //PTEdgeImpl
