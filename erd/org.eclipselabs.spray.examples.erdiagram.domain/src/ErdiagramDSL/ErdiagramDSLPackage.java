/**
 */
package ErdiagramDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ErdiagramDSL.ErdiagramDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ErdiagramDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ErdiagramDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Erdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErdiagramDSLPackage eINSTANCE = ErdiagramDSL.impl.ErdiagramDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ErdiagramImpl <em>Erdiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ErdiagramImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getErdiagram()
	 * @generated
	 */
	int ERDIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERDIAGRAM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERDIAGRAM__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Erdiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERDIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ElementImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.EntityImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.RelationshipImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.AttributeImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PARENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ErdiagramDSL.impl.ERConnectionImpl <em>ER Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ErdiagramDSL.impl.ERConnectionImpl
	 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getERConnection()
	 * @generated
	 */
	int ER_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_CONNECTION__FROM_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_CONNECTION__TO_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_CONNECTION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>ER Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ER_CONNECTION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Erdiagram <em>Erdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erdiagram</em>'.
	 * @see ErdiagramDSL.Erdiagram
	 * @generated
	 */
	EClass getErdiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ErdiagramDSL.Erdiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ErdiagramDSL.Erdiagram#getElements()
	 * @see #getErdiagram()
	 * @generated
	 */
	EReference getErdiagram_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link ErdiagramDSL.Erdiagram#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see ErdiagramDSL.Erdiagram#getConnections()
	 * @see #getErdiagram()
	 * @generated
	 */
	EReference getErdiagram_Connections();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ErdiagramDSL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ErdiagramDSL.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ErdiagramDSL.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see ErdiagramDSL.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.Relationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ErdiagramDSL.Relationship#getDescription()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Description();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ErdiagramDSL.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ErdiagramDSL.Attribute#getParent()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Parent();

	/**
	 * Returns the meta object for class '{@link ErdiagramDSL.ERConnection <em>ER Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ER Connection</em>'.
	 * @see ErdiagramDSL.ERConnection
	 * @generated
	 */
	EClass getERConnection();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ERConnection#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Entity</em>'.
	 * @see ErdiagramDSL.ERConnection#getFromEntity()
	 * @see #getERConnection()
	 * @generated
	 */
	EReference getERConnection_FromEntity();

	/**
	 * Returns the meta object for the reference '{@link ErdiagramDSL.ERConnection#getToRelationship <em>To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Relationship</em>'.
	 * @see ErdiagramDSL.ERConnection#getToRelationship()
	 * @see #getERConnection()
	 * @generated
	 */
	EReference getERConnection_ToRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ErdiagramDSL.ERConnection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ErdiagramDSL.ERConnection#getValue()
	 * @see #getERConnection()
	 * @generated
	 */
	EAttribute getERConnection_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErdiagramDSLFactory getErdiagramDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ErdiagramImpl <em>Erdiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ErdiagramImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getErdiagram()
		 * @generated
		 */
		EClass ERDIAGRAM = eINSTANCE.getErdiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERDIAGRAM__ELEMENTS = eINSTANCE.getErdiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERDIAGRAM__CONNECTIONS = eINSTANCE.getErdiagram_Connections();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ElementImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.EntityImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.RelationshipImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DESCRIPTION = eINSTANCE.getRelationship_Description();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.AttributeImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PARENT = eINSTANCE.getAttribute_Parent();

		/**
		 * The meta object literal for the '{@link ErdiagramDSL.impl.ERConnectionImpl <em>ER Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ErdiagramDSL.impl.ERConnectionImpl
		 * @see ErdiagramDSL.impl.ErdiagramDSLPackageImpl#getERConnection()
		 * @generated
		 */
		EClass ER_CONNECTION = eINSTANCE.getERConnection();

		/**
		 * The meta object literal for the '<em><b>From Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_CONNECTION__FROM_ENTITY = eINSTANCE.getERConnection_FromEntity();

		/**
		 * The meta object literal for the '<em><b>To Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ER_CONNECTION__TO_RELATIONSHIP = eINSTANCE.getERConnection_ToRelationship();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ER_CONNECTION__VALUE = eINSTANCE.getERConnection_Value();

	}

} //ErdiagramDSLPackage
