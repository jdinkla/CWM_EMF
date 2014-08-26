/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.ProcedureExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.FeatureMap#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.FeatureMap#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.FeatureMap#getSource <em>Source</em>}</li>
 *   <li>{@link CWM.CwmTransformation.FeatureMap#getTarget <em>Target</em>}</li>
 *   <li>{@link CWM.CwmTransformation.FeatureMap#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap()
 * @model
 * @generated
 */
public interface FeatureMap extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(ProcedureExpression)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap_Function()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getFunction();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.FeatureMap#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ProcedureExpression value);

	/**
	 * Returns the value of the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Description</em>' attribute.
	 * @see #setFunctionDescription(String)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap_FunctionDescription()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunctionDescription();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.FeatureMap#getFunctionDescription <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Description</em>' attribute.
	 * @see #getFunctionDescription()
	 * @generated
	 */
	void setFunctionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getTarget();

	/**
	 * Returns the value of the '<em><b>Classifier Map</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.ClassifierMap#getFeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Map</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Map</em>' container reference.
	 * @see #setClassifierMap(ClassifierMap)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getFeatureMap_ClassifierMap()
	 * @see CWM.CwmTransformation.ClassifierMap#getFeatureMap
	 * @model opposite="featureMap" transient="false" ordered="false"
	 * @generated
	 */
	ClassifierMap getClassifierMap();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.FeatureMap#getClassifierMap <em>Classifier Map</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Map</em>' container reference.
	 * @see #getClassifierMap()
	 * @generated
	 */
	void setClassifierMap(ClassifierMap value);

} // FeatureMap
