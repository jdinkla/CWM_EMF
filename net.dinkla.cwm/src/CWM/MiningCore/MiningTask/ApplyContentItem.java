/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Content Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.ApplyContentItem#getTopNthIndex <em>Top Nth Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getApplyContentItem()
 * @model abstract="true"
 * @generated
 */
public interface ApplyContentItem extends ApplyOutputItem {
	/**
	 * Returns the value of the '<em><b>Top Nth Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Nth Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Nth Index</em>' attribute.
	 * @see #setTopNthIndex(Integer)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getApplyContentItem_TopNthIndex()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getTopNthIndex();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.ApplyContentItem#getTopNthIndex <em>Top Nth Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Nth Index</em>' attribute.
	 * @see #getTopNthIndex()
	 * @generated
	 */
	void setTopNthIndex(Integer value);

} // ApplyContentItem
