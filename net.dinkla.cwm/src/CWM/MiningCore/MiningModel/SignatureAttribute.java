/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import CWM.MiningCore.MiningData.MiningAttribute;
import CWM.MiningCore.MiningData.UsageOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.SignatureAttribute#getUsageOption <em>Usage Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getSignatureAttribute()
 * @model
 * @generated
 */
public interface SignatureAttribute extends MiningAttribute {
	/**
	 * Returns the value of the '<em><b>Usage Option</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.UsageOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Option</em>' attribute.
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @see #setUsageOption(UsageOption)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getSignatureAttribute_UsageOption()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	UsageOption getUsageOption();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.SignatureAttribute#getUsageOption <em>Usage Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Option</em>' attribute.
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @see #getUsageOption()
	 * @generated
	 */
	void setUsageOption(UsageOption value);

} // SignatureAttribute
