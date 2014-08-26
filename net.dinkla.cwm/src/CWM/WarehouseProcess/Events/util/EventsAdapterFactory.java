/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events.util;

import CWM.Behavioral.Event;

import CWM.Core.Element;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;

import CWM.WarehouseProcess.Events.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.WarehouseProcess.Events.EventsPackage
 * @generated
 */
public class EventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsSwitch<Adapter> modelSwitch =
		new EventsSwitch<Adapter>() {
			@Override
			public Adapter caseWarehouseEvent(WarehouseEvent object) {
				return createWarehouseEventAdapter();
			}
			@Override
			public Adapter caseScheduleEvent(ScheduleEvent object) {
				return createScheduleEventAdapter();
			}
			@Override
			public Adapter casePointInTimeEvent(PointInTimeEvent object) {
				return createPointInTimeEventAdapter();
			}
			@Override
			public Adapter caseCustomCalendarEvent(CustomCalendarEvent object) {
				return createCustomCalendarEventAdapter();
			}
			@Override
			public Adapter caseCustomCalendar(CustomCalendar object) {
				return createCustomCalendarAdapter();
			}
			@Override
			public Adapter caseCalendarDate(CalendarDate object) {
				return createCalendarDateAdapter();
			}
			@Override
			public Adapter caseIntervalEvent(IntervalEvent object) {
				return createIntervalEventAdapter();
			}
			@Override
			public Adapter caseExternalEvent(ExternalEvent object) {
				return createExternalEventAdapter();
			}
			@Override
			public Adapter caseInternalEvent(InternalEvent object) {
				return createInternalEventAdapter();
			}
			@Override
			public Adapter caseCascadeEvent(CascadeEvent object) {
				return createCascadeEventAdapter();
			}
			@Override
			public Adapter caseRetryEvent(RetryEvent object) {
				return createRetryEventAdapter();
			}
			@Override
			public Adapter caseRecurringPointInTimeEvent(RecurringPointInTimeEvent object) {
				return createRecurringPointInTimeEventAdapter();
			}
			@Override
			public Adapter caseEvents_container(Events_container object) {
				return createEvents_containerAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter casePackage(CWM.Core.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.WarehouseEvent <em>Warehouse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.WarehouseEvent
	 * @generated
	 */
	public Adapter createWarehouseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.ScheduleEvent <em>Schedule Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.ScheduleEvent
	 * @generated
	 */
	public Adapter createScheduleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.PointInTimeEvent <em>Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.PointInTimeEvent
	 * @generated
	 */
	public Adapter createPointInTimeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.CustomCalendarEvent <em>Custom Calendar Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.CustomCalendarEvent
	 * @generated
	 */
	public Adapter createCustomCalendarEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.CustomCalendar <em>Custom Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.CustomCalendar
	 * @generated
	 */
	public Adapter createCustomCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.CalendarDate <em>Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.CalendarDate
	 * @generated
	 */
	public Adapter createCalendarDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.IntervalEvent <em>Interval Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.IntervalEvent
	 * @generated
	 */
	public Adapter createIntervalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.ExternalEvent
	 * @generated
	 */
	public Adapter createExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.InternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.InternalEvent
	 * @generated
	 */
	public Adapter createInternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.CascadeEvent <em>Cascade Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.CascadeEvent
	 * @generated
	 */
	public Adapter createCascadeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.RetryEvent <em>Retry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.RetryEvent
	 * @generated
	 */
	public Adapter createRetryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent <em>Recurring Point In Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.RecurringPointInTimeEvent
	 * @generated
	 */
	public Adapter createRecurringPointInTimeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.WarehouseProcess.Events.Events_container <em>Events container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.WarehouseProcess.Events.Events_container
	 * @generated
	 */
	public Adapter createEvents_containerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Behavioral.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Behavioral.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EventsAdapterFactory
