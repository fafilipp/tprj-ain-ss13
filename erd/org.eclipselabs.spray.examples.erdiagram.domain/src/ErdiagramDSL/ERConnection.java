/**
 */
package ErdiagramDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ER Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ErdiagramDSL.ERConnection#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link ErdiagramDSL.ERConnection#getToRelationship <em>To Relationship</em>}</li>
 *   <li>{@link ErdiagramDSL.ERConnection#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ErdiagramDSL.ErdiagramDSLPackage#getERConnection()
 * @model
 * @generated
 */
public interface ERConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Entity</em>' reference.
	 * @see #setFromEntity(Entity)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getERConnection_FromEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getFromEntity();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ERConnection#getFromEntity <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Entity</em>' reference.
	 * @see #getFromEntity()
	 * @generated
	 */
	void setFromEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Relationship</em>' reference.
	 * @see #setToRelationship(Relationship)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getERConnection_ToRelationship()
	 * @model required="true"
	 * @generated
	 */
	Relationship getToRelationship();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ERConnection#getToRelationship <em>To Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Relationship</em>' reference.
	 * @see #getToRelationship()
	 * @generated
	 */
	void setToRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ErdiagramDSL.ErdiagramDSLPackage#getERConnection_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ErdiagramDSL.ERConnection#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ERConnection
