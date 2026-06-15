# com.finbourne.sdk.services.workflow.model.EventHandler
classname EventHandler
Information about an Event Handler

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**status** | **String** | The current status of the event handler | [default to String]
**eventMatchingPattern** | [**EventMatchingPattern**](EventMatchingPattern.md) |  | [optional] [default to EventMatchingPattern]
**scheduleMatchingPattern** | [**ScheduleMatchingPattern**](ScheduleMatchingPattern.md) |  | [optional] [default to ScheduleMatchingPattern]
**runAsUserId** | [**EventHandlerMapping**](EventHandlerMapping.md) |  | [default to EventHandlerMapping]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | AsAt of the required task definition | [optional] [default to OffsetDateTime]
**taskActivity** | [**TaskActivityResponse**](TaskActivityResponse.md) |  | [default to TaskActivityResponse]

```java
import com.finbourne.sdk.services.workflow.model.EventHandler;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
VersionInfo version = new VersionInfo();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
EventMatchingPattern eventMatchingPattern = new EventMatchingPattern();
ScheduleMatchingPattern scheduleMatchingPattern = new ScheduleMatchingPattern();
EventHandlerMapping runAsUserId = new EventHandlerMapping();
ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime taskDefinitionAsAt = OffsetDateTime.now();
TaskActivityResponse taskActivity = new TaskActivityResponse();


EventHandler eventHandlerInstance = new EventHandler()
    .id(id)
    .version(version)
    .displayName(displayName)
    .description(description)
    .status(status)
    .eventMatchingPattern(eventMatchingPattern)
    .scheduleMatchingPattern(scheduleMatchingPattern)
    .runAsUserId(runAsUserId)
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionAsAt(taskDefinitionAsAt)
    .taskActivity(taskActivity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)