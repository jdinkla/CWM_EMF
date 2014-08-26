/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMatrix;
import CWM.MiningCore.MiningData.MatrixProperty;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl#getDiagonalDefault <em>Diagonal Default</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl#getOffDiagonalDefault <em>Off Diagonal Default</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMatrixImpl extends ModelElementImpl implements CategoryMatrix {
	/**
	 * The default value of the '{@link #getDiagonalDefault() <em>Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Double DIAGONAL_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagonalDefault() <em>Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalDefault()
	 * @generated
	 * @ordered
	 */
	protected Double diagonalDefault = DIAGONAL_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffDiagonalDefault() <em>Off Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffDiagonalDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Double OFF_DIAGONAL_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffDiagonalDefault() <em>Off Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffDiagonalDefault()
	 * @generated
	 * @ordered
	 */
	protected Double offDiagonalDefault = OFF_DIAGONAL_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MatrixProperty KIND_EDEFAULT = MatrixProperty.MP_SYMMETRIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MatrixProperty kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDiagonalDefault() {
		return diagonalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalDefault(Double newDiagonalDefault) {
		Double oldDiagonalDefault = diagonalDefault;
		diagonalDefault = newDiagonalDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX__DIAGONAL_DEFAULT, oldDiagonalDefault, diagonalDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOffDiagonalDefault() {
		return offDiagonalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffDiagonalDefault(Double newOffDiagonalDefault) {
		Double oldOffDiagonalDefault = offDiagonalDefault;
		offDiagonalDefault = newOffDiagonalDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT, oldOffDiagonalDefault, offDiagonalDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixProperty getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MatrixProperty newKind) {
		MatrixProperty oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, MiningDataPackage.CATEGORY_MATRIX__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MATRIX__DIAGONAL_DEFAULT:
				return getDiagonalDefault();
			case MiningDataPackage.CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT:
				return getOffDiagonalDefault();
			case MiningDataPackage.CATEGORY_MATRIX__KIND:
				return getKind();
			case MiningDataPackage.CATEGORY_MATRIX__CATEGORY:
				return getCategory();
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
			case MiningDataPackage.CATEGORY_MATRIX__DIAGONAL_DEFAULT:
				setDiagonalDefault((Double)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT:
				setOffDiagonalDefault((Double)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__KIND:
				setKind((MatrixProperty)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
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
			case MiningDataPackage.CATEGORY_MATRIX__DIAGONAL_DEFAULT:
				setDiagonalDefault(DIAGONAL_DEFAULT_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT:
				setOffDiagonalDefault(OFF_DIAGONAL_DEFAULT_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MATRIX__CATEGORY:
				getCategory().clear();
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
			case MiningDataPackage.CATEGORY_MATRIX__DIAGONAL_DEFAULT:
				return DIAGONAL_DEFAULT_EDEFAULT == null ? diagonalDefault != null : !DIAGONAL_DEFAULT_EDEFAULT.equals(diagonalDefault);
			case MiningDataPackage.CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT:
				return OFF_DIAGONAL_DEFAULT_EDEFAULT == null ? offDiagonalDefault != null : !OFF_DIAGONAL_DEFAULT_EDEFAULT.equals(offDiagonalDefault);
			case MiningDataPackage.CATEGORY_MATRIX__KIND:
				return kind != KIND_EDEFAULT;
			case MiningDataPackage.CATEGORY_MATRIX__CATEGORY:
				return category != null && !category.isEmpty();
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
		result.append(" (diagonalDefault: ");
		result.append(diagonalDefault);
		result.append(", offDiagonalDefault: ");
		result.append(offDiagonalDefault);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CategoryMatrixImpl
