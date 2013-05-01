/**
 */
package PetrinetDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.EndElement#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getEndElement()
 * @model
 * @generated
 */
public interface EndElement extends Node {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link PetrinetDSL.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see PetrinetDSL.PetrinetDSLPackage#getEndElement_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // EndElement
