# com.finbourne.sdk.services.scheduler.model.StartJobRequest
classname StartJobRequest
Job start definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | **Map&lt;String, String&gt;** | All arguments needed for the Job to run | [optional] [default to Map<String, String>]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Job | [optional] [default to List<Notification>]
**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services as part of execution of this schedule will be authenticated as this user. Can be null, in which case we&#39;ll default to that of the user making this request | [optional] [default to String]
**runId** | **String** | Optional pre-generated RunId (Guid format) for this job run. When provided, this is used as the RunId instead of generating a new one, allowing the caller to pre-generate and track the run before it starts. | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.StartJobRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> arguments = new Map<String, String>();
@javax.annotation.Nullable List<Notification> notifications = new List<Notification>();
@javax.annotation.Nullable String useAsAuth = "example useAsAuth";
@javax.annotation.Nullable String runId = "example runId";


StartJobRequest startJobRequestInstance = new StartJobRequest()
    .arguments(arguments)
    .notifications(notifications)
    .useAsAuth(useAsAuth)
    .runId(runId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)