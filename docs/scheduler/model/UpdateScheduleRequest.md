# com.finbourne.sdk.services.scheduler.model.UpdateScheduleRequest
classname UpdateScheduleRequest
Create a schedule definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The updated name of the schedule | [default to String]
**description** | **String** | The updated description of the schedule | [default to String]
**author** | **String** | The updated author of the schedule | [optional] [default to String]
**owner** | **String** | The update owner of the schedule | [optional] [default to String]
**arguments** | **Map&lt;String, String&gt;** | Updated arguments to be passed to the job Note: The new arguments will completely replace old arguments | [optional] [default to Map<String, String>]
**trigger** | [**Trigger**](Trigger.md) |  | [optional] [default to Trigger]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Updated notifications for this schedule | [optional] [default to List<Notification>]
**enabled** | **Boolean** | Specify whether schedule is enabled or not Defaults to true | [optional] [default to Boolean]
**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services as part of execution of this schedule will be authenticated as this  user. Can be null, in which case we&#39;ll default to that of the user  making this request | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.UpdateScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId jobId = new ResourceId();
String name = "example name";
String description = "example description";
@javax.annotation.Nullable String author = "example author";
@javax.annotation.Nullable String owner = "example owner";
@javax.annotation.Nullable Map<String, String> arguments = new Map<String, String>();
Trigger trigger = new Trigger();
@javax.annotation.Nullable List<Notification> notifications = new List<Notification>();
Boolean enabled = true;
@javax.annotation.Nullable String useAsAuth = "example useAsAuth";


UpdateScheduleRequest updateScheduleRequestInstance = new UpdateScheduleRequest()
    .jobId(jobId)
    .name(name)
    .description(description)
    .author(author)
    .owner(owner)
    .arguments(arguments)
    .trigger(trigger)
    .notifications(notifications)
    .enabled(enabled)
    .useAsAuth(useAsAuth);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)