/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.impl;

import CWM.Core.Expression;

import CWM.Core.impl.ModelElementImpl;

import CWM.WarehouseOperation.TransformationExecution;
import CWM.WarehouseOperation.WarehouseOperationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl#getInProgress <em>In Progress</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl#getSuccessful <em>Successful</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationExecutionImpl extends ModelElementImpl implements TransformationExecution {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInProgress() <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IN_PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInProgress() <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProgress()
	 * @generated
	 * @ordered
	 */
	protected Boolean inProgress = IN_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessful() <em>Successful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessful()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUCCESSFUL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessful() <em>Successful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessful()
	 * @generated
	 * @ordered
	 */
	protected Boolean successful = SUCCESSFUL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Expression status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseOperationPackage.Literals.TRANSFORMATION_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInProgress() {
		return inProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInProgress(Boolean newInProgress) {
		Boolean oldInProgress = inProgress;
		inProgress = newInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__IN_PROGRESS, oldInProgress, inProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSuccessful() {
		return successful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessful(Boolean newSuccessful) {
		Boolean oldSuccessful = successful;
		successful = newSuccessful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__SUCCESSFUL, oldSuccessful, successful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Expression newStatus, NotificationChain msgs) {
		Expression oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Expression newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS:
				return basicSetStatus(null, msgs);
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
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__START_DATE:
				return getStartDate();
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__END_DATE:
				return getEndDate();
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__IN_PROGRESS:
				return getInProgress();
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__SUCCESSFUL:
				return getSuccessful();
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__START_DATE:
				setStartDate((String)newValue);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__END_DATE:
				setEndDate((String)newValue);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__IN_PROGRESS:
				setInProgress((Boolean)newValue);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__SUCCESSFUL:
				setSuccessful((Boolean)newValue);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS:
				setStatus((Expression)newValue);
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
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__IN_PROGRESS:
				setInProgress(IN_PROGRESS_EDEFAULT);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__SUCCESSFUL:
				setSuccessful(SUCCESSFUL_EDEFAULT);
				return;
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS:
				setStatus((Expression)null);
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
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__IN_PROGRESS:
				return IN_PROGRESS_EDEFAULT == null ? inProgress != null : !IN_PROGRESS_EDEFAULT.equals(inProgress);
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__SUCCESSFUL:
				return SUCCESSFUL_EDEFAULT == null ? successful != null : !SUCCESSFUL_EDEFAULT.equals(successful);
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION__STATUS:
				return status != null;
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", inProgress: ");
		result.append(inProgress);
		result.append(", successful: ");
		result.append(successful);
		result.append(')');
		return result.toString();
	}

} //TransformationExecutionImpl
