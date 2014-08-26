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
 * A representation of the model object '<em><b>Transformation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.TransformationMap#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationMap()
 * @model
 * @generated
 */
public interface TransformationMap extends Transformation {
	/**
	 * Returns the value of the '<em><b>Classifier Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationMap_ClassifierMap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getClassifierMap();

} // TransformationMap
