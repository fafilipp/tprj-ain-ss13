/**
 */
package ErdiagramDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.Attribute#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Element {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Element)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getAttribute_Parent()
	 * @model required="true"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.Attribute#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Element value);

} // Attribute
