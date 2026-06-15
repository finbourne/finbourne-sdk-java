# com.finbourne.sdk.services.workflow.model.CreateNewTaskActivityResponse
classname CreateNewTaskActivityResponse
Read only Create new task response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of task activity | [optional] [default to String]
**initialTrigger** | **String** | Trigger to supply to all tasks to be made | [optional] [default to String]
**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings | [optional] [default to List<EventHandlerMapping>]
**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings | [optional] [default to Map<String, FieldMapping>]
**scheduleDependentTaskFields** | [**Map&lt;String, ScheduledTimeAdjustment&gt;**](ScheduledTimeAdjustment.md) | The Schedule dependent task field mappings. Only relevant if a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern is specified | [optional] [default to Map<String, ScheduledTimeAdjustment>]

```java
import com.finbourne.sdk.services.workflow.model.CreateNewTaskActivityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String initialTrigger = "example initialTrigger";
@javax.annotation.Nullable List<EventHandlerMapping> correlationIds = new List<EventHandlerMapping>();
@javax.annotation.Nullable Map<String, FieldMapping> taskFields = new Map<String, FieldMapping>();
@javax.annotation.Nullable Map<String, ScheduledTimeAdjustment> scheduleDependentTaskFields = new Map<String, ScheduledTimeAdjustment>();


CreateNewTaskActivityResponse createNewTaskActivityResponseInstance = new CreateNewTaskActivityResponse()
    .type(type)
    .initialTrigger(initialTrigger)
    .correlationIds(correlationIds)
    .taskFields(taskFields)
    .scheduleDependentTaskFields(scheduleDependentTaskFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)