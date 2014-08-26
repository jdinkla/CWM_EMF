/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.Behavioral.BehavioralPackage;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.WarehouseProcess.Events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = CWM.WarehouseProcess.Events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.WarehouseEventImpl <em>Warehouse Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.WarehouseEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getWarehouseEvent()
	 * @generated
	 */
	int WAREHOUSE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__NAME = BehavioralPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__VISIBILITY = BehavioralPackage.EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__CLIENT_DEPENDENCY = BehavioralPackage.EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__CONSTRAINT = BehavioralPackage.EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__IMPORTER = BehavioralPackage.EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__NAMESPACE = BehavioralPackage.EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__TAGGED_VALUE = BehavioralPackage.EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__PARAMETER = BehavioralPackage.EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT__WAREHOUSE_PROCESS = BehavioralPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Warehouse Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_EVENT_FEATURE_COUNT = BehavioralPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.ScheduleEventImpl <em>Schedule Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.ScheduleEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getScheduleEvent()
	 * @generated
	 */
	int SCHEDULE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__NAME = WAREHOUSE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__VISIBILITY = WAREHOUSE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__CLIENT_DEPENDENCY = WAREHOUSE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__CONSTRAINT = WAREHOUSE_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__IMPORTER = WAREHOUSE_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__NAMESPACE = WAREHOUSE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__TAGGED_VALUE = WAREHOUSE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__PARAMETER = WAREHOUSE_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__WAREHOUSE_PROCESS = WAREHOUSE_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The number of structural features of the '<em>Schedule Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT_FEATURE_COUNT = WAREHOUSE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.PointInTimeEventImpl <em>Point In Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.PointInTimeEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getPointInTimeEvent()
	 * @generated
	 */
	int POINT_IN_TIME_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__NAME = SCHEDULE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__VISIBILITY = SCHEDULE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__CLIENT_DEPENDENCY = SCHEDULE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__CONSTRAINT = SCHEDULE_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__IMPORTER = SCHEDULE_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__NAMESPACE = SCHEDULE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__TAGGED_VALUE = SCHEDULE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__PARAMETER = SCHEDULE_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT__WAREHOUSE_PROCESS = SCHEDULE_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The number of structural features of the '<em>Point In Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_EVENT_FEATURE_COUNT = SCHEDULE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.CustomCalendarEventImpl <em>Custom Calendar Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.CustomCalendarEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCustomCalendarEvent()
	 * @generated
	 */
	int CUSTOM_CALENDAR_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__NAME = POINT_IN_TIME_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__VISIBILITY = POINT_IN_TIME_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__CLIENT_DEPENDENCY = POINT_IN_TIME_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__CONSTRAINT = POINT_IN_TIME_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__IMPORTER = POINT_IN_TIME_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__NAMESPACE = POINT_IN_TIME_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__TAGGED_VALUE = POINT_IN_TIME_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__PARAMETER = POINT_IN_TIME_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__WAREHOUSE_PROCESS = POINT_IN_TIME_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Custom Calendar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT__CUSTOM_CALENDAR = POINT_IN_TIME_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Calendar Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_EVENT_FEATURE_COUNT = POINT_IN_TIME_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.CustomCalendarImpl <em>Custom Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.CustomCalendarImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCustomCalendar()
	 * @generated
	 */
	int CUSTOM_CALENDAR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Custom Calendar Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR__CUSTOM_CALENDAR_EVENT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CALENDAR_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.CalendarDateImpl <em>Calendar Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.CalendarDateImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCalendarDate()
	 * @generated
	 */
	int CALENDAR_DATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Specific Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__SPECIFIC_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calendar Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.IntervalEventImpl <em>Interval Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.IntervalEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getIntervalEvent()
	 * @generated
	 */
	int INTERVAL_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__NAME = SCHEDULE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__VISIBILITY = SCHEDULE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__CLIENT_DEPENDENCY = SCHEDULE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__CONSTRAINT = SCHEDULE_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__IMPORTER = SCHEDULE_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__NAMESPACE = SCHEDULE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__TAGGED_VALUE = SCHEDULE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__PARAMETER = SCHEDULE_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__WAREHOUSE_PROCESS = SCHEDULE_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT__DURATION = SCHEDULE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interval Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_EVENT_FEATURE_COUNT = SCHEDULE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.ExternalEventImpl <em>External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.ExternalEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getExternalEvent()
	 * @generated
	 */
	int EXTERNAL_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__NAME = WAREHOUSE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__VISIBILITY = WAREHOUSE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__CLIENT_DEPENDENCY = WAREHOUSE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__CONSTRAINT = WAREHOUSE_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__IMPORTER = WAREHOUSE_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__NAMESPACE = WAREHOUSE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__TAGGED_VALUE = WAREHOUSE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__PARAMETER = WAREHOUSE_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__WAREHOUSE_PROCESS = WAREHOUSE_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__DESCRIPTION = WAREHOUSE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_FEATURE_COUNT = WAREHOUSE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.InternalEventImpl <em>Internal Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.InternalEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getInternalEvent()
	 * @generated
	 */
	int INTERNAL_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__NAME = WAREHOUSE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__VISIBILITY = WAREHOUSE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__CLIENT_DEPENDENCY = WAREHOUSE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__CONSTRAINT = WAREHOUSE_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__IMPORTER = WAREHOUSE_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__NAMESPACE = WAREHOUSE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__TAGGED_VALUE = WAREHOUSE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__PARAMETER = WAREHOUSE_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__WAREHOUSE_PROCESS = WAREHOUSE_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__CONDITION = WAREHOUSE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggering WP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT__TRIGGERING_WP = WAREHOUSE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EVENT_FEATURE_COUNT = WAREHOUSE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.CascadeEventImpl <em>Cascade Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.CascadeEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCascadeEvent()
	 * @generated
	 */
	int CASCADE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__NAME = INTERNAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__VISIBILITY = INTERNAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__CLIENT_DEPENDENCY = INTERNAL_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__CONSTRAINT = INTERNAL_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__IMPORTER = INTERNAL_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__NAMESPACE = INTERNAL_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__TAGGED_VALUE = INTERNAL_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__PARAMETER = INTERNAL_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__WAREHOUSE_PROCESS = INTERNAL_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__CONDITION = INTERNAL_EVENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Triggering WP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__TRIGGERING_WP = INTERNAL_EVENT__TRIGGERING_WP;

	/**
	 * The feature id for the '<em><b>Wait Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT__WAIT_RULE = INTERNAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cascade Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_EVENT_FEATURE_COUNT = INTERNAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.RetryEventImpl <em>Retry Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.RetryEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getRetryEvent()
	 * @generated
	 */
	int RETRY_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__NAME = INTERNAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__VISIBILITY = INTERNAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__CLIENT_DEPENDENCY = INTERNAL_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__CONSTRAINT = INTERNAL_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__IMPORTER = INTERNAL_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__NAMESPACE = INTERNAL_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__TAGGED_VALUE = INTERNAL_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__PARAMETER = INTERNAL_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__WAREHOUSE_PROCESS = INTERNAL_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__CONDITION = INTERNAL_EVENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Triggering WP</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__TRIGGERING_WP = INTERNAL_EVENT__TRIGGERING_WP;

	/**
	 * The feature id for the '<em><b>Wait Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__WAIT_DURATION = INTERNAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT__MAX_COUNT = INTERNAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Retry Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_EVENT_FEATURE_COUNT = INTERNAL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl <em>Recurring Point In Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getRecurringPointInTimeEvent()
	 * @generated
	 */
	int RECURRING_POINT_IN_TIME_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__NAME = POINT_IN_TIME_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__VISIBILITY = POINT_IN_TIME_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__CLIENT_DEPENDENCY = POINT_IN_TIME_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__CONSTRAINT = POINT_IN_TIME_EVENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__IMPORTER = POINT_IN_TIME_EVENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__NAMESPACE = POINT_IN_TIME_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__TAGGED_VALUE = POINT_IN_TIME_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__PARAMETER = POINT_IN_TIME_EVENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__WAREHOUSE_PROCESS = POINT_IN_TIME_EVENT__WAREHOUSE_PROCESS;

	/**
	 * The feature id for the '<em><b>Recurring Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE = POINT_IN_TIME_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR = POINT_IN_TIME_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__MONTH = POINT_IN_TIME_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Day Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH = POINT_IN_TIME_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK = POINT_IN_TIME_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__HOUR = POINT_IN_TIME_EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__MINUTE = POINT_IN_TIME_EVENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT__SECOND = POINT_IN_TIME_EVENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Recurring Point In Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_POINT_IN_TIME_EVENT_FEATURE_COUNT = POINT_IN_TIME_EVENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl <em>Events container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.Events.impl.Events_containerImpl
	 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getEvents_container()
	 * @generated
	 */
	int EVENTS_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__WAREHOUSE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Schedule Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__SCHEDULE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Point In Time Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__POINT_IN_TIME_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Custom Calendar Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Custom Calendar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__CUSTOM_CALENDAR = 4;

	/**
	 * The feature id for the '<em><b>Calendar Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__CALENDAR_DATE = 5;

	/**
	 * The feature id for the '<em><b>Interval Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__INTERVAL_EVENT = 6;

	/**
	 * The feature id for the '<em><b>External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__EXTERNAL_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Internal Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__INTERNAL_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Cascade Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__CASCADE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Retry Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__RETRY_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Recurring Point In Time Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT = 11;

	/**
	 * The number of structural features of the '<em>Events container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_CONTAINER_FEATURE_COUNT = 12;


	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.WarehouseEvent <em>Warehouse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Event</em>'.
	 * @see CWM.WarehouseProcess.Events.WarehouseEvent
	 * @generated
	 */
	EClass getWarehouseEvent();

	/**
	 * Returns the meta object for the container reference '{@link CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess <em>Warehouse Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Warehouse Process</em>'.
	 * @see CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess()
	 * @see #getWarehouseEvent()
	 * @generated
	 */
	EReference getWarehouseEvent_WarehouseProcess();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.ScheduleEvent <em>Schedule Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Event</em>'.
	 * @see CWM.WarehouseProcess.Events.ScheduleEvent
	 * @generated
	 */
	EClass getScheduleEvent();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.PointInTimeEvent <em>Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point In Time Event</em>'.
	 * @see CWM.WarehouseProcess.Events.PointInTimeEvent
	 * @generated
	 */
	EClass getPointInTimeEvent();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.CustomCalendarEvent <em>Custom Calendar Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Calendar Event</em>'.
	 * @see CWM.WarehouseProcess.Events.CustomCalendarEvent
	 * @generated
	 */
	EClass getCustomCalendarEvent();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar <em>Custom Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Calendar</em>'.
	 * @see CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar()
	 * @see #getCustomCalendarEvent()
	 * @generated
	 */
	EReference getCustomCalendarEvent_CustomCalendar();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.CustomCalendar <em>Custom Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Calendar</em>'.
	 * @see CWM.WarehouseProcess.Events.CustomCalendar
	 * @generated
	 */
	EClass getCustomCalendar();

	/**
	 * Returns the meta object for the reference list '{@link CWM.WarehouseProcess.Events.CustomCalendar#getCustomCalendarEvent <em>Custom Calendar Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Custom Calendar Event</em>'.
	 * @see CWM.WarehouseProcess.Events.CustomCalendar#getCustomCalendarEvent()
	 * @see #getCustomCalendar()
	 * @generated
	 */
	EReference getCustomCalendar_CustomCalendarEvent();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.CalendarDate <em>Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Date</em>'.
	 * @see CWM.WarehouseProcess.Events.CalendarDate
	 * @generated
	 */
	EClass getCalendarDate();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.CalendarDate#getSpecificDate <em>Specific Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Date</em>'.
	 * @see CWM.WarehouseProcess.Events.CalendarDate#getSpecificDate()
	 * @see #getCalendarDate()
	 * @generated
	 */
	EAttribute getCalendarDate_SpecificDate();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.IntervalEvent <em>Interval Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Event</em>'.
	 * @see CWM.WarehouseProcess.Events.IntervalEvent
	 * @generated
	 */
	EClass getIntervalEvent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.IntervalEvent#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CWM.WarehouseProcess.Events.IntervalEvent#getDuration()
	 * @see #getIntervalEvent()
	 * @generated
	 */
	EAttribute getIntervalEvent_Duration();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Event</em>'.
	 * @see CWM.WarehouseProcess.Events.ExternalEvent
	 * @generated
	 */
	EClass getExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.ExternalEvent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CWM.WarehouseProcess.Events.ExternalEvent#getDescription()
	 * @see #getExternalEvent()
	 * @generated
	 */
	EAttribute getExternalEvent_Description();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.InternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Event</em>'.
	 * @see CWM.WarehouseProcess.Events.InternalEvent
	 * @generated
	 */
	EClass getInternalEvent();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.WarehouseProcess.Events.InternalEvent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see CWM.WarehouseProcess.Events.InternalEvent#getCondition()
	 * @see #getInternalEvent()
	 * @generated
	 */
	EReference getInternalEvent_Condition();

	/**
	 * Returns the meta object for the reference list '{@link CWM.WarehouseProcess.Events.InternalEvent#getTriggeringWP <em>Triggering WP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggering WP</em>'.
	 * @see CWM.WarehouseProcess.Events.InternalEvent#getTriggeringWP()
	 * @see #getInternalEvent()
	 * @generated
	 */
	EReference getInternalEvent_TriggeringWP();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.CascadeEvent <em>Cascade Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Event</em>'.
	 * @see CWM.WarehouseProcess.Events.CascadeEvent
	 * @generated
	 */
	EClass getCascadeEvent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.CascadeEvent#getWaitRule <em>Wait Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait Rule</em>'.
	 * @see CWM.WarehouseProcess.Events.CascadeEvent#getWaitRule()
	 * @see #getCascadeEvent()
	 * @generated
	 */
	EAttribute getCascadeEvent_WaitRule();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.RetryEvent <em>Retry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Event</em>'.
	 * @see CWM.WarehouseProcess.Events.RetryEvent
	 * @generated
	 */
	EClass getRetryEvent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RetryEvent#getWaitDuration <em>Wait Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait Duration</em>'.
	 * @see CWM.WarehouseProcess.Events.RetryEvent#getWaitDuration()
	 * @see #getRetryEvent()
	 * @generated
	 */
	EAttribute getRetryEvent_WaitDuration();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RetryEvent#getMaxCount <em>Max Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Count</em>'.
	 * @see CWM.WarehouseProcess.Events.RetryEvent#getMaxCount()
	 * @see #getRetryEvent()
	 * @generated
	 */
	EAttribute getRetryEvent_MaxCount();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent <em>Recurring Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurring Point In Time Event</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent
	 * @generated
	 */
	EClass getRecurringPointInTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getRecurringType <em>Recurring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurring Type</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getRecurringType()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_RecurringType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getFrequencyFactor <em>Frequency Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Factor</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getFrequencyFactor()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_FrequencyFactor();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMonth()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_Month();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfMonth <em>Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Month</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfMonth()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_DayOfMonth();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfWeek()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_DayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getHour()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_Hour();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMinute()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_Minute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getSecond()
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 */
	EAttribute getRecurringPointInTimeEvent_Second();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.Events.Events_container <em>Events container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Events container</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container
	 * @generated
	 */
	EClass getEvents_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getWarehouseEvent <em>Warehouse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getWarehouseEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_WarehouseEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getScheduleEvent <em>Schedule Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedule Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getScheduleEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_ScheduleEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getPointInTimeEvent <em>Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point In Time Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getPointInTimeEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_PointInTimeEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getCustomCalendarEvent <em>Custom Calendar Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Calendar Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getCustomCalendarEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_CustomCalendarEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getCustomCalendar <em>Custom Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Calendar</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getCustomCalendar()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_CustomCalendar();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getCalendarDate <em>Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendar Date</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getCalendarDate()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_CalendarDate();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getIntervalEvent <em>Interval Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interval Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getIntervalEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_IntervalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getExternalEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_ExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getInternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getInternalEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_InternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getCascadeEvent <em>Cascade Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cascade Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getCascadeEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_CascadeEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getRetryEvent <em>Retry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getRetryEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_RetryEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.Events.Events_container#getRecurringPointInTimeEvent <em>Recurring Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recurring Point In Time Event</em>'.
	 * @see CWM.WarehouseProcess.Events.Events_container#getRecurringPointInTimeEvent()
	 * @see #getEvents_container()
	 * @generated
	 */
	EReference getEvents_container_RecurringPointInTimeEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.WarehouseEventImpl <em>Warehouse Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.WarehouseEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getWarehouseEvent()
		 * @generated
		 */
		EClass WAREHOUSE_EVENT = eINSTANCE.getWarehouseEvent();

		/**
		 * The meta object literal for the '<em><b>Warehouse Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_EVENT__WAREHOUSE_PROCESS = eINSTANCE.getWarehouseEvent_WarehouseProcess();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.ScheduleEventImpl <em>Schedule Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.ScheduleEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getScheduleEvent()
		 * @generated
		 */
		EClass SCHEDULE_EVENT = eINSTANCE.getScheduleEvent();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.PointInTimeEventImpl <em>Point In Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.PointInTimeEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getPointInTimeEvent()
		 * @generated
		 */
		EClass POINT_IN_TIME_EVENT = eINSTANCE.getPointInTimeEvent();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.CustomCalendarEventImpl <em>Custom Calendar Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.CustomCalendarEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCustomCalendarEvent()
		 * @generated
		 */
		EClass CUSTOM_CALENDAR_EVENT = eINSTANCE.getCustomCalendarEvent();

		/**
		 * The meta object literal for the '<em><b>Custom Calendar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_CALENDAR_EVENT__CUSTOM_CALENDAR = eINSTANCE.getCustomCalendarEvent_CustomCalendar();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.CustomCalendarImpl <em>Custom Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.CustomCalendarImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCustomCalendar()
		 * @generated
		 */
		EClass CUSTOM_CALENDAR = eINSTANCE.getCustomCalendar();

		/**
		 * The meta object literal for the '<em><b>Custom Calendar Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_CALENDAR__CUSTOM_CALENDAR_EVENT = eINSTANCE.getCustomCalendar_CustomCalendarEvent();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.CalendarDateImpl <em>Calendar Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.CalendarDateImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCalendarDate()
		 * @generated
		 */
		EClass CALENDAR_DATE = eINSTANCE.getCalendarDate();

		/**
		 * The meta object literal for the '<em><b>Specific Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_DATE__SPECIFIC_DATE = eINSTANCE.getCalendarDate_SpecificDate();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.IntervalEventImpl <em>Interval Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.IntervalEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getIntervalEvent()
		 * @generated
		 */
		EClass INTERVAL_EVENT = eINSTANCE.getIntervalEvent();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_EVENT__DURATION = eINSTANCE.getIntervalEvent_Duration();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.ExternalEventImpl <em>External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.ExternalEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getExternalEvent()
		 * @generated
		 */
		EClass EXTERNAL_EVENT = eINSTANCE.getExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_EVENT__DESCRIPTION = eINSTANCE.getExternalEvent_Description();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.InternalEventImpl <em>Internal Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.InternalEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getInternalEvent()
		 * @generated
		 */
		EClass INTERNAL_EVENT = eINSTANCE.getInternalEvent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_EVENT__CONDITION = eINSTANCE.getInternalEvent_Condition();

		/**
		 * The meta object literal for the '<em><b>Triggering WP</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_EVENT__TRIGGERING_WP = eINSTANCE.getInternalEvent_TriggeringWP();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.CascadeEventImpl <em>Cascade Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.CascadeEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getCascadeEvent()
		 * @generated
		 */
		EClass CASCADE_EVENT = eINSTANCE.getCascadeEvent();

		/**
		 * The meta object literal for the '<em><b>Wait Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_EVENT__WAIT_RULE = eINSTANCE.getCascadeEvent_WaitRule();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.RetryEventImpl <em>Retry Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.RetryEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getRetryEvent()
		 * @generated
		 */
		EClass RETRY_EVENT = eINSTANCE.getRetryEvent();

		/**
		 * The meta object literal for the '<em><b>Wait Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_EVENT__WAIT_DURATION = eINSTANCE.getRetryEvent_WaitDuration();

		/**
		 * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_EVENT__MAX_COUNT = eINSTANCE.getRetryEvent_MaxCount();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl <em>Recurring Point In Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getRecurringPointInTimeEvent()
		 * @generated
		 */
		EClass RECURRING_POINT_IN_TIME_EVENT = eINSTANCE.getRecurringPointInTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Recurring Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE = eINSTANCE.getRecurringPointInTimeEvent_RecurringType();

		/**
		 * The meta object literal for the '<em><b>Frequency Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR = eINSTANCE.getRecurringPointInTimeEvent_FrequencyFactor();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__MONTH = eINSTANCE.getRecurringPointInTimeEvent_Month();

		/**
		 * The meta object literal for the '<em><b>Day Of Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH = eINSTANCE.getRecurringPointInTimeEvent_DayOfMonth();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK = eINSTANCE.getRecurringPointInTimeEvent_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__HOUR = eINSTANCE.getRecurringPointInTimeEvent_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__MINUTE = eINSTANCE.getRecurringPointInTimeEvent_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_POINT_IN_TIME_EVENT__SECOND = eINSTANCE.getRecurringPointInTimeEvent_Second();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl <em>Events container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.Events.impl.Events_containerImpl
		 * @see CWM.WarehouseProcess.Events.impl.EventsPackageImpl#getEvents_container()
		 * @generated
		 */
		EClass EVENTS_CONTAINER = eINSTANCE.getEvents_container();

		/**
		 * The meta object literal for the '<em><b>Warehouse Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__WAREHOUSE_EVENT = eINSTANCE.getEvents_container_WarehouseEvent();

		/**
		 * The meta object literal for the '<em><b>Schedule Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__SCHEDULE_EVENT = eINSTANCE.getEvents_container_ScheduleEvent();

		/**
		 * The meta object literal for the '<em><b>Point In Time Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__POINT_IN_TIME_EVENT = eINSTANCE.getEvents_container_PointInTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Custom Calendar Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT = eINSTANCE.getEvents_container_CustomCalendarEvent();

		/**
		 * The meta object literal for the '<em><b>Custom Calendar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__CUSTOM_CALENDAR = eINSTANCE.getEvents_container_CustomCalendar();

		/**
		 * The meta object literal for the '<em><b>Calendar Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__CALENDAR_DATE = eINSTANCE.getEvents_container_CalendarDate();

		/**
		 * The meta object literal for the '<em><b>Interval Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__INTERVAL_EVENT = eINSTANCE.getEvents_container_IntervalEvent();

		/**
		 * The meta object literal for the '<em><b>External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__EXTERNAL_EVENT = eINSTANCE.getEvents_container_ExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Internal Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__INTERNAL_EVENT = eINSTANCE.getEvents_container_InternalEvent();

		/**
		 * The meta object literal for the '<em><b>Cascade Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__CASCADE_EVENT = eINSTANCE.getEvents_container_CascadeEvent();

		/**
		 * The meta object literal for the '<em><b>Retry Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__RETRY_EVENT = eINSTANCE.getEvents_container_RetryEvent();

		/**
		 * The meta object literal for the '<em><b>Recurring Point In Time Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT = eINSTANCE.getEvents_container_RecurringPointInTimeEvent();

	}

} //EventsPackage
