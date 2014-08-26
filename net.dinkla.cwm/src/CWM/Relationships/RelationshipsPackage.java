/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relationships;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CWM.Relationships.RelationshipsFactory
 * @model kind="package"
 * @generated
 */
public interface RelationshipsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relationships";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Relationships";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Relationships";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationshipsPackage eINSTANCE = CWM.Relationships.impl.RelationshipsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Relationships.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relationships.impl.AssociationImpl
	 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relationships.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relationships.impl.AssociationEndImpl
	 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = CorePackage.STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__VISIBILITY = CorePackage.STRUCTURAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CLIENT_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CONSTRAINT = CorePackage.STRUCTURAL_FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__IMPORTER = CorePackage.STRUCTURAL_FEATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAMESPACE = CorePackage.STRUCTURAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__TAGGED_VALUE = CorePackage.STRUCTURAL_FEATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__OWNER_SCOPE = CorePackage.STRUCTURAL_FEATURE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__OWNER = CorePackage.STRUCTURAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CHANGEABILITY = CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__MULTIPLICITY = CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__ORDERING = CorePackage.STRUCTURAL_FEATURE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__TARGET_SCOPE = CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__TYPE = CorePackage.STRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__AGGREGATION = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__IS_NAVIGABLE = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Relationships.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relationships.impl.GeneralizationImpl
	 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CHILD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__PARENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Relationships.impl.Relationships_containerImpl <em>Relationships container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relationships.impl.Relationships_containerImpl
	 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getRelationships_container()
	 * @generated
	 */
	int RELATIONSHIPS_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER__ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER__ASSOCIATION_END = 1;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER__GENERALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Relationships container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CWM.Relationships.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relationships.AggregationKind
	 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 4;


	/**
	 * Returns the meta object for class '{@link CWM.Relationships.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see CWM.Relationships.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link CWM.Relationships.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see CWM.Relationships.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relationships.AssociationEnd#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see CWM.Relationships.AssociationEnd#getAggregation()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relationships.AssociationEnd#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see CWM.Relationships.AssociationEnd#getIsNavigable()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_IsNavigable();

	/**
	 * Returns the meta object for class '{@link CWM.Relationships.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see CWM.Relationships.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relationships.Generalization#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see CWM.Relationships.Generalization#getChild()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Child();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relationships.Generalization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see CWM.Relationships.Generalization#getParent()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Parent();

	/**
	 * Returns the meta object for class '{@link CWM.Relationships.Relationships_container <em>Relationships container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships container</em>'.
	 * @see CWM.Relationships.Relationships_container
	 * @generated
	 */
	EClass getRelationships_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relationships.Relationships_container#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see CWM.Relationships.Relationships_container#getAssociation()
	 * @see #getRelationships_container()
	 * @generated
	 */
	EReference getRelationships_container_Association();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relationships.Relationships_container#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association End</em>'.
	 * @see CWM.Relationships.Relationships_container#getAssociationEnd()
	 * @see #getRelationships_container()
	 * @generated
	 */
	EReference getRelationships_container_AssociationEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relationships.Relationships_container#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see CWM.Relationships.Relationships_container#getGeneralization()
	 * @see #getRelationships_container()
	 * @generated
	 */
	EReference getRelationships_container_Generalization();

	/**
	 * Returns the meta object for enum '{@link CWM.Relationships.AggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Kind</em>'.
	 * @see CWM.Relationships.AggregationKind
	 * @generated
	 */
	EEnum getAggregationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationshipsFactory getRelationshipsFactory();

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
		 * The meta object literal for the '{@link CWM.Relationships.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relationships.impl.AssociationImpl
		 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link CWM.Relationships.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relationships.impl.AssociationEndImpl
		 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__AGGREGATION = eINSTANCE.getAssociationEnd_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__IS_NAVIGABLE = eINSTANCE.getAssociationEnd_IsNavigable();

		/**
		 * The meta object literal for the '{@link CWM.Relationships.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relationships.impl.GeneralizationImpl
		 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__CHILD = eINSTANCE.getGeneralization_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__PARENT = eINSTANCE.getGeneralization_Parent();

		/**
		 * The meta object literal for the '{@link CWM.Relationships.impl.Relationships_containerImpl <em>Relationships container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relationships.impl.Relationships_containerImpl
		 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getRelationships_container()
		 * @generated
		 */
		EClass RELATIONSHIPS_CONTAINER = eINSTANCE.getRelationships_container();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_CONTAINER__ASSOCIATION = eINSTANCE.getRelationships_container_Association();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_CONTAINER__ASSOCIATION_END = eINSTANCE.getRelationships_container_AssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_CONTAINER__GENERALIZATION = eINSTANCE.getRelationships_container_Generalization();

		/**
		 * The meta object literal for the '{@link CWM.Relationships.AggregationKind <em>Aggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relationships.AggregationKind
		 * @see CWM.Relationships.impl.RelationshipsPackageImpl#getAggregationKind()
		 * @generated
		 */
		EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

	}

} //RelationshipsPackage
