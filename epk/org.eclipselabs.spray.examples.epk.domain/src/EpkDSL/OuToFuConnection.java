/**
 */
package EpkDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ou To Fu Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EpkDSL.OuToFuConnection#getStart <em>Start</em>}</li>
 *   <li>{@link EpkDSL.OuToFuConnection#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see EpkDSL.EpkDSLPackage#getOuToFuConnection()
 * @model
 * @generated
 */
public interface OuToFuConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OrgUnit)
	 * @see EpkDSL.EpkDSLPackage#getOuToFuConnection_Start()
	 * @model required="true"
	 * @generated
	 */
	OrgUnit getStart();

	/**
	 * Sets the value of the '{@link EpkDSL.OuToFuConnection#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OrgUnit value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Function)
	 * @see EpkDSL.EpkDSLPackage#getOuToFuConnection_End()
	 * @model required="true"
	 * @generated
	 */
	Function getEnd();

	/**
	 * Sets the value of the '{@link EpkDSL.OuToFuConnection#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Function value);

} // OuToFuConnection
