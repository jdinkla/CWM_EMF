/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.impl;

import CWM.Clustering.AttributeComparisonFunction;
import CWM.Clustering.ClusteringAttributeUsage;
import CWM.Clustering.ClusteringPackage;

import CWM.MiningCore.MiningData.CategoryMatrix;

import CWM.MiningCore.MiningData.impl.AttributeUsageImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Clustering.impl.ClusteringAttributeUsageImpl#getAttributeComparisonFunction <em>Attribute Comparison Function</em>}</li>
 *   <li>{@link CWM.Clustering.impl.ClusteringAttributeUsageImpl#getSimilarityScale <em>Similarity Scale</em>}</li>
 *   <li>{@link CWM.Clustering.impl.ClusteringAttributeUsageImpl#getComparisonMatrix <em>Comparison Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusteringAttributeUsageImpl extends AttributeUsageImpl implements ClusteringAttributeUsage {
	/**
	 * The default value of the '{@link #getAttributeComparisonFunction() <em>Attribute Comparison Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeComparisonFunction()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeComparisonFunction ATTRIBUTE_COMPARISON_FUNCTION_EDEFAULT = AttributeComparisonFunction.ABS_DIFF;

	/**
	 * The cached value of the '{@link #getAttributeComparisonFunction() <em>Attribute Comparison Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeComparisonFunction()
	 * @generated
	 * @ordered
	 */
	protected AttributeComparisonFunction attributeComparisonFunction = ATTRIBUTE_COMPARISON_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimilarityScale() <em>Similarity Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimilarityScale()
	 * @generated
	 * @ordered
	 */
	protected static final Double SIMILARITY_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimilarityScale() <em>Similarity Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimilarityScale()
	 * @generated
	 * @ordered
	 */
	protected Double similarityScale = SIMILARITY_SCALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisonMatrix() <em>Comparison Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonMatrix()
	 * @generated
	 * @ordered
	 */
	protected CategoryMatrix comparisonMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusteringAttributeUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClusteringPackage.Literals.CLUSTERING_ATTRIBUTE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeComparisonFunction getAttributeComparisonFunction() {
		return attributeComparisonFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeComparisonFunction(AttributeComparisonFunction newAttributeComparisonFunction) {
		AttributeComparisonFunction oldAttributeComparisonFunction = attributeComparisonFunction;
		attributeComparisonFunction = newAttributeComparisonFunction == null ? ATTRIBUTE_COMPARISON_FUNCTION_EDEFAULT : newAttributeComparisonFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION, oldAttributeComparisonFunction, attributeComparisonFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSimilarityScale() {
		return similarityScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimilarityScale(Double newSimilarityScale) {
		Double oldSimilarityScale = similarityScale;
		similarityScale = newSimilarityScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE, oldSimilarityScale, similarityScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix getComparisonMatrix() {
		if (comparisonMatrix != null && comparisonMatrix.eIsProxy()) {
			InternalEObject oldComparisonMatrix = (InternalEObject)comparisonMatrix;
			comparisonMatrix = (CategoryMatrix)eResolveProxy(oldComparisonMatrix);
			if (comparisonMatrix != oldComparisonMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX, oldComparisonMatrix, comparisonMatrix));
			}
		}
		return comparisonMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix basicGetComparisonMatrix() {
		return comparisonMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonMatrix(CategoryMatrix newComparisonMatrix) {
		CategoryMatrix oldComparisonMatrix = comparisonMatrix;
		comparisonMatrix = newComparisonMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX, oldComparisonMatrix, comparisonMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION:
				return getAttributeComparisonFunction();
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE:
				return getSimilarityScale();
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX:
				if (resolve) return getComparisonMatrix();
				return basicGetComparisonMatrix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION:
				setAttributeComparisonFunction((AttributeComparisonFunction)newValue);
				return;
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE:
				setSimilarityScale((Double)newValue);
				return;
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX:
				setComparisonMatrix((CategoryMatrix)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION:
				setAttributeComparisonFunction(ATTRIBUTE_COMPARISON_FUNCTION_EDEFAULT);
				return;
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE:
				setSimilarityScale(SIMILARITY_SCALE_EDEFAULT);
				return;
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX:
				setComparisonMatrix((CategoryMatrix)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION:
				return attributeComparisonFunction != ATTRIBUTE_COMPARISON_FUNCTION_EDEFAULT;
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE:
				return SIMILARITY_SCALE_EDEFAULT == null ? similarityScale != null : !SIMILARITY_SCALE_EDEFAULT.equals(similarityScale);
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX:
				return comparisonMatrix != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributeComparisonFunction: ");
		result.append(attributeComparisonFunction);
		result.append(", similarityScale: ");
		result.append(similarityScale);
		result.append(')');
		return result.toString();
	}

} //ClusteringAttributeUsageImpl
