# com.finbourne.sdk.services.scheduler.model.ScheduleDefinition
classname ScheduleDefinition
Schedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleIdentifier** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** | A display name for this Schedule | [optional] [default to String]
**description** | **String** | A description of the Schedule | [optional] [default to String]
**author** | **String** | Name of the author of this schedule | [optional] [default to String]
**owner** | **String** | Name of owner of this schedule | [optional] [default to String]
**useAsAuth** | **String** | User to runs schedule when automatically run and authenticates  requests in the schedule | [optional] [default to String]
**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job | [optional] [default to Map<String, String>]
**trigger** | [**Trigger**](Trigger.md) |  | [optional] [default to Trigger]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule | [optional] [default to List<Notification>]
**enabled** | **Boolean** | The status of this schedule | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.scheduler.model.ScheduleDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId scheduleIdentifier = new ResourceId();
ResourceId jobId = new ResourceId();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String author = "example author";
@javax.annotation.Nullable String owner = "example owner";
@javax.annotation.Nullable String useAsAuth = "example useAsAuth";
@javax.annotation.Nullable Map<String, String> arguments = new Map<String, String>();
Trigger trigger = new Trigger();
@javax.annotation.Nullable List<Notification> notifications = new List<Notification>();
Boolean enabled = true;


ScheduleDefinition scheduleDefinitionInstance = new ScheduleDefinition()
    .scheduleIdentifier(scheduleIdentifier)
    .jobId(jobId)
    .name(name)
    .description(description)
    .author(author)
    .owner(owner)
    .useAsAuth(useAsAuth)
    .arguments(arguments)
    .trigger(trigger)
    .notifications(notifications)
    .enabled(enabled);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)