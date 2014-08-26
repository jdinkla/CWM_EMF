/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Core_container#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getClass_ <em>Class</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getDataType <em>Data Type</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getPackage <em>Package</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getModel <em>Model</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getDependency <em>Dependency</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getExpression <em>Expression</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getProcedureExpression <em>Procedure Expression</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getMultiplicityRange <em>Multiplicity Range</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link CWM.Core.Core_container#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getCore_container()
 * @model
 * @generated
 */
public interface Core_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_ModelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Namespace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespace();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<CWM.Core.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_DataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataType();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Package()
	 * @model containment="true"
	 * @generated
	 */
	EList<CWM.Core.Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Subsystem</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Subsystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getSubsystem();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.StructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Feature</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_StructuralFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralFeature> getStructuralFeature();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.BooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_BooleanExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanExpression> getBooleanExpression();

	/**
	 * Returns the value of the '<em><b>Procedure Expression</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ProcedureExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Expression</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_ProcedureExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcedureExpression> getProcedureExpression();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Multiplicity> getMultiplicity();

	/**
	 * Returns the value of the '<em><b>Multiplicity Range</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.MultiplicityRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Range</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_MultiplicityRange()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiplicityRange> getMultiplicityRange();

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_Stereotype()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stereotype> getStereotype();

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getCore_container_TaggedValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaggedValue> getTaggedValue();

} // Core_container
