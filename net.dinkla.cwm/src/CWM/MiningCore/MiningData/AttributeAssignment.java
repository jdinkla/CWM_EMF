/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Attribute;
import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeAssignment#getOrderIdAttribute <em>Order Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeAssignment#getLogicalAttribute <em>Logical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeAssignment()
 * @model
 * @generated
 */
public interface AttributeAssignment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Order Id Attribute</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id Attribute</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeAssignment_OrderIdAttribute()
	 * @model
	 * @generated
	 */
	EList<Attribute> getOrderIdAttribute();

	/**
	 * Returns the value of the '<em><b>Logical Attribute</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.MiningAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Attribute</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeAssignment_LogicalAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MiningAttribute> getLogicalAttribute();

} // AttributeAssignment
