/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.Attribute;
import ErdiagramDSL.ERConnection;
import ErdiagramDSL.Element;
import ErdiagramDSL.Erdiagram;
import ErdiagramDSL.ErdiagramDSLPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erdiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ErdiagramDSL.impl.ErdiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.ErdiagramImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErdiagramImpl extends EObjectImpl implements Erdiagram {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ERConnection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErdiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramDSLPackage.Literals.ERDIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<ERConnection>(ERConnection.class, this, ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS:
				return getElements();
			case ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS:
				return getConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends ERConnection>)newValue);
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
			case ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS:
				getElements().clear();
				return;
			case ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS:
				getConnections().clear();
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
			case ErdiagramDSLPackage.ERDIAGRAM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ErdiagramDSLPackage.ERDIAGRAM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErdiagramImpl
