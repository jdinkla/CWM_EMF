/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.CategoryMatrix;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Clustering.ClusteringAttributeUsage#getAttributeComparisonFunction <em>Attribute Comparison Function</em>}</li>
 *   <li>{@link CWM.Clustering.ClusteringAttributeUsage#getSimilarityScale <em>Similarity Scale</em>}</li>
 *   <li>{@link CWM.Clustering.ClusteringAttributeUsage#getComparisonMatrix <em>Comparison Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Clustering.ClusteringPackage#getClusteringAttributeUsage()
 * @model
 * @generated
 */
public interface ClusteringAttributeUsage extends AttributeUsage {
	/**
	 * Returns the value of the '<em><b>Attribute Comparison Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Clustering.AttributeComparisonFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Comparison Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Comparison Function</em>' attribute.
	 * @see CWM.Clustering.AttributeComparisonFunction
	 * @see #setAttributeComparisonFunction(AttributeComparisonFunction)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringAttributeUsage_AttributeComparisonFunction()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	AttributeComparisonFunction getAttributeComparisonFunction();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringAttributeUsage#getAttributeComparisonFunction <em>Attribute Comparison Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Comparison Function</em>' attribute.
	 * @see CWM.Clustering.AttributeComparisonFunction
	 * @see #getAttributeComparisonFunction()
	 * @generated
	 */
	void setAttributeComparisonFunction(AttributeComparisonFunction value);

	/**
	 * Returns the value of the '<em><b>Similarity Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Similarity Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Similarity Scale</em>' attribute.
	 * @see #setSimilarityScale(Double)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringAttributeUsage_SimilarityScale()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getSimilarityScale();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringAttributeUsage#getSimilarityScale <em>Similarity Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Similarity Scale</em>' attribute.
	 * @see #getSimilarityScale()
	 * @generated
	 */
	void setSimilarityScale(Double value);

	/**
	 * Returns the value of the '<em><b>Comparison Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Matrix</em>' reference.
	 * @see #setComparisonMatrix(CategoryMatrix)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringAttributeUsage_ComparisonMatrix()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryMatrix getComparisonMatrix();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringAttributeUsage#getComparisonMatrix <em>Comparison Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Matrix</em>' reference.
	 * @see #getComparisonMatrix()
	 * @generated
	 */
	void setComparisonMatrix(CategoryMatrix value);

} // ClusteringAttributeUsage
