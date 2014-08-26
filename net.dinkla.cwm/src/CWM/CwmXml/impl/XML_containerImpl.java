/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.impl;

import CWM.CwmXml.Attribute;
import CWM.CwmXml.Content;
import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.Document;
import CWM.CwmXml.Element;
import CWM.CwmXml.ElementContent;
import CWM.CwmXml.ElementType;
import CWM.CwmXml.ElementTypeReference;
import CWM.CwmXml.MixedContent;
import CWM.CwmXml.Schema;
import CWM.CwmXml.Text;
import CWM.CwmXml.XML_container;

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
 * An implementation of the model object '<em><b>XML container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getContent <em>Content</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getElementContent <em>Element Content</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getMixedContent <em>Mixed Content</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getElementTypeReference <em>Element Type Reference</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getText <em>Text</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.XML_containerImpl#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XML_containerImpl extends EObjectImpl implements XML_container {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> elementType;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> content;

	/**
	 * The cached value of the '{@link #getElementContent() <em>Element Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementContent> elementContent;

	/**
	 * The cached value of the '{@link #getMixedContent() <em>Mixed Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixedContent()
	 * @generated
	 * @ordered
	 */
	protected EList<MixedContent> mixedContent;

	/**
	 * The cached value of the '{@link #getElementTypeReference() <em>Element Type Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypeReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementTypeReference> elementTypeReference;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> text;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XML_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmXmlPackage.Literals.XML_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, CwmXmlPackage.XML_CONTAINER__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElementType() {
		if (elementType == null) {
			elementType = new EObjectContainmentEList<ElementType>(ElementType.class, this, CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE);
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CwmXmlPackage.XML_CONTAINER__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, CwmXmlPackage.XML_CONTAINER__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementContent> getElementContent() {
		if (elementContent == null) {
			elementContent = new EObjectContainmentEList<ElementContent>(ElementContent.class, this, CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT);
		}
		return elementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MixedContent> getMixedContent() {
		if (mixedContent == null) {
			mixedContent = new EObjectContainmentEList<MixedContent>(MixedContent.class, this, CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT);
		}
		return mixedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementTypeReference> getElementTypeReference() {
		if (elementTypeReference == null) {
			elementTypeReference = new EObjectContainmentEList<ElementTypeReference>(ElementTypeReference.class, this, CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE);
		}
		return elementTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<Text>(Text.class, this, CwmXmlPackage.XML_CONTAINER__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, CwmXmlPackage.XML_CONTAINER__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<Document>(Document.class, this, CwmXmlPackage.XML_CONTAINER__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
				return ((InternalEList<?>)getElementType()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
				return ((InternalEList<?>)getElementContent()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
				return ((InternalEList<?>)getMixedContent()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
				return ((InternalEList<?>)getElementTypeReference()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
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
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
				return getSchema();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
				return getElementType();
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
				return getAttribute();
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
				return getContent();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
				return getElementContent();
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
				return getMixedContent();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
				return getElementTypeReference();
			case CwmXmlPackage.XML_CONTAINER__TEXT:
				return getText();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
				return getElement();
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
				return getDocument();
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
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
				getElementType().clear();
				getElementType().addAll((Collection<? extends ElementType>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
				getElementContent().clear();
				getElementContent().addAll((Collection<? extends ElementContent>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
				getMixedContent().clear();
				getMixedContent().addAll((Collection<? extends MixedContent>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
				getElementTypeReference().clear();
				getElementTypeReference().addAll((Collection<? extends ElementTypeReference>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends Document>)newValue);
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
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
				getSchema().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
				getElementType().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
				getContent().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
				getElementContent().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
				getMixedContent().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
				getElementTypeReference().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__TEXT:
				getText().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
				getElement().clear();
				return;
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
				getDocument().clear();
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
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
				return schema != null && !schema.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
				return elementType != null && !elementType.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
				return content != null && !content.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
				return elementContent != null && !elementContent.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
				return mixedContent != null && !mixedContent.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
				return elementTypeReference != null && !elementTypeReference.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__TEXT:
				return text != null && !text.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
				return element != null && !element.isEmpty();
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
				return document != null && !document.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XML_containerImpl
