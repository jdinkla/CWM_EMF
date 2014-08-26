/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Constraint;
import CWM.Core.Dependency;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.TransformationStep#getTask <em>Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationStep#getActivity <em>Activity</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationStep#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationStep#getPrecedingStep <em>Preceding Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationStep#getSucceedingStep <em>Succeeding Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep()
 * @model
 * @generated
 */
public interface TransformationStep extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(TransformationTask)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep_Task()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransformationTask getTask();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.TransformationStep#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TransformationTask value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Namespace)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getActivity();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.TransformationStep#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Namespace value);

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep_Precedence()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPrecedence();

	/**
	 * Returns the value of the '<em><b>Preceding Step</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding Step</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep_PrecedingStep()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dependency> getPrecedingStep();

	/**
	 * Returns the value of the '<em><b>Succeeding Step</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succeeding Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succeeding Step</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationStep_SucceedingStep()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dependency> getSucceedingStep();

} // TransformationStep
