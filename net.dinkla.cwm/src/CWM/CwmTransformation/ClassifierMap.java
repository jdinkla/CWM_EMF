/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Classifier;
import CWM.Core.Namespace;
import CWM.Core.ProcedureExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getSource <em>Source</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getTarget <em>Target</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getTransformationMap <em>Transformation Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getFeatureMap <em>Feature Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierMap#getCfMap <em>Cf Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap()
 * @model
 * @generated
 */
public interface ClassifierMap extends Namespace {
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_Function()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getFunction();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierMap#getFunction <em>Function</em>}' containment reference.
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_FunctionDescription()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunctionDescription();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierMap#getFunctionDescription <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Description</em>' attribute.
	 * @see #getFunctionDescription()
	 * @generated
	 */
	void setFunctionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getTarget();

	/**
	 * Returns the value of the '<em><b>Transformation Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Map</em>' reference.
	 * @see #setTransformationMap(Namespace)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_TransformationMap()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getTransformationMap();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierMap#getTransformationMap <em>Transformation Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Map</em>' reference.
	 * @see #getTransformationMap()
	 * @generated
	 */
	void setTransformationMap(Namespace value);

	/**
	 * Returns the value of the '<em><b>Feature Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.FeatureMap}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.FeatureMap#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_FeatureMap()
	 * @see CWM.CwmTransformation.FeatureMap#getClassifierMap
	 * @model opposite="classifierMap" containment="true" ordered="false"
	 * @generated
	 */
	EList<FeatureMap> getFeatureMap();

	/**
	 * Returns the value of the '<em><b>Cf Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.ClassifierFeatureMap}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cf Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cf Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierMap_CfMap()
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap
	 * @model opposite="classifierMap" containment="true" ordered="false"
	 * @generated
	 */
	EList<ClassifierFeatureMap> getCfMap();

} // ClassifierMap
