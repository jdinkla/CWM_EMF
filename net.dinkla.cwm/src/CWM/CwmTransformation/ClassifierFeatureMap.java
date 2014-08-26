/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Classifier;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.ProcedureExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Feature Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierToFeature <em>Classifier To Feature</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap()
 * @model
 * @generated
 */
public interface ClassifierFeatureMap extends ModelElement {
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_Function()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getFunction();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunction <em>Function</em>}' containment reference.
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_FunctionDescription()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunctionDescription();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunctionDescription <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Description</em>' attribute.
	 * @see #getFunctionDescription()
	 * @generated
	 */
	void setFunctionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Classifier To Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier To Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier To Feature</em>' attribute.
	 * @see #setClassifierToFeature(Boolean)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_ClassifierToFeature()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getClassifierToFeature();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierToFeature <em>Classifier To Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier To Feature</em>' attribute.
	 * @see #getClassifierToFeature()
	 * @generated
	 */
	void setClassifierToFeature(Boolean value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Classifier Map</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.ClassifierMap#getCfMap <em>Cf Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Map</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Map</em>' container reference.
	 * @see #setClassifierMap(ClassifierMap)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getClassifierFeatureMap_ClassifierMap()
	 * @see CWM.CwmTransformation.ClassifierMap#getCfMap
	 * @model opposite="cfMap" transient="false" ordered="false"
	 * @generated
	 */
	ClassifierMap getClassifierMap();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap <em>Classifier Map</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Map</em>' container reference.
	 * @see #getClassifierMap()
	 * @generated
	 */
	void setClassifierMap(ClassifierMap value);

} // ClassifierFeatureMap
