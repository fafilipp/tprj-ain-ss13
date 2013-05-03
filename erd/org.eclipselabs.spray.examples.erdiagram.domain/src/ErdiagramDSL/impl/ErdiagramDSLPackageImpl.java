/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.ChenAttribute;
import ErdiagramDSL.ChenConnection;
import ErdiagramDSL.ChenElement;
import ErdiagramDSL.ChenEntity;
import ErdiagramDSL.ChenNormalToWeakConnection;
import ErdiagramDSL.ChenRelationship;
import ErdiagramDSL.ChenWeakAttribute;
import ErdiagramDSL.ChenWeakConnection;
import ErdiagramDSL.ChenWeakElement;
import ErdiagramDSL.ChenWeakEntity;
import ErdiagramDSL.ChenWeakRelationship;
import ErdiagramDSL.DiagramElement;
import ErdiagramDSL.Erdiagram;
import ErdiagramDSL.ErdiagramDSLFactory;
import ErdiagramDSL.ErdiagramDSLPackage;

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
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenNormalToWeakConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenWeakElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenWeakEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenWeakRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenWeakAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chenWeakConnectionEClass = null;

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
	public EClass getDiagramElement() {
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenElement() {
		return chenElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenElement_Name() {
		return (EAttribute)chenElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenEntity() {
		return chenEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenRelationship() {
		return chenRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenRelationship_Description() {
		return (EAttribute)chenRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenAttribute() {
		return chenAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenAttribute_Parent() {
		return (EReference)chenAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenConnection() {
		return chenConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenConnection_FromEntity() {
		return (EReference)chenConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenConnection_ToRelationship() {
		return (EReference)chenConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenConnection_Value() {
		return (EAttribute)chenConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenNormalToWeakConnection() {
		return chenNormalToWeakConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenNormalToWeakConnection_FromEntity() {
		return (EReference)chenNormalToWeakConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenNormalToWeakConnection_ToRelationship() {
		return (EReference)chenNormalToWeakConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenNormalToWeakConnection_Value() {
		return (EAttribute)chenNormalToWeakConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenWeakElement() {
		return chenWeakElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenWeakElement_Name() {
		return (EAttribute)chenWeakElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenWeakEntity() {
		return chenWeakEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenWeakRelationship() {
		return chenWeakRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenWeakRelationship_Description() {
		return (EAttribute)chenWeakRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenWeakAttribute() {
		return chenWeakAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenWeakAttribute_Parent() {
		return (EReference)chenWeakAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChenWeakConnection() {
		return chenWeakConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenWeakConnection_FromEntity() {
		return (EReference)chenWeakConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChenWeakConnection_ToRelationship() {
		return (EReference)chenWeakConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChenWeakConnection_Value() {
		return (EAttribute)chenWeakConnectionEClass.getEStructuralFeatures().get(2);
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

		diagramElementEClass = createEClass(DIAGRAM_ELEMENT);

		chenElementEClass = createEClass(CHEN_ELEMENT);
		createEAttribute(chenElementEClass, CHEN_ELEMENT__NAME);

		chenEntityEClass = createEClass(CHEN_ENTITY);

		chenRelationshipEClass = createEClass(CHEN_RELATIONSHIP);
		createEAttribute(chenRelationshipEClass, CHEN_RELATIONSHIP__DESCRIPTION);

		chenAttributeEClass = createEClass(CHEN_ATTRIBUTE);
		createEReference(chenAttributeEClass, CHEN_ATTRIBUTE__PARENT);

		chenConnectionEClass = createEClass(CHEN_CONNECTION);
		createEReference(chenConnectionEClass, CHEN_CONNECTION__FROM_ENTITY);
		createEReference(chenConnectionEClass, CHEN_CONNECTION__TO_RELATIONSHIP);
		createEAttribute(chenConnectionEClass, CHEN_CONNECTION__VALUE);

		chenNormalToWeakConnectionEClass = createEClass(CHEN_NORMAL_TO_WEAK_CONNECTION);
		createEReference(chenNormalToWeakConnectionEClass, CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY);
		createEReference(chenNormalToWeakConnectionEClass, CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP);
		createEAttribute(chenNormalToWeakConnectionEClass, CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE);

		chenWeakElementEClass = createEClass(CHEN_WEAK_ELEMENT);
		createEAttribute(chenWeakElementEClass, CHEN_WEAK_ELEMENT__NAME);

		chenWeakEntityEClass = createEClass(CHEN_WEAK_ENTITY);

		chenWeakRelationshipEClass = createEClass(CHEN_WEAK_RELATIONSHIP);
		createEAttribute(chenWeakRelationshipEClass, CHEN_WEAK_RELATIONSHIP__DESCRIPTION);

		chenWeakAttributeEClass = createEClass(CHEN_WEAK_ATTRIBUTE);
		createEReference(chenWeakAttributeEClass, CHEN_WEAK_ATTRIBUTE__PARENT);

		chenWeakConnectionEClass = createEClass(CHEN_WEAK_CONNECTION);
		createEReference(chenWeakConnectionEClass, CHEN_WEAK_CONNECTION__FROM_ENTITY);
		createEReference(chenWeakConnectionEClass, CHEN_WEAK_CONNECTION__TO_RELATIONSHIP);
		createEAttribute(chenWeakConnectionEClass, CHEN_WEAK_CONNECTION__VALUE);
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
		chenElementEClass.getESuperTypes().add(this.getDiagramElement());
		chenEntityEClass.getESuperTypes().add(this.getChenElement());
		chenRelationshipEClass.getESuperTypes().add(this.getChenElement());
		chenAttributeEClass.getESuperTypes().add(this.getChenElement());
		chenConnectionEClass.getESuperTypes().add(this.getDiagramElement());
		chenNormalToWeakConnectionEClass.getESuperTypes().add(this.getDiagramElement());
		chenWeakElementEClass.getESuperTypes().add(this.getDiagramElement());
		chenWeakEntityEClass.getESuperTypes().add(this.getChenWeakElement());
		chenWeakRelationshipEClass.getESuperTypes().add(this.getChenWeakElement());
		chenWeakAttributeEClass.getESuperTypes().add(this.getChenWeakElement());
		chenWeakConnectionEClass.getESuperTypes().add(this.getDiagramElement());

		// Initialize classes and features; add operations and parameters
		initEClass(erdiagramEClass, Erdiagram.class, "Erdiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErdiagram_Elements(), this.getDiagramElement(), null, "elements", null, 0, -1, Erdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chenElementEClass, ChenElement.class, "ChenElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChenElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChenElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenEntityEClass, ChenEntity.class, "ChenEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chenRelationshipEClass, ChenRelationship.class, "ChenRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChenRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChenRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenAttributeEClass, ChenAttribute.class, "ChenAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChenAttribute_Parent(), this.getChenElement(), null, "parent", null, 1, 1, ChenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenConnectionEClass, ChenConnection.class, "ChenConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChenConnection_FromEntity(), this.getChenEntity(), null, "fromEntity", null, 1, 1, ChenConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChenConnection_ToRelationship(), this.getChenRelationship(), null, "toRelationship", null, 1, 1, ChenConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChenConnection_Value(), ecorePackage.getEString(), "value", null, 0, 1, ChenConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenNormalToWeakConnectionEClass, ChenNormalToWeakConnection.class, "ChenNormalToWeakConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChenNormalToWeakConnection_FromEntity(), this.getChenEntity(), null, "fromEntity", null, 1, 1, ChenNormalToWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChenNormalToWeakConnection_ToRelationship(), this.getChenWeakRelationship(), null, "toRelationship", null, 1, 1, ChenNormalToWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChenNormalToWeakConnection_Value(), ecorePackage.getEString(), "value", null, 0, 1, ChenNormalToWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenWeakElementEClass, ChenWeakElement.class, "ChenWeakElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChenWeakElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChenWeakElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenWeakEntityEClass, ChenWeakEntity.class, "ChenWeakEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chenWeakRelationshipEClass, ChenWeakRelationship.class, "ChenWeakRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChenWeakRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChenWeakRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenWeakAttributeEClass, ChenWeakAttribute.class, "ChenWeakAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChenWeakAttribute_Parent(), this.getChenWeakElement(), null, "parent", null, 1, 1, ChenWeakAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chenWeakConnectionEClass, ChenWeakConnection.class, "ChenWeakConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChenWeakConnection_FromEntity(), this.getChenWeakEntity(), null, "fromEntity", null, 1, 1, ChenWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChenWeakConnection_ToRelationship(), this.getChenWeakRelationship(), null, "toRelationship", null, 1, 1, ChenWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChenWeakConnection_Value(), ecorePackage.getEString(), "value", null, 0, 1, ChenWeakConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErdiagramDSLPackageImpl
