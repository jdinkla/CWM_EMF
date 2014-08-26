/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Based Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.ValueBasedHierarchy#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getValueBasedHierarchy()
 * @model
 * @generated
 */
public interface ValueBasedHierarchy extends Hierarchy {
	/**
	 * Returns the value of the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.DimensionDeployment}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getValueBasedHierarchy <em>Value Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getValueBasedHierarchy_DimensionDeployment()
	 * @see CWM.Olap.DimensionDeployment#getValueBasedHierarchy
	 * @model opposite="valueBasedHierarchy" containment="true"
	 * @generated
	 */
	EList<DimensionDeployment> getDimensionDeployment();

} // ValueBasedHierarchy
