/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.Expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = CWM.Expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Expressions.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Expressions.impl.ExpressionNodeImpl
	 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getExpressionNode()
	 * @generated
	 */
	int EXPRESSION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__EXPRESSION = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__FEATURE_NODE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__TYPE = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Expressions.impl.ConstantNodeImpl <em>Constant Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Expressions.impl.ConstantNodeImpl
	 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getConstantNode()
	 * @generated
	 */
	int CONSTANT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_NODE__EXPRESSION = EXPRESSION_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_NODE__FEATURE_NODE = EXPRESSION_NODE__FEATURE_NODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_NODE__TYPE = EXPRESSION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_NODE__VALUE = EXPRESSION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_NODE_FEATURE_COUNT = EXPRESSION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Expressions.impl.ElementNodeImpl <em>Element Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Expressions.impl.ElementNodeImpl
	 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getElementNode()
	 * @generated
	 */
	int ELEMENT_NODE = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__EXPRESSION = EXPRESSION_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__FEATURE_NODE = EXPRESSION_NODE__FEATURE_NODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__TYPE = EXPRESSION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__MODEL_ELEMENT = EXPRESSION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE_FEATURE_COUNT = EXPRESSION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Expressions.impl.FeatureNodeImpl <em>Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Expressions.impl.FeatureNodeImpl
	 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getFeatureNode()
	 * @generated
	 */
	int FEATURE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE__EXPRESSION = EXPRESSION_NODE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE__FEATURE_NODE = EXPRESSION_NODE__FEATURE_NODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE__TYPE = EXPRESSION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE__ARGUMENT = EXPRESSION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE__FEATURE = EXPRESSION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NODE_FEATURE_COUNT = EXPRESSION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Expressions.impl.Expressions_containerImpl <em>Expressions container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Expressions.impl.Expressions_containerImpl
	 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getExpressions_container()
	 * @generated
	 */
	int EXPRESSIONS_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Expression Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_CONTAINER__EXPRESSION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Constant Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_CONTAINER__CONSTANT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Element Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_CONTAINER__ELEMENT_NODE = 2;

	/**
	 * The feature id for the '<em><b>Feature Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_CONTAINER__FEATURE_NODE = 3;

	/**
	 * The number of structural features of the '<em>Expressions container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_CONTAINER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link CWM.Expressions.ExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Node</em>'.
	 * @see CWM.Expressions.ExpressionNode
	 * @generated
	 */
	EClass getExpressionNode();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Expressions.ExpressionNode#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see CWM.Expressions.ExpressionNode#getExpression()
	 * @see #getExpressionNode()
	 * @generated
	 */
	EReference getExpressionNode_Expression();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Expressions.ExpressionNode#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature Node</em>'.
	 * @see CWM.Expressions.ExpressionNode#getFeatureNode()
	 * @see #getExpressionNode()
	 * @generated
	 */
	EReference getExpressionNode_FeatureNode();

	/**
	 * Returns the meta object for the reference '{@link CWM.Expressions.ExpressionNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CWM.Expressions.ExpressionNode#getType()
	 * @see #getExpressionNode()
	 * @generated
	 */
	EReference getExpressionNode_Type();

	/**
	 * Returns the meta object for class '{@link CWM.Expressions.ConstantNode <em>Constant Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Node</em>'.
	 * @see CWM.Expressions.ConstantNode
	 * @generated
	 */
	EClass getConstantNode();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Expressions.ConstantNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CWM.Expressions.ConstantNode#getValue()
	 * @see #getConstantNode()
	 * @generated
	 */
	EAttribute getConstantNode_Value();

	/**
	 * Returns the meta object for class '{@link CWM.Expressions.ElementNode <em>Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Node</em>'.
	 * @see CWM.Expressions.ElementNode
	 * @generated
	 */
	EClass getElementNode();

	/**
	 * Returns the meta object for the reference '{@link CWM.Expressions.ElementNode#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see CWM.Expressions.ElementNode#getModelElement()
	 * @see #getElementNode()
	 * @generated
	 */
	EReference getElementNode_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.Expressions.FeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Node</em>'.
	 * @see CWM.Expressions.FeatureNode
	 * @generated
	 */
	EClass getFeatureNode();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Expressions.FeatureNode#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see CWM.Expressions.FeatureNode#getArgument()
	 * @see #getFeatureNode()
	 * @generated
	 */
	EReference getFeatureNode_Argument();

	/**
	 * Returns the meta object for the reference '{@link CWM.Expressions.FeatureNode#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see CWM.Expressions.FeatureNode#getFeature()
	 * @see #getFeatureNode()
	 * @generated
	 */
	EReference getFeatureNode_Feature();

	/**
	 * Returns the meta object for class '{@link CWM.Expressions.Expressions_container <em>Expressions container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressions container</em>'.
	 * @see CWM.Expressions.Expressions_container
	 * @generated
	 */
	EClass getExpressions_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Expressions.Expressions_container#getExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Node</em>'.
	 * @see CWM.Expressions.Expressions_container#getExpressionNode()
	 * @see #getExpressions_container()
	 * @generated
	 */
	EReference getExpressions_container_ExpressionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Expressions.Expressions_container#getConstantNode <em>Constant Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant Node</em>'.
	 * @see CWM.Expressions.Expressions_container#getConstantNode()
	 * @see #getExpressions_container()
	 * @generated
	 */
	EReference getExpressions_container_ConstantNode();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Expressions.Expressions_container#getElementNode <em>Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Node</em>'.
	 * @see CWM.Expressions.Expressions_container#getElementNode()
	 * @see #getExpressions_container()
	 * @generated
	 */
	EReference getExpressions_container_ElementNode();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Expressions.Expressions_container#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Node</em>'.
	 * @see CWM.Expressions.Expressions_container#getFeatureNode()
	 * @see #getExpressions_container()
	 * @generated
	 */
	EReference getExpressions_container_FeatureNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.Expressions.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Expressions.impl.ExpressionNodeImpl
		 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getExpressionNode()
		 * @generated
		 */
		EClass EXPRESSION_NODE = eINSTANCE.getExpressionNode();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NODE__EXPRESSION = eINSTANCE.getExpressionNode_Expression();

		/**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NODE__FEATURE_NODE = eINSTANCE.getExpressionNode_FeatureNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NODE__TYPE = eINSTANCE.getExpressionNode_Type();

		/**
		 * The meta object literal for the '{@link CWM.Expressions.impl.ConstantNodeImpl <em>Constant Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Expressions.impl.ConstantNodeImpl
		 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getConstantNode()
		 * @generated
		 */
		EClass CONSTANT_NODE = eINSTANCE.getConstantNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_NODE__VALUE = eINSTANCE.getConstantNode_Value();

		/**
		 * The meta object literal for the '{@link CWM.Expressions.impl.ElementNodeImpl <em>Element Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Expressions.impl.ElementNodeImpl
		 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getElementNode()
		 * @generated
		 */
		EClass ELEMENT_NODE = eINSTANCE.getElementNode();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_NODE__MODEL_ELEMENT = eINSTANCE.getElementNode_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.Expressions.impl.FeatureNodeImpl <em>Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Expressions.impl.FeatureNodeImpl
		 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getFeatureNode()
		 * @generated
		 */
		EClass FEATURE_NODE = eINSTANCE.getFeatureNode();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_NODE__ARGUMENT = eINSTANCE.getFeatureNode_Argument();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_NODE__FEATURE = eINSTANCE.getFeatureNode_Feature();

		/**
		 * The meta object literal for the '{@link CWM.Expressions.impl.Expressions_containerImpl <em>Expressions container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Expressions.impl.Expressions_containerImpl
		 * @see CWM.Expressions.impl.ExpressionsPackageImpl#getExpressions_container()
		 * @generated
		 */
		EClass EXPRESSIONS_CONTAINER = eINSTANCE.getExpressions_container();

		/**
		 * The meta object literal for the '<em><b>Expression Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_CONTAINER__EXPRESSION_NODE = eINSTANCE.getExpressions_container_ExpressionNode();

		/**
		 * The meta object literal for the '<em><b>Constant Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_CONTAINER__CONSTANT_NODE = eINSTANCE.getExpressions_container_ConstantNode();

		/**
		 * The meta object literal for the '<em><b>Element Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_CONTAINER__ELEMENT_NODE = eINSTANCE.getExpressions_container_ElementNode();

		/**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_CONTAINER__FEATURE_NODE = eINSTANCE.getExpressions_container_FeatureNode();

	}

} //ExpressionsPackage
