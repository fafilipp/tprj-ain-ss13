/**
 */
package ConceptMapDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConceptMapDSL.Connection#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ConceptMapDSL.Connection#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConceptMapDSL.ConceptMapDSLPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends MapElements {
	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(Element)
	 * @see ConceptMapDSL.ConceptMapDSLPackage#getConnection_FromElement()
	 * @model
	 * @generated
	 */
	Element getFromElement();

	/**
	 * Sets the value of the '{@link ConceptMapDSL.Connection#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(Element value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(Element)
	 * @see ConceptMapDSL.ConceptMapDSLPackage#getConnection_ToElement()
	 * @model
	 * @generated
	 */
	Element getToElement();

	/**
	 * Sets the value of the '{@link ConceptMapDSL.Connection#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(Element value);

} // Connection
