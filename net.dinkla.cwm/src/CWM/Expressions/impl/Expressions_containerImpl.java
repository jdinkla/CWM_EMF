/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions.impl;

import CWM.Expressions.ConstantNode;
import CWM.Expressions.ElementNode;
import CWM.Expressions.ExpressionNode;
import CWM.Expressions.ExpressionsPackage;
import CWM.Expressions.Expressions_container;
import CWM.Expressions.FeatureNode;

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
 * An implementation of the model object '<em><b>Expressions container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Expressions.impl.Expressions_containerImpl#getExpressionNode <em>Expression Node</em>}</li>
 *   <li>{@link CWM.Expressions.impl.Expressions_containerImpl#getConstantNode <em>Constant Node</em>}</li>
 *   <li>{@link CWM.Expressions.impl.Expressions_containerImpl#getElementNode <em>Element Node</em>}</li>
 *   <li>{@link CWM.Expressions.impl.Expressions_containerImpl#getFeatureNode <em>Feature Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Expressions_containerImpl extends EObjectImpl implements Expressions_container {
	/**
	 * The cached value of the '{@link #getExpressionNode() <em>Expression Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionNode> expressionNode;

	/**
	 * The cached value of the '{@link #getConstantNode() <em>Constant Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantNode> constantNode;

	/**
	 * The cached value of the '{@link #getElementNode() <em>Element Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNode> elementNode;

	/**
	 * The cached value of the '{@link #getFeatureNode() <em>Feature Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureNode()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureNode> featureNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Expressions_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSIONS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionNode> getExpressionNode() {
		if (expressionNode == null) {
			expressionNode = new EObjectContainmentEList<ExpressionNode>(ExpressionNode.class, this, ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE);
		}
		return expressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantNode> getConstantNode() {
		if (constantNode == null) {
			constantNode = new EObjectContainmentEList<ConstantNode>(ConstantNode.class, this, ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE);
		}
		return constantNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNode> getElementNode() {
		if (elementNode == null) {
			elementNode = new EObjectContainmentEList<ElementNode>(ElementNode.class, this, ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE);
		}
		return elementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureNode> getFeatureNode() {
		if (featureNode == null) {
			featureNode = new EObjectContainmentEList<FeatureNode>(FeatureNode.class, this, ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE);
		}
		return featureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE:
				return ((InternalEList<?>)getExpressionNode()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE:
				return ((InternalEList<?>)getConstantNode()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE:
				return ((InternalEList<?>)getElementNode()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE:
				return ((InternalEList<?>)getFeatureNode()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE:
				return getExpressionNode();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE:
				return getConstantNode();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE:
				return getElementNode();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE:
				return getFeatureNode();
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
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE:
				getExpressionNode().clear();
				getExpressionNode().addAll((Collection<? extends ExpressionNode>)newValue);
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE:
				getConstantNode().clear();
				getConstantNode().addAll((Collection<? extends ConstantNode>)newValue);
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE:
				getElementNode().clear();
				getElementNode().addAll((Collection<? extends ElementNode>)newValue);
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE:
				getFeatureNode().clear();
				getFeatureNode().addAll((Collection<? extends FeatureNode>)newValue);
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
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE:
				getExpressionNode().clear();
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE:
				getConstantNode().clear();
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE:
				getElementNode().clear();
				return;
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE:
				getFeatureNode().clear();
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
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__EXPRESSION_NODE:
				return expressionNode != null && !expressionNode.isEmpty();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__CONSTANT_NODE:
				return constantNode != null && !constantNode.isEmpty();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__ELEMENT_NODE:
				return elementNode != null && !elementNode.isEmpty();
			case ExpressionsPackage.EXPRESSIONS_CONTAINER__FEATURE_NODE:
				return featureNode != null && !featureNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Expressions_containerImpl
