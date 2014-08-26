/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import CWM.Core.CorePackage;

import CWM.CwmTransformation.CwmTransformationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.Olap.OlapFactory
 * @model kind="package"
 * @generated
 */
public interface OlapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Olap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Olap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Olap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OlapPackage eINSTANCE = CWM.Olap.impl.OlapPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.ContentMapImpl <em>Content Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.ContentMapImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getContentMap()
	 * @generated
	 */
	int CONTENT_MAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__NAME = CwmTransformationPackage.TRANSFORMATION_MAP__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__VISIBILITY = CwmTransformationPackage.TRANSFORMATION_MAP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__CLIENT_DEPENDENCY = CwmTransformationPackage.TRANSFORMATION_MAP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__CONSTRAINT = CwmTransformationPackage.TRANSFORMATION_MAP__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__IMPORTER = CwmTransformationPackage.TRANSFORMATION_MAP__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__NAMESPACE = CwmTransformationPackage.TRANSFORMATION_MAP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__TAGGED_VALUE = CwmTransformationPackage.TRANSFORMATION_MAP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__OWNED_ELEMENT = CwmTransformationPackage.TRANSFORMATION_MAP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__FUNCTION = CwmTransformationPackage.TRANSFORMATION_MAP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__FUNCTION_DESCRIPTION = CwmTransformationPackage.TRANSFORMATION_MAP__FUNCTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__IS_PRIMARY = CwmTransformationPackage.TRANSFORMATION_MAP__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__SOURCE = CwmTransformationPackage.TRANSFORMATION_MAP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__TARGET = CwmTransformationPackage.TRANSFORMATION_MAP__TARGET;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__USE = CwmTransformationPackage.TRANSFORMATION_MAP__USE;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__CLASSIFIER_MAP = CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP;

	/**
	 * The feature id for the '<em><b>Cube Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP__CUBE_DEPLOYMENT = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MAP_FEATURE_COUNT = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.CubeImpl <em>Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.CubeImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getCube()
	 * @generated
	 */
	int CUBE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__IS_VIRTUAL = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__CUBE_DIMENSION_ASSOCIATION = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cube Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__CUBE_REGION = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__SCHEMA = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.CubeDeploymentImpl <em>Cube Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.CubeDeploymentImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getCubeDeployment()
	 * @generated
	 */
	int CUBE_DEPLOYMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Cube Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__CUBE_REGION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__DEPLOYMENT_GROUP = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT__CONTENT_MAP = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cube Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DEPLOYMENT_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.CubeDimensionAssociationImpl <em>Cube Dimension Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.CubeDimensionAssociationImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getCubeDimensionAssociation()
	 * @generated
	 */
	int CUBE_DIMENSION_ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__CUBE = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calc Hierarchy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION__CALC_HIERARCHY = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cube Dimension Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_DIMENSION_ASSOCIATION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.CubeRegionImpl <em>Cube Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.CubeRegionImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getCubeRegion()
	 * @generated
	 */
	int CUBE_REGION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__IS_READ_ONLY = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__IS_FULLY_REALIZED = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__MEMBER_SELECTION_GROUP = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__CUBE = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION__CUBE_DEPLOYMENT = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cube Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_REGION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.DeploymentGroupImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getDeploymentGroup()
	 * @generated
	 */
	int DEPLOYMENT_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__SCHEMA = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cube Deployment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__CUBE_DEPLOYMENT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension Deployment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__DIMENSION_DEPLOYMENT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.DimensionImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Is Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IS_TIME = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IS_MEASURE = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HIERARCHY = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__MEMBER_SELECTION = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CUBE_DIMENSION_ASSOCIATION = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DISPLAY_DEFAULT = CorePackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__SCHEMA = CorePackage.CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.DimensionDeploymentImpl <em>Dimension Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.DimensionDeploymentImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getDimensionDeployment()
	 * @generated
	 */
	int DIMENSION_DEPLOYMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Hierarchy Level Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__HIERARCHY_LEVEL_ASSOCIATION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Based Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__VALUE_BASED_HIERARCHY = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__STRUCTURE_MAP = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Of Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__LIST_OF_VALUES = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Immediate Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__IMMEDIATE_PARENT = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Deployment Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT__DEPLOYMENT_GROUP = CorePackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dimension Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEPLOYMENT_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.HierarchyImpl <em>Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.HierarchyImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchy()
	 * @generated
	 */
	int HIERARCHY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__CUBE_DIMENSION_ASSOCIATION = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defaulted Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__DEFAULTED_DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hierarchy Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.HierarchyLevelAssociationImpl <em>Hierarchy Level Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.HierarchyLevelAssociationImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchyLevelAssociation()
	 * @generated
	 */
	int HIERARCHY_LEVEL_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Level Based Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__LEVEL_BASED_HIERARCHY = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__CURRENT_LEVEL = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION__DIMENSION_DEPLOYMENT = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hierarchy Level Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_LEVEL_ASSOCIATION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.LevelBasedHierarchyImpl <em>Level Based Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.LevelBasedHierarchyImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getLevelBasedHierarchy()
	 * @generated
	 */
	int LEVEL_BASED_HIERARCHY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__NAME = HIERARCHY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__VISIBILITY = HIERARCHY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__CLIENT_DEPENDENCY = HIERARCHY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__CONSTRAINT = HIERARCHY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__IMPORTER = HIERARCHY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__NAMESPACE = HIERARCHY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__TAGGED_VALUE = HIERARCHY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__OWNED_ELEMENT = HIERARCHY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__IS_ABSTRACT = HIERARCHY__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__FEATURE = HIERARCHY__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__DIMENSION = HIERARCHY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__CUBE_DIMENSION_ASSOCIATION = HIERARCHY__CUBE_DIMENSION_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Defaulted Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__DEFAULTED_DIMENSION = HIERARCHY__DEFAULTED_DIMENSION;

	/**
	 * The feature id for the '<em><b>Hierarchy Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP = HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP;

	/**
	 * The feature id for the '<em><b>Hierarchy Level Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY__HIERARCHY_LEVEL_ASSOCIATION = HIERARCHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level Based Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_BASED_HIERARCHY_FEATURE_COUNT = HIERARCHY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.MemberSelectionGroupImpl <em>Member Selection Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.MemberSelectionGroupImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getMemberSelectionGroup()
	 * @generated
	 */
	int MEMBER_SELECTION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Member Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__MEMBER_SELECTION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cube Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP__CUBE_REGION = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Selection Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_GROUP_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.MemberSelectionImpl <em>Member Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.MemberSelectionImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getMemberSelection()
	 * @generated
	 */
	int MEMBER_SELECTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION__MEMBER_SELECTION_GROUP = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SELECTION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.SchemaImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CUBE = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DIMENSION = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployment Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEPLOYMENT_GROUP = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.ValueBasedHierarchyImpl <em>Value Based Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.ValueBasedHierarchyImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getValueBasedHierarchy()
	 * @generated
	 */
	int VALUE_BASED_HIERARCHY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__NAME = HIERARCHY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__VISIBILITY = HIERARCHY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__CLIENT_DEPENDENCY = HIERARCHY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__CONSTRAINT = HIERARCHY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__IMPORTER = HIERARCHY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__NAMESPACE = HIERARCHY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__TAGGED_VALUE = HIERARCHY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__OWNED_ELEMENT = HIERARCHY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__IS_ABSTRACT = HIERARCHY__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__FEATURE = HIERARCHY__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__DIMENSION = HIERARCHY__DIMENSION;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__CUBE_DIMENSION_ASSOCIATION = HIERARCHY__CUBE_DIMENSION_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Defaulted Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__DEFAULTED_DIMENSION = HIERARCHY__DEFAULTED_DIMENSION;

	/**
	 * The feature id for the '<em><b>Hierarchy Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP = HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP;

	/**
	 * The feature id for the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY__DIMENSION_DEPLOYMENT = HIERARCHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Based Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BASED_HIERARCHY_FEATURE_COUNT = HIERARCHY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.LevelImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = MEMBER_SELECTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__VISIBILITY = MEMBER_SELECTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__CLIENT_DEPENDENCY = MEMBER_SELECTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__CONSTRAINT = MEMBER_SELECTION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__IMPORTER = MEMBER_SELECTION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAMESPACE = MEMBER_SELECTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TAGGED_VALUE = MEMBER_SELECTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__OWNED_ELEMENT = MEMBER_SELECTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__IS_ABSTRACT = MEMBER_SELECTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__FEATURE = MEMBER_SELECTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIMENSION = MEMBER_SELECTION__DIMENSION;

	/**
	 * The feature id for the '<em><b>Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MEMBER_SELECTION_GROUP = MEMBER_SELECTION__MEMBER_SELECTION_GROUP;

	/**
	 * The feature id for the '<em><b>Hierarchy Level Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__HIERARCHY_LEVEL_ASSOCIATION = MEMBER_SELECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = MEMBER_SELECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.CodedLevelImpl <em>Coded Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.CodedLevelImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getCodedLevel()
	 * @generated
	 */
	int CODED_LEVEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__NAME = LEVEL__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__VISIBILITY = LEVEL__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__CLIENT_DEPENDENCY = LEVEL__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__CONSTRAINT = LEVEL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__IMPORTER = LEVEL__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__NAMESPACE = LEVEL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__TAGGED_VALUE = LEVEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__OWNED_ELEMENT = LEVEL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__IS_ABSTRACT = LEVEL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__FEATURE = LEVEL__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__DIMENSION = LEVEL__DIMENSION;

	/**
	 * The feature id for the '<em><b>Member Selection Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__MEMBER_SELECTION_GROUP = LEVEL__MEMBER_SELECTION_GROUP;

	/**
	 * The feature id for the '<em><b>Hierarchy Level Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__HIERARCHY_LEVEL_ASSOCIATION = LEVEL__HIERARCHY_LEVEL_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL__ENCODING = LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coded Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODED_LEVEL_FEATURE_COUNT = LEVEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.MeasureImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.StructureMapImpl <em>Structure Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.StructureMapImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getStructureMap()
	 * @generated
	 */
	int STRUCTURE_MAP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__NAME = CwmTransformationPackage.TRANSFORMATION_MAP__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__VISIBILITY = CwmTransformationPackage.TRANSFORMATION_MAP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__CLIENT_DEPENDENCY = CwmTransformationPackage.TRANSFORMATION_MAP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__CONSTRAINT = CwmTransformationPackage.TRANSFORMATION_MAP__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__IMPORTER = CwmTransformationPackage.TRANSFORMATION_MAP__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__NAMESPACE = CwmTransformationPackage.TRANSFORMATION_MAP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__TAGGED_VALUE = CwmTransformationPackage.TRANSFORMATION_MAP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__OWNED_ELEMENT = CwmTransformationPackage.TRANSFORMATION_MAP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__FUNCTION = CwmTransformationPackage.TRANSFORMATION_MAP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__FUNCTION_DESCRIPTION = CwmTransformationPackage.TRANSFORMATION_MAP__FUNCTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__IS_PRIMARY = CwmTransformationPackage.TRANSFORMATION_MAP__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__SOURCE = CwmTransformationPackage.TRANSFORMATION_MAP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__TARGET = CwmTransformationPackage.TRANSFORMATION_MAP__TARGET;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__USE = CwmTransformationPackage.TRANSFORMATION_MAP__USE;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__CLASSIFIER_MAP = CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP;

	/**
	 * The feature id for the '<em><b>Dimension Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__DIMENSION_DEPLOYMENT = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension Deployment LV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__DIMENSION_DEPLOYMENT_LV = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension Deployment IP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP__DIMENSION_DEPLOYMENT_IP = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structure Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MAP_FEATURE_COUNT = CwmTransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.HierarchyMemberSelectionGroupImpl <em>Hierarchy Member Selection Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.HierarchyMemberSelectionGroupImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchyMemberSelectionGroup()
	 * @generated
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__NAME = MEMBER_SELECTION_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__VISIBILITY = MEMBER_SELECTION_GROUP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__CLIENT_DEPENDENCY = MEMBER_SELECTION_GROUP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__CONSTRAINT = MEMBER_SELECTION_GROUP__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__IMPORTER = MEMBER_SELECTION_GROUP__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__NAMESPACE = MEMBER_SELECTION_GROUP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__TAGGED_VALUE = MEMBER_SELECTION_GROUP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__OWNED_ELEMENT = MEMBER_SELECTION_GROUP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__IS_ABSTRACT = MEMBER_SELECTION_GROUP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__FEATURE = MEMBER_SELECTION_GROUP__FEATURE;

	/**
	 * The feature id for the '<em><b>Member Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__MEMBER_SELECTION = MEMBER_SELECTION_GROUP__MEMBER_SELECTION;

	/**
	 * The feature id for the '<em><b>Cube Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__CUBE_REGION = MEMBER_SELECTION_GROUP__CUBE_REGION;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY = MEMBER_SELECTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hierarchy Member Selection Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_MEMBER_SELECTION_GROUP_FEATURE_COUNT = MEMBER_SELECTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Olap.impl.Olap_containerImpl <em>Olap container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Olap.impl.Olap_containerImpl
	 * @see CWM.Olap.impl.OlapPackageImpl#getOlap_container()
	 * @generated
	 */
	int OLAP_CONTAINER = 20;

	/**
	 * The feature id for the '<em><b>Content Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CONTENT_MAP = 0;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CUBE = 1;

	/**
	 * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CUBE_DEPLOYMENT = 2;

	/**
	 * The feature id for the '<em><b>Cube Dimension Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Cube Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CUBE_REGION = 4;

	/**
	 * The feature id for the '<em><b>Deployment Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__DEPLOYMENT_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__DIMENSION_DEPLOYMENT = 7;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__HIERARCHY = 8;

	/**
	 * The feature id for the '<em><b>Hierarchy Level Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Level Based Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__LEVEL_BASED_HIERARCHY = 10;

	/**
	 * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__MEMBER_SELECTION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Member Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__MEMBER_SELECTION = 12;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__SCHEMA = 13;

	/**
	 * The feature id for the '<em><b>Value Based Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__VALUE_BASED_HIERARCHY = 14;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__LEVEL = 15;

	/**
	 * The feature id for the '<em><b>Coded Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__CODED_LEVEL = 16;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__MEASURE = 17;

	/**
	 * The feature id for the '<em><b>Structure Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__STRUCTURE_MAP = 18;

	/**
	 * The feature id for the '<em><b>Hierarchy Member Selection Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP = 19;

	/**
	 * The number of structural features of the '<em>Olap container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_CONTAINER_FEATURE_COUNT = 20;


	/**
	 * Returns the meta object for class '{@link CWM.Olap.ContentMap <em>Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Map</em>'.
	 * @see CWM.Olap.ContentMap
	 * @generated
	 */
	EClass getContentMap();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.ContentMap#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cube Deployment</em>'.
	 * @see CWM.Olap.ContentMap#getCubeDeployment()
	 * @see #getContentMap()
	 * @generated
	 */
	EReference getContentMap_CubeDeployment();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube</em>'.
	 * @see CWM.Olap.Cube
	 * @generated
	 */
	EClass getCube();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Olap.Cube#getIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see CWM.Olap.Cube#getIsVirtual()
	 * @see #getCube()
	 * @generated
	 */
	EAttribute getCube_IsVirtual();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Cube#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Dimension Association</em>'.
	 * @see CWM.Olap.Cube#getCubeDimensionAssociation()
	 * @see #getCube()
	 * @generated
	 */
	EReference getCube_CubeDimensionAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Cube#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Region</em>'.
	 * @see CWM.Olap.Cube#getCubeRegion()
	 * @see #getCube()
	 * @generated
	 */
	EReference getCube_CubeRegion();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.Cube#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see CWM.Olap.Cube#getSchema()
	 * @see #getCube()
	 * @generated
	 */
	EReference getCube_Schema();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.CubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Deployment</em>'.
	 * @see CWM.Olap.CubeDeployment
	 * @generated
	 */
	EClass getCubeDeployment();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.CubeDeployment#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cube Region</em>'.
	 * @see CWM.Olap.CubeDeployment#getCubeRegion()
	 * @see #getCubeDeployment()
	 * @generated
	 */
	EReference getCubeDeployment_CubeRegion();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.CubeDeployment#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Group</em>'.
	 * @see CWM.Olap.CubeDeployment#getDeploymentGroup()
	 * @see #getCubeDeployment()
	 * @generated
	 */
	EReference getCubeDeployment_DeploymentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.CubeDeployment#getContentMap <em>Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Map</em>'.
	 * @see CWM.Olap.CubeDeployment#getContentMap()
	 * @see #getCubeDeployment()
	 * @generated
	 */
	EReference getCubeDeployment_ContentMap();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.CubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Dimension Association</em>'.
	 * @see CWM.Olap.CubeDimensionAssociation
	 * @generated
	 */
	EClass getCubeDimensionAssociation();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.CubeDimensionAssociation#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see CWM.Olap.CubeDimensionAssociation#getDimension()
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 */
	EReference getCubeDimensionAssociation_Dimension();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.CubeDimensionAssociation#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cube</em>'.
	 * @see CWM.Olap.CubeDimensionAssociation#getCube()
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 */
	EReference getCubeDimensionAssociation_Cube();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.CubeDimensionAssociation#getCalcHierarchy <em>Calc Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calc Hierarchy</em>'.
	 * @see CWM.Olap.CubeDimensionAssociation#getCalcHierarchy()
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 */
	EReference getCubeDimensionAssociation_CalcHierarchy();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.CubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Region</em>'.
	 * @see CWM.Olap.CubeRegion
	 * @generated
	 */
	EClass getCubeRegion();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Olap.CubeRegion#getIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see CWM.Olap.CubeRegion#getIsReadOnly()
	 * @see #getCubeRegion()
	 * @generated
	 */
	EAttribute getCubeRegion_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Olap.CubeRegion#getIsFullyRealized <em>Is Fully Realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fully Realized</em>'.
	 * @see CWM.Olap.CubeRegion#getIsFullyRealized()
	 * @see #getCubeRegion()
	 * @generated
	 */
	EAttribute getCubeRegion_IsFullyRealized();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.CubeRegion#getMemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Selection Group</em>'.
	 * @see CWM.Olap.CubeRegion#getMemberSelectionGroup()
	 * @see #getCubeRegion()
	 * @generated
	 */
	EReference getCubeRegion_MemberSelectionGroup();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.CubeRegion#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cube</em>'.
	 * @see CWM.Olap.CubeRegion#getCube()
	 * @see #getCubeRegion()
	 * @generated
	 */
	EReference getCubeRegion_Cube();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.CubeRegion#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Deployment</em>'.
	 * @see CWM.Olap.CubeRegion#getCubeDeployment()
	 * @see #getCubeRegion()
	 * @generated
	 */
	EReference getCubeRegion_CubeDeployment();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.DeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Group</em>'.
	 * @see CWM.Olap.DeploymentGroup
	 * @generated
	 */
	EClass getDeploymentGroup();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.DeploymentGroup#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see CWM.Olap.DeploymentGroup#getSchema()
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	EReference getDeploymentGroup_Schema();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.DeploymentGroup#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cube Deployment</em>'.
	 * @see CWM.Olap.DeploymentGroup#getCubeDeployment()
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	EReference getDeploymentGroup_CubeDeployment();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.DeploymentGroup#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.DeploymentGroup#getDimensionDeployment()
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	EReference getDeploymentGroup_DimensionDeployment();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see CWM.Olap.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Olap.Dimension#getIsTime <em>Is Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Time</em>'.
	 * @see CWM.Olap.Dimension#getIsTime()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_IsTime();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Olap.Dimension#getIsMeasure <em>Is Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Measure</em>'.
	 * @see CWM.Olap.Dimension#getIsMeasure()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_IsMeasure();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Dimension#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy</em>'.
	 * @see CWM.Olap.Dimension#getHierarchy()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Hierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Dimension#getMemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Selection</em>'.
	 * @see CWM.Olap.Dimension#getMemberSelection()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_MemberSelection();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.Dimension#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cube Dimension Association</em>'.
	 * @see CWM.Olap.Dimension#getCubeDimensionAssociation()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_CubeDimensionAssociation();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.Dimension#getDisplayDefault <em>Display Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display Default</em>'.
	 * @see CWM.Olap.Dimension#getDisplayDefault()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_DisplayDefault();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.Dimension#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see CWM.Olap.Dimension#getSchema()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Schema();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.DimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.DimensionDeployment
	 * @generated
	 */
	EClass getDimensionDeployment();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hierarchy Level Association</em>'.
	 * @see CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_HierarchyLevelAssociation();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.DimensionDeployment#getValueBasedHierarchy <em>Value Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Value Based Hierarchy</em>'.
	 * @see CWM.Olap.DimensionDeployment#getValueBasedHierarchy()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_ValueBasedHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.DimensionDeployment#getStructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Map</em>'.
	 * @see CWM.Olap.DimensionDeployment#getStructureMap()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_StructureMap();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.DimensionDeployment#getListOfValues <em>List Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Of Values</em>'.
	 * @see CWM.Olap.DimensionDeployment#getListOfValues()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_ListOfValues();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.DimensionDeployment#getImmediateParent <em>Immediate Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Immediate Parent</em>'.
	 * @see CWM.Olap.DimensionDeployment#getImmediateParent()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_ImmediateParent();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.DimensionDeployment#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Group</em>'.
	 * @see CWM.Olap.DimensionDeployment#getDeploymentGroup()
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	EReference getDimensionDeployment_DeploymentGroup();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy</em>'.
	 * @see CWM.Olap.Hierarchy
	 * @generated
	 */
	EClass getHierarchy();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.Hierarchy#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dimension</em>'.
	 * @see CWM.Olap.Hierarchy#getDimension()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Dimension();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.Hierarchy#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cube Dimension Association</em>'.
	 * @see CWM.Olap.Hierarchy#getCubeDimensionAssociation()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_CubeDimensionAssociation();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.Hierarchy#getDefaultedDimension <em>Defaulted Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defaulted Dimension</em>'.
	 * @see CWM.Olap.Hierarchy#getDefaultedDimension()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_DefaultedDimension();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.Hierarchy#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hierarchy Member Selection Group</em>'.
	 * @see CWM.Olap.Hierarchy#getHierarchyMemberSelectionGroup()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_HierarchyMemberSelectionGroup();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.HierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Level Association</em>'.
	 * @see CWM.Olap.HierarchyLevelAssociation
	 * @generated
	 */
	EClass getHierarchyLevelAssociation();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Level Based Hierarchy</em>'.
	 * @see CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy()
	 * @see #getHierarchyLevelAssociation()
	 * @generated
	 */
	EReference getHierarchyLevelAssociation_LevelBasedHierarchy();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.HierarchyLevelAssociation#getCurrentLevel <em>Current Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Level</em>'.
	 * @see CWM.Olap.HierarchyLevelAssociation#getCurrentLevel()
	 * @see #getHierarchyLevelAssociation()
	 * @generated
	 */
	EReference getHierarchyLevelAssociation_CurrentLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.HierarchyLevelAssociation#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.HierarchyLevelAssociation#getDimensionDeployment()
	 * @see #getHierarchyLevelAssociation()
	 * @generated
	 */
	EReference getHierarchyLevelAssociation_DimensionDeployment();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.LevelBasedHierarchy <em>Level Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Based Hierarchy</em>'.
	 * @see CWM.Olap.LevelBasedHierarchy
	 * @generated
	 */
	EClass getLevelBasedHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.LevelBasedHierarchy#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy Level Association</em>'.
	 * @see CWM.Olap.LevelBasedHierarchy#getHierarchyLevelAssociation()
	 * @see #getLevelBasedHierarchy()
	 * @generated
	 */
	EReference getLevelBasedHierarchy_HierarchyLevelAssociation();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.MemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Selection Group</em>'.
	 * @see CWM.Olap.MemberSelectionGroup
	 * @generated
	 */
	EClass getMemberSelectionGroup();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.MemberSelectionGroup#getMemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Selection</em>'.
	 * @see CWM.Olap.MemberSelectionGroup#getMemberSelection()
	 * @see #getMemberSelectionGroup()
	 * @generated
	 */
	EReference getMemberSelectionGroup_MemberSelection();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.MemberSelectionGroup#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cube Region</em>'.
	 * @see CWM.Olap.MemberSelectionGroup#getCubeRegion()
	 * @see #getMemberSelectionGroup()
	 * @generated
	 */
	EReference getMemberSelectionGroup_CubeRegion();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.MemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Selection</em>'.
	 * @see CWM.Olap.MemberSelection
	 * @generated
	 */
	EClass getMemberSelection();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.MemberSelection#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dimension</em>'.
	 * @see CWM.Olap.MemberSelection#getDimension()
	 * @see #getMemberSelection()
	 * @generated
	 */
	EReference getMemberSelection_Dimension();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.MemberSelection#getMemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Selection Group</em>'.
	 * @see CWM.Olap.MemberSelection#getMemberSelectionGroup()
	 * @see #getMemberSelection()
	 * @generated
	 */
	EReference getMemberSelection_MemberSelectionGroup();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see CWM.Olap.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Schema#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube</em>'.
	 * @see CWM.Olap.Schema#getCube()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Cube();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Schema#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see CWM.Olap.Schema#getDimension()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Schema#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Group</em>'.
	 * @see CWM.Olap.Schema#getDeploymentGroup()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DeploymentGroup();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.ValueBasedHierarchy <em>Value Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Based Hierarchy</em>'.
	 * @see CWM.Olap.ValueBasedHierarchy
	 * @generated
	 */
	EClass getValueBasedHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.ValueBasedHierarchy#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.ValueBasedHierarchy#getDimensionDeployment()
	 * @see #getValueBasedHierarchy()
	 * @generated
	 */
	EReference getValueBasedHierarchy_DimensionDeployment();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see CWM.Olap.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.Level#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hierarchy Level Association</em>'.
	 * @see CWM.Olap.Level#getHierarchyLevelAssociation()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_HierarchyLevelAssociation();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.CodedLevel <em>Coded Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coded Level</em>'.
	 * @see CWM.Olap.CodedLevel
	 * @generated
	 */
	EClass getCodedLevel();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Olap.CodedLevel#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encoding</em>'.
	 * @see CWM.Olap.CodedLevel#getEncoding()
	 * @see #getCodedLevel()
	 * @generated
	 */
	EReference getCodedLevel_Encoding();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see CWM.Olap.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.StructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Map</em>'.
	 * @see CWM.Olap.StructureMap
	 * @generated
	 */
	EClass getStructureMap();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Olap.StructureMap#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.StructureMap#getDimensionDeployment()
	 * @see #getStructureMap()
	 * @generated
	 */
	EReference getStructureMap_DimensionDeployment();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.StructureMap#getDimensionDeploymentLV <em>Dimension Deployment LV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension Deployment LV</em>'.
	 * @see CWM.Olap.StructureMap#getDimensionDeploymentLV()
	 * @see #getStructureMap()
	 * @generated
	 */
	EReference getStructureMap_DimensionDeploymentLV();

	/**
	 * Returns the meta object for the reference '{@link CWM.Olap.StructureMap#getDimensionDeploymentIP <em>Dimension Deployment IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension Deployment IP</em>'.
	 * @see CWM.Olap.StructureMap#getDimensionDeploymentIP()
	 * @see #getStructureMap()
	 * @generated
	 */
	EReference getStructureMap_DimensionDeploymentIP();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.HierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Member Selection Group</em>'.
	 * @see CWM.Olap.HierarchyMemberSelectionGroup
	 * @generated
	 */
	EClass getHierarchyMemberSelectionGroup();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Olap.HierarchyMemberSelectionGroup#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hierarchy</em>'.
	 * @see CWM.Olap.HierarchyMemberSelectionGroup#getHierarchy()
	 * @see #getHierarchyMemberSelectionGroup()
	 * @generated
	 */
	EReference getHierarchyMemberSelectionGroup_Hierarchy();

	/**
	 * Returns the meta object for class '{@link CWM.Olap.Olap_container <em>Olap container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Olap container</em>'.
	 * @see CWM.Olap.Olap_container
	 * @generated
	 */
	EClass getOlap_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getContentMap <em>Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Map</em>'.
	 * @see CWM.Olap.Olap_container#getContentMap()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_ContentMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube</em>'.
	 * @see CWM.Olap.Olap_container#getCube()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Cube();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Deployment</em>'.
	 * @see CWM.Olap.Olap_container#getCubeDeployment()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_CubeDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Dimension Association</em>'.
	 * @see CWM.Olap.Olap_container#getCubeDimensionAssociation()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_CubeDimensionAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube Region</em>'.
	 * @see CWM.Olap.Olap_container#getCubeRegion()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_CubeRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Group</em>'.
	 * @see CWM.Olap.Olap_container#getDeploymentGroup()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_DeploymentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see CWM.Olap.Olap_container#getDimension()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Deployment</em>'.
	 * @see CWM.Olap.Olap_container#getDimensionDeployment()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_DimensionDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy</em>'.
	 * @see CWM.Olap.Olap_container#getHierarchy()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Hierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy Level Association</em>'.
	 * @see CWM.Olap.Olap_container#getHierarchyLevelAssociation()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_HierarchyLevelAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Based Hierarchy</em>'.
	 * @see CWM.Olap.Olap_container#getLevelBasedHierarchy()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_LevelBasedHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getMemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Selection Group</em>'.
	 * @see CWM.Olap.Olap_container#getMemberSelectionGroup()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_MemberSelectionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getMemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Selection</em>'.
	 * @see CWM.Olap.Olap_container#getMemberSelection()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_MemberSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.Olap.Olap_container#getSchema()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getValueBasedHierarchy <em>Value Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Based Hierarchy</em>'.
	 * @see CWM.Olap.Olap_container#getValueBasedHierarchy()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_ValueBasedHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see CWM.Olap.Olap_container#getLevel()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getCodedLevel <em>Coded Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coded Level</em>'.
	 * @see CWM.Olap.Olap_container#getCodedLevel()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_CodedLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see CWM.Olap.Olap_container#getMeasure()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getStructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Map</em>'.
	 * @see CWM.Olap.Olap_container#getStructureMap()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_StructureMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Olap.Olap_container#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy Member Selection Group</em>'.
	 * @see CWM.Olap.Olap_container#getHierarchyMemberSelectionGroup()
	 * @see #getOlap_container()
	 * @generated
	 */
	EReference getOlap_container_HierarchyMemberSelectionGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OlapFactory getOlapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.ContentMapImpl <em>Content Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.ContentMapImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getContentMap()
		 * @generated
		 */
		EClass CONTENT_MAP = eINSTANCE.getContentMap();

		/**
		 * The meta object literal for the '<em><b>Cube Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_MAP__CUBE_DEPLOYMENT = eINSTANCE.getContentMap_CubeDeployment();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.CubeImpl <em>Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.CubeImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getCube()
		 * @generated
		 */
		EClass CUBE = eINSTANCE.getCube();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE__IS_VIRTUAL = eINSTANCE.getCube_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Cube Dimension Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE__CUBE_DIMENSION_ASSOCIATION = eINSTANCE.getCube_CubeDimensionAssociation();

		/**
		 * The meta object literal for the '<em><b>Cube Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE__CUBE_REGION = eINSTANCE.getCube_CubeRegion();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE__SCHEMA = eINSTANCE.getCube_Schema();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.CubeDeploymentImpl <em>Cube Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.CubeDeploymentImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getCubeDeployment()
		 * @generated
		 */
		EClass CUBE_DEPLOYMENT = eINSTANCE.getCubeDeployment();

		/**
		 * The meta object literal for the '<em><b>Cube Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DEPLOYMENT__CUBE_REGION = eINSTANCE.getCubeDeployment_CubeRegion();

		/**
		 * The meta object literal for the '<em><b>Deployment Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DEPLOYMENT__DEPLOYMENT_GROUP = eINSTANCE.getCubeDeployment_DeploymentGroup();

		/**
		 * The meta object literal for the '<em><b>Content Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DEPLOYMENT__CONTENT_MAP = eINSTANCE.getCubeDeployment_ContentMap();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.CubeDimensionAssociationImpl <em>Cube Dimension Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.CubeDimensionAssociationImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getCubeDimensionAssociation()
		 * @generated
		 */
		EClass CUBE_DIMENSION_ASSOCIATION = eINSTANCE.getCubeDimensionAssociation();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DIMENSION_ASSOCIATION__DIMENSION = eINSTANCE.getCubeDimensionAssociation_Dimension();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DIMENSION_ASSOCIATION__CUBE = eINSTANCE.getCubeDimensionAssociation_Cube();

		/**
		 * The meta object literal for the '<em><b>Calc Hierarchy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_DIMENSION_ASSOCIATION__CALC_HIERARCHY = eINSTANCE.getCubeDimensionAssociation_CalcHierarchy();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.CubeRegionImpl <em>Cube Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.CubeRegionImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getCubeRegion()
		 * @generated
		 */
		EClass CUBE_REGION = eINSTANCE.getCubeRegion();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_REGION__IS_READ_ONLY = eINSTANCE.getCubeRegion_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Fully Realized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_REGION__IS_FULLY_REALIZED = eINSTANCE.getCubeRegion_IsFullyRealized();

		/**
		 * The meta object literal for the '<em><b>Member Selection Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_REGION__MEMBER_SELECTION_GROUP = eINSTANCE.getCubeRegion_MemberSelectionGroup();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_REGION__CUBE = eINSTANCE.getCubeRegion_Cube();

		/**
		 * The meta object literal for the '<em><b>Cube Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_REGION__CUBE_DEPLOYMENT = eINSTANCE.getCubeRegion_CubeDeployment();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.DeploymentGroupImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getDeploymentGroup()
		 * @generated
		 */
		EClass DEPLOYMENT_GROUP = eINSTANCE.getDeploymentGroup();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_GROUP__SCHEMA = eINSTANCE.getDeploymentGroup_Schema();

		/**
		 * The meta object literal for the '<em><b>Cube Deployment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_GROUP__CUBE_DEPLOYMENT = eINSTANCE.getDeploymentGroup_CubeDeployment();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_GROUP__DIMENSION_DEPLOYMENT = eINSTANCE.getDeploymentGroup_DimensionDeployment();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.DimensionImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Is Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__IS_TIME = eINSTANCE.getDimension_IsTime();

		/**
		 * The meta object literal for the '<em><b>Is Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__IS_MEASURE = eINSTANCE.getDimension_IsMeasure();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__HIERARCHY = eINSTANCE.getDimension_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Member Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__MEMBER_SELECTION = eINSTANCE.getDimension_MemberSelection();

		/**
		 * The meta object literal for the '<em><b>Cube Dimension Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__CUBE_DIMENSION_ASSOCIATION = eINSTANCE.getDimension_CubeDimensionAssociation();

		/**
		 * The meta object literal for the '<em><b>Display Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__DISPLAY_DEFAULT = eINSTANCE.getDimension_DisplayDefault();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__SCHEMA = eINSTANCE.getDimension_Schema();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.DimensionDeploymentImpl <em>Dimension Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.DimensionDeploymentImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getDimensionDeployment()
		 * @generated
		 */
		EClass DIMENSION_DEPLOYMENT = eINSTANCE.getDimensionDeployment();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Level Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__HIERARCHY_LEVEL_ASSOCIATION = eINSTANCE.getDimensionDeployment_HierarchyLevelAssociation();

		/**
		 * The meta object literal for the '<em><b>Value Based Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__VALUE_BASED_HIERARCHY = eINSTANCE.getDimensionDeployment_ValueBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Structure Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__STRUCTURE_MAP = eINSTANCE.getDimensionDeployment_StructureMap();

		/**
		 * The meta object literal for the '<em><b>List Of Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__LIST_OF_VALUES = eINSTANCE.getDimensionDeployment_ListOfValues();

		/**
		 * The meta object literal for the '<em><b>Immediate Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__IMMEDIATE_PARENT = eINSTANCE.getDimensionDeployment_ImmediateParent();

		/**
		 * The meta object literal for the '<em><b>Deployment Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_DEPLOYMENT__DEPLOYMENT_GROUP = eINSTANCE.getDimensionDeployment_DeploymentGroup();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.HierarchyImpl <em>Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.HierarchyImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchy()
		 * @generated
		 */
		EClass HIERARCHY = eINSTANCE.getHierarchy();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__DIMENSION = eINSTANCE.getHierarchy_Dimension();

		/**
		 * The meta object literal for the '<em><b>Cube Dimension Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__CUBE_DIMENSION_ASSOCIATION = eINSTANCE.getHierarchy_CubeDimensionAssociation();

		/**
		 * The meta object literal for the '<em><b>Defaulted Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__DEFAULTED_DIMENSION = eINSTANCE.getHierarchy_DefaultedDimension();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Member Selection Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP = eINSTANCE.getHierarchy_HierarchyMemberSelectionGroup();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.HierarchyLevelAssociationImpl <em>Hierarchy Level Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.HierarchyLevelAssociationImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchyLevelAssociation()
		 * @generated
		 */
		EClass HIERARCHY_LEVEL_ASSOCIATION = eINSTANCE.getHierarchyLevelAssociation();

		/**
		 * The meta object literal for the '<em><b>Level Based Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_LEVEL_ASSOCIATION__LEVEL_BASED_HIERARCHY = eINSTANCE.getHierarchyLevelAssociation_LevelBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Current Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_LEVEL_ASSOCIATION__CURRENT_LEVEL = eINSTANCE.getHierarchyLevelAssociation_CurrentLevel();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_LEVEL_ASSOCIATION__DIMENSION_DEPLOYMENT = eINSTANCE.getHierarchyLevelAssociation_DimensionDeployment();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.LevelBasedHierarchyImpl <em>Level Based Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.LevelBasedHierarchyImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getLevelBasedHierarchy()
		 * @generated
		 */
		EClass LEVEL_BASED_HIERARCHY = eINSTANCE.getLevelBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Level Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_BASED_HIERARCHY__HIERARCHY_LEVEL_ASSOCIATION = eINSTANCE.getLevelBasedHierarchy_HierarchyLevelAssociation();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.MemberSelectionGroupImpl <em>Member Selection Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.MemberSelectionGroupImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getMemberSelectionGroup()
		 * @generated
		 */
		EClass MEMBER_SELECTION_GROUP = eINSTANCE.getMemberSelectionGroup();

		/**
		 * The meta object literal for the '<em><b>Member Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_SELECTION_GROUP__MEMBER_SELECTION = eINSTANCE.getMemberSelectionGroup_MemberSelection();

		/**
		 * The meta object literal for the '<em><b>Cube Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_SELECTION_GROUP__CUBE_REGION = eINSTANCE.getMemberSelectionGroup_CubeRegion();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.MemberSelectionImpl <em>Member Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.MemberSelectionImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getMemberSelection()
		 * @generated
		 */
		EClass MEMBER_SELECTION = eINSTANCE.getMemberSelection();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_SELECTION__DIMENSION = eINSTANCE.getMemberSelection_Dimension();

		/**
		 * The meta object literal for the '<em><b>Member Selection Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_SELECTION__MEMBER_SELECTION_GROUP = eINSTANCE.getMemberSelection_MemberSelectionGroup();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.SchemaImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CUBE = eINSTANCE.getSchema_Cube();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DIMENSION = eINSTANCE.getSchema_Dimension();

		/**
		 * The meta object literal for the '<em><b>Deployment Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DEPLOYMENT_GROUP = eINSTANCE.getSchema_DeploymentGroup();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.ValueBasedHierarchyImpl <em>Value Based Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.ValueBasedHierarchyImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getValueBasedHierarchy()
		 * @generated
		 */
		EClass VALUE_BASED_HIERARCHY = eINSTANCE.getValueBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BASED_HIERARCHY__DIMENSION_DEPLOYMENT = eINSTANCE.getValueBasedHierarchy_DimensionDeployment();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.LevelImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Level Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__HIERARCHY_LEVEL_ASSOCIATION = eINSTANCE.getLevel_HierarchyLevelAssociation();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.CodedLevelImpl <em>Coded Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.CodedLevelImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getCodedLevel()
		 * @generated
		 */
		EClass CODED_LEVEL = eINSTANCE.getCodedLevel();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODED_LEVEL__ENCODING = eINSTANCE.getCodedLevel_Encoding();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.MeasureImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.StructureMapImpl <em>Structure Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.StructureMapImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getStructureMap()
		 * @generated
		 */
		EClass STRUCTURE_MAP = eINSTANCE.getStructureMap();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MAP__DIMENSION_DEPLOYMENT = eINSTANCE.getStructureMap_DimensionDeployment();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment LV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MAP__DIMENSION_DEPLOYMENT_LV = eINSTANCE.getStructureMap_DimensionDeploymentLV();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment IP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MAP__DIMENSION_DEPLOYMENT_IP = eINSTANCE.getStructureMap_DimensionDeploymentIP();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.HierarchyMemberSelectionGroupImpl <em>Hierarchy Member Selection Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.HierarchyMemberSelectionGroupImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getHierarchyMemberSelectionGroup()
		 * @generated
		 */
		EClass HIERARCHY_MEMBER_SELECTION_GROUP = eINSTANCE.getHierarchyMemberSelectionGroup();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY = eINSTANCE.getHierarchyMemberSelectionGroup_Hierarchy();

		/**
		 * The meta object literal for the '{@link CWM.Olap.impl.Olap_containerImpl <em>Olap container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Olap.impl.Olap_containerImpl
		 * @see CWM.Olap.impl.OlapPackageImpl#getOlap_container()
		 * @generated
		 */
		EClass OLAP_CONTAINER = eINSTANCE.getOlap_container();

		/**
		 * The meta object literal for the '<em><b>Content Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CONTENT_MAP = eINSTANCE.getOlap_container_ContentMap();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CUBE = eINSTANCE.getOlap_container_Cube();

		/**
		 * The meta object literal for the '<em><b>Cube Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CUBE_DEPLOYMENT = eINSTANCE.getOlap_container_CubeDeployment();

		/**
		 * The meta object literal for the '<em><b>Cube Dimension Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION = eINSTANCE.getOlap_container_CubeDimensionAssociation();

		/**
		 * The meta object literal for the '<em><b>Cube Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CUBE_REGION = eINSTANCE.getOlap_container_CubeRegion();

		/**
		 * The meta object literal for the '<em><b>Deployment Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__DEPLOYMENT_GROUP = eINSTANCE.getOlap_container_DeploymentGroup();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__DIMENSION = eINSTANCE.getOlap_container_Dimension();

		/**
		 * The meta object literal for the '<em><b>Dimension Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__DIMENSION_DEPLOYMENT = eINSTANCE.getOlap_container_DimensionDeployment();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__HIERARCHY = eINSTANCE.getOlap_container_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Level Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION = eINSTANCE.getOlap_container_HierarchyLevelAssociation();

		/**
		 * The meta object literal for the '<em><b>Level Based Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__LEVEL_BASED_HIERARCHY = eINSTANCE.getOlap_container_LevelBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Member Selection Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__MEMBER_SELECTION_GROUP = eINSTANCE.getOlap_container_MemberSelectionGroup();

		/**
		 * The meta object literal for the '<em><b>Member Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__MEMBER_SELECTION = eINSTANCE.getOlap_container_MemberSelection();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__SCHEMA = eINSTANCE.getOlap_container_Schema();

		/**
		 * The meta object literal for the '<em><b>Value Based Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__VALUE_BASED_HIERARCHY = eINSTANCE.getOlap_container_ValueBasedHierarchy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__LEVEL = eINSTANCE.getOlap_container_Level();

		/**
		 * The meta object literal for the '<em><b>Coded Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__CODED_LEVEL = eINSTANCE.getOlap_container_CodedLevel();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__MEASURE = eINSTANCE.getOlap_container_Measure();

		/**
		 * The meta object literal for the '<em><b>Structure Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__STRUCTURE_MAP = eINSTANCE.getOlap_container_StructureMap();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Member Selection Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP = eINSTANCE.getOlap_container_HierarchyMemberSelectionGroup();

	}

} //OlapPackage
