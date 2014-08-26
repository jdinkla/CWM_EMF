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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Record.RecordFile#getIsSelfDescribing <em>Is Self Describing</em>}</li>
 *   <li>{@link CWM.Record.RecordFile#getRecordDelimiter <em>Record Delimiter</em>}</li>
 *   <li>{@link CWM.Record.RecordFile#getSkipRecords <em>Skip Records</em>}</li>
 *   <li>{@link CWM.Record.RecordFile#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Record.RecordPackage#getRecordFile()
 * @model
 * @generated
 */
public interface RecordFile extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Is Self Describing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Self Describing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Self Describing</em>' attribute.
	 * @see #setIsSelfDescribing(Boolean)
	 * @see CWM.Record.RecordPackage#getRecordFile_IsSelfDescribing()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSelfDescribing();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordFile#getIsSelfDescribing <em>Is Self Describing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Self Describing</em>' attribute.
	 * @see #getIsSelfDescribing()
	 * @generated
	 */
	void setIsSelfDescribing(Boolean value);

	/**
	 * Returns the value of the '<em><b>Record Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Delimiter</em>' attribute.
	 * @see #setRecordDelimiter(Integer)
	 * @see CWM.Record.RecordPackage#getRecordFile_RecordDelimiter()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getRecordDelimiter();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordFile#getRecordDelimiter <em>Record Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Delimiter</em>' attribute.
	 * @see #getRecordDelimiter()
	 * @generated
	 */
	void setRecordDelimiter(Integer value);

	/**
	 * Returns the value of the '<em><b>Skip Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Records</em>' attribute.
	 * @see #setSkipRecords(Integer)
	 * @see CWM.Record.RecordPackage#getRecordFile_SkipRecords()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getSkipRecords();

	/**
	 * Sets the value of the '{@link CWM.Record.RecordFile#getSkipRecords <em>Skip Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Records</em>' attribute.
	 * @see #getSkipRecords()
	 * @generated
	 */
	void setSkipRecords(Integer value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' reference list.
	 * The list contents are of type {@link CWM.Record.RecordDef}.
	 * It is bidirectional and its opposite is '{@link CWM.Record.RecordDef#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' reference list.
	 * @see CWM.Record.RecordPackage#getRecordFile_Record()
	 * @see CWM.Record.RecordDef#getFile
	 * @model opposite="file"
	 * @generated
	 */
	EList<RecordDef> getRecord();

} // RecordFile
