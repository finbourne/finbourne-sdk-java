# com.finbourne.sdk.services.horizon.model.AuditCompleteRequest
classname AuditCompleteRequest
An incoming request for a Horizon Complete Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID identifiying the source of the event | [default to String]
**userId** | **String** | A unique ID identifiying who owns the schedule | [default to String]
**schedulerRunId** | **String** | The GUID of the schedule run | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run was started in UTC | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run finished in UTC | [default to OffsetDateTime]
**message** | **String** | A descriptive message to accompany the status | [default to String]
**status** | **String** | The final status of the run | [default to String]
**rowsTotal** | **Integer** | The number of data rows operated on | [default to Integer]
**rowsSucceeded** | **Integer** | The number of data rows successfully operated on | [default to Integer]
**rowsFailed** | **Integer** | The number of data rows that failed to be operated on | [default to Integer]
**rowsIgnored** | **Integer** | The number of data rows that had no actions taken | [default to Integer]
**auditFiles** | [**List&lt;AuditFileDetails&gt;**](AuditFileDetails.md) | A list of file details for attaching to the event | [default to List<AuditFileDetails>]
**processNameOverride** | **String** | Optional Name for how the process appears in Data Feed Monitoring | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.AuditCompleteRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String userId = "example userId";
String schedulerRunId = "example schedulerRunId";
OffsetDateTime startTime = OffsetDateTime.now();
OffsetDateTime endTime = OffsetDateTime.now();
String message = "example message";
String status = "example status";
Integer rowsTotal = new Integer("100.00");
Integer rowsSucceeded = new Integer("100.00");
Integer rowsFailed = new Integer("100.00");
Integer rowsIgnored = new Integer("100.00");
List<AuditFileDetails> auditFiles = new List<AuditFileDetails>();
@javax.annotation.Nullable String processNameOverride = "example processNameOverride";


AuditCompleteRequest auditCompleteRequestInstance = new AuditCompleteRequest()
    .id(id)
    .userId(userId)
    .schedulerRunId(schedulerRunId)
    .startTime(startTime)
    .endTime(endTime)
    .message(message)
    .status(status)
    .rowsTotal(rowsTotal)
    .rowsSucceeded(rowsSucceeded)
    .rowsFailed(rowsFailed)
    .rowsIgnored(rowsIgnored)
    .auditFiles(auditFiles)
    .processNameOverride(processNameOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)