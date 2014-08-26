/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint;

import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.AuxiliaryObject#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getAuxiliaryObject()
 * @model
 * @generated
 */
public interface AuxiliaryObject extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Attribute Assignment Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeAssignmentSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignment Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignment Set</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getAuxiliaryObject_AttributeAssignmentSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeAssignmentSet> getAttributeAssignmentSet();

} // AuxiliaryObject
