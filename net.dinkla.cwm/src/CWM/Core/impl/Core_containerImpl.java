/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.impl;

import CWM.Core.Attribute;
import CWM.Core.BooleanExpression;
import CWM.Core.Classifier;
import CWM.Core.Constraint;
import CWM.Core.CorePackage;
import CWM.Core.Core_container;
import CWM.Core.DataType;
import CWM.Core.Dependency;
import CWM.Core.Element;
import CWM.Core.Expression;
import CWM.Core.Feature;
import CWM.Core.Model;
import CWM.Core.ModelElement;
import CWM.Core.Multiplicity;
import CWM.Core.MultiplicityRange;
import CWM.Core.Namespace;
import CWM.Core.ProcedureExpression;
import CWM.Core.Stereotype;
import CWM.Core.StructuralFeature;
import CWM.Core.Subsystem;
import CWM.Core.TaggedValue;

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
 * An implementation of the model object '<em><b>Core container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getProcedureExpression <em>Procedure Expression</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getMultiplicityRange <em>Multiplicity Range</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link CWM.Core.impl.Core_containerImpl#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Core_containerImpl extends EObjectImpl implements Core_container {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElement;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespace;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifier;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.Core.Class> class_;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataType;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.Core.Package> package_;

	/**
	 * The cached value of the '{@link #getSubsystem() <em>Subsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> subsystem;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getStructuralFeature() <em>Structural Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralFeature> structuralFeature;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * The cached value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanExpression> booleanExpression;

	/**
	 * The cached value of the '{@link #getProcedureExpression() <em>Procedure Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureExpression> procedureExpression;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected EList<Multiplicity> multiplicity;

	/**
	 * The cached value of the '{@link #getMultiplicityRange() <em>Multiplicity Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityRange()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicityRange> multiplicityRange;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotype;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedValue> taggedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Core_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, CorePackage.CORE_CONTAINER__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getModelElement() {
		if (modelElement == null) {
			modelElement = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, CorePackage.CORE_CONTAINER__MODEL_ELEMENT);
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespace() {
		if (namespace == null) {
			namespace = new EObjectContainmentEList<Namespace>(Namespace.class, this, CorePackage.CORE_CONTAINER__NAMESPACE);
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, CorePackage.CORE_CONTAINER__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.Core.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<CWM.Core.Class>(CWM.Core.Class.class, this, CorePackage.CORE_CONTAINER__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataType() {
		if (dataType == null) {
			dataType = new EObjectContainmentEList<DataType>(DataType.class, this, CorePackage.CORE_CONTAINER__DATA_TYPE);
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.Core.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<CWM.Core.Package>(CWM.Core.Package.class, this, CorePackage.CORE_CONTAINER__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getSubsystem() {
		if (subsystem == null) {
			subsystem = new EObjectContainmentEList<Subsystem>(Subsystem.class, this, CorePackage.CORE_CONTAINER__SUBSYSTEM);
		}
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<Model>(Model.class, this, CorePackage.CORE_CONTAINER__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, CorePackage.CORE_CONTAINER__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getStructuralFeature() {
		if (structuralFeature == null) {
			structuralFeature = new EObjectContainmentEList<StructuralFeature>(StructuralFeature.class, this, CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE);
		}
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CorePackage.CORE_CONTAINER__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, CorePackage.CORE_CONTAINER__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<Dependency>(Dependency.class, this, CorePackage.CORE_CONTAINER__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this, CorePackage.CORE_CONTAINER__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanExpression> getBooleanExpression() {
		if (booleanExpression == null) {
			booleanExpression = new EObjectContainmentEList<BooleanExpression>(BooleanExpression.class, this, CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION);
		}
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureExpression> getProcedureExpression() {
		if (procedureExpression == null) {
			procedureExpression = new EObjectContainmentEList<ProcedureExpression>(ProcedureExpression.class, this, CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION);
		}
		return procedureExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multiplicity> getMultiplicity() {
		if (multiplicity == null) {
			multiplicity = new EObjectContainmentEList<Multiplicity>(Multiplicity.class, this, CorePackage.CORE_CONTAINER__MULTIPLICITY);
		}
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicityRange> getMultiplicityRange() {
		if (multiplicityRange == null) {
			multiplicityRange = new EObjectContainmentEList<MultiplicityRange>(MultiplicityRange.class, this, CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE);
		}
		return multiplicityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectContainmentEList<Stereotype>(Stereotype.class, this, CorePackage.CORE_CONTAINER__STEREOTYPE);
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<TaggedValue>(TaggedValue.class, this, CorePackage.CORE_CONTAINER__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_CONTAINER__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
				return ((InternalEList<?>)getModelElement()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__NAMESPACE:
				return ((InternalEList<?>)getNamespace()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
				return ((InternalEList<?>)getDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
				return ((InternalEList<?>)getSubsystem()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
				return ((InternalEList<?>)getStructuralFeature()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
				return ((InternalEList<?>)getBooleanExpression()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
				return ((InternalEList<?>)getProcedureExpression()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
				return ((InternalEList<?>)getMultiplicity()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
				return ((InternalEList<?>)getMultiplicityRange()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
				return ((InternalEList<?>)getStereotype()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CORE_CONTAINER__ELEMENT:
				return getElement();
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
				return getModelElement();
			case CorePackage.CORE_CONTAINER__NAMESPACE:
				return getNamespace();
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
				return getClassifier();
			case CorePackage.CORE_CONTAINER__CLASS:
				return getClass_();
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
				return getDataType();
			case CorePackage.CORE_CONTAINER__PACKAGE:
				return getPackage();
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
				return getSubsystem();
			case CorePackage.CORE_CONTAINER__MODEL:
				return getModel();
			case CorePackage.CORE_CONTAINER__FEATURE:
				return getFeature();
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
				return getStructuralFeature();
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
				return getAttribute();
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
				return getConstraint();
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
				return getDependency();
			case CorePackage.CORE_CONTAINER__EXPRESSION:
				return getExpression();
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
				return getBooleanExpression();
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
				return getProcedureExpression();
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
				return getMultiplicity();
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
				return getMultiplicityRange();
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
				return getStereotype();
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
				return getTaggedValue();
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
			case CorePackage.CORE_CONTAINER__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
				getModelElement().clear();
				getModelElement().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends Namespace>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends CWM.Core.Class>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends DataType>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends CWM.Core.Package>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
				getSubsystem().clear();
				getSubsystem().addAll((Collection<? extends Subsystem>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends Model>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
				getStructuralFeature().clear();
				getStructuralFeature().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
				getBooleanExpression().clear();
				getBooleanExpression().addAll((Collection<? extends BooleanExpression>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
				getProcedureExpression().clear();
				getProcedureExpression().addAll((Collection<? extends ProcedureExpression>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
				getMultiplicity().clear();
				getMultiplicity().addAll((Collection<? extends Multiplicity>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
				getMultiplicityRange().clear();
				getMultiplicityRange().addAll((Collection<? extends MultiplicityRange>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
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
			case CorePackage.CORE_CONTAINER__ELEMENT:
				getElement().clear();
				return;
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
				getModelElement().clear();
				return;
			case CorePackage.CORE_CONTAINER__NAMESPACE:
				getNamespace().clear();
				return;
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
				getClassifier().clear();
				return;
			case CorePackage.CORE_CONTAINER__CLASS:
				getClass_().clear();
				return;
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
				getDataType().clear();
				return;
			case CorePackage.CORE_CONTAINER__PACKAGE:
				getPackage().clear();
				return;
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
				getSubsystem().clear();
				return;
			case CorePackage.CORE_CONTAINER__MODEL:
				getModel().clear();
				return;
			case CorePackage.CORE_CONTAINER__FEATURE:
				getFeature().clear();
				return;
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
				getStructuralFeature().clear();
				return;
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
				getConstraint().clear();
				return;
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
				getDependency().clear();
				return;
			case CorePackage.CORE_CONTAINER__EXPRESSION:
				getExpression().clear();
				return;
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
				getBooleanExpression().clear();
				return;
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
				getProcedureExpression().clear();
				return;
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
				getMultiplicity().clear();
				return;
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
				getMultiplicityRange().clear();
				return;
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
				getStereotype().clear();
				return;
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
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
			case CorePackage.CORE_CONTAINER__ELEMENT:
				return element != null && !element.isEmpty();
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
				return modelElement != null && !modelElement.isEmpty();
			case CorePackage.CORE_CONTAINER__NAMESPACE:
				return namespace != null && !namespace.isEmpty();
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case CorePackage.CORE_CONTAINER__CLASS:
				return class_ != null && !class_.isEmpty();
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case CorePackage.CORE_CONTAINER__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
				return subsystem != null && !subsystem.isEmpty();
			case CorePackage.CORE_CONTAINER__MODEL:
				return model != null && !model.isEmpty();
			case CorePackage.CORE_CONTAINER__FEATURE:
				return feature != null && !feature.isEmpty();
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
				return structuralFeature != null && !structuralFeature.isEmpty();
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case CorePackage.CORE_CONTAINER__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
				return booleanExpression != null && !booleanExpression.isEmpty();
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
				return procedureExpression != null && !procedureExpression.isEmpty();
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
				return multiplicity != null && !multiplicity.isEmpty();
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
				return multiplicityRange != null && !multiplicityRange.isEmpty();
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Core_containerImpl
