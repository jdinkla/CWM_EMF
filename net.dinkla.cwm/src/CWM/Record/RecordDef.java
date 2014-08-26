/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Record.RecordDef#getFieldDelimiter <em>Field Delimiter</em>}</li>
 *   <li>{@link CWM.Record.RecordDef#getIsFixedWidth <em>Is Fixed Width</em>}</li>
 *   <li>{@link CWM.Record.RecordDef#getTextDelimiter <em>Text Delimiter</em>}</li>
 *   <li>{@link CWM.Record.RecordDef#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Record.RecordPackage#getRecordDef()
 * @model
 * @generated
 */
public interface RecordDef extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Field Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Delimiter</em>' attribute.
	 * @see #setFieldDelimiter(String)
	 * @see CWM.Record.RecordPackage#getRecordDef_FieldDelimiter()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFieldDelimiter();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordDef#getFieldDelimiter <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Delimiter</em>' attribute.
	 * @see #getFieldDelimiter()
	 * @generated
	 */
	void setFieldDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Is Fixed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fixed Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fixed Width</em>' attribute.
	 * @see #setIsFixedWidth(Boolean)
	 * @see CWM.Record.RecordPackage#getRecordDef_IsFixedWidth()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsFixedWidth();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordDef#getIsFixedWidth <em>Is Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Width</em>' attribute.
	 * @see #getIsFixedWidth()
	 * @generated
	 */
	void setIsFixedWidth(Boolean value);

	/**
	 * Returns the value of the '<em><b>Text Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Delimiter</em>' attribute.
	 * @see #setTextDelimiter(String)
	 * @see CWM.Record.RecordPackage#getRecordDef_TextDelimiter()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getTextDelimiter();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordDef#getTextDelimiter <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Delimiter</em>' attribute.
	 * @see #getTextDelimiter()
	 * @generated
	 */
	void setTextDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference list.
	 * The list contents are of type {@link CWM.Record.RecordFile}.
	 * It is bidirectional and its opposite is '{@link CWM.Record.RecordFile#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference list.
	 * @see CWM.Record.RecordPackage#getRecordDef_File()
	 * @see CWM.Record.RecordFile#getRecord
	 * @model opposite="record" ordered="false"
	 * @generated
	 */
	EList<RecordFile> getFile();

} // RecordDef
