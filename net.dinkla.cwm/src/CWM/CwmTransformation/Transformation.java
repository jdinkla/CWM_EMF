/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Dependency;
import CWM.Core.Namespace;
import CWM.Core.ProcedureExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.Transformation#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation#getIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation#getSource <em>Source</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation#getTarget <em>Target</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Namespace {
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_Function()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getFunction();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.Transformation#getFunction <em>Function</em>}' containment reference.
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
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_FunctionDescription()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunctionDescription();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.Transformation#getFunctionDescription <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Description</em>' attribute.
	 * @see #getFunctionDescription()
	 * @generated
	 */
	void setFunctionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(Boolean)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_IsPrimary()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsPrimary();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.Transformation#getIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #getIsPrimary()
	 * @generated
	 */
	void setIsPrimary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.DataObjectSet}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.DataObjectSet#getSourceTransformation <em>Source Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_Source()
	 * @see CWM.CwmTransformation.DataObjectSet#getSourceTransformation
	 * @model opposite="sourceTransformation" ordered="false"
	 * @generated
	 */
	EList<DataObjectSet> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.DataObjectSet}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.DataObjectSet#getTargetTransformation <em>Target Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_Target()
	 * @see CWM.CwmTransformation.DataObjectSet#getTargetTransformation
	 * @model opposite="targetTransformation" ordered="false"
	 * @generated
	 */
	EList<DataObjectSet> getTarget();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_Use()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dependency> getUse();

} // Transformation
