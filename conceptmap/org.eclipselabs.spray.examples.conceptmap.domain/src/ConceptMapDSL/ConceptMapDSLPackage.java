/**
 */
package ConceptMapDSL;

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
 * @see ConceptMapDSL.ConceptMapDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptMapDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConceptMapDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spray.eclipselabs.org/examples/Mindmap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptmap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptMapDSLPackage eINSTANCE = ConceptMapDSL.impl.ConceptMapDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.NamedElementImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.ConceptMapImpl <em>Concept Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.ConceptMapImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getConceptMap()
	 * @generated
	 */
	int CONCEPT_MAP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mapelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__MAPELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.MapElementsImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getMapElements()
	 * @generated
	 */
	int MAP_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Map Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENTS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.StartElementImpl <em>Start Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.StartElementImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getStartElement()
	 * @generated
	 */
	int START_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ELEMENT__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The number of structural features of the '<em>Start Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ELEMENT_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConceptMapDSL.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConceptMapDSL.impl.ElementImpl
	 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = MAP_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = MAP_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = MAP_ELEMENTS_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ConceptMapDSL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ConceptMapDSL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConceptMapDSL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Map</em>'.
	 * @see ConceptMapDSL.ConceptMap
	 * @generated
	 */
	EClass getConceptMap();

	/**
	 * Returns the meta object for the containment reference list '{@link ConceptMapDSL.ConceptMap#getMapelements <em>Mapelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapelements</em>'.
	 * @see ConceptMapDSL.ConceptMap#getMapelements()
	 * @see #getConceptMap()
	 * @generated
	 */
	EReference getConceptMap_Mapelements();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.MapElements <em>Map Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Elements</em>'.
	 * @see ConceptMapDSL.MapElements
	 * @generated
	 */
	EClass getMapElements();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.StartElement <em>Start Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Element</em>'.
	 * @see ConceptMapDSL.StartElement
	 * @generated
	 */
	EClass getStartElement();

	/**
	 * Returns the meta object for class '{@link ConceptMapDSL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ConceptMapDSL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link ConceptMapDSL.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ConceptMapDSL.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptMapDSLFactory getConceptMapDSLFactory();

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
		 * The meta object literal for the '{@link ConceptMapDSL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.NamedElementImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.ConceptMapImpl <em>Concept Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.ConceptMapImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getConceptMap()
		 * @generated
		 */
		EClass CONCEPT_MAP = eINSTANCE.getConceptMap();

		/**
		 * The meta object literal for the '<em><b>Mapelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_MAP__MAPELEMENTS = eINSTANCE.getConceptMap_Mapelements();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.MapElementsImpl <em>Map Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.MapElementsImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getMapElements()
		 * @generated
		 */
		EClass MAP_ELEMENTS = eINSTANCE.getMapElements();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.StartElementImpl <em>Start Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.StartElementImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getStartElement()
		 * @generated
		 */
		EClass START_ELEMENT = eINSTANCE.getStartElement();

		/**
		 * The meta object literal for the '{@link ConceptMapDSL.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConceptMapDSL.impl.ElementImpl
		 * @see ConceptMapDSL.impl.ConceptMapDSLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT = eINSTANCE.getElement_Parent();

	}

} //ConceptMapDSLPackage
