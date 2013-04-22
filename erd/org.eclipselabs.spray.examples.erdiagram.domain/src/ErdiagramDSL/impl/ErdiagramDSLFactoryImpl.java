/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErdiagramDSLFactoryImpl extends EFactoryImpl implements ErdiagramDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErdiagramDSLFactory init() {
		try {
			ErdiagramDSLFactory theErdiagramDSLFactory = (ErdiagramDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Erdiagram"); 
			if (theErdiagramDSLFactory != null) {
				return theErdiagramDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErdiagramDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ErdiagramDSLPackage.ERDIAGRAM: return createErdiagram();
			case ErdiagramDSLPackage.ELEMENT: return createElement();
			case ErdiagramDSLPackage.ENTITY: return createEntity();
			case ErdiagramDSLPackage.RELATIONSHIP: return createRelationship();
			case ErdiagramDSLPackage.ATTRIBUTE: return createAttribute();
			case ErdiagramDSLPackage.ER_CONNECTION: return createERConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Erdiagram createErdiagram() {
		ErdiagramImpl erdiagram = new ErdiagramImpl();
		return erdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERConnection createERConnection() {
		ERConnectionImpl erConnection = new ERConnectionImpl();
		return erConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLPackage getErdiagramDSLPackage() {
		return (ErdiagramDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErdiagramDSLPackage getPackage() {
		return ErdiagramDSLPackage.eINSTANCE;
	}

} //ErdiagramDSLFactoryImpl
