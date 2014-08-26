/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Package#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace {
	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.ModelElement#getImporter <em>Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference list.
	 * @see CWM.Core.CorePackage#getPackage_ImportedElement()
	 * @see CWM.Core.ModelElement#getImporter
	 * @model opposite="importer" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getImportedElement();

} // Package
