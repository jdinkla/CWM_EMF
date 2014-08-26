/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.Category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lift Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Supervised.LiftAnalysis#getPoint <em>Point</em>}</li>
 *   <li>{@link CWM.Supervised.LiftAnalysis#getTargetAttributeName <em>Target Attribute Name</em>}</li>
 *   <li>{@link CWM.Supervised.LiftAnalysis#getPositiveTargetCategory <em>Positive Target Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysis()
 * @model
 * @generated
 */
public interface LiftAnalysis extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.LiftAnalysisPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysis_Point()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<LiftAnalysisPoint> getPoint();

	/**
	 * Returns the value of the '<em><b>Target Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute Name</em>' attribute.
	 * @see #setTargetAttributeName(String)
	 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysis_TargetAttributeName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getTargetAttributeName();

	/**
	 * Sets the value of the '{@link CWM.Supervised.LiftAnalysis#getTargetAttributeName <em>Target Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute Name</em>' attribute.
	 * @see #getTargetAttributeName()
	 * @generated
	 */
	void setTargetAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Positive Target Category</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Target Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Target Category</em>' reference list.
	 * @see CWM.Supervised.SupervisedPackage#getLiftAnalysis_PositiveTargetCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getPositiveTargetCategory();

} // LiftAnalysis
