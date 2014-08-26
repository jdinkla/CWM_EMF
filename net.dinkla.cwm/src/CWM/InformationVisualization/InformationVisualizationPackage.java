/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import CWM.Core.CorePackage;

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
 * @see CWM.InformationVisualization.InformationVisualizationFactory
 * @model kind="package"
 * @generated
 */
public interface InformationVisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InformationVisualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "InformationVisualization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InformationVisualization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationVisualizationPackage eINSTANCE = CWM.InformationVisualization.impl.InformationVisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.InformationVisualization.impl.RenderedObjectImpl <em>Rendered Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.InformationVisualization.impl.RenderedObjectImpl
	 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRenderedObject()
	 * @generated
	 */
	int RENDERED_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__NAME = CorePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__FEATURE = CorePackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__FORMULA = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__ACTION = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__FILE_NAME = CorePackage.CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__TYPE = CorePackage.CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__URL = CorePackage.CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__RENDERING = CorePackage.CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__DEFAULT_RENDERING = CorePackage.CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__COMPONENT = CorePackage.CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__COMPOSITE = CorePackage.CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Neighbor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__NEIGHBOR = CorePackage.CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__REFERENCING_NEIGHBOR = CorePackage.CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__MODEL_ELEMENT = CorePackage.CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rendered Object Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT__RENDERED_OBJECT_SET = CorePackage.CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Rendered Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link CWM.InformationVisualization.impl.RenderedObjectSetImpl <em>Rendered Object Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.InformationVisualization.impl.RenderedObjectSetImpl
	 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRenderedObjectSet()
	 * @generated
	 */
	int RENDERED_OBJECT_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Rendered Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__RENDERED_OBJECT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET__RENDERING = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rendered Object Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERED_OBJECT_SET_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.InformationVisualization.impl.RenderingImpl <em>Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.InformationVisualization.impl.RenderingImpl
	 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRendering()
	 * @generated
	 */
	int RENDERING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__NAME = CorePackage.FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__VISIBILITY = CorePackage.FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__CLIENT_DEPENDENCY = CorePackage.FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__CONSTRAINT = CorePackage.FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__IMPORTER = CorePackage.FEATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__NAMESPACE = CorePackage.FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__TAGGED_VALUE = CorePackage.FEATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__OWNER_SCOPE = CorePackage.FEATURE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__OWNER = CorePackage.FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__FORMULA = CorePackage.FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__ACTION = CorePackage.FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__FILE_NAME = CorePackage.FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__TYPE = CorePackage.FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__URL = CorePackage.FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__RENDERED_OBJECT = CorePackage.FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Defaulted Rendered Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__DEFAULTED_RENDERED_OBJECT = CorePackage.FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rendered Object Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__RENDERED_OBJECT_SET = CorePackage.FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING_FEATURE_COUNT = CorePackage.FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CWM.InformationVisualization.impl.XSLRenderingImpl <em>XSL Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.InformationVisualization.impl.XSLRenderingImpl
	 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getXSLRendering()
	 * @generated
	 */
	int XSL_RENDERING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__NAME = RENDERING__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__VISIBILITY = RENDERING__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__CLIENT_DEPENDENCY = RENDERING__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__CONSTRAINT = RENDERING__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__IMPORTER = RENDERING__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__NAMESPACE = RENDERING__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__TAGGED_VALUE = RENDERING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__OWNER_SCOPE = RENDERING__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__OWNER = RENDERING__OWNER;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__FORMULA = RENDERING__FORMULA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__ACTION = RENDERING__ACTION;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__FILE_NAME = RENDERING__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__TYPE = RENDERING__TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__URL = RENDERING__URL;

	/**
	 * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__RENDERED_OBJECT = RENDERING__RENDERED_OBJECT;

	/**
	 * The feature id for the '<em><b>Defaulted Rendered Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__DEFAULTED_RENDERED_OBJECT = RENDERING__DEFAULTED_RENDERED_OBJECT;

	/**
	 * The feature id for the '<em><b>Rendered Object Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING__RENDERED_OBJECT_SET = RENDERING__RENDERED_OBJECT_SET;

	/**
	 * The number of structural features of the '<em>XSL Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_RENDERING_FEATURE_COUNT = RENDERING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl <em>Information Visualization container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.InformationVisualization.impl.InformationVisualization_containerImpl
	 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getInformationVisualization_container()
	 * @generated
	 */
	int INFORMATION_VISUALIZATION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Rendered Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Rendered Object Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET = 1;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VISUALIZATION_CONTAINER__RENDERING = 2;

	/**
	 * The feature id for the '<em><b>XSL Rendering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING = 3;

	/**
	 * The number of structural features of the '<em>Information Visualization container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VISUALIZATION_CONTAINER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link CWM.InformationVisualization.RenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendered Object</em>'.
	 * @see CWM.InformationVisualization.RenderedObject
	 * @generated
	 */
	EClass getRenderedObject();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.InformationVisualization.RenderedObject#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getFormula()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_Formula();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.RenderedObject#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getAction()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EAttribute getRenderedObject_Action();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.RenderedObject#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getFileName()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EAttribute getRenderedObject_FileName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.RenderedObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getType()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EAttribute getRenderedObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.RenderedObject#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getUrl()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EAttribute getRenderedObject_Url();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.RenderedObject#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rendering</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getRendering()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_Rendering();

	/**
	 * Returns the meta object for the reference '{@link CWM.InformationVisualization.RenderedObject#getDefaultRendering <em>Default Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Rendering</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getDefaultRendering()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_DefaultRendering();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.RenderedObject#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getComponent()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_Component();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.RenderedObject#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composite</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getComposite()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_Composite();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.RenderedObject#getNeighbor <em>Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbor</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getNeighbor()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_Neighbor();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.RenderedObject#getReferencingNeighbor <em>Referencing Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Neighbor</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getReferencingNeighbor()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_ReferencingNeighbor();

	/**
	 * Returns the meta object for the reference '{@link CWM.InformationVisualization.RenderedObject#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getModelElement()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_ModelElement();

	/**
	 * Returns the meta object for the container reference '{@link CWM.InformationVisualization.RenderedObject#getRenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rendered Object Set</em>'.
	 * @see CWM.InformationVisualization.RenderedObject#getRenderedObjectSet()
	 * @see #getRenderedObject()
	 * @generated
	 */
	EReference getRenderedObject_RenderedObjectSet();

	/**
	 * Returns the meta object for class '{@link CWM.InformationVisualization.RenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendered Object Set</em>'.
	 * @see CWM.InformationVisualization.RenderedObjectSet
	 * @generated
	 */
	EClass getRenderedObjectSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.RenderedObjectSet#getRenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendered Object</em>'.
	 * @see CWM.InformationVisualization.RenderedObjectSet#getRenderedObject()
	 * @see #getRenderedObjectSet()
	 * @generated
	 */
	EReference getRenderedObjectSet_RenderedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.RenderedObjectSet#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendering</em>'.
	 * @see CWM.InformationVisualization.RenderedObjectSet#getRendering()
	 * @see #getRenderedObjectSet()
	 * @generated
	 */
	EReference getRenderedObjectSet_Rendering();

	/**
	 * Returns the meta object for class '{@link CWM.InformationVisualization.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendering</em>'.
	 * @see CWM.InformationVisualization.Rendering
	 * @generated
	 */
	EClass getRendering();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.InformationVisualization.Rendering#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see CWM.InformationVisualization.Rendering#getFormula()
	 * @see #getRendering()
	 * @generated
	 */
	EReference getRendering_Formula();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.Rendering#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see CWM.InformationVisualization.Rendering#getAction()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_Action();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.Rendering#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see CWM.InformationVisualization.Rendering#getFileName()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_FileName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.Rendering#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.InformationVisualization.Rendering#getType()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_Type();

	/**
	 * Returns the meta object for the attribute '{@link CWM.InformationVisualization.Rendering#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CWM.InformationVisualization.Rendering#getUrl()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_Url();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.Rendering#getRenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rendered Object</em>'.
	 * @see CWM.InformationVisualization.Rendering#getRenderedObject()
	 * @see #getRendering()
	 * @generated
	 */
	EReference getRendering_RenderedObject();

	/**
	 * Returns the meta object for the reference list '{@link CWM.InformationVisualization.Rendering#getDefaultedRenderedObject <em>Defaulted Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defaulted Rendered Object</em>'.
	 * @see CWM.InformationVisualization.Rendering#getDefaultedRenderedObject()
	 * @see #getRendering()
	 * @generated
	 */
	EReference getRendering_DefaultedRenderedObject();

	/**
	 * Returns the meta object for the container reference '{@link CWM.InformationVisualization.Rendering#getRenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rendered Object Set</em>'.
	 * @see CWM.InformationVisualization.Rendering#getRenderedObjectSet()
	 * @see #getRendering()
	 * @generated
	 */
	EReference getRendering_RenderedObjectSet();

	/**
	 * Returns the meta object for class '{@link CWM.InformationVisualization.XSLRendering <em>XSL Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSL Rendering</em>'.
	 * @see CWM.InformationVisualization.XSLRendering
	 * @generated
	 */
	EClass getXSLRendering();

	/**
	 * Returns the meta object for class '{@link CWM.InformationVisualization.InformationVisualization_container <em>Information Visualization container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Visualization container</em>'.
	 * @see CWM.InformationVisualization.InformationVisualization_container
	 * @generated
	 */
	EClass getInformationVisualization_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.InformationVisualization_container#getRenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendered Object</em>'.
	 * @see CWM.InformationVisualization.InformationVisualization_container#getRenderedObject()
	 * @see #getInformationVisualization_container()
	 * @generated
	 */
	EReference getInformationVisualization_container_RenderedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.InformationVisualization_container#getRenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendered Object Set</em>'.
	 * @see CWM.InformationVisualization.InformationVisualization_container#getRenderedObjectSet()
	 * @see #getInformationVisualization_container()
	 * @generated
	 */
	EReference getInformationVisualization_container_RenderedObjectSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.InformationVisualization_container#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendering</em>'.
	 * @see CWM.InformationVisualization.InformationVisualization_container#getRendering()
	 * @see #getInformationVisualization_container()
	 * @generated
	 */
	EReference getInformationVisualization_container_Rendering();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.InformationVisualization.InformationVisualization_container#getXSLRendering <em>XSL Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XSL Rendering</em>'.
	 * @see CWM.InformationVisualization.InformationVisualization_container#getXSLRendering()
	 * @see #getInformationVisualization_container()
	 * @generated
	 */
	EReference getInformationVisualization_container_XSLRendering();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InformationVisualizationFactory getInformationVisualizationFactory();

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
		 * The meta object literal for the '{@link CWM.InformationVisualization.impl.RenderedObjectImpl <em>Rendered Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.InformationVisualization.impl.RenderedObjectImpl
		 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRenderedObject()
		 * @generated
		 */
		EClass RENDERED_OBJECT = eINSTANCE.getRenderedObject();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__FORMULA = eINSTANCE.getRenderedObject_Formula();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERED_OBJECT__ACTION = eINSTANCE.getRenderedObject_Action();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERED_OBJECT__FILE_NAME = eINSTANCE.getRenderedObject_FileName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERED_OBJECT__TYPE = eINSTANCE.getRenderedObject_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERED_OBJECT__URL = eINSTANCE.getRenderedObject_Url();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__RENDERING = eINSTANCE.getRenderedObject_Rendering();

		/**
		 * The meta object literal for the '<em><b>Default Rendering</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__DEFAULT_RENDERING = eINSTANCE.getRenderedObject_DefaultRendering();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__COMPONENT = eINSTANCE.getRenderedObject_Component();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__COMPOSITE = eINSTANCE.getRenderedObject_Composite();

		/**
		 * The meta object literal for the '<em><b>Neighbor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__NEIGHBOR = eINSTANCE.getRenderedObject_Neighbor();

		/**
		 * The meta object literal for the '<em><b>Referencing Neighbor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__REFERENCING_NEIGHBOR = eINSTANCE.getRenderedObject_ReferencingNeighbor();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__MODEL_ELEMENT = eINSTANCE.getRenderedObject_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Rendered Object Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT__RENDERED_OBJECT_SET = eINSTANCE.getRenderedObject_RenderedObjectSet();

		/**
		 * The meta object literal for the '{@link CWM.InformationVisualization.impl.RenderedObjectSetImpl <em>Rendered Object Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.InformationVisualization.impl.RenderedObjectSetImpl
		 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRenderedObjectSet()
		 * @generated
		 */
		EClass RENDERED_OBJECT_SET = eINSTANCE.getRenderedObjectSet();

		/**
		 * The meta object literal for the '<em><b>Rendered Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT_SET__RENDERED_OBJECT = eINSTANCE.getRenderedObjectSet_RenderedObject();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERED_OBJECT_SET__RENDERING = eINSTANCE.getRenderedObjectSet_Rendering();

		/**
		 * The meta object literal for the '{@link CWM.InformationVisualization.impl.RenderingImpl <em>Rendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.InformationVisualization.impl.RenderingImpl
		 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getRendering()
		 * @generated
		 */
		EClass RENDERING = eINSTANCE.getRendering();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERING__FORMULA = eINSTANCE.getRendering_Formula();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__ACTION = eINSTANCE.getRendering_Action();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__FILE_NAME = eINSTANCE.getRendering_FileName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__TYPE = eINSTANCE.getRendering_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__URL = eINSTANCE.getRendering_Url();

		/**
		 * The meta object literal for the '<em><b>Rendered Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERING__RENDERED_OBJECT = eINSTANCE.getRendering_RenderedObject();

		/**
		 * The meta object literal for the '<em><b>Defaulted Rendered Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERING__DEFAULTED_RENDERED_OBJECT = eINSTANCE.getRendering_DefaultedRenderedObject();

		/**
		 * The meta object literal for the '<em><b>Rendered Object Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERING__RENDERED_OBJECT_SET = eINSTANCE.getRendering_RenderedObjectSet();

		/**
		 * The meta object literal for the '{@link CWM.InformationVisualization.impl.XSLRenderingImpl <em>XSL Rendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.InformationVisualization.impl.XSLRenderingImpl
		 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getXSLRendering()
		 * @generated
		 */
		EClass XSL_RENDERING = eINSTANCE.getXSLRendering();

		/**
		 * The meta object literal for the '{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl <em>Information Visualization container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.InformationVisualization.impl.InformationVisualization_containerImpl
		 * @see CWM.InformationVisualization.impl.InformationVisualizationPackageImpl#getInformationVisualization_container()
		 * @generated
		 */
		EClass INFORMATION_VISUALIZATION_CONTAINER = eINSTANCE.getInformationVisualization_container();

		/**
		 * The meta object literal for the '<em><b>Rendered Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT = eINSTANCE.getInformationVisualization_container_RenderedObject();

		/**
		 * The meta object literal for the '<em><b>Rendered Object Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET = eINSTANCE.getInformationVisualization_container_RenderedObjectSet();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_VISUALIZATION_CONTAINER__RENDERING = eINSTANCE.getInformationVisualization_container_Rendering();

		/**
		 * The meta object literal for the '<em><b>XSL Rendering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING = eINSTANCE.getInformationVisualization_container_XSLRendering();

	}

} //InformationVisualizationPackage
