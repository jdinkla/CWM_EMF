/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.impl;

import CWM.Approximation.Approximation_container;

import CWM.AssociationRules.AssociationRules_container;

import CWM.AttributeImportance.AttributeImportance_container;

import CWM.Behavioral.Behavioral_container;

import CWM.BusinessInformation.BusinessInformation_container;

import CWM.BusinessNomenclature.BusinessNomenclature_container;

import CWM.CWMComplete.CWMComplete_container;

import CWM.CWMPackage;
import CWM.CWM_container;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWM container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.impl.CWM_containerImpl#getCore <em>Core</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getBehavioral <em>Behavioral</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getBusinessInformation <em>Business Information</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getKeysIndexes <em>Keys Indexes</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getSoftwareDeployment <em>Software Deployment</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getTypeMapping <em>Type Mapping</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getRelational <em>Relational</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMultidimensional <em>Multidimensional</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getXML <em>XML</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getOlap <em>Olap</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningCore <em>Mining Core</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningData <em>Mining Data</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningResult <em>Mining Result</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getClustering <em>Clustering</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getAssociationRules <em>Association Rules</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getSupervised <em>Supervised</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getApproximation <em>Approximation</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getAttributeImportance <em>Attribute Importance</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getInformationVisualization <em>Information Visualization</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getBusinessNomenclature <em>Business Nomenclature</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getWarehouseProcess <em>Warehouse Process</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getWarehouseOperation <em>Warehouse Operation</em>}</li>
 *   <li>{@link CWM.impl.CWM_containerImpl#getCWMComplete <em>CWM Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CWM_containerImpl extends EObjectImpl implements CWM_container {
	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Core_container core;

	/**
	 * The cached value of the '{@link #getBehavioral() <em>Behavioral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioral()
	 * @generated
	 * @ordered
	 */
	protected Behavioral_container behavioral;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected Relationships_container relationships;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Instance_container instance;

	/**
	 * The cached value of the '{@link #getBusinessInformation() <em>Business Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessInformation()
	 * @generated
	 * @ordered
	 */
	protected BusinessInformation_container businessInformation;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected DataTypes_container dataTypes;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected Expressions_container expressions;

	/**
	 * The cached value of the '{@link #getKeysIndexes() <em>Keys Indexes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysIndexes()
	 * @generated
	 * @ordered
	 */
	protected KeysIndexes_container keysIndexes;

	/**
	 * The cached value of the '{@link #getSoftwareDeployment() <em>Software Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareDeployment()
	 * @generated
	 * @ordered
	 */
	protected SoftwareDeployment_container softwareDeployment;

	/**
	 * The cached value of the '{@link #getTypeMapping() <em>Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected TypeMapping_container typeMapping;

	/**
	 * The cached value of the '{@link #getRelational() <em>Relational</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelational()
	 * @generated
	 * @ordered
	 */
	protected Relational_container relational;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected Enumerations_container enumerations;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected Record_container record;

	/**
	 * The cached value of the '{@link #getMultidimensional() <em>Multidimensional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidimensional()
	 * @generated
	 * @ordered
	 */
	protected Multidimensional_container multidimensional;

	/**
	 * The cached value of the '{@link #getXML() <em>XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXML()
	 * @generated
	 * @ordered
	 */
	protected XML_container xml;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation_container transformation;

	/**
	 * The cached value of the '{@link #getOlap() <em>Olap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOlap()
	 * @generated
	 * @ordered
	 */
	protected Olap_container olap;

	/**
	 * The cached value of the '{@link #getMiningCore() <em>Mining Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningCore()
	 * @generated
	 * @ordered
	 */
	protected MiningCore_container miningCore;

	/**
	 * The cached value of the '{@link #getMiningData() <em>Mining Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningData()
	 * @generated
	 * @ordered
	 */
	protected MiningData_container miningData;

	/**
	 * The cached value of the '{@link #getMiningFunctionSettings() <em>Mining Function Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected MiningFunctionSettings_container miningFunctionSettings;

	/**
	 * The cached value of the '{@link #getMiningModel() <em>Mining Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModel()
	 * @generated
	 * @ordered
	 */
	protected MiningModel_container miningModel;

	/**
	 * The cached value of the '{@link #getMiningResult() <em>Mining Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningResult()
	 * @generated
	 * @ordered
	 */
	protected MiningResult_container miningResult;

	/**
	 * The cached value of the '{@link #getMiningTask() <em>Mining Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTask()
	 * @generated
	 * @ordered
	 */
	protected MiningTask_container miningTask;

	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint_container entryPoint;

	/**
	 * The cached value of the '{@link #getClustering() <em>Clustering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClustering()
	 * @generated
	 * @ordered
	 */
	protected Clustering_container clustering;

	/**
	 * The cached value of the '{@link #getAssociationRules() <em>Association Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRules()
	 * @generated
	 * @ordered
	 */
	protected AssociationRules_container associationRules;

	/**
	 * The cached value of the '{@link #getSupervised() <em>Supervised</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervised()
	 * @generated
	 * @ordered
	 */
	protected Supervised_container supervised;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification_container classification;

	/**
	 * The cached value of the '{@link #getApproximation() <em>Approximation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproximation()
	 * @generated
	 * @ordered
	 */
	protected Approximation_container approximation;

	/**
	 * The cached value of the '{@link #getAttributeImportance() <em>Attribute Importance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeImportance()
	 * @generated
	 * @ordered
	 */
	protected AttributeImportance_container attributeImportance;

	/**
	 * The cached value of the '{@link #getInformationVisualization() <em>Information Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationVisualization()
	 * @generated
	 * @ordered
	 */
	protected InformationVisualization_container informationVisualization;

	/**
	 * The cached value of the '{@link #getBusinessNomenclature() <em>Business Nomenclature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessNomenclature()
	 * @generated
	 * @ordered
	 */
	protected BusinessNomenclature_container businessNomenclature;

	/**
	 * The cached value of the '{@link #getWarehouseProcess() <em>Warehouse Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseProcess()
	 * @generated
	 * @ordered
	 */
	protected WarehouseProcess_container warehouseProcess;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType_container dataType;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected Events_container events;

	/**
	 * The cached value of the '{@link #getWarehouseOperation() <em>Warehouse Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseOperation()
	 * @generated
	 * @ordered
	 */
	protected WarehouseOperation_container warehouseOperation;

	/**
	 * The cached value of the '{@link #getCWMComplete() <em>CWM Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWMComplete()
	 * @generated
	 * @ordered
	 */
	protected CWMComplete_container cwmComplete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWM_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWMPackage.Literals.CWM_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core_container getCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Core_container newCore, NotificationChain msgs) {
		Core_container oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CORE, oldCore, newCore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Core_container newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject)core).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CORE, null, msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CORE, null, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavioral_container getBehavioral() {
		return behavioral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioral(Behavioral_container newBehavioral, NotificationChain msgs) {
		Behavioral_container oldBehavioral = behavioral;
		behavioral = newBehavioral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BEHAVIORAL, oldBehavioral, newBehavioral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioral(Behavioral_container newBehavioral) {
		if (newBehavioral != behavioral) {
			NotificationChain msgs = null;
			if (behavioral != null)
				msgs = ((InternalEObject)behavioral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BEHAVIORAL, null, msgs);
			if (newBehavioral != null)
				msgs = ((InternalEObject)newBehavioral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BEHAVIORAL, null, msgs);
			msgs = basicSetBehavioral(newBehavioral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BEHAVIORAL, newBehavioral, newBehavioral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships_container getRelationships() {
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationships(Relationships_container newRelationships, NotificationChain msgs) {
		Relationships_container oldRelationships = relationships;
		relationships = newRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RELATIONSHIPS, oldRelationships, newRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationships(Relationships_container newRelationships) {
		if (newRelationships != relationships) {
			NotificationChain msgs = null;
			if (relationships != null)
				msgs = ((InternalEObject)relationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RELATIONSHIPS, null, msgs);
			if (newRelationships != null)
				msgs = ((InternalEObject)newRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RELATIONSHIPS, null, msgs);
			msgs = basicSetRelationships(newRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RELATIONSHIPS, newRelationships, newRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_container getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(Instance_container newInstance, NotificationChain msgs) {
		Instance_container oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Instance_container newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInformation_container getBusinessInformation() {
		return businessInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessInformation(BusinessInformation_container newBusinessInformation, NotificationChain msgs) {
		BusinessInformation_container oldBusinessInformation = businessInformation;
		businessInformation = newBusinessInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION, oldBusinessInformation, newBusinessInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessInformation(BusinessInformation_container newBusinessInformation) {
		if (newBusinessInformation != businessInformation) {
			NotificationChain msgs = null;
			if (businessInformation != null)
				msgs = ((InternalEObject)businessInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION, null, msgs);
			if (newBusinessInformation != null)
				msgs = ((InternalEObject)newBusinessInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION, null, msgs);
			msgs = basicSetBusinessInformation(newBusinessInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION, newBusinessInformation, newBusinessInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes_container getDataTypes() {
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypes(DataTypes_container newDataTypes, NotificationChain msgs) {
		DataTypes_container oldDataTypes = dataTypes;
		dataTypes = newDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__DATA_TYPES, oldDataTypes, newDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypes(DataTypes_container newDataTypes) {
		if (newDataTypes != dataTypes) {
			NotificationChain msgs = null;
			if (dataTypes != null)
				msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__DATA_TYPES, null, msgs);
			if (newDataTypes != null)
				msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__DATA_TYPES, null, msgs);
			msgs = basicSetDataTypes(newDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__DATA_TYPES, newDataTypes, newDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressions_container getExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressions(Expressions_container newExpressions, NotificationChain msgs) {
		Expressions_container oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__EXPRESSIONS, oldExpressions, newExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressions(Expressions_container newExpressions) {
		if (newExpressions != expressions) {
			NotificationChain msgs = null;
			if (expressions != null)
				msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__EXPRESSIONS, null, msgs);
			if (newExpressions != null)
				msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__EXPRESSIONS, null, msgs);
			msgs = basicSetExpressions(newExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__EXPRESSIONS, newExpressions, newExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysIndexes_container getKeysIndexes() {
		return keysIndexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeysIndexes(KeysIndexes_container newKeysIndexes, NotificationChain msgs) {
		KeysIndexes_container oldKeysIndexes = keysIndexes;
		keysIndexes = newKeysIndexes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__KEYS_INDEXES, oldKeysIndexes, newKeysIndexes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeysIndexes(KeysIndexes_container newKeysIndexes) {
		if (newKeysIndexes != keysIndexes) {
			NotificationChain msgs = null;
			if (keysIndexes != null)
				msgs = ((InternalEObject)keysIndexes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__KEYS_INDEXES, null, msgs);
			if (newKeysIndexes != null)
				msgs = ((InternalEObject)newKeysIndexes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__KEYS_INDEXES, null, msgs);
			msgs = basicSetKeysIndexes(newKeysIndexes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__KEYS_INDEXES, newKeysIndexes, newKeysIndexes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareDeployment_container getSoftwareDeployment() {
		return softwareDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareDeployment(SoftwareDeployment_container newSoftwareDeployment, NotificationChain msgs) {
		SoftwareDeployment_container oldSoftwareDeployment = softwareDeployment;
		softwareDeployment = newSoftwareDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT, oldSoftwareDeployment, newSoftwareDeployment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareDeployment(SoftwareDeployment_container newSoftwareDeployment) {
		if (newSoftwareDeployment != softwareDeployment) {
			NotificationChain msgs = null;
			if (softwareDeployment != null)
				msgs = ((InternalEObject)softwareDeployment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT, null, msgs);
			if (newSoftwareDeployment != null)
				msgs = ((InternalEObject)newSoftwareDeployment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT, null, msgs);
			msgs = basicSetSoftwareDeployment(newSoftwareDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT, newSoftwareDeployment, newSoftwareDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapping_container getTypeMapping() {
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMapping(TypeMapping_container newTypeMapping, NotificationChain msgs) {
		TypeMapping_container oldTypeMapping = typeMapping;
		typeMapping = newTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__TYPE_MAPPING, oldTypeMapping, newTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMapping(TypeMapping_container newTypeMapping) {
		if (newTypeMapping != typeMapping) {
			NotificationChain msgs = null;
			if (typeMapping != null)
				msgs = ((InternalEObject)typeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__TYPE_MAPPING, null, msgs);
			if (newTypeMapping != null)
				msgs = ((InternalEObject)newTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__TYPE_MAPPING, null, msgs);
			msgs = basicSetTypeMapping(newTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__TYPE_MAPPING, newTypeMapping, newTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relational_container getRelational() {
		return relational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelational(Relational_container newRelational, NotificationChain msgs) {
		Relational_container oldRelational = relational;
		relational = newRelational;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RELATIONAL, oldRelational, newRelational);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelational(Relational_container newRelational) {
		if (newRelational != relational) {
			NotificationChain msgs = null;
			if (relational != null)
				msgs = ((InternalEObject)relational).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RELATIONAL, null, msgs);
			if (newRelational != null)
				msgs = ((InternalEObject)newRelational).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RELATIONAL, null, msgs);
			msgs = basicSetRelational(newRelational, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RELATIONAL, newRelational, newRelational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerations_container getEnumerations() {
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerations(Enumerations_container newEnumerations, NotificationChain msgs) {
		Enumerations_container oldEnumerations = enumerations;
		enumerations = newEnumerations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ENUMERATIONS, oldEnumerations, newEnumerations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerations(Enumerations_container newEnumerations) {
		if (newEnumerations != enumerations) {
			NotificationChain msgs = null;
			if (enumerations != null)
				msgs = ((InternalEObject)enumerations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ENUMERATIONS, null, msgs);
			if (newEnumerations != null)
				msgs = ((InternalEObject)newEnumerations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ENUMERATIONS, null, msgs);
			msgs = basicSetEnumerations(newEnumerations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ENUMERATIONS, newEnumerations, newEnumerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record_container getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(Record_container newRecord, NotificationChain msgs) {
		Record_container oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RECORD, oldRecord, newRecord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord(Record_container newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multidimensional_container getMultidimensional() {
		return multidimensional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultidimensional(Multidimensional_container newMultidimensional, NotificationChain msgs) {
		Multidimensional_container oldMultidimensional = multidimensional;
		multidimensional = newMultidimensional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL, oldMultidimensional, newMultidimensional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultidimensional(Multidimensional_container newMultidimensional) {
		if (newMultidimensional != multidimensional) {
			NotificationChain msgs = null;
			if (multidimensional != null)
				msgs = ((InternalEObject)multidimensional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL, null, msgs);
			if (newMultidimensional != null)
				msgs = ((InternalEObject)newMultidimensional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL, null, msgs);
			msgs = basicSetMultidimensional(newMultidimensional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL, newMultidimensional, newMultidimensional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XML_container getXML() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXML(XML_container newXML, NotificationChain msgs) {
		XML_container oldXML = xml;
		xml = newXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__XML, oldXML, newXML);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXML(XML_container newXML) {
		if (newXML != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__XML, null, msgs);
			if (newXML != null)
				msgs = ((InternalEObject)newXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__XML, null, msgs);
			msgs = basicSetXML(newXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__XML, newXML, newXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_container getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation_container newTransformation, NotificationChain msgs) {
		Transformation_container oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation_container newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Olap_container getOlap() {
		return olap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOlap(Olap_container newOlap, NotificationChain msgs) {
		Olap_container oldOlap = olap;
		olap = newOlap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__OLAP, oldOlap, newOlap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOlap(Olap_container newOlap) {
		if (newOlap != olap) {
			NotificationChain msgs = null;
			if (olap != null)
				msgs = ((InternalEObject)olap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__OLAP, null, msgs);
			if (newOlap != null)
				msgs = ((InternalEObject)newOlap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__OLAP, null, msgs);
			msgs = basicSetOlap(newOlap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__OLAP, newOlap, newOlap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningCore_container getMiningCore() {
		return miningCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningCore(MiningCore_container newMiningCore, NotificationChain msgs) {
		MiningCore_container oldMiningCore = miningCore;
		miningCore = newMiningCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_CORE, oldMiningCore, newMiningCore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningCore(MiningCore_container newMiningCore) {
		if (newMiningCore != miningCore) {
			NotificationChain msgs = null;
			if (miningCore != null)
				msgs = ((InternalEObject)miningCore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_CORE, null, msgs);
			if (newMiningCore != null)
				msgs = ((InternalEObject)newMiningCore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_CORE, null, msgs);
			msgs = basicSetMiningCore(newMiningCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_CORE, newMiningCore, newMiningCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningData_container getMiningData() {
		return miningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningData(MiningData_container newMiningData, NotificationChain msgs) {
		MiningData_container oldMiningData = miningData;
		miningData = newMiningData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_DATA, oldMiningData, newMiningData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningData(MiningData_container newMiningData) {
		if (newMiningData != miningData) {
			NotificationChain msgs = null;
			if (miningData != null)
				msgs = ((InternalEObject)miningData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_DATA, null, msgs);
			if (newMiningData != null)
				msgs = ((InternalEObject)newMiningData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_DATA, null, msgs);
			msgs = basicSetMiningData(newMiningData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_DATA, newMiningData, newMiningData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings_container getMiningFunctionSettings() {
		return miningFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningFunctionSettings(MiningFunctionSettings_container newMiningFunctionSettings, NotificationChain msgs) {
		MiningFunctionSettings_container oldMiningFunctionSettings = miningFunctionSettings;
		miningFunctionSettings = newMiningFunctionSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS, oldMiningFunctionSettings, newMiningFunctionSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningFunctionSettings(MiningFunctionSettings_container newMiningFunctionSettings) {
		if (newMiningFunctionSettings != miningFunctionSettings) {
			NotificationChain msgs = null;
			if (miningFunctionSettings != null)
				msgs = ((InternalEObject)miningFunctionSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS, null, msgs);
			if (newMiningFunctionSettings != null)
				msgs = ((InternalEObject)newMiningFunctionSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS, null, msgs);
			msgs = basicSetMiningFunctionSettings(newMiningFunctionSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS, newMiningFunctionSettings, newMiningFunctionSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel_container getMiningModel() {
		return miningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningModel(MiningModel_container newMiningModel, NotificationChain msgs) {
		MiningModel_container oldMiningModel = miningModel;
		miningModel = newMiningModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_MODEL, oldMiningModel, newMiningModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModel(MiningModel_container newMiningModel) {
		if (newMiningModel != miningModel) {
			NotificationChain msgs = null;
			if (miningModel != null)
				msgs = ((InternalEObject)miningModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_MODEL, null, msgs);
			if (newMiningModel != null)
				msgs = ((InternalEObject)newMiningModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_MODEL, null, msgs);
			msgs = basicSetMiningModel(newMiningModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_MODEL, newMiningModel, newMiningModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningResult_container getMiningResult() {
		return miningResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningResult(MiningResult_container newMiningResult, NotificationChain msgs) {
		MiningResult_container oldMiningResult = miningResult;
		miningResult = newMiningResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_RESULT, oldMiningResult, newMiningResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningResult(MiningResult_container newMiningResult) {
		if (newMiningResult != miningResult) {
			NotificationChain msgs = null;
			if (miningResult != null)
				msgs = ((InternalEObject)miningResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_RESULT, null, msgs);
			if (newMiningResult != null)
				msgs = ((InternalEObject)newMiningResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_RESULT, null, msgs);
			msgs = basicSetMiningResult(newMiningResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_RESULT, newMiningResult, newMiningResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTask_container getMiningTask() {
		return miningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningTask(MiningTask_container newMiningTask, NotificationChain msgs) {
		MiningTask_container oldMiningTask = miningTask;
		miningTask = newMiningTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_TASK, oldMiningTask, newMiningTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningTask(MiningTask_container newMiningTask) {
		if (newMiningTask != miningTask) {
			NotificationChain msgs = null;
			if (miningTask != null)
				msgs = ((InternalEObject)miningTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_TASK, null, msgs);
			if (newMiningTask != null)
				msgs = ((InternalEObject)newMiningTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__MINING_TASK, null, msgs);
			msgs = basicSetMiningTask(newMiningTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__MINING_TASK, newMiningTask, newMiningTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_container getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPoint(EntryPoint_container newEntryPoint, NotificationChain msgs) {
		EntryPoint_container oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ENTRY_POINT, oldEntryPoint, newEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(EntryPoint_container newEntryPoint) {
		if (newEntryPoint != entryPoint) {
			NotificationChain msgs = null;
			if (entryPoint != null)
				msgs = ((InternalEObject)entryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ENTRY_POINT, null, msgs);
			if (newEntryPoint != null)
				msgs = ((InternalEObject)newEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ENTRY_POINT, null, msgs);
			msgs = basicSetEntryPoint(newEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ENTRY_POINT, newEntryPoint, newEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clustering_container getClustering() {
		return clustering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClustering(Clustering_container newClustering, NotificationChain msgs) {
		Clustering_container oldClustering = clustering;
		clustering = newClustering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CLUSTERING, oldClustering, newClustering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClustering(Clustering_container newClustering) {
		if (newClustering != clustering) {
			NotificationChain msgs = null;
			if (clustering != null)
				msgs = ((InternalEObject)clustering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CLUSTERING, null, msgs);
			if (newClustering != null)
				msgs = ((InternalEObject)newClustering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CLUSTERING, null, msgs);
			msgs = basicSetClustering(newClustering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CLUSTERING, newClustering, newClustering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRules_container getAssociationRules() {
		return associationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationRules(AssociationRules_container newAssociationRules, NotificationChain msgs) {
		AssociationRules_container oldAssociationRules = associationRules;
		associationRules = newAssociationRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES, oldAssociationRules, newAssociationRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationRules(AssociationRules_container newAssociationRules) {
		if (newAssociationRules != associationRules) {
			NotificationChain msgs = null;
			if (associationRules != null)
				msgs = ((InternalEObject)associationRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES, null, msgs);
			if (newAssociationRules != null)
				msgs = ((InternalEObject)newAssociationRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES, null, msgs);
			msgs = basicSetAssociationRules(newAssociationRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES, newAssociationRules, newAssociationRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supervised_container getSupervised() {
		return supervised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervised(Supervised_container newSupervised, NotificationChain msgs) {
		Supervised_container oldSupervised = supervised;
		supervised = newSupervised;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__SUPERVISED, oldSupervised, newSupervised);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervised(Supervised_container newSupervised) {
		if (newSupervised != supervised) {
			NotificationChain msgs = null;
			if (supervised != null)
				msgs = ((InternalEObject)supervised).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__SUPERVISED, null, msgs);
			if (newSupervised != null)
				msgs = ((InternalEObject)newSupervised).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__SUPERVISED, null, msgs);
			msgs = basicSetSupervised(newSupervised, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__SUPERVISED, newSupervised, newSupervised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification_container getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(Classification_container newClassification, NotificationChain msgs) {
		Classification_container oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(Classification_container newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approximation_container getApproximation() {
		return approximation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproximation(Approximation_container newApproximation, NotificationChain msgs) {
		Approximation_container oldApproximation = approximation;
		approximation = newApproximation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__APPROXIMATION, oldApproximation, newApproximation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproximation(Approximation_container newApproximation) {
		if (newApproximation != approximation) {
			NotificationChain msgs = null;
			if (approximation != null)
				msgs = ((InternalEObject)approximation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__APPROXIMATION, null, msgs);
			if (newApproximation != null)
				msgs = ((InternalEObject)newApproximation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__APPROXIMATION, null, msgs);
			msgs = basicSetApproximation(newApproximation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__APPROXIMATION, newApproximation, newApproximation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportance_container getAttributeImportance() {
		return attributeImportance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeImportance(AttributeImportance_container newAttributeImportance, NotificationChain msgs) {
		AttributeImportance_container oldAttributeImportance = attributeImportance;
		attributeImportance = newAttributeImportance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE, oldAttributeImportance, newAttributeImportance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeImportance(AttributeImportance_container newAttributeImportance) {
		if (newAttributeImportance != attributeImportance) {
			NotificationChain msgs = null;
			if (attributeImportance != null)
				msgs = ((InternalEObject)attributeImportance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE, null, msgs);
			if (newAttributeImportance != null)
				msgs = ((InternalEObject)newAttributeImportance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE, null, msgs);
			msgs = basicSetAttributeImportance(newAttributeImportance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE, newAttributeImportance, newAttributeImportance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationVisualization_container getInformationVisualization() {
		return informationVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationVisualization(InformationVisualization_container newInformationVisualization, NotificationChain msgs) {
		InformationVisualization_container oldInformationVisualization = informationVisualization;
		informationVisualization = newInformationVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION, oldInformationVisualization, newInformationVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationVisualization(InformationVisualization_container newInformationVisualization) {
		if (newInformationVisualization != informationVisualization) {
			NotificationChain msgs = null;
			if (informationVisualization != null)
				msgs = ((InternalEObject)informationVisualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION, null, msgs);
			if (newInformationVisualization != null)
				msgs = ((InternalEObject)newInformationVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION, null, msgs);
			msgs = basicSetInformationVisualization(newInformationVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION, newInformationVisualization, newInformationVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessNomenclature_container getBusinessNomenclature() {
		return businessNomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessNomenclature(BusinessNomenclature_container newBusinessNomenclature, NotificationChain msgs) {
		BusinessNomenclature_container oldBusinessNomenclature = businessNomenclature;
		businessNomenclature = newBusinessNomenclature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE, oldBusinessNomenclature, newBusinessNomenclature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessNomenclature(BusinessNomenclature_container newBusinessNomenclature) {
		if (newBusinessNomenclature != businessNomenclature) {
			NotificationChain msgs = null;
			if (businessNomenclature != null)
				msgs = ((InternalEObject)businessNomenclature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE, null, msgs);
			if (newBusinessNomenclature != null)
				msgs = ((InternalEObject)newBusinessNomenclature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE, null, msgs);
			msgs = basicSetBusinessNomenclature(newBusinessNomenclature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE, newBusinessNomenclature, newBusinessNomenclature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseProcess_container getWarehouseProcess() {
		return warehouseProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarehouseProcess(WarehouseProcess_container newWarehouseProcess, NotificationChain msgs) {
		WarehouseProcess_container oldWarehouseProcess = warehouseProcess;
		warehouseProcess = newWarehouseProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS, oldWarehouseProcess, newWarehouseProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarehouseProcess(WarehouseProcess_container newWarehouseProcess) {
		if (newWarehouseProcess != warehouseProcess) {
			NotificationChain msgs = null;
			if (warehouseProcess != null)
				msgs = ((InternalEObject)warehouseProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS, null, msgs);
			if (newWarehouseProcess != null)
				msgs = ((InternalEObject)newWarehouseProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS, null, msgs);
			msgs = basicSetWarehouseProcess(newWarehouseProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS, newWarehouseProcess, newWarehouseProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType_container getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType_container newDataType, NotificationChain msgs) {
		DataType_container oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType_container newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Events_container getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvents(Events_container newEvents, NotificationChain msgs) {
		Events_container oldEvents = events;
		events = newEvents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__EVENTS, oldEvents, newEvents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(Events_container newEvents) {
		if (newEvents != events) {
			NotificationChain msgs = null;
			if (events != null)
				msgs = ((InternalEObject)events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__EVENTS, null, msgs);
			if (newEvents != null)
				msgs = ((InternalEObject)newEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__EVENTS, null, msgs);
			msgs = basicSetEvents(newEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__EVENTS, newEvents, newEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseOperation_container getWarehouseOperation() {
		return warehouseOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarehouseOperation(WarehouseOperation_container newWarehouseOperation, NotificationChain msgs) {
		WarehouseOperation_container oldWarehouseOperation = warehouseOperation;
		warehouseOperation = newWarehouseOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION, oldWarehouseOperation, newWarehouseOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarehouseOperation(WarehouseOperation_container newWarehouseOperation) {
		if (newWarehouseOperation != warehouseOperation) {
			NotificationChain msgs = null;
			if (warehouseOperation != null)
				msgs = ((InternalEObject)warehouseOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION, null, msgs);
			if (newWarehouseOperation != null)
				msgs = ((InternalEObject)newWarehouseOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION, null, msgs);
			msgs = basicSetWarehouseOperation(newWarehouseOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION, newWarehouseOperation, newWarehouseOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWMComplete_container getCWMComplete() {
		return cwmComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWMComplete(CWMComplete_container newCWMComplete, NotificationChain msgs) {
		CWMComplete_container oldCWMComplete = cwmComplete;
		cwmComplete = newCWMComplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CWM_COMPLETE, oldCWMComplete, newCWMComplete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWMComplete(CWMComplete_container newCWMComplete) {
		if (newCWMComplete != cwmComplete) {
			NotificationChain msgs = null;
			if (cwmComplete != null)
				msgs = ((InternalEObject)cwmComplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CWM_COMPLETE, null, msgs);
			if (newCWMComplete != null)
				msgs = ((InternalEObject)newCWMComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWMPackage.CWM_CONTAINER__CWM_COMPLETE, null, msgs);
			msgs = basicSetCWMComplete(newCWMComplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWMPackage.CWM_CONTAINER__CWM_COMPLETE, newCWMComplete, newCWMComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWMPackage.CWM_CONTAINER__CORE:
				return basicSetCore(null, msgs);
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
				return basicSetBehavioral(null, msgs);
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
			case CWMPackage.CWM_CONTAINER__INSTANCE:
				return basicSetInstance(null, msgs);
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
				return basicSetBusinessInformation(null, msgs);
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
				return basicSetDataTypes(null, msgs);
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
				return basicSetExpressions(null, msgs);
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
				return basicSetKeysIndexes(null, msgs);
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
				return basicSetSoftwareDeployment(null, msgs);
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
				return basicSetTypeMapping(null, msgs);
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
				return basicSetRelational(null, msgs);
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
				return basicSetEnumerations(null, msgs);
			case CWMPackage.CWM_CONTAINER__RECORD:
				return basicSetRecord(null, msgs);
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
				return basicSetMultidimensional(null, msgs);
			case CWMPackage.CWM_CONTAINER__XML:
				return basicSetXML(null, msgs);
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case CWMPackage.CWM_CONTAINER__OLAP:
				return basicSetOlap(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
				return basicSetMiningCore(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
				return basicSetMiningData(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
				return basicSetMiningFunctionSettings(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
				return basicSetMiningModel(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
				return basicSetMiningResult(null, msgs);
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
				return basicSetMiningTask(null, msgs);
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
				return basicSetEntryPoint(null, msgs);
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
				return basicSetClustering(null, msgs);
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
				return basicSetAssociationRules(null, msgs);
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
				return basicSetSupervised(null, msgs);
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
				return basicSetApproximation(null, msgs);
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
				return basicSetAttributeImportance(null, msgs);
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
				return basicSetInformationVisualization(null, msgs);
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
				return basicSetBusinessNomenclature(null, msgs);
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
				return basicSetWarehouseProcess(null, msgs);
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case CWMPackage.CWM_CONTAINER__EVENTS:
				return basicSetEvents(null, msgs);
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
				return basicSetWarehouseOperation(null, msgs);
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
				return basicSetCWMComplete(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWMPackage.CWM_CONTAINER__CORE:
				return getCore();
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
				return getBehavioral();
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
				return getRelationships();
			case CWMPackage.CWM_CONTAINER__INSTANCE:
				return getInstance();
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
				return getBusinessInformation();
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
				return getDataTypes();
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
				return getExpressions();
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
				return getKeysIndexes();
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
				return getSoftwareDeployment();
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
				return getTypeMapping();
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
				return getRelational();
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
				return getEnumerations();
			case CWMPackage.CWM_CONTAINER__RECORD:
				return getRecord();
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
				return getMultidimensional();
			case CWMPackage.CWM_CONTAINER__XML:
				return getXML();
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
				return getTransformation();
			case CWMPackage.CWM_CONTAINER__OLAP:
				return getOlap();
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
				return getMiningCore();
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
				return getMiningData();
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
				return getMiningFunctionSettings();
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
				return getMiningModel();
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
				return getMiningResult();
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
				return getMiningTask();
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
				return getEntryPoint();
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
				return getClustering();
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
				return getAssociationRules();
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
				return getSupervised();
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
				return getClassification();
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
				return getApproximation();
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
				return getAttributeImportance();
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
				return getInformationVisualization();
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
				return getBusinessNomenclature();
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
				return getWarehouseProcess();
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
				return getDataType();
			case CWMPackage.CWM_CONTAINER__EVENTS:
				return getEvents();
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
				return getWarehouseOperation();
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
				return getCWMComplete();
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
			case CWMPackage.CWM_CONTAINER__CORE:
				setCore((Core_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
				setBehavioral((Behavioral_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
				setRelationships((Relationships_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__INSTANCE:
				setInstance((Instance_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
				setBusinessInformation((BusinessInformation_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
				setDataTypes((DataTypes_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
				setExpressions((Expressions_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
				setKeysIndexes((KeysIndexes_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
				setSoftwareDeployment((SoftwareDeployment_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
				setTypeMapping((TypeMapping_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
				setRelational((Relational_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
				setEnumerations((Enumerations_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__RECORD:
				setRecord((Record_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
				setMultidimensional((Multidimensional_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__XML:
				setXML((XML_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
				setTransformation((Transformation_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__OLAP:
				setOlap((Olap_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
				setMiningCore((MiningCore_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
				setMiningData((MiningData_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
				setMiningFunctionSettings((MiningFunctionSettings_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
				setMiningModel((MiningModel_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
				setMiningResult((MiningResult_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
				setMiningTask((MiningTask_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
				setEntryPoint((EntryPoint_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
				setClustering((Clustering_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
				setAssociationRules((AssociationRules_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
				setSupervised((Supervised_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
				setClassification((Classification_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
				setApproximation((Approximation_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
				setAttributeImportance((AttributeImportance_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
				setInformationVisualization((InformationVisualization_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
				setBusinessNomenclature((BusinessNomenclature_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
				setWarehouseProcess((WarehouseProcess_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
				setDataType((DataType_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__EVENTS:
				setEvents((Events_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
				setWarehouseOperation((WarehouseOperation_container)newValue);
				return;
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
				setCWMComplete((CWMComplete_container)newValue);
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
			case CWMPackage.CWM_CONTAINER__CORE:
				setCore((Core_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
				setBehavioral((Behavioral_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
				setRelationships((Relationships_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__INSTANCE:
				setInstance((Instance_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
				setBusinessInformation((BusinessInformation_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
				setDataTypes((DataTypes_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
				setExpressions((Expressions_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
				setKeysIndexes((KeysIndexes_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
				setSoftwareDeployment((SoftwareDeployment_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
				setTypeMapping((TypeMapping_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
				setRelational((Relational_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
				setEnumerations((Enumerations_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__RECORD:
				setRecord((Record_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
				setMultidimensional((Multidimensional_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__XML:
				setXML((XML_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
				setTransformation((Transformation_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__OLAP:
				setOlap((Olap_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
				setMiningCore((MiningCore_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
				setMiningData((MiningData_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
				setMiningFunctionSettings((MiningFunctionSettings_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
				setMiningModel((MiningModel_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
				setMiningResult((MiningResult_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
				setMiningTask((MiningTask_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
				setEntryPoint((EntryPoint_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
				setClustering((Clustering_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
				setAssociationRules((AssociationRules_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
				setSupervised((Supervised_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
				setClassification((Classification_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
				setApproximation((Approximation_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
				setAttributeImportance((AttributeImportance_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
				setInformationVisualization((InformationVisualization_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
				setBusinessNomenclature((BusinessNomenclature_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
				setWarehouseProcess((WarehouseProcess_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
				setDataType((DataType_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__EVENTS:
				setEvents((Events_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
				setWarehouseOperation((WarehouseOperation_container)null);
				return;
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
				setCWMComplete((CWMComplete_container)null);
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
			case CWMPackage.CWM_CONTAINER__CORE:
				return core != null;
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
				return behavioral != null;
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
				return relationships != null;
			case CWMPackage.CWM_CONTAINER__INSTANCE:
				return instance != null;
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
				return businessInformation != null;
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
				return dataTypes != null;
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
				return expressions != null;
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
				return keysIndexes != null;
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
				return softwareDeployment != null;
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
				return typeMapping != null;
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
				return relational != null;
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
				return enumerations != null;
			case CWMPackage.CWM_CONTAINER__RECORD:
				return record != null;
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
				return multidimensional != null;
			case CWMPackage.CWM_CONTAINER__XML:
				return xml != null;
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
				return transformation != null;
			case CWMPackage.CWM_CONTAINER__OLAP:
				return olap != null;
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
				return miningCore != null;
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
				return miningData != null;
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
				return miningFunctionSettings != null;
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
				return miningModel != null;
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
				return miningResult != null;
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
				return miningTask != null;
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
				return entryPoint != null;
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
				return clustering != null;
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
				return associationRules != null;
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
				return supervised != null;
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
				return classification != null;
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
				return approximation != null;
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
				return attributeImportance != null;
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
				return informationVisualization != null;
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
				return businessNomenclature != null;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
				return warehouseProcess != null;
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
				return dataType != null;
			case CWMPackage.CWM_CONTAINER__EVENTS:
				return events != null;
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
				return warehouseOperation != null;
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
				return cwmComplete != null;
		}
		return super.eIsSet(featureID);
	}

} //CWM_containerImpl
