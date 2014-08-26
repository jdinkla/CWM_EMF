/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.VocabularyElement#getDefinition <em>Definition</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.VocabularyElement#getExample <em>Example</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.VocabularyElement#getUsage <em>Usage</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.VocabularyElement#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getVocabularyElement()
 * @model
 * @generated
 */
public interface VocabularyElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getVocabularyElement_Definition()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.VocabularyElement#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getVocabularyElement_Example()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.VocabularyElement#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getVocabularyElement_Usage()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.VocabularyElement#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getVocabularyElement_ModelElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // VocabularyElement
