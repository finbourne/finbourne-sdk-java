# com.finbourne.sdk.services.horizon.model.AuditUpdateRequest
classname AuditUpdateRequest
An incoming request for a Horizon Update Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID identifiying the source of the event | [default to String]
**userId** | **String** | A unique ID identifiying who owns the schedule | [default to String]
**schedulerRunId** | **String** | The GUID of the schedule run | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run was started in UTC | [default to OffsetDateTime]
**message** | **String** | A descriptive message to accompany the status | [default to String]
**processNameOverride** | **String** | Optional Name for how the process appears in Data Feed Monitoring | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.AuditUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String userId = "example userId";
String schedulerRunId = "example schedulerRunId";
OffsetDateTime startTime = OffsetDateTime.now();
String message = "example message";
@javax.annotation.Nullable String processNameOverride = "example processNameOverride";


AuditUpdateRequest auditUpdateRequestInstance = new AuditUpdateRequest()
    .id(id)
    .userId(userId)
    .schedulerRunId(schedulerRunId)
    .startTime(startTime)
    .message(message)
    .processNameOverride(processNameOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)