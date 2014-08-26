/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping;

import CWM.Core.Classifier;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.TypeMapping.TypeMapping#getIsBestMatch <em>Is Best Match</em>}</li>
 *   <li>{@link CWM.TypeMapping.TypeMapping#getIsLossy <em>Is Lossy</em>}</li>
 *   <li>{@link CWM.TypeMapping.TypeMapping#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link CWM.TypeMapping.TypeMapping#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping()
 * @model
 * @generated
 */
public interface TypeMapping extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Best Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Best Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Best Match</em>' attribute.
	 * @see #setIsBestMatch(Boolean)
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_IsBestMatch()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsBestMatch();

	/**
	 * Sets the value of the '{@link CWM.TypeMapping.TypeMapping#getIsBestMatch <em>Is Best Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Best Match</em>' attribute.
	 * @see #getIsBestMatch()
	 * @generated
	 */
	void setIsBestMatch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Lossy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Lossy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Lossy</em>' attribute.
	 * @see #setIsLossy(Boolean)
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_IsLossy()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsLossy();

	/**
	 * Sets the value of the '{@link CWM.TypeMapping.TypeMapping#getIsLossy <em>Is Lossy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Lossy</em>' attribute.
	 * @see #getIsLossy()
	 * @generated
	 */
	void setIsLossy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(Classifier)
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_SourceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getSourceType();

	/**
	 * Sets the value of the '{@link CWM.TypeMapping.TypeMapping#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(Classifier)
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_TargetType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getTargetType();

	/**
	 * Sets the value of the '{@link CWM.TypeMapping.TypeMapping#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(Classifier value);

} // TypeMapping
