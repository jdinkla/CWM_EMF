/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.BusinessDomain#getTaxonomy <em>Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessDomain()
 * @model
 * @generated
 */
public interface BusinessDomain extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessDomain_Taxonomy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getTaxonomy();

} // BusinessDomain
