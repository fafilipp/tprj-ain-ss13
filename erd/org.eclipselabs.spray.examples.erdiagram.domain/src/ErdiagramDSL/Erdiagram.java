/**
 */
package ErdiagramDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erdiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.Erdiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link ErdiagramDSL.Erdiagram#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ErdiagramDSL.Erdiagram#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram()
 * @model
 * @generated
 */
public interface Erdiagram extends EObject {

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ErdiagramDSL.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ErdiagramDSL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link ErdiagramDSL.ERConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getErdiagram_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERConnection> getConnections();
} // Erdiagram
