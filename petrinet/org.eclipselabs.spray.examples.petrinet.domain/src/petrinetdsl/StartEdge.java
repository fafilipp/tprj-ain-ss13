/**
 */
package PetrinetDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.StartEdge#getFromStart <em>From Start</em>}</li>
 *   <li>{@link PetrinetDSL.StartEdge#getToTransition <em>To Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getStartEdge()
 * @model
 * @generated
 */
public interface StartEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>From Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Start</em>' reference.
	 * @see #setFromStart(StartElement)
	 * @see PetrinetDSL.PetrinetDSLPackage#getStartEdge_FromStart()
	 * @model
	 * @generated
	 */
	StartElement getFromStart();

	/**
	 * Sets the value of the '{@link PetrinetDSL.StartEdge#getFromStart <em>From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Start</em>' reference.
	 * @see #getFromStart()
	 * @generated
	 */
	void setFromStart(StartElement value);

	/**
	 * Returns the value of the '<em><b>To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transition</em>' reference.
	 * @see #setToTransition(Transition)
	 * @see PetrinetDSL.PetrinetDSLPackage#getStartEdge_ToTransition()
	 * @model
	 * @generated
	 */
	Transition getToTransition();

	/**
	 * Sets the value of the '{@link PetrinetDSL.StartEdge#getToTransition <em>To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Transition</em>' reference.
	 * @see #getToTransition()
	 * @generated
	 */
	void setToTransition(Transition value);

} // StartEdge
