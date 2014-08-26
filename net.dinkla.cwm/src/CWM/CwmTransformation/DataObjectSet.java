/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.DataObjectSet#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.CwmTransformation.DataObjectSet#getSourceTransformation <em>Source Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.DataObjectSet#getTargetTransformation <em>Target Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getDataObjectSet()
 * @model
 * @generated
 */
public interface DataObjectSet extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getDataObjectSet_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getElement();

	/**
	 * Returns the value of the '<em><b>Source Transformation</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.Transformation}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.Transformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transformation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transformation</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getDataObjectSet_SourceTransformation()
	 * @see CWM.CwmTransformation.Transformation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<Transformation> getSourceTransformation();

	/**
	 * Returns the value of the '<em><b>Target Transformation</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.Transformation}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmTransformation.Transformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transformation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transformation</em>' reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getDataObjectSet_TargetTransformation()
	 * @see CWM.CwmTransformation.Transformation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transformation> getTargetTransformation();

} // DataObjectSet
