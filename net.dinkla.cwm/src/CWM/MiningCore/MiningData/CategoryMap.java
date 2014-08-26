/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMap#getIsMultiLevel <em>Is Multi Level</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMap#getIsItemMap <em>Is Item Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMap()
 * @model
 * @generated
 */
public interface CategoryMap extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Multi Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multi Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multi Level</em>' attribute.
	 * @see #setIsMultiLevel(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMap_IsMultiLevel()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsMultiLevel();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMap#getIsMultiLevel <em>Is Multi Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi Level</em>' attribute.
	 * @see #getIsMultiLevel()
	 * @generated
	 */
	void setIsMultiLevel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Item Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Item Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Item Map</em>' attribute.
	 * @see #setIsItemMap(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMap_IsItemMap()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsItemMap();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMap#getIsItemMap <em>Is Item Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Item Map</em>' attribute.
	 * @see #getIsItemMap()
	 * @generated
	 */
	void setIsItemMap(Boolean value);

} // CategoryMap
