/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import CWM.MiningCore.MiningResult.MiningResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Supervised.MiningTestResult#getNumberOfTestRecords <em>Number Of Test Records</em>}</li>
 *   <li>{@link CWM.Supervised.MiningTestResult#getLiftAnalysis <em>Lift Analysis</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Supervised.SupervisedPackage#getMiningTestResult()
 * @model
 * @generated
 */
public interface MiningTestResult extends MiningResult {
	/**
	 * Returns the value of the '<em><b>Number Of Test Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Test Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Test Records</em>' attribute.
	 * @see #setNumberOfTestRecords(Integer)
	 * @see CWM.Supervised.SupervisedPackage#getMiningTestResult_NumberOfTestRecords()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getNumberOfTestRecords();

	/**
	 * Sets the value of the '{@link CWM.Supervised.MiningTestResult#getNumberOfTestRecords <em>Number Of Test Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Test Records</em>' attribute.
	 * @see #getNumberOfTestRecords()
	 * @generated
	 */
	void setNumberOfTestRecords(Integer value);

	/**
	 * Returns the value of the '<em><b>Lift Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lift Analysis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lift Analysis</em>' containment reference.
	 * @see #setLiftAnalysis(LiftAnalysis)
	 * @see CWM.Supervised.SupervisedPackage#getMiningTestResult_LiftAnalysis()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LiftAnalysis getLiftAnalysis();

	/**
	 * Sets the value of the '{@link CWM.Supervised.MiningTestResult#getLiftAnalysis <em>Lift Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lift Analysis</em>' containment reference.
	 * @see #getLiftAnalysis()
	 * @generated
	 */
	void setLiftAnalysis(LiftAnalysis value);

} // MiningTestResult
