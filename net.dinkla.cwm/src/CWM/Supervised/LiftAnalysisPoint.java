/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lift Analysis Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Supervised.LiftAnalysisPoint#getSubsetOfRecords <em>Subset Of Records</em>}</li>
 *   <li>{@link CWM.Supervised.LiftAnalysisPoint#getAggregateTarget <em>Aggregate Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysisPoint()
 * @model
 * @generated
 */
public interface LiftAnalysisPoint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Subset Of Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset Of Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Of Records</em>' attribute.
	 * @see #setSubsetOfRecords(Integer)
	 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysisPoint_SubsetOfRecords()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getSubsetOfRecords();

	/**
	 * Sets the value of the '{@link CWM.Supervised.LiftAnalysisPoint#getSubsetOfRecords <em>Subset Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset Of Records</em>' attribute.
	 * @see #getSubsetOfRecords()
	 * @generated
	 */
	void setSubsetOfRecords(Integer value);

	/**
	 * Returns the value of the '<em><b>Aggregate Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Target</em>' attribute.
	 * @see #setAggregateTarget(Double)
	 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysisPoint_AggregateTarget()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getAggregateTarget();

	/**
	 * Sets the value of the '{@link CWM.Supervised.LiftAnalysisPoint#getAggregateTarget <em>Aggregate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Target</em>' attribute.
	 * @see #getAggregateTarget()
	 * @generated
	 */
	void setAggregateTarget(Double value);

} // LiftAnalysisPoint
