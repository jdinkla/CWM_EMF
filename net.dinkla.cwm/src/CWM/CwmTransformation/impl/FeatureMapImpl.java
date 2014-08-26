/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.Feature;
import CWM.Core.ProcedureExpression;

import CWM.Core.impl.ModelElementImpl;

import CWM.CwmTransformation.ClassifierMap;
import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.FeatureMap;

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
 * An implementation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.FeatureMapImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.FeatureMapImpl#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.FeatureMapImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.FeatureMapImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.FeatureMapImpl#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMapImpl extends ModelElementImpl implements FeatureMap {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.FEATURE_MAP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.FEATURE_MAP__FUNCTION, oldFunction, newFunction);
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
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.FEATURE_MAP__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.FEATURE_MAP__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.FEATURE_MAP__FUNCTION, newFunction, newFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.FEATURE_MAP__FUNCTION_DESCRIPTION, oldFunctionDescription, functionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Feature>(Feature.class, this, CwmTransformationPackage.FEATURE_MAP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Feature>(Feature.class, this, CwmTransformationPackage.FEATURE_MAP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierMap getClassifierMap() {
		if (eContainerFeatureID != CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP) return null;
		return (ClassifierMap)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierMap(ClassifierMap newClassifierMap, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassifierMap, CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierMap(ClassifierMap newClassifierMap) {
		if (newClassifierMap != eInternalContainer() || (eContainerFeatureID != CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP && newClassifierMap != null)) {
			if (EcoreUtil.isAncestor(this, newClassifierMap))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassifierMap != null)
				msgs = ((InternalEObject)newClassifierMap).eInverseAdd(this, CwmTransformationPackage.CLASSIFIER_MAP__FEATURE_MAP, ClassifierMap.class, msgs);
			msgs = basicSetClassifierMap(newClassifierMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP, newClassifierMap, newClassifierMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION:
				return basicSetFunction(null, msgs);
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
				return eInternalContainer().eInverseRemove(this, CwmTransformationPackage.CLASSIFIER_MAP__FEATURE_MAP, ClassifierMap.class, msgs);
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
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION:
				return getFunction();
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION_DESCRIPTION:
				return getFunctionDescription();
			case CwmTransformationPackage.FEATURE_MAP__SOURCE:
				return getSource();
			case CwmTransformationPackage.FEATURE_MAP__TARGET:
				return getTarget();
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION:
				setFunction((ProcedureExpression)newValue);
				return;
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION_DESCRIPTION:
				setFunctionDescription((String)newValue);
				return;
			case CwmTransformationPackage.FEATURE_MAP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Feature>)newValue);
				return;
			case CwmTransformationPackage.FEATURE_MAP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Feature>)newValue);
				return;
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION:
				setFunction((ProcedureExpression)null);
				return;
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION_DESCRIPTION:
				setFunctionDescription(FUNCTION_DESCRIPTION_EDEFAULT);
				return;
			case CwmTransformationPackage.FEATURE_MAP__SOURCE:
				getSource().clear();
				return;
			case CwmTransformationPackage.FEATURE_MAP__TARGET:
				getTarget().clear();
				return;
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION:
				return function != null;
			case CwmTransformationPackage.FEATURE_MAP__FUNCTION_DESCRIPTION:
				return FUNCTION_DESCRIPTION_EDEFAULT == null ? functionDescription != null : !FUNCTION_DESCRIPTION_EDEFAULT.equals(functionDescription);
			case CwmTransformationPackage.FEATURE_MAP__SOURCE:
				return source != null && !source.isEmpty();
			case CwmTransformationPackage.FEATURE_MAP__TARGET:
				return target != null && !target.isEmpty();
			case CwmTransformationPackage.FEATURE_MAP__CLASSIFIER_MAP:
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
		result.append(')');
		return result.toString();
	}

} //FeatureMapImpl
