/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.Classifier;
import CWM.Core.Feature;
import CWM.Core.ProcedureExpression;

import CWM.Core.impl.ModelElementImpl;

import CWM.CwmTransformation.ClassifierFeatureMap;
import CWM.CwmTransformation.ClassifierMap;
import CWM.CwmTransformation.CwmTransformationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Feature Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getClassifierToFeature <em>Classifier To Feature</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierFeatureMapImpl extends ModelElementImpl implements ClassifierFeatureMap {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected ProcedureExpression function;

	/**
	 * The default value of the '{@link #getFunctionDescription() <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionDescription() <em>Function Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDescription()
	 * @generated
	 * @ordered
	 */
	protected String functionDescription = FUNCTION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierToFeature() <em>Classifier To Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierToFeature()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLASSIFIER_TO_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierToFeature() <em>Classifier To Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierToFeature()
	 * @generated
	 * @ordered
	 */
	protected Boolean classifierToFeature = CLASSIFIER_TO_FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifier;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierFeatureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.CLASSIFIER_FEATURE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureExpression getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(ProcedureExpression newFunction, NotificationChain msgs) {
		ProcedureExpression oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(ProcedureExpression newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionDescription() {
		return functionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionDescription(String newFunctionDescription) {
		String oldFunctionDescription = functionDescription;
		functionDescription = newFunctionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION, oldFunctionDescription, functionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getClassifierToFeature() {
		return classifierToFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierToFeature(Boolean newClassifierToFeature) {
		Boolean oldClassifierToFeature = classifierToFeature;
		classifierToFeature = newClassifierToFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE, oldClassifierToFeature, classifierToFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<Feature>(Feature.class, this, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierMap getClassifierMap() {
		if (eContainerFeatureID != CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP) return null;
		return (ClassifierMap)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierMap(ClassifierMap newClassifierMap, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassifierMap, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierMap(ClassifierMap newClassifierMap) {
		if (newClassifierMap != eInternalContainer() || (eContainerFeatureID != CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP && newClassifierMap != null)) {
			if (EcoreUtil.isAncestor(this, newClassifierMap))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassifierMap != null)
				msgs = ((InternalEObject)newClassifierMap).eInverseAdd(this, CwmTransformationPackage.CLASSIFIER_MAP__CF_MAP, ClassifierMap.class, msgs);
			msgs = basicSetClassifierMap(newClassifierMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP, newClassifierMap, newClassifierMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClassifierMap((ClassifierMap)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION:
				return basicSetFunction(null, msgs);
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				return basicSetClassifierMap(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				return eInternalContainer().eInverseRemove(this, CwmTransformationPackage.CLASSIFIER_MAP__CF_MAP, ClassifierMap.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION:
				return getFunction();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION:
				return getFunctionDescription();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE:
				return getClassifierToFeature();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER:
				return getClassifier();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FEATURE:
				return getFeature();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				return getClassifierMap();
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
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION:
				setFunction((ProcedureExpression)newValue);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION:
				setFunctionDescription((String)newValue);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE:
				setClassifierToFeature((Boolean)newValue);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				setClassifierMap((ClassifierMap)newValue);
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
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION:
				setFunction((ProcedureExpression)null);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION:
				setFunctionDescription(FUNCTION_DESCRIPTION_EDEFAULT);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE:
				setClassifierToFeature(CLASSIFIER_TO_FEATURE_EDEFAULT);
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER:
				getClassifier().clear();
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FEATURE:
				getFeature().clear();
				return;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				setClassifierMap((ClassifierMap)null);
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
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION:
				return function != null;
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION:
				return FUNCTION_DESCRIPTION_EDEFAULT == null ? functionDescription != null : !FUNCTION_DESCRIPTION_EDEFAULT.equals(functionDescription);
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE:
				return CLASSIFIER_TO_FEATURE_EDEFAULT == null ? classifierToFeature != null : !CLASSIFIER_TO_FEATURE_EDEFAULT.equals(classifierToFeature);
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__FEATURE:
				return feature != null && !feature.isEmpty();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP:
				return getClassifierMap() != null;
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
		result.append(" (functionDescription: ");
		result.append(functionDescription);
		result.append(", classifierToFeature: ");
		result.append(classifierToFeature);
		result.append(')');
		return result.toString();
	}

} //ClassifierFeatureMapImpl
