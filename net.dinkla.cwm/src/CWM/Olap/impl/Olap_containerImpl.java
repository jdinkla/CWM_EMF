/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

import CWM.Olap.CodedLevel;
import CWM.Olap.ContentMap;
import CWM.Olap.Cube;
import CWM.Olap.CubeDeployment;
import CWM.Olap.CubeDimensionAssociation;
import CWM.Olap.CubeRegion;
import CWM.Olap.DeploymentGroup;
import CWM.Olap.Dimension;
import CWM.Olap.DimensionDeployment;
import CWM.Olap.Hierarchy;
import CWM.Olap.HierarchyLevelAssociation;
import CWM.Olap.HierarchyMemberSelectionGroup;
import CWM.Olap.Level;
import CWM.Olap.LevelBasedHierarchy;
import CWM.Olap.Measure;
import CWM.Olap.MemberSelection;
import CWM.Olap.MemberSelectionGroup;
import CWM.Olap.OlapPackage;
import CWM.Olap.Olap_container;
import CWM.Olap.Schema;
import CWM.Olap.StructureMap;
import CWM.Olap.ValueBasedHierarchy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Olap container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getContentMap <em>Content Map</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getCubeDeployment <em>Cube Deployment</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getCubeRegion <em>Cube Region</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getDeploymentGroup <em>Deployment Group</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getMemberSelectionGroup <em>Member Selection Group</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getMemberSelection <em>Member Selection</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getValueBasedHierarchy <em>Value Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getCodedLevel <em>Coded Level</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link CWM.Olap.impl.Olap_containerImpl#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Olap_containerImpl extends EObjectImpl implements Olap_container {
	/**
	 * The cached value of the '{@link #getContentMap() <em>Content Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentMap> contentMap;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected EList<Cube> cube;

	/**
	 * The cached value of the '{@link #getCubeDeployment() <em>Cube Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeDeployment> cubeDeployment;

	/**
	 * The cached value of the '{@link #getCubeDimensionAssociation() <em>Cube Dimension Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeDimensionAssociation> cubeDimensionAssociation;

	/**
	 * The cached value of the '{@link #getCubeRegion() <em>Cube Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeRegion> cubeRegion;

	/**
	 * The cached value of the '{@link #getDeploymentGroup() <em>Deployment Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentGroup> deploymentGroup;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimension;

	/**
	 * The cached value of the '{@link #getDimensionDeployment() <em>Dimension Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionDeployment> dimensionDeployment;

	/**
	 * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<Hierarchy> hierarchy;

	/**
	 * The cached value of the '{@link #getHierarchyLevelAssociation() <em>Hierarchy Level Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyLevelAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<HierarchyLevelAssociation> hierarchyLevelAssociation;

	/**
	 * The cached value of the '{@link #getLevelBasedHierarchy() <em>Level Based Hierarchy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelBasedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelBasedHierarchy> levelBasedHierarchy;

	/**
	 * The cached value of the '{@link #getMemberSelectionGroup() <em>Member Selection Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSelectionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberSelectionGroup> memberSelectionGroup;

	/**
	 * The cached value of the '{@link #getMemberSelection() <em>Member Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberSelection> memberSelection;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * The cached value of the '{@link #getValueBasedHierarchy() <em>Value Based Hierarchy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBasedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueBasedHierarchy> valueBasedHierarchy;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> level;

	/**
	 * The cached value of the '{@link #getCodedLevel() <em>Coded Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<CodedLevel> codedLevel;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measure;

	/**
	 * The cached value of the '{@link #getStructureMap() <em>Structure Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureMap()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMap> structureMap;

	/**
	 * The cached value of the '{@link #getHierarchyMemberSelectionGroup() <em>Hierarchy Member Selection Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyMemberSelectionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<HierarchyMemberSelectionGroup> hierarchyMemberSelectionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Olap_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlapPackage.Literals.OLAP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentMap> getContentMap() {
		if (contentMap == null) {
			contentMap = new EObjectContainmentEList<ContentMap>(ContentMap.class, this, OlapPackage.OLAP_CONTAINER__CONTENT_MAP);
		}
		return contentMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cube> getCube() {
		if (cube == null) {
			cube = new EObjectContainmentEList<Cube>(Cube.class, this, OlapPackage.OLAP_CONTAINER__CUBE);
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeDeployment> getCubeDeployment() {
		if (cubeDeployment == null) {
			cubeDeployment = new EObjectContainmentEList<CubeDeployment>(CubeDeployment.class, this, OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT);
		}
		return cubeDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeDimensionAssociation> getCubeDimensionAssociation() {
		if (cubeDimensionAssociation == null) {
			cubeDimensionAssociation = new EObjectContainmentEList<CubeDimensionAssociation>(CubeDimensionAssociation.class, this, OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION);
		}
		return cubeDimensionAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeRegion> getCubeRegion() {
		if (cubeRegion == null) {
			cubeRegion = new EObjectContainmentEList<CubeRegion>(CubeRegion.class, this, OlapPackage.OLAP_CONTAINER__CUBE_REGION);
		}
		return cubeRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentGroup> getDeploymentGroup() {
		if (deploymentGroup == null) {
			deploymentGroup = new EObjectContainmentEList<DeploymentGroup>(DeploymentGroup.class, this, OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP);
		}
		return deploymentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<Dimension>(Dimension.class, this, OlapPackage.OLAP_CONTAINER__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionDeployment> getDimensionDeployment() {
		if (dimensionDeployment == null) {
			dimensionDeployment = new EObjectContainmentEList<DimensionDeployment>(DimensionDeployment.class, this, OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT);
		}
		return dimensionDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hierarchy> getHierarchy() {
		if (hierarchy == null) {
			hierarchy = new EObjectContainmentEList<Hierarchy>(Hierarchy.class, this, OlapPackage.OLAP_CONTAINER__HIERARCHY);
		}
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierarchyLevelAssociation> getHierarchyLevelAssociation() {
		if (hierarchyLevelAssociation == null) {
			hierarchyLevelAssociation = new EObjectContainmentEList<HierarchyLevelAssociation>(HierarchyLevelAssociation.class, this, OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION);
		}
		return hierarchyLevelAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LevelBasedHierarchy> getLevelBasedHierarchy() {
		if (levelBasedHierarchy == null) {
			levelBasedHierarchy = new EObjectContainmentEList<LevelBasedHierarchy>(LevelBasedHierarchy.class, this, OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY);
		}
		return levelBasedHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberSelectionGroup> getMemberSelectionGroup() {
		if (memberSelectionGroup == null) {
			memberSelectionGroup = new EObjectContainmentEList<MemberSelectionGroup>(MemberSelectionGroup.class, this, OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP);
		}
		return memberSelectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberSelection> getMemberSelection() {
		if (memberSelection == null) {
			memberSelection = new EObjectContainmentEList<MemberSelection>(MemberSelection.class, this, OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION);
		}
		return memberSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, OlapPackage.OLAP_CONTAINER__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueBasedHierarchy> getValueBasedHierarchy() {
		if (valueBasedHierarchy == null) {
			valueBasedHierarchy = new EObjectContainmentEList<ValueBasedHierarchy>(ValueBasedHierarchy.class, this, OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY);
		}
		return valueBasedHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getLevel() {
		if (level == null) {
			level = new EObjectContainmentEList<Level>(Level.class, this, OlapPackage.OLAP_CONTAINER__LEVEL);
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodedLevel> getCodedLevel() {
		if (codedLevel == null) {
			codedLevel = new EObjectContainmentEList<CodedLevel>(CodedLevel.class, this, OlapPackage.OLAP_CONTAINER__CODED_LEVEL);
		}
		return codedLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<Measure>(Measure.class, this, OlapPackage.OLAP_CONTAINER__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMap> getStructureMap() {
		if (structureMap == null) {
			structureMap = new EObjectContainmentEList<StructureMap>(StructureMap.class, this, OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP);
		}
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierarchyMemberSelectionGroup> getHierarchyMemberSelectionGroup() {
		if (hierarchyMemberSelectionGroup == null) {
			hierarchyMemberSelectionGroup = new EObjectContainmentEList<HierarchyMemberSelectionGroup>(HierarchyMemberSelectionGroup.class, this, OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP);
		}
		return hierarchyMemberSelectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
				return ((InternalEList<?>)getContentMap()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__CUBE:
				return ((InternalEList<?>)getCube()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
				return ((InternalEList<?>)getCubeDeployment()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
				return ((InternalEList<?>)getCubeDimensionAssociation()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
				return ((InternalEList<?>)getCubeRegion()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
				return ((InternalEList<?>)getDeploymentGroup()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
				return ((InternalEList<?>)getDimensionDeployment()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
				return ((InternalEList<?>)getHierarchy()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
				return ((InternalEList<?>)getHierarchyLevelAssociation()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
				return ((InternalEList<?>)getLevelBasedHierarchy()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
				return ((InternalEList<?>)getMemberSelectionGroup()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
				return ((InternalEList<?>)getMemberSelection()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
				return ((InternalEList<?>)getValueBasedHierarchy()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__LEVEL:
				return ((InternalEList<?>)getLevel()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
				return ((InternalEList<?>)getCodedLevel()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
				return ((InternalEList<?>)getStructureMap()).basicRemove(otherEnd, msgs);
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
				return ((InternalEList<?>)getHierarchyMemberSelectionGroup()).basicRemove(otherEnd, msgs);
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
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
				return getContentMap();
			case OlapPackage.OLAP_CONTAINER__CUBE:
				return getCube();
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
				return getCubeDeployment();
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
				return getCubeDimensionAssociation();
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
				return getCubeRegion();
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
				return getDeploymentGroup();
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
				return getDimension();
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
				return getDimensionDeployment();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
				return getHierarchy();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
				return getHierarchyLevelAssociation();
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
				return getLevelBasedHierarchy();
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
				return getMemberSelectionGroup();
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
				return getMemberSelection();
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
				return getSchema();
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
				return getValueBasedHierarchy();
			case OlapPackage.OLAP_CONTAINER__LEVEL:
				return getLevel();
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
				return getCodedLevel();
			case OlapPackage.OLAP_CONTAINER__MEASURE:
				return getMeasure();
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
				return getStructureMap();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
				return getHierarchyMemberSelectionGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
				getContentMap().clear();
				getContentMap().addAll((Collection<? extends ContentMap>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE:
				getCube().clear();
				getCube().addAll((Collection<? extends Cube>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
				getCubeDeployment().clear();
				getCubeDeployment().addAll((Collection<? extends CubeDeployment>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				getCubeDimensionAssociation().addAll((Collection<? extends CubeDimensionAssociation>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
				getCubeRegion().clear();
				getCubeRegion().addAll((Collection<? extends CubeRegion>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
				getDeploymentGroup().clear();
				getDeploymentGroup().addAll((Collection<? extends DeploymentGroup>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Dimension>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
				getDimensionDeployment().clear();
				getDimensionDeployment().addAll((Collection<? extends DimensionDeployment>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
				getHierarchy().clear();
				getHierarchy().addAll((Collection<? extends Hierarchy>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
				getHierarchyLevelAssociation().clear();
				getHierarchyLevelAssociation().addAll((Collection<? extends HierarchyLevelAssociation>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
				getLevelBasedHierarchy().clear();
				getLevelBasedHierarchy().addAll((Collection<? extends LevelBasedHierarchy>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
				getMemberSelectionGroup().clear();
				getMemberSelectionGroup().addAll((Collection<? extends MemberSelectionGroup>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
				getMemberSelection().clear();
				getMemberSelection().addAll((Collection<? extends MemberSelection>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
				getValueBasedHierarchy().clear();
				getValueBasedHierarchy().addAll((Collection<? extends ValueBasedHierarchy>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__LEVEL:
				getLevel().clear();
				getLevel().addAll((Collection<? extends Level>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
				getCodedLevel().clear();
				getCodedLevel().addAll((Collection<? extends CodedLevel>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends Measure>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
				getStructureMap().clear();
				getStructureMap().addAll((Collection<? extends StructureMap>)newValue);
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
				getHierarchyMemberSelectionGroup().clear();
				getHierarchyMemberSelectionGroup().addAll((Collection<? extends HierarchyMemberSelectionGroup>)newValue);
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
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
				getContentMap().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE:
				getCube().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
				getCubeDeployment().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
				getCubeRegion().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
				getDeploymentGroup().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
				getDimension().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
				getDimensionDeployment().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
				getHierarchy().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
				getHierarchyLevelAssociation().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
				getLevelBasedHierarchy().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
				getMemberSelectionGroup().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
				getMemberSelection().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
				getSchema().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
				getValueBasedHierarchy().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__LEVEL:
				getLevel().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
				getCodedLevel().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__MEASURE:
				getMeasure().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
				getStructureMap().clear();
				return;
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
				getHierarchyMemberSelectionGroup().clear();
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
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
				return contentMap != null && !contentMap.isEmpty();
			case OlapPackage.OLAP_CONTAINER__CUBE:
				return cube != null && !cube.isEmpty();
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
				return cubeDeployment != null && !cubeDeployment.isEmpty();
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
				return cubeDimensionAssociation != null && !cubeDimensionAssociation.isEmpty();
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
				return cubeRegion != null && !cubeRegion.isEmpty();
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
				return deploymentGroup != null && !deploymentGroup.isEmpty();
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
				return dimensionDeployment != null && !dimensionDeployment.isEmpty();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
				return hierarchy != null && !hierarchy.isEmpty();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
				return hierarchyLevelAssociation != null && !hierarchyLevelAssociation.isEmpty();
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
				return levelBasedHierarchy != null && !levelBasedHierarchy.isEmpty();
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
				return memberSelectionGroup != null && !memberSelectionGroup.isEmpty();
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
				return memberSelection != null && !memberSelection.isEmpty();
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
				return schema != null && !schema.isEmpty();
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
				return valueBasedHierarchy != null && !valueBasedHierarchy.isEmpty();
			case OlapPackage.OLAP_CONTAINER__LEVEL:
				return level != null && !level.isEmpty();
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
				return codedLevel != null && !codedLevel.isEmpty();
			case OlapPackage.OLAP_CONTAINER__MEASURE:
				return measure != null && !measure.isEmpty();
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
				return structureMap != null && !structureMap.isEmpty();
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
				return hierarchyMemberSelectionGroup != null && !hierarchyMemberSelectionGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Olap_containerImpl
