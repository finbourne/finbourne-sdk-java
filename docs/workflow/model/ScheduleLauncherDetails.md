# com.finbourne.sdk.services.workflow.model.ScheduleLauncherDetails
classname ScheduleLauncherDetails
A Launcher that starts a run of its Workflow at the times a recurrence pattern gives, and can fill date and time fields of the root task from the instant it fired

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** |  | [default to String]
**schedule** | [**LauncherSchedule**](LauncherSchedule.md) |  | [default to LauncherSchedule]
**calendarContexts** | [**List&lt;CalendarContext&gt;**](CalendarContext.md) | The named time zones and holiday calendars this Launcher works in.              Only a Schedule Launcher works in a calendar context | [optional] [default to List<CalendarContext>]
**mapTaskFields** | [**Map&lt;String, ScheduleTaskFieldMapping&gt;**](ScheduleTaskFieldMapping.md) | Fields of the root task filled from the instant the schedule fired, keyed by the field name on the root task definition | [optional] [default to Map<String, ScheduleTaskFieldMapping>]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled. When it is left out the root task is left in its initial state | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ScheduleLauncherDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String launcherType = "example launcherType";
LauncherSchedule schedule = new LauncherSchedule();
@javax.annotation.Nullable List<CalendarContext> calendarContexts = new List<CalendarContext>();
@javax.annotation.Nullable Map<String, ScheduleTaskFieldMapping> mapTaskFields = new Map<String, ScheduleTaskFieldMapping>();
LauncherMapping runAsUserId = new LauncherMapping();
@javax.annotation.Nullable Map<String, Object> setTaskFields = new Map<String, Object>();
@javax.annotation.Nullable List<String> setCorrelationIds = new List<String>();
@javax.annotation.Nullable String initialTrigger = "example initialTrigger";


ScheduleLauncherDetails scheduleLauncherDetailsInstance = new ScheduleLauncherDetails()
    .launcherType(launcherType)
    .schedule(schedule)
    .calendarContexts(calendarContexts)
    .mapTaskFields(mapTaskFields)
    .runAsUserId(runAsUserId)
    .setTaskFields(setTaskFields)
    .setCorrelationIds(setCorrelationIds)
    .initialTrigger(initialTrigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)