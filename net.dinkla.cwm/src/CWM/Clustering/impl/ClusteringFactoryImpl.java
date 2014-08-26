/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.impl;

import CWM.Clustering.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusteringFactoryImpl extends EFactoryImpl implements ClusteringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClusteringFactory init() {
		try {
			ClusteringFactory theClusteringFactory = (ClusteringFactory)EPackage.Registry.INSTANCE.getEFactory("Clustering"); 
			if (theClusteringFactory != null) {
				return theClusteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClusteringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClusteringPackage.CLUSTERING_ATTRIBUTE_USAGE: return createClusteringAttributeUsage();
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS: return createClusteringFunctionSettings();
			case ClusteringPackage.CLUSTERING_CONTAINER: return createClustering_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClusteringPackage.AGGREGATION_FUNCTION:
				return createAggregationFunctionFromString(eDataType, initialValue);
			case ClusteringPackage.ATTRIBUTE_COMPARISON_FUNCTION:
				return createAttributeComparisonFunctionFromString(eDataType, initialValue);
			case ClusteringPackage.CLUSTERING_MODEL_CBASIS:
				return createClusteringModelCBasisFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClusteringPackage.AGGREGATION_FUNCTION:
				return convertAggregationFunctionToString(eDataType, instanceValue);
			case ClusteringPackage.ATTRIBUTE_COMPARISON_FUNCTION:
				return convertAttributeComparisonFunctionToString(eDataType, instanceValue);
			case ClusteringPackage.CLUSTERING_MODEL_CBASIS:
				return convertClusteringModelCBasisToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringAttributeUsage createClusteringAttributeUsage() {
		ClusteringAttributeUsageImpl clusteringAttributeUsage = new ClusteringAttributeUsageImpl();
		return clusteringAttributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringFunctionSettings createClusteringFunctionSettings() {
		ClusteringFunctionSettingsImpl clusteringFunctionSettings = new ClusteringFunctionSettingsImpl();
		return clusteringFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clustering_container createClustering_container() {
		Clustering_containerImpl clustering_container = new Clustering_containerImpl();
		return clustering_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunction createAggregationFunctionFromString(EDataType eDataType, String initialValue) {
		AggregationFunction result = AggregationFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeComparisonFunction createAttributeComparisonFunctionFromString(EDataType eDataType, String initialValue) {
		AttributeComparisonFunction result = AttributeComparisonFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeComparisonFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringModelCBasis createClusteringModelCBasisFromString(EDataType eDataType, String initialValue) {
		ClusteringModelCBasis result = ClusteringModelCBasis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusteringModelCBasisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringPackage getClusteringPackage() {
		return (ClusteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClusteringPackage getPackage() {
		return ClusteringPackage.eINSTANCE;
	}

} //ClusteringFactoryImpl
