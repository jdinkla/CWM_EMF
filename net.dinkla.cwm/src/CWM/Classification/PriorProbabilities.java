/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prior Probabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.PriorProbabilities#getPrior <em>Prior</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getPriorProbabilities()
 * @model
 * @generated
 */
public interface PriorProbabilities extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Prior</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.PriorProbabilitiesEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getPriorProbabilities_Prior()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PriorProbabilitiesEntry> getPrior();

} // PriorProbabilities
