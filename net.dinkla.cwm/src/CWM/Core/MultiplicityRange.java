/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.MultiplicityRange#getLower <em>Lower</em>}</li>
 *   <li>{@link CWM.Core.MultiplicityRange#getUpper <em>Upper</em>}</li>
 *   <li>{@link CWM.Core.MultiplicityRange#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getMultiplicityRange()
 * @model
 * @generated
 */
public interface MultiplicityRange extends Element {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see CWM.Core.CorePackage#getMultiplicityRange_Lower()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link CWM.Core.MultiplicityRange#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see CWM.Core.CorePackage#getMultiplicityRange_Upper()
	 * @model unique="false" dataType="CWM.Core.UnlimitedInteger" required="true" ordered="false"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link CWM.Core.MultiplicityRange#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Multiplicity#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' container reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see CWM.Core.CorePackage#getMultiplicityRange_Multiplicity()
	 * @see CWM.Core.Multiplicity#getRange
	 * @model opposite="range" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link CWM.Core.MultiplicityRange#getMultiplicity <em>Multiplicity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' container reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // MultiplicityRange
