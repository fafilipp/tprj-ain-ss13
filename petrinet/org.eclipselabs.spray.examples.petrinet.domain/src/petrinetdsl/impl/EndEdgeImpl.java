/**
 */
package PetrinetDSL.impl;

import PetrinetDSL.EndEdge;
import PetrinetDSL.EndElement;
import PetrinetDSL.PetrinetDSLPackage;
import PetrinetDSL.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetrinetDSL.impl.EndEdgeImpl#getFromTransition <em>From Transition</em>}</li>
 *   <li>{@link PetrinetDSL.impl.EndEdgeImpl#getToEnd <em>To End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndEdgeImpl extends EdgeImpl implements EndEdge {
	/**
	 * The cached value of the '{@link #getFromTransition() <em>From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition fromTransition;

	/**
	 * The cached value of the '{@link #getToEnd() <em>To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEnd()
	 * @generated
	 * @ordered
	 */
	protected EndElement toEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetDSLPackage.Literals.END_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFromTransition() {
		if (fromTransition != null && fromTransition.eIsProxy()) {
			InternalEObject oldFromTransition = (InternalEObject)fromTransition;
			fromTransition = (Transition)eResolveProxy(oldFromTransition);
			if (fromTransition != oldFromTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.END_EDGE__FROM_TRANSITION, oldFromTransition, fromTransition));
			}
		}
		return fromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFromTransition() {
		return fromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTransition(Transition newFromTransition) {
		Transition oldFromTransition = fromTransition;
		fromTransition = newFromTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.END_EDGE__FROM_TRANSITION, oldFromTransition, fromTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndElement getToEnd() {
		if (toEnd != null && toEnd.eIsProxy()) {
			InternalEObject oldToEnd = (InternalEObject)toEnd;
			toEnd = (EndElement)eResolveProxy(oldToEnd);
			if (toEnd != oldToEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.END_EDGE__TO_END, oldToEnd, toEnd));
			}
		}
		return toEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndElement basicGetToEnd() {
		return toEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEnd(EndElement newToEnd) {
		EndElement oldToEnd = toEnd;
		toEnd = newToEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.END_EDGE__TO_END, oldToEnd, toEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetDSLPackage.END_EDGE__FROM_TRANSITION:
				if (resolve) return getFromTransition();
				return basicGetFromTransition();
			case PetrinetDSLPackage.END_EDGE__TO_END:
				if (resolve) return getToEnd();
				return basicGetToEnd();
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
			case PetrinetDSLPackage.END_EDGE__FROM_TRANSITION:
				setFromTransition((Transition)newValue);
				return;
			case PetrinetDSLPackage.END_EDGE__TO_END:
				setToEnd((EndElement)newValue);
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
			case PetrinetDSLPackage.END_EDGE__FROM_TRANSITION:
				setFromTransition((Transition)null);
				return;
			case PetrinetDSLPackage.END_EDGE__TO_END:
				setToEnd((EndElement)null);
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
			case PetrinetDSLPackage.END_EDGE__FROM_TRANSITION:
				return fromTransition != null;
			case PetrinetDSLPackage.END_EDGE__TO_END:
				return toEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //EndEdgeImpl
