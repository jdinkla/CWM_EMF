/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes.impl;

import CWM.DataTypes.DataTypesPackage;
import CWM.DataTypes.DataTypes_container;
import CWM.DataTypes.Enumeration;
import CWM.DataTypes.EnumerationLiteral;
import CWM.DataTypes.QueryExpression;
import CWM.DataTypes.TypeAlias;
import CWM.DataTypes.Union;
import CWM.DataTypes.UnionMember;

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
 * An implementation of the model object '<em><b>Data Types container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getQueryExpression <em>Query Expression</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getTypeAlias <em>Type Alias</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.DataTypes_containerImpl#getUnionMember <em>Union Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypes_containerImpl extends EObjectImpl implements DataTypes_container {
	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumeration;

	/**
	 * The cached value of the '{@link #getEnumerationLiteral() <em>Enumeration Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerationLiteral;

	/**
	 * The cached value of the '{@link #getQueryExpression() <em>Query Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryExpression> queryExpression;

	/**
	 * The cached value of the '{@link #getTypeAlias() <em>Type Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAlias> typeAlias;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<Union> union;

	/**
	 * The cached value of the '{@link #getUnionMember() <em>Union Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionMember()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionMember> unionMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypes_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_TYPES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumeration() {
		if (enumeration == null) {
			enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getEnumerationLiteral() {
		if (enumerationLiteral == null) {
			enumerationLiteral = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL);
		}
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryExpression> getQueryExpression() {
		if (queryExpression == null) {
			queryExpression = new EObjectContainmentEList<QueryExpression>(QueryExpression.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION);
		}
		return queryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAlias> getTypeAlias() {
		if (typeAlias == null) {
			typeAlias = new EObjectContainmentEList<TypeAlias>(TypeAlias.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS);
		}
		return typeAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Union> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<Union>(Union.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionMember> getUnionMember() {
		if (unionMember == null) {
			unionMember = new EObjectContainmentEList<UnionMember>(UnionMember.class, this, DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER);
		}
		return unionMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION:
				return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL:
				return ((InternalEList<?>)getEnumerationLiteral()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION:
				return ((InternalEList<?>)getQueryExpression()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS:
				return ((InternalEList<?>)getTypeAlias()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION:
				return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER:
				return ((InternalEList<?>)getUnionMember()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION:
				return getEnumeration();
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL:
				return getEnumerationLiteral();
			case DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION:
				return getQueryExpression();
			case DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS:
				return getTypeAlias();
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION:
				return getUnion();
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER:
				return getUnionMember();
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
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL:
				getEnumerationLiteral().clear();
				getEnumerationLiteral().addAll((Collection<? extends EnumerationLiteral>)newValue);
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION:
				getQueryExpression().clear();
				getQueryExpression().addAll((Collection<? extends QueryExpression>)newValue);
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS:
				getTypeAlias().clear();
				getTypeAlias().addAll((Collection<? extends TypeAlias>)newValue);
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends Union>)newValue);
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER:
				getUnionMember().clear();
				getUnionMember().addAll((Collection<? extends UnionMember>)newValue);
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
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION:
				getEnumeration().clear();
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL:
				getEnumerationLiteral().clear();
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION:
				getQueryExpression().clear();
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS:
				getTypeAlias().clear();
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION:
				getUnion().clear();
				return;
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER:
				getUnionMember().clear();
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
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
			case DataTypesPackage.DATA_TYPES_CONTAINER__ENUMERATION_LITERAL:
				return enumerationLiteral != null && !enumerationLiteral.isEmpty();
			case DataTypesPackage.DATA_TYPES_CONTAINER__QUERY_EXPRESSION:
				return queryExpression != null && !queryExpression.isEmpty();
			case DataTypesPackage.DATA_TYPES_CONTAINER__TYPE_ALIAS:
				return typeAlias != null && !typeAlias.isEmpty();
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION:
				return union != null && !union.isEmpty();
			case DataTypesPackage.DATA_TYPES_CONTAINER__UNION_MEMBER:
				return unionMember != null && !unionMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTypes_containerImpl
