/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional.impl;

import CWM.Multidimensional.Dimension;
import CWM.Multidimensional.DimensionedObject;
import CWM.Multidimensional.Member;
import CWM.Multidimensional.MemberSet;
import CWM.Multidimensional.MemberValue;
import CWM.Multidimensional.MultidimensionalPackage;
import CWM.Multidimensional.Multidimensional_container;
import CWM.Multidimensional.Schema;

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
 * An implementation of the model object '<em><b>Multidimensional container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getMember <em>Member</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getMemberSet <em>Member Set</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getMemberValue <em>Member Value</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.Multidimensional_containerImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Multidimensional_containerImpl extends EObjectImpl implements Multidimensional_container {
	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimension;

	/**
	 * The cached value of the '{@link #getDimensionedObject() <em>Dimensioned Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionedObject> dimensionedObject;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> member;

	/**
	 * The cached value of the '{@link #getMemberSet() <em>Member Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSet()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberSet> memberSet;

	/**
	 * The cached value of the '{@link #getMemberValue() <em>Member Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberValue()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberValue> memberValue;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Multidimensional_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultidimensionalPackage.Literals.MULTIDIMENSIONAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<Dimension>(Dimension.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionedObject> getDimensionedObject() {
		if (dimensionedObject == null) {
			dimensionedObject = new EObjectContainmentEList<DimensionedObject>(DimensionedObject.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT);
		}
		return dimensionedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<Member>(Member.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberSet> getMemberSet() {
		if (memberSet == null) {
			memberSet = new EObjectContainmentEList<MemberSet>(MemberSet.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET);
		}
		return memberSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberValue> getMemberValue() {
		if (memberValue == null) {
			memberValue = new EObjectContainmentEList<MemberValue>(MemberValue.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE);
		}
		return memberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT:
				return ((InternalEList<?>)getDimensionedObject()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET:
				return ((InternalEList<?>)getMemberSet()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE:
				return ((InternalEList<?>)getMemberValue()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
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
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION:
				return getDimension();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT:
				return getDimensionedObject();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER:
				return getMember();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET:
				return getMemberSet();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE:
				return getMemberValue();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA:
				return getSchema();
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
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Dimension>)newValue);
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				getDimensionedObject().addAll((Collection<? extends DimensionedObject>)newValue);
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Member>)newValue);
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET:
				getMemberSet().clear();
				getMemberSet().addAll((Collection<? extends MemberSet>)newValue);
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE:
				getMemberValue().clear();
				getMemberValue().addAll((Collection<? extends MemberValue>)newValue);
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
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
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION:
				getDimension().clear();
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER:
				getMember().clear();
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET:
				getMemberSet().clear();
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE:
				getMemberValue().clear();
				return;
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA:
				getSchema().clear();
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
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT:
				return dimensionedObject != null && !dimensionedObject.isEmpty();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER:
				return member != null && !member.isEmpty();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_SET:
				return memberSet != null && !memberSet.isEmpty();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE:
				return memberValue != null && !memberValue.isEmpty();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER__SCHEMA:
				return schema != null && !schema.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Multidimensional_containerImpl
