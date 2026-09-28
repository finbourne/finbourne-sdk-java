# com.finbourne.sdk.services.workflow.model.EventLauncherDetails
classname EventLauncherDetails
A Launcher that starts a run of its Workflow when a matching platform event arrives, and can fill fields and correlation IDs of the root task from that event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** |  | [default to String]
**eventMatchingPattern** | [**LauncherEventMatchingPattern**](LauncherEventMatchingPattern.md) |  | [default to LauncherEventMatchingPattern]
**mapTaskFields** | [**Map&lt;String, EventTaskFieldMapping&gt;**](EventTaskFieldMapping.md) | Fields of the root task filled from the event, keyed by the field name on the root task definition | [optional] [default to Map<String, EventTaskFieldMapping>]
**mapCorrelationIds** | [**List&lt;CorrelationIdMapping&gt;**](CorrelationIdMapping.md) | Correlation IDs of the root task filled from the event | [optional] [default to List<CorrelationIdMapping>]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled. When it is left out the root task is left in its initial state | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.EventLauncherDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String launcherType = "example launcherType";
LauncherEventMatchingPattern eventMatchingPattern = new LauncherEventMatchingPattern();
@javax.annotation.Nullable Map<String, EventTaskFieldMapping> mapTaskFields = new Map<String, EventTaskFieldMapping>();
@javax.annotation.Nullable List<CorrelationIdMapping> mapCorrelationIds = new List<CorrelationIdMapping>();
LauncherMapping runAsUserId = new LauncherMapping();
@javax.annotation.Nullable Map<String, Object> setTaskFields = new Map<String, Object>();
@javax.annotation.Nullable List<String> setCorrelationIds = new List<String>();
@javax.annotation.Nullable String initialTrigger = "example initialTrigger";


EventLauncherDetails eventLauncherDetailsInstance = new EventLauncherDetails()
    .launcherType(launcherType)
    .eventMatchingPattern(eventMatchingPattern)
    .mapTaskFields(mapTaskFields)
    .mapCorrelationIds(mapCorrelationIds)
    .runAsUserId(runAsUserId)
    .setTaskFields(setTaskFields)
    .setCorrelationIds(setCorrelationIds)
    .initialTrigger(initialTrigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)