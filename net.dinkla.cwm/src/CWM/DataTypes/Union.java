/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

import CWM.Core.Classifier;
import CWM.Core.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.DataTypes.Union#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.DataTypes.DataTypesPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends Classifier {
	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' reference.
	 * @see #setDiscriminator(StructuralFeature)
	 * @see CWM.DataTypes.DataTypesPackage#getUnion_Discriminator()
	 * @model ordered="false"
	 * @generated
	 */
	StructuralFeature getDiscriminator();

	/**
	 * Sets the value of the '{@link CWM.DataTypes.Union#getDiscriminator <em>Discriminator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' reference.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(StructuralFeature value);

} // Union
