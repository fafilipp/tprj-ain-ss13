/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.Attribute;
import ErdiagramDSL.ERConnection;
import ErdiagramDSL.Element;
import ErdiagramDSL.Entity;
import ErdiagramDSL.Erdiagram;
import ErdiagramDSL.ErdiagramDSLFactory;
import ErdiagramDSL.ErdiagramDSLPackage;
import ErdiagramDSL.Relationship;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErdiagramDSLPackageImpl extends EPackageImpl implements ErdiagramDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erdiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erConnectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ErdiagramDSL.ErdiagramDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErdiagramDSLPackageImpl() {
		super(eNS_URI, ErdiagramDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ErdiagramDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErdiagramDSLPackage init() {
		if (isInited) return (ErdiagramDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ErdiagramDSLPackage.eNS_URI);

		// Obtain or create and register package
		ErdiagramDSLPackageImpl theErdiagramDSLPackage = (ErdiagramDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErdiagramDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErdiagramDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theErdiagramDSLPackage.createPackageContents();

		// Initialize created meta-data
		theErdiagramDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErdiagramDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErdiagramDSLPackage.eNS_URI, theErdiagramDSLPackage);
		return theErdiagramDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErdiagram() {
		return erdiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErdiagram_Elements() {
		return (EReference)erdiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErdiagram_Connections() {
		return (EReference)erdiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Description() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Parent() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERConnection() {
		return erConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERConnection_FromEntity() {
		return (EReference)erConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERConnection_ToRelationship() {
		return (EReference)erConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERConnection_Value() {
		return (EAttribute)erConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLFactory getErdiagramDSLFactory() {
		return (ErdiagramDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		erdiagramEClass = createEClass(ERDIAGRAM);
		createEReference(erdiagramEClass, ERDIAGRAM__ELEMENTS);
		createEReference(erdiagramEClass, ERDIAGRAM__CONNECTIONS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);

		entityEClass = createEClass(ENTITY);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__DESCRIPTION);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__PARENT);

		erConnectionEClass = createEClass(ER_CONNECTION);
		createEReference(erConnectionEClass, ER_CONNECTION__FROM_ENTITY);
		createEReference(erConnectionEClass, ER_CONNECTION__TO_RELATIONSHIP);
		createEAttribute(erConnectionEClass, ER_CONNECTION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getElement());
		relationshipEClass.getESuperTypes().add(this.getElement());
		attributeEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(erdiagramEClass, Erdiagram.class, "Erdiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErdiagram_Elements(), this.getElement(), null, "elements", null, 0, -1, Erdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErdiagram_Connections(), this.getERConnection(), null, "connections", null, 0, -1, Erdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Parent(), this.getElement(), null, "parent", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erConnectionEClass, ERConnection.class, "ERConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERConnection_FromEntity(), this.getEntity(), null, "fromEntity", null, 1, 1, ERConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERConnection_ToRelationship(), this.getRelationship(), null, "toRelationship", null, 1, 1, ERConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERConnection_Value(), ecorePackage.getEString(), "value", null, 0, 1, ERConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErdiagramDSLPackageImpl
