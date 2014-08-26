/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.SoftwareDeployment.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.TransformationTask#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationTask#getInverseTask <em>Inverse Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationTask#getOriginalTask <em>Original Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTask()
 * @model
 * @generated
 */
public interface TransformationTask extends Component {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTask_Transformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Transformation> getTransformation();

	/**
	 * Returns the value of the '<em><b>Inverse Task</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationTask}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.TransformationTask#getOriginalTask <em>Original Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Task</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTask_InverseTask()
	 * @see CWM.CwmTransformation.TransformationTask#getOriginalTask
	 * @model opposite="originalTask" ordered="false"
	 * @generated
	 */
	EList<TransformationTask> getInverseTask();

	/**
	 * Returns the value of the '<em><b>Original Task</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationTask}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.TransformationTask#getInverseTask <em>Inverse Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Task</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTask_OriginalTask()
	 * @see CWM.CwmTransformation.TransformationTask#getInverseTask
	 * @model opposite="inverseTask" ordered="false"
	 * @generated
	 */
	EList<TransformationTask> getOriginalTask();

} // TransformationTask
