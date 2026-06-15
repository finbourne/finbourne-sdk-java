# com.finbourne.sdk.services.workflow.model.UpdateMatchingTasksActivity
classname UpdateMatchingTasksActivity
Update all matching tasks based on filter matches

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of task activity | [default to String]
**filter** | **String** | The filter that matches on existing tasks | [optional] [default to String]
**trigger** | **String** | Trigger to supply to all tasks that have been matched | [default to String]
**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings | [optional] [default to List<EventHandlerMapping>]
**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings | [optional] [default to Map<String, FieldMapping>]
**scheduleDependentTaskFields** | [**Map&lt;String, ScheduledTimeAdjustment&gt;**](ScheduledTimeAdjustment.md) | The Schedule dependent task field mappings. Only relevant if a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern is specified | [optional] [default to Map<String, ScheduledTimeAdjustment>]

```java
import com.finbourne.sdk.services.workflow.model.UpdateMatchingTasksActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String filter = "example filter";
String trigger = "example trigger";
@javax.annotation.Nullable List<EventHandlerMapping> correlationIds = new List<EventHandlerMapping>();
@javax.annotation.Nullable Map<String, FieldMapping> taskFields = new Map<String, FieldMapping>();
@javax.annotation.Nullable Map<String, ScheduledTimeAdjustment> scheduleDependentTaskFields = new Map<String, ScheduledTimeAdjustment>();


UpdateMatchingTasksActivity updateMatchingTasksActivityInstance = new UpdateMatchingTasksActivity()
    .type(type)
    .filter(filter)
    .trigger(trigger)
    .correlationIds(correlationIds)
    .taskFields(taskFields)
    .scheduleDependentTaskFields(scheduleDependentTaskFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)