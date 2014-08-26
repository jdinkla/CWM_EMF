/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.util;

import CWM.AssociationRules.*;

import CWM.Core.Element;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.AssociationRules.AssociationRulesPackage
 * @generated
 */
public class AssociationRulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssociationRulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssociationRulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationRulesSwitch<Adapter> modelSwitch =
		new AssociationRulesSwitch<Adapter>() {
			@Override
			public Adapter caseAssociationRulesFunctionSettings(AssociationRulesFunctionSettings object) {
				return createAssociationRulesFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseFrequentItemSetFunctionSettings(FrequentItemSetFunctionSettings object) {
				return createFrequentItemSetFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseSequenceFunctionSettings(SequenceFunctionSettings object) {
				return createSequenceFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseAssociationRules_container(AssociationRules_container object) {
				return createAssociationRules_containerAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseMiningFunctionSettings(MiningFunctionSettings object) {
				return createMiningFunctionSettingsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CWM.AssociationRules.AssociationRulesFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.AssociationRules.AssociationRulesFunctionSettings
	 * @generated
	 */
	public Adapter createAssociationRulesFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings <em>Frequent Item Set Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.AssociationRules.FrequentItemSetFunctionSettings
	 * @generated
	 */
	public Adapter createFrequentItemSetFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.AssociationRules.SequenceFunctionSettings <em>Sequence Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.AssociationRules.SequenceFunctionSettings
	 * @generated
	 */
	public Adapter createSequenceFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.AssociationRules.AssociationRules_container <em>Association Rules container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.AssociationRules.AssociationRules_container
	 * @generated
	 */
	public Adapter createAssociationRules_containerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings
	 * @generated
	 */
	public Adapter createMiningFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssociationRulesAdapterFactory
