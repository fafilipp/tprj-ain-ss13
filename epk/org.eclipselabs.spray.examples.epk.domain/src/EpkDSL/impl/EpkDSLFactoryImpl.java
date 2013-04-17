/**
 */
package EpkDSL.impl;

import EpkDSL.*;

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
public class EpkDSLFactoryImpl extends EFactoryImpl implements EpkDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpkDSLFactory init() {
		try {
			EpkDSLFactory theEpkDSLFactory = (EpkDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Epk"); 
			if (theEpkDSLFactory != null) {
				return theEpkDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpkDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLFactoryImpl() {
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
			case EpkDSLPackage.NAMED_ELEMENT: return createNamedElement();
			case EpkDSLPackage.EPK: return createEpk();
			case EpkDSLPackage.EDGE: return createEdge();
			case EpkDSLPackage.NODE: return createNode();
			case EpkDSLPackage.EVENT: return createEvent();
			case EpkDSLPackage.FUNCTION: return createFunction();
			case EpkDSLPackage.IN_OUTPUT: return createInOutput();
			case EpkDSLPackage.ORG_UNIT: return createOrgUnit();
			case EpkDSLPackage.PROC_PATH: return createProcPath();
			case EpkDSLPackage.CONNECTOR: return createConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epk createEpk() {
		EpkImpl epk = new EpkImpl();
		return epk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutput createInOutput() {
		InOutputImpl inOutput = new InOutputImpl();
		return inOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcPath createProcPath() {
		ProcPathImpl procPath = new ProcPathImpl();
		return procPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpkDSLPackage getEpkDSLPackage() {
		return (EpkDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpkDSLPackage getPackage() {
		return EpkDSLPackage.eINSTANCE;
	}

} //EpkDSLFactoryImpl
