/**
 */
package PetrinetDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetrinetDSL.Transition#getTargetPlaces <em>Target Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetrinetDSL.PetrinetDSLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target Places</b></em>' reference list.
	 * The list contents are of type {@link PetrinetDSL.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Places</em>' reference list.
	 * @see PetrinetDSL.PetrinetDSLPackage#getTransition_TargetPlaces()
	 * @model
	 * @generated
	 */
	EList<Place> getTargetPlaces();

} // Transition
