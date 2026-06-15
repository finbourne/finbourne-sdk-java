# com.finbourne.sdk.services.scheduler.model.CreateScheduleRequest
classname CreateScheduleRequest
Create a schedule definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | A display name for this Schedule | [default to String]
**description** | **String** | A description of the Schedule | [default to String]
**author** | **String** | Name of the author of this schedule | [optional] [default to String]
**owner** | **String** | Name of owner of this schedule | [optional] [default to String]
**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job | [optional] [default to Map<String, String>]
**trigger** | [**Trigger**](Trigger.md) |  | [optional] [default to Trigger]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule | [optional] [default to List<Notification>]
**enabled** | **Boolean** | Specify whether schedule is enabled or not Defaults to true | [optional] [default to Boolean]
**useAsAuth** | **String** | ID of user associated with schedule. All calls to FINBOURNE services as part of processing this schedule (such as calls to Config Service) will be authenticated as this  user. Can be null, in which case we&#39;ll default to that of the user  making this request. Given the image is a trusted image, we will also supply an FBN_PAT to the environment variables of the image which will hold the System PAT of this UseAsAuth user | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.CreateScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId scheduleId = new ResourceId();
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


CreateScheduleRequest createScheduleRequestInstance = new CreateScheduleRequest()
    .scheduleId(scheduleId)
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