/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM;

import CWM.Approximation.Approximation_container;

import CWM.AssociationRules.AssociationRules_container;

import CWM.AttributeImportance.AttributeImportance_container;

import CWM.Behavioral.Behavioral_container;

import CWM.BusinessInformation.BusinessInformation_container;

import CWM.BusinessNomenclature.BusinessNomenclature_container;

import CWM.CWMComplete.CWMComplete_container;

import CWM.Classification.Classification_container;

import CWM.Clustering.Clustering_container;

import CWM.Core.Core_container;

import CWM.CwmInstance.Instance_container;

import CWM.CwmTransformation.Transformation_container;

import CWM.CwmXml.XML_container;

import CWM.DataTypes.DataTypes_container;

import CWM.Expressions.Expressions_container;

import CWM.InformationVisualization.InformationVisualization_container;

import CWM.KeysIndexes.KeysIndexes_container;

import CWM.MiningCore.EntryPoint.EntryPoint_container;

import CWM.MiningCore.MiningCore_container;

import CWM.MiningCore.MiningData.MiningData_container;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container;

import CWM.MiningCore.MiningModel.MiningModel_container;

import CWM.MiningCore.MiningResult.MiningResult_container;

import CWM.MiningCore.MiningTask.MiningTask_container;

import CWM.Multidimensional.Multidimensional_container;

import CWM.Olap.Olap_container;

import CWM.Record.Record_container;

import CWM.Relational.Enumerations.Enumerations_container;

import CWM.Relational.Relational_container;

import CWM.Relationships.Relationships_container;

import CWM.SoftwareDeployment.SoftwareDeployment_container;

import CWM.Supervised.Supervised_container;

import CWM.TypeMapping.TypeMapping_container;

import CWM.WarehouseOperation.WarehouseOperation_container;

import CWM.WarehouseProcess.DataType.DataType_container;

import CWM.WarehouseProcess.Events.Events_container;

import CWM.WarehouseProcess.WarehouseProcess_container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CWM container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CWM_container#getCore <em>Core</em>}</li>
 *   <li>{@link CWM.CWM_container#getBehavioral <em>Behavioral</em>}</li>
 *   <li>{@link CWM.CWM_container#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link CWM.CWM_container#getInstance <em>Instance</em>}</li>
 *   <li>{@link CWM.CWM_container#getBusinessInformation <em>Business Information</em>}</li>
 *   <li>{@link CWM.CWM_container#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link CWM.CWM_container#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link CWM.CWM_container#getKeysIndexes <em>Keys Indexes</em>}</li>
 *   <li>{@link CWM.CWM_container#getSoftwareDeployment <em>Software Deployment</em>}</li>
 *   <li>{@link CWM.CWM_container#getTypeMapping <em>Type Mapping</em>}</li>
 *   <li>{@link CWM.CWM_container#getRelational <em>Relational</em>}</li>
 *   <li>{@link CWM.CWM_container#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link CWM.CWM_container#getRecord <em>Record</em>}</li>
 *   <li>{@link CWM.CWM_container#getMultidimensional <em>Multidimensional</em>}</li>
 *   <li>{@link CWM.CWM_container#getXML <em>XML</em>}</li>
 *   <li>{@link CWM.CWM_container#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CWM_container#getOlap <em>Olap</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningCore <em>Mining Core</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningData <em>Mining Data</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningResult <em>Mining Result</em>}</li>
 *   <li>{@link CWM.CWM_container#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.CWM_container#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link CWM.CWM_container#getClustering <em>Clustering</em>}</li>
 *   <li>{@link CWM.CWM_container#getAssociationRules <em>Association Rules</em>}</li>
 *   <li>{@link CWM.CWM_container#getSupervised <em>Supervised</em>}</li>
 *   <li>{@link CWM.CWM_container#getClassification <em>Classification</em>}</li>
 *   <li>{@link CWM.CWM_container#getApproximation <em>Approximation</em>}</li>
 *   <li>{@link CWM.CWM_container#getAttributeImportance <em>Attribute Importance</em>}</li>
 *   <li>{@link CWM.CWM_container#getInformationVisualization <em>Information Visualization</em>}</li>
 *   <li>{@link CWM.CWM_container#getBusinessNomenclature <em>Business Nomenclature</em>}</li>
 *   <li>{@link CWM.CWM_container#getWarehouseProcess <em>Warehouse Process</em>}</li>
 *   <li>{@link CWM.CWM_container#getDataType <em>Data Type</em>}</li>
 *   <li>{@link CWM.CWM_container#getEvents <em>Events</em>}</li>
 *   <li>{@link CWM.CWM_container#getWarehouseOperation <em>Warehouse Operation</em>}</li>
 *   <li>{@link CWM.CWM_container#getCWMComplete <em>CWM Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CWMPackage#getCWM_container()
 * @model
 * @generated
 */
public interface CWM_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' containment reference.
	 * @see #setCore(Core_container)
	 * @see CWM.CWMPackage#getCWM_container_Core()
	 * @model containment="true"
	 * @generated
	 */
	Core_container getCore();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getCore <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' containment reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core_container value);

	/**
	 * Returns the value of the '<em><b>Behavioral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral</em>' containment reference.
	 * @see #setBehavioral(Behavioral_container)
	 * @see CWM.CWMPackage#getCWM_container_Behavioral()
	 * @model containment="true"
	 * @generated
	 */
	Behavioral_container getBehavioral();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getBehavioral <em>Behavioral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral</em>' containment reference.
	 * @see #getBehavioral()
	 * @generated
	 */
	void setBehavioral(Behavioral_container value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference.
	 * @see #setRelationships(Relationships_container)
	 * @see CWM.CWMPackage#getCWM_container_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	Relationships_container getRelationships();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getRelationships <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationships</em>' containment reference.
	 * @see #getRelationships()
	 * @generated
	 */
	void setRelationships(Relationships_container value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Instance_container)
	 * @see CWM.CWMPackage#getCWM_container_Instance()
	 * @model containment="true"
	 * @generated
	 */
	Instance_container getInstance();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance_container value);

	/**
	 * Returns the value of the '<em><b>Business Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Information</em>' containment reference.
	 * @see #setBusinessInformation(BusinessInformation_container)
	 * @see CWM.CWMPackage#getCWM_container_BusinessInformation()
	 * @model containment="true"
	 * @generated
	 */
	BusinessInformation_container getBusinessInformation();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getBusinessInformation <em>Business Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Information</em>' containment reference.
	 * @see #getBusinessInformation()
	 * @generated
	 */
	void setBusinessInformation(BusinessInformation_container value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference.
	 * @see #setDataTypes(DataTypes_container)
	 * @see CWM.CWMPackage#getCWM_container_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	DataTypes_container getDataTypes();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getDataTypes <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Types</em>' containment reference.
	 * @see #getDataTypes()
	 * @generated
	 */
	void setDataTypes(DataTypes_container value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference.
	 * @see #setExpressions(Expressions_container)
	 * @see CWM.CWMPackage#getCWM_container_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	Expressions_container getExpressions();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getExpressions <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' containment reference.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(Expressions_container value);

	/**
	 * Returns the value of the '<em><b>Keys Indexes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys Indexes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys Indexes</em>' containment reference.
	 * @see #setKeysIndexes(KeysIndexes_container)
	 * @see CWM.CWMPackage#getCWM_container_KeysIndexes()
	 * @model containment="true"
	 * @generated
	 */
	KeysIndexes_container getKeysIndexes();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getKeysIndexes <em>Keys Indexes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys Indexes</em>' containment reference.
	 * @see #getKeysIndexes()
	 * @generated
	 */
	void setKeysIndexes(KeysIndexes_container value);

	/**
	 * Returns the value of the '<em><b>Software Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Deployment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Deployment</em>' containment reference.
	 * @see #setSoftwareDeployment(SoftwareDeployment_container)
	 * @see CWM.CWMPackage#getCWM_container_SoftwareDeployment()
	 * @model containment="true"
	 * @generated
	 */
	SoftwareDeployment_container getSoftwareDeployment();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getSoftwareDeployment <em>Software Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Deployment</em>' containment reference.
	 * @see #getSoftwareDeployment()
	 * @generated
	 */
	void setSoftwareDeployment(SoftwareDeployment_container value);

	/**
	 * Returns the value of the '<em><b>Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mapping</em>' containment reference.
	 * @see #setTypeMapping(TypeMapping_container)
	 * @see CWM.CWMPackage#getCWM_container_TypeMapping()
	 * @model containment="true"
	 * @generated
	 */
	TypeMapping_container getTypeMapping();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getTypeMapping <em>Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mapping</em>' containment reference.
	 * @see #getTypeMapping()
	 * @generated
	 */
	void setTypeMapping(TypeMapping_container value);

	/**
	 * Returns the value of the '<em><b>Relational</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational</em>' containment reference.
	 * @see #setRelational(Relational_container)
	 * @see CWM.CWMPackage#getCWM_container_Relational()
	 * @model containment="true"
	 * @generated
	 */
	Relational_container getRelational();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getRelational <em>Relational</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational</em>' containment reference.
	 * @see #getRelational()
	 * @generated
	 */
	void setRelational(Relational_container value);

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference.
	 * @see #setEnumerations(Enumerations_container)
	 * @see CWM.CWMPackage#getCWM_container_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	Enumerations_container getEnumerations();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getEnumerations <em>Enumerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerations</em>' containment reference.
	 * @see #getEnumerations()
	 * @generated
	 */
	void setEnumerations(Enumerations_container value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(Record_container)
	 * @see CWM.CWMPackage#getCWM_container_Record()
	 * @model containment="true"
	 * @generated
	 */
	Record_container getRecord();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(Record_container value);

	/**
	 * Returns the value of the '<em><b>Multidimensional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidimensional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multidimensional</em>' containment reference.
	 * @see #setMultidimensional(Multidimensional_container)
	 * @see CWM.CWMPackage#getCWM_container_Multidimensional()
	 * @model containment="true"
	 * @generated
	 */
	Multidimensional_container getMultidimensional();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMultidimensional <em>Multidimensional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidimensional</em>' containment reference.
	 * @see #getMultidimensional()
	 * @generated
	 */
	void setMultidimensional(Multidimensional_container value);

	/**
	 * Returns the value of the '<em><b>XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XML</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XML</em>' containment reference.
	 * @see #setXML(XML_container)
	 * @see CWM.CWMPackage#getCWM_container_XML()
	 * @model containment="true"
	 * @generated
	 */
	XML_container getXML();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getXML <em>XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML</em>' containment reference.
	 * @see #getXML()
	 * @generated
	 */
	void setXML(XML_container value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Transformation_container)
	 * @see CWM.CWMPackage#getCWM_container_Transformation()
	 * @model containment="true"
	 * @generated
	 */
	Transformation_container getTransformation();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation_container value);

	/**
	 * Returns the value of the '<em><b>Olap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Olap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Olap</em>' containment reference.
	 * @see #setOlap(Olap_container)
	 * @see CWM.CWMPackage#getCWM_container_Olap()
	 * @model containment="true"
	 * @generated
	 */
	Olap_container getOlap();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getOlap <em>Olap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Olap</em>' containment reference.
	 * @see #getOlap()
	 * @generated
	 */
	void setOlap(Olap_container value);

	/**
	 * Returns the value of the '<em><b>Mining Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Core</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Core</em>' containment reference.
	 * @see #setMiningCore(MiningCore_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningCore()
	 * @model containment="true"
	 * @generated
	 */
	MiningCore_container getMiningCore();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningCore <em>Mining Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Core</em>' containment reference.
	 * @see #getMiningCore()
	 * @generated
	 */
	void setMiningCore(MiningCore_container value);

	/**
	 * Returns the value of the '<em><b>Mining Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Data</em>' containment reference.
	 * @see #setMiningData(MiningData_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningData()
	 * @model containment="true"
	 * @generated
	 */
	MiningData_container getMiningData();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningData <em>Mining Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Data</em>' containment reference.
	 * @see #getMiningData()
	 * @generated
	 */
	void setMiningData(MiningData_container value);

	/**
	 * Returns the value of the '<em><b>Mining Function Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Function Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Function Settings</em>' containment reference.
	 * @see #setMiningFunctionSettings(MiningFunctionSettings_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	MiningFunctionSettings_container getMiningFunctionSettings();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningFunctionSettings <em>Mining Function Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Function Settings</em>' containment reference.
	 * @see #getMiningFunctionSettings()
	 * @generated
	 */
	void setMiningFunctionSettings(MiningFunctionSettings_container value);

	/**
	 * Returns the value of the '<em><b>Mining Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model</em>' containment reference.
	 * @see #setMiningModel(MiningModel_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningModel()
	 * @model containment="true"
	 * @generated
	 */
	MiningModel_container getMiningModel();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningModel <em>Mining Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model</em>' containment reference.
	 * @see #getMiningModel()
	 * @generated
	 */
	void setMiningModel(MiningModel_container value);

	/**
	 * Returns the value of the '<em><b>Mining Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Result</em>' containment reference.
	 * @see #setMiningResult(MiningResult_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningResult()
	 * @model containment="true"
	 * @generated
	 */
	MiningResult_container getMiningResult();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningResult <em>Mining Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Result</em>' containment reference.
	 * @see #getMiningResult()
	 * @generated
	 */
	void setMiningResult(MiningResult_container value);

	/**
	 * Returns the value of the '<em><b>Mining Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Task</em>' containment reference.
	 * @see #setMiningTask(MiningTask_container)
	 * @see CWM.CWMPackage#getCWM_container_MiningTask()
	 * @model containment="true"
	 * @generated
	 */
	MiningTask_container getMiningTask();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getMiningTask <em>Mining Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Task</em>' containment reference.
	 * @see #getMiningTask()
	 * @generated
	 */
	void setMiningTask(MiningTask_container value);

	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference.
	 * @see #setEntryPoint(EntryPoint_container)
	 * @see CWM.CWMPackage#getCWM_container_EntryPoint()
	 * @model containment="true"
	 * @generated
	 */
	EntryPoint_container getEntryPoint();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getEntryPoint <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' containment reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(EntryPoint_container value);

	/**
	 * Returns the value of the '<em><b>Clustering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clustering</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clustering</em>' containment reference.
	 * @see #setClustering(Clustering_container)
	 * @see CWM.CWMPackage#getCWM_container_Clustering()
	 * @model containment="true"
	 * @generated
	 */
	Clustering_container getClustering();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getClustering <em>Clustering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clustering</em>' containment reference.
	 * @see #getClustering()
	 * @generated
	 */
	void setClustering(Clustering_container value);

	/**
	 * Returns the value of the '<em><b>Association Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Rules</em>' containment reference.
	 * @see #setAssociationRules(AssociationRules_container)
	 * @see CWM.CWMPackage#getCWM_container_AssociationRules()
	 * @model containment="true"
	 * @generated
	 */
	AssociationRules_container getAssociationRules();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getAssociationRules <em>Association Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Rules</em>' containment reference.
	 * @see #getAssociationRules()
	 * @generated
	 */
	void setAssociationRules(AssociationRules_container value);

	/**
	 * Returns the value of the '<em><b>Supervised</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervised</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervised</em>' containment reference.
	 * @see #setSupervised(Supervised_container)
	 * @see CWM.CWMPackage#getCWM_container_Supervised()
	 * @model containment="true"
	 * @generated
	 */
	Supervised_container getSupervised();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getSupervised <em>Supervised</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervised</em>' containment reference.
	 * @see #getSupervised()
	 * @generated
	 */
	void setSupervised(Supervised_container value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(Classification_container)
	 * @see CWM.CWMPackage#getCWM_container_Classification()
	 * @model containment="true"
	 * @generated
	 */
	Classification_container getClassification();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification_container value);

	/**
	 * Returns the value of the '<em><b>Approximation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approximation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approximation</em>' containment reference.
	 * @see #setApproximation(Approximation_container)
	 * @see CWM.CWMPackage#getCWM_container_Approximation()
	 * @model containment="true"
	 * @generated
	 */
	Approximation_container getApproximation();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getApproximation <em>Approximation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approximation</em>' containment reference.
	 * @see #getApproximation()
	 * @generated
	 */
	void setApproximation(Approximation_container value);

	/**
	 * Returns the value of the '<em><b>Attribute Importance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Importance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Importance</em>' containment reference.
	 * @see #setAttributeImportance(AttributeImportance_container)
	 * @see CWM.CWMPackage#getCWM_container_AttributeImportance()
	 * @model containment="true"
	 * @generated
	 */
	AttributeImportance_container getAttributeImportance();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getAttributeImportance <em>Attribute Importance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Importance</em>' containment reference.
	 * @see #getAttributeImportance()
	 * @generated
	 */
	void setAttributeImportance(AttributeImportance_container value);

	/**
	 * Returns the value of the '<em><b>Information Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Visualization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Visualization</em>' containment reference.
	 * @see #setInformationVisualization(InformationVisualization_container)
	 * @see CWM.CWMPackage#getCWM_container_InformationVisualization()
	 * @model containment="true"
	 * @generated
	 */
	InformationVisualization_container getInformationVisualization();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getInformationVisualization <em>Information Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Visualization</em>' containment reference.
	 * @see #getInformationVisualization()
	 * @generated
	 */
	void setInformationVisualization(InformationVisualization_container value);

	/**
	 * Returns the value of the '<em><b>Business Nomenclature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Nomenclature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Nomenclature</em>' containment reference.
	 * @see #setBusinessNomenclature(BusinessNomenclature_container)
	 * @see CWM.CWMPackage#getCWM_container_BusinessNomenclature()
	 * @model containment="true"
	 * @generated
	 */
	BusinessNomenclature_container getBusinessNomenclature();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getBusinessNomenclature <em>Business Nomenclature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Nomenclature</em>' containment reference.
	 * @see #getBusinessNomenclature()
	 * @generated
	 */
	void setBusinessNomenclature(BusinessNomenclature_container value);

	/**
	 * Returns the value of the '<em><b>Warehouse Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Process</em>' containment reference.
	 * @see #setWarehouseProcess(WarehouseProcess_container)
	 * @see CWM.CWMPackage#getCWM_container_WarehouseProcess()
	 * @model containment="true"
	 * @generated
	 */
	WarehouseProcess_container getWarehouseProcess();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getWarehouseProcess <em>Warehouse Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warehouse Process</em>' containment reference.
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	void setWarehouseProcess(WarehouseProcess_container value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataType_container)
	 * @see CWM.CWMPackage#getCWM_container_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataType_container getDataType();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType_container value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference.
	 * @see #setEvents(Events_container)
	 * @see CWM.CWMPackage#getCWM_container_Events()
	 * @model containment="true"
	 * @generated
	 */
	Events_container getEvents();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' containment reference.
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(Events_container value);

	/**
	 * Returns the value of the '<em><b>Warehouse Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Operation</em>' containment reference.
	 * @see #setWarehouseOperation(WarehouseOperation_container)
	 * @see CWM.CWMPackage#getCWM_container_WarehouseOperation()
	 * @model containment="true"
	 * @generated
	 */
	WarehouseOperation_container getWarehouseOperation();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getWarehouseOperation <em>Warehouse Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warehouse Operation</em>' containment reference.
	 * @see #getWarehouseOperation()
	 * @generated
	 */
	void setWarehouseOperation(WarehouseOperation_container value);

	/**
	 * Returns the value of the '<em><b>CWM Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CWM Complete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CWM Complete</em>' containment reference.
	 * @see #setCWMComplete(CWMComplete_container)
	 * @see CWM.CWMPackage#getCWM_container_CWMComplete()
	 * @model containment="true"
	 * @generated
	 */
	CWMComplete_container getCWMComplete();

	/**
	 * Sets the value of the '{@link CWM.CWM_container#getCWMComplete <em>CWM Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CWM Complete</em>' containment reference.
	 * @see #getCWMComplete()
	 * @generated
	 */
	void setCWMComplete(CWMComplete_container value);

} // CWM_container
