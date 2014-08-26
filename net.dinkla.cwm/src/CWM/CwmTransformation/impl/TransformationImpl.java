/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.Dependency;
import CWM.Core.ProcedureExpression;

import CWM.Core.impl.NamespaceImpl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.DataObjectSet;
import CWM.CwmTransformation.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getFunctionDescription <em>Function Description</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationImpl#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends NamespaceImpl implements Transformation {
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
	 * The default value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObjectSet> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObjectSet> target;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> use;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION__FUNCTION, oldFunction, newFunction);
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
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.TRANSFORMATION__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CwmTransformationPackage.TRANSFORMATION__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION__FUNCTION, newFunction, newFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION, oldFunctionDescription, functionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimary(Boolean newIsPrimary) {
		Boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectSet> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList.ManyInverse<DataObjectSet>(DataObjectSet.class, this, CwmTransformationPackage.TRANSFORMATION__SOURCE, CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectSet> getTarget() {
		if (target == null) {
			target = new EObjectWithInverseResolvingEList.ManyInverse<DataObjectSet>(DataObjectSet.class, this, CwmTransformationPackage.TRANSFORMATION__TARGET, CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<Dependency>(Dependency.class, this, CwmTransformationPackage.TRANSFORMATION__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTarget()).basicAdd(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION:
				return basicSetFunction(null, msgs);
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION:
				return getFunction();
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION:
				return getFunctionDescription();
			case CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY:
				return getIsPrimary();
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				return getSource();
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				return getTarget();
			case CwmTransformationPackage.TRANSFORMATION__USE:
				return getUse();
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
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION:
				setFunction((ProcedureExpression)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION:
				setFunctionDescription((String)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends DataObjectSet>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends DataObjectSet>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends Dependency>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION:
				setFunction((ProcedureExpression)null);
				return;
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION:
				setFunctionDescription(FUNCTION_DESCRIPTION_EDEFAULT);
				return;
			case CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
				return;
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				getSource().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				getTarget().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION__USE:
				getUse().clear();
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
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION:
				return function != null;
			case CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION:
				return FUNCTION_DESCRIPTION_EDEFAULT == null ? functionDescription != null : !FUNCTION_DESCRIPTION_EDEFAULT.equals(functionDescription);
			case CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY:
				return IS_PRIMARY_EDEFAULT == null ? isPrimary != null : !IS_PRIMARY_EDEFAULT.equals(isPrimary);
			case CwmTransformationPackage.TRANSFORMATION__SOURCE:
				return source != null && !source.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION__TARGET:
				return target != null && !target.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION__USE:
				return use != null && !use.isEmpty();
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
		result.append(", isPrimary: ");
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
