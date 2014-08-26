/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeAssignmentSet#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeAssignmentSet()
 * @model
 * @generated
 */
public interface AttributeAssignmentSet extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeAssignmentSet_Assignment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<AttributeAssignment> getAssignment();

} // AttributeAssignmentSet
