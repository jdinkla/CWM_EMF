/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relationships;

import CWM.Core.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relationships.AssociationEnd#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link CWM.Relationships.AssociationEnd#getIsNavigable <em>Is Navigable</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relationships.RelationshipsPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relationships.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see CWM.Relationships.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see CWM.Relationships.RelationshipsPackage#getAssociationEnd_Aggregation()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link CWM.Relationships.AssociationEnd#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see CWM.Relationships.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(Boolean)
	 * @see CWM.Relationships.RelationshipsPackage#getAssociationEnd_IsNavigable()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsNavigable();

	/**
	 * Sets the value of the '{@link CWM.Relationships.AssociationEnd#getIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #getIsNavigable()
	 * @generated
	 */
	void setIsNavigable(Boolean value);

} // AssociationEnd
