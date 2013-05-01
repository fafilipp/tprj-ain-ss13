/**
 */
package PetrinetDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.EndEdge#getFromTransition <em>From Transition</em>}</li>
 *   <li>{@link PetrinetDSL.EndEdge#getToEnd <em>To End</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getEndEdge()
 * @model
 * @generated
 */
public interface EndEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>From Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Transition</em>' reference.
	 * @see #setFromTransition(Transition)
	 * @see PetrinetDSL.PetrinetDSLPackage#getEndEdge_FromTransition()
	 * @model
	 * @generated
	 */
	Transition getFromTransition();

	/**
	 * Sets the value of the '{@link PetrinetDSL.EndEdge#getFromTransition <em>From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Transition</em>' reference.
	 * @see #getFromTransition()
	 * @generated
	 */
	void setFromTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>To End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To End</em>' reference.
	 * @see #setToEnd(EndElement)
	 * @see PetrinetDSL.PetrinetDSLPackage#getEndEdge_ToEnd()
	 * @model
	 * @generated
	 */
	EndElement getToEnd();

	/**
	 * Sets the value of the '{@link PetrinetDSL.EndEdge#getToEnd <em>To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To End</em>' reference.
	 * @see #getToEnd()
	 * @generated
	 */
	void setToEnd(EndElement value);

} // EndEdge
