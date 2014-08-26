/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.provider;

import CWM.MiningCore.MiningTask.util.MiningTaskAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTaskItemProviderAdapterFactory extends MiningTaskAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTaskItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.ApplyOutputItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyOutputItemItemProvider applyOutputItemItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.ApplyOutputItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplyOutputItemAdapter() {
		if (applyOutputItemItemProvider == null) {
			applyOutputItemItemProvider = new ApplyOutputItemItemProvider(this);
		}

		return applyOutputItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.ApplyProbabilityItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyProbabilityItemItemProvider applyProbabilityItemItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.ApplyProbabilityItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplyProbabilityItemAdapter() {
		if (applyProbabilityItemItemProvider == null) {
			applyProbabilityItemItemProvider = new ApplyProbabilityItemItemProvider(this);
		}

		return applyProbabilityItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.ApplyRuleIdItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyRuleIdItemItemProvider applyRuleIdItemItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.ApplyRuleIdItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplyRuleIdItemAdapter() {
		if (applyRuleIdItemItemProvider == null) {
			applyRuleIdItemItemProvider = new ApplyRuleIdItemItemProvider(this);
		}

		return applyRuleIdItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.ApplyScoreItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyScoreItemItemProvider applyScoreItemItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.ApplyScoreItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplyScoreItemAdapter() {
		if (applyScoreItemItemProvider == null) {
			applyScoreItemItemProvider = new ApplyScoreItemItemProvider(this);
		}

		return applyScoreItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.ApplySourceItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplySourceItemItemProvider applySourceItemItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.ApplySourceItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplySourceItemAdapter() {
		if (applySourceItemItemProvider == null) {
			applySourceItemItemProvider = new ApplySourceItemItemProvider(this);
		}

		return applySourceItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.MiningApplyOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningApplyOutputItemProvider miningApplyOutputItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.MiningApplyOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningApplyOutputAdapter() {
		if (miningApplyOutputItemProvider == null) {
			miningApplyOutputItemProvider = new MiningApplyOutputItemProvider(this);
		}

		return miningApplyOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.MiningApplyTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningApplyTaskItemProvider miningApplyTaskItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.MiningApplyTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningApplyTaskAdapter() {
		if (miningApplyTaskItemProvider == null) {
			miningApplyTaskItemProvider = new MiningApplyTaskItemProvider(this);
		}

		return miningApplyTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.MiningBuildTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningBuildTaskItemProvider miningBuildTaskItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.MiningBuildTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningBuildTaskAdapter() {
		if (miningBuildTaskItemProvider == null) {
			miningBuildTaskItemProvider = new MiningBuildTaskItemProvider(this);
		}

		return miningBuildTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.MiningTransformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTransformationItemProvider miningTransformationItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.MiningTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningTransformationAdapter() {
		if (miningTransformationItemProvider == null) {
			miningTransformationItemProvider = new MiningTransformationItemProvider(this);
		}

		return miningTransformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.MiningCore.MiningTask.MiningTask_container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTask_containerItemProvider miningTask_containerItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.MiningCore.MiningTask.MiningTask_container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningTask_containerAdapter() {
		if (miningTask_containerItemProvider == null) {
			miningTask_containerItemProvider = new MiningTask_containerItemProvider(this);
		}

		return miningTask_containerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (applyOutputItemItemProvider != null) applyOutputItemItemProvider.dispose();
		if (applyProbabilityItemItemProvider != null) applyProbabilityItemItemProvider.dispose();
		if (applyRuleIdItemItemProvider != null) applyRuleIdItemItemProvider.dispose();
		if (applyScoreItemItemProvider != null) applyScoreItemItemProvider.dispose();
		if (applySourceItemItemProvider != null) applySourceItemItemProvider.dispose();
		if (miningApplyOutputItemProvider != null) miningApplyOutputItemProvider.dispose();
		if (miningApplyTaskItemProvider != null) miningApplyTaskItemProvider.dispose();
		if (miningBuildTaskItemProvider != null) miningBuildTaskItemProvider.dispose();
		if (miningTransformationItemProvider != null) miningTransformationItemProvider.dispose();
		if (miningTask_containerItemProvider != null) miningTask_containerItemProvider.dispose();
	}

}