/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningResult;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Result container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningResult.MiningResult_container#getMiningResult <em>Mining Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningResult.MiningResultPackage#getMiningResult_container()
 * @model
 * @generated
 */
public interface MiningResult_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Result</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningResult.MiningResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Result</em>' containment reference list.
	 * @see CWM.MiningCore.MiningResult.MiningResultPackage#getMiningResult_container_MiningResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningResult> getMiningResult();

} // MiningResult_container
