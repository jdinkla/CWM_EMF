/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.ModelElement;

import CWM.Core.impl.DependencyImpl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.TransformationUse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationUseImpl#getType <em>Type</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationUseImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationUseImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationUseImpl extends DependencyImpl implements TransformationUse {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> transformation;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION_USE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getTransformation() {
		if (transformation == null) {
			transformation = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.TRANSFORMATION_USE__TRANSFORMATION);
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getOperation() {
		if (operation == null) {
			operation = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.TRANSFORMATION_USE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CwmTransformationPackage.TRANSFORMATION_USE__TYPE:
				return getType();
			case CwmTransformationPackage.TRANSFORMATION_USE__TRANSFORMATION:
				return getTransformation();
			case CwmTransformationPackage.TRANSFORMATION_USE__OPERATION:
				return getOperation();
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
			case CwmTransformationPackage.TRANSFORMATION_USE__TYPE:
				setType((String)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_USE__TRANSFORMATION:
				getTransformation().clear();
				getTransformation().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_USE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends ModelElement>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION_USE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CwmTransformationPackage.TRANSFORMATION_USE__TRANSFORMATION:
				getTransformation().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_USE__OPERATION:
				getOperation().clear();
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
			case CwmTransformationPackage.TRANSFORMATION_USE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CwmTransformationPackage.TRANSFORMATION_USE__TRANSFORMATION:
				return transformation != null && !transformation.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_USE__OPERATION:
				return operation != null && !operation.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TransformationUseImpl
