/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.Dependency;
import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.StepPrecedence#getPrecedingStep <em>Preceding Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.StepPrecedence#getSucceedingStep <em>Succeeding Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getStepPrecedence()
 * @model
 * @generated
 */
public interface StepPrecedence extends Dependency {
	/**
	 * Returns the value of the '<em><b>Preceding Step</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding Step</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getStepPrecedence_PrecedingStep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getPrecedingStep();

	/**
	 * Returns the value of the '<em><b>Succeeding Step</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succeeding Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succeeding Step</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getStepPrecedence_SucceedingStep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getSucceedingStep();

} // StepPrecedence
