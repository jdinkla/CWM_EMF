/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Function Settings container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningAlgorithmSettings <em>Mining Algorithm Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_container()
 * @model
 * @generated
 */
public interface MiningFunctionSettings_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Algorithm Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningFunctionSettings.MiningAlgorithmSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Algorithm Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Algorithm Settings</em>' containment reference list.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_container_MiningAlgorithmSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningAlgorithmSettings> getMiningAlgorithmSettings();

	/**
	 * Returns the value of the '<em><b>Mining Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Function Settings</em>' containment reference list.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_container_MiningFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningFunctionSettings> getMiningFunctionSettings();

} // MiningFunctionSettings_container
