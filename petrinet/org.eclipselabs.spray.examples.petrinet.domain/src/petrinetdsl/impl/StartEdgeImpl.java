/**
 */
package PetrinetDSL.impl;

import PetrinetDSL.PetrinetDSLPackage;
import PetrinetDSL.StartEdge;
import PetrinetDSL.StartElement;
import PetrinetDSL.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetrinetDSL.impl.StartEdgeImpl#getFromStart <em>From Start</em>}</li>
 *   <li>{@link PetrinetDSL.impl.StartEdgeImpl#getToTransition <em>To Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartEdgeImpl extends EdgeImpl implements StartEdge {
	/**
	 * The cached value of the '{@link #getFromStart() <em>From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStart()
	 * @generated
	 * @ordered
	 */
	protected StartElement fromStart;

	/**
	 * The cached value of the '{@link #getToTransition() <em>To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition toTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetDSLPackage.Literals.START_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartElement getFromStart() {
		if (fromStart != null && fromStart.eIsProxy()) {
			InternalEObject oldFromStart = (InternalEObject)fromStart;
			fromStart = (StartElement)eResolveProxy(oldFromStart);
			if (fromStart != oldFromStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.START_EDGE__FROM_START, oldFromStart, fromStart));
			}
		}
		return fromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartElement basicGetFromStart() {
		return fromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromStart(StartElement newFromStart) {
		StartElement oldFromStart = fromStart;
		fromStart = newFromStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.START_EDGE__FROM_START, oldFromStart, fromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getToTransition() {
		if (toTransition != null && toTransition.eIsProxy()) {
			InternalEObject oldToTransition = (InternalEObject)toTransition;
			toTransition = (Transition)eResolveProxy(oldToTransition);
			if (toTransition != oldToTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.START_EDGE__TO_TRANSITION, oldToTransition, toTransition));
			}
		}
		return toTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetToTransition() {
		return toTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTransition(Transition newToTransition) {
		Transition oldToTransition = toTransition;
		toTransition = newToTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.START_EDGE__TO_TRANSITION, oldToTransition, toTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetDSLPackage.START_EDGE__FROM_START:
				if (resolve) return getFromStart();
				return basicGetFromStart();
			case PetrinetDSLPackage.START_EDGE__TO_TRANSITION:
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
			case PetrinetDSLPackage.START_EDGE__FROM_START:
				setFromStart((StartElement)newValue);
				return;
			case PetrinetDSLPackage.START_EDGE__TO_TRANSITION:
				setToTransition((Transition)newValue);
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
			case PetrinetDSLPackage.START_EDGE__FROM_START:
				setFromStart((StartElement)null);
				return;
			case PetrinetDSLPackage.START_EDGE__TO_TRANSITION:
				setToTransition((Transition)null);
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
			case PetrinetDSLPackage.START_EDGE__FROM_START:
				return fromStart != null;
			case PetrinetDSLPackage.START_EDGE__TO_TRANSITION:
				return toTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //StartEdgeImpl
