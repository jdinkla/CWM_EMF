/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.impl;

import CWM.CwmXml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CwmXmlFactoryImpl extends EFactoryImpl implements CwmXmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CwmXmlFactory init() {
		try {
			CwmXmlFactory theCwmXmlFactory = (CwmXmlFactory)EPackage.Registry.INSTANCE.getEFactory("CwmXml"); 
			if (theCwmXmlFactory != null) {
				return theCwmXmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CwmXmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmXmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CwmXmlPackage.SCHEMA: return createSchema();
			case CwmXmlPackage.ELEMENT_TYPE: return createElementType();
			case CwmXmlPackage.ATTRIBUTE: return createAttribute();
			case CwmXmlPackage.CONTENT: return createContent();
			case CwmXmlPackage.ELEMENT_CONTENT: return createElementContent();
			case CwmXmlPackage.MIXED_CONTENT: return createMixedContent();
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE: return createElementTypeReference();
			case CwmXmlPackage.TEXT: return createText();
			case CwmXmlPackage.ELEMENT: return createElement();
			case CwmXmlPackage.DOCUMENT: return createDocument();
			case CwmXmlPackage.XML_CONTAINER: return createXML_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CwmXmlPackage.ATTRIBUTE_DEFAULT:
				return createAttributeDefaultFromString(eDataType, initialValue);
			case CwmXmlPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case CwmXmlPackage.OCCURRENCE_TYPE:
				return createOccurrenceTypeFromString(eDataType, initialValue);
			case CwmXmlPackage.ELEMENT_ORDER_TYPE:
				return createElementOrderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CwmXmlPackage.ATTRIBUTE_DEFAULT:
				return convertAttributeDefaultToString(eDataType, instanceValue);
			case CwmXmlPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case CwmXmlPackage.OCCURRENCE_TYPE:
				return convertOccurrenceTypeToString(eDataType, instanceValue);
			case CwmXmlPackage.ELEMENT_ORDER_TYPE:
				return convertElementOrderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementContent createElementContent() {
		ElementContentImpl elementContent = new ElementContentImpl();
		return elementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedContent createMixedContent() {
		MixedContentImpl mixedContent = new MixedContentImpl();
		return mixedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypeReference createElementTypeReference() {
		ElementTypeReferenceImpl elementTypeReference = new ElementTypeReferenceImpl();
		return elementTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XML_container createXML_container() {
		XML_containerImpl xmL_container = new XML_containerImpl();
		return xmL_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefault createAttributeDefaultFromString(EDataType eDataType, String initialValue) {
		AttributeDefault result = AttributeDefault.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeDefaultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentTypeFromString(EDataType eDataType, String initialValue) {
		ContentType result = ContentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceType createOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		OccurrenceType result = OccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementOrderType createElementOrderTypeFromString(EDataType eDataType, String initialValue) {
		ElementOrderType result = ElementOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmXmlPackage getCwmXmlPackage() {
		return (CwmXmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CwmXmlPackage getPackage() {
		return CwmXmlPackage.eINSTANCE;
	}

} //CwmXmlFactoryImpl
