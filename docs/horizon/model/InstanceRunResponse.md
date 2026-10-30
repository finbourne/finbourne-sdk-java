# com.finbourne.sdk.services.horizon.model.InstanceRunResponse
classname InstanceRunResponse
Response containing details of a single run for an instance. The transaction and file figures describe the batch as it stands now, so they are reported on the latest attempt only and are null on earlier attempts of a retried run. Message explains a failed attempt and what will happen or must be done next; it is null for completed, running and queued attempts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**referenceId** | [**UUID**](UUID.md) |  | [default to UUID]
**attempt** | **Integer** |  | [optional] [default to Integer]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**duration** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**triggeredBy** | **String** |  | [optional] [default to String]
**total** | **Integer** |  | [optional] [default to Integer]
**sentCount** | **Long** |  | [optional] [default to Long]
**skippedCount** | **Long** |  | [optional] [default to Long]
**failedCount** | **Long** |  | [optional] [default to Long]
**failedFiles** | **Integer** |  | [optional] [default to Integer]
**message** | **String** |  | [optional] [default to String]
**fileCount** | **Integer** | The number of rows ListRunFiles returns for the run, every delivery attempt included; latest attempt only. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.horizon.model.InstanceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID runId = "example runId";
UUID referenceId = "example referenceId";
@javax.annotation.Nullable Integer attempt = new Integer("100.00");
OffsetDateTime startTime = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endTime = OffsetDateTime.now();
@javax.annotation.Nullable String duration = "example duration";
String status = "example status";
@javax.annotation.Nullable String triggeredBy = "example triggeredBy";
@javax.annotation.Nullable Integer total = new Integer("100.00");
@javax.annotation.Nullable Long sentCount = new Long("100.00");
@javax.annotation.Nullable Long skippedCount = new Long("100.00");
@javax.annotation.Nullable Long failedCount = new Long("100.00");
@javax.annotation.Nullable Integer failedFiles = new Integer("100.00");
@javax.annotation.Nullable String message = "example message";
@javax.annotation.Nullable Integer fileCount = new Integer("100.00");


InstanceRunResponse instanceRunResponseInstance = new InstanceRunResponse()
    .runId(runId)
    .referenceId(referenceId)
    .attempt(attempt)
    .startTime(startTime)
    .endTime(endTime)
    .duration(duration)
    .status(status)
    .triggeredBy(triggeredBy)
    .total(total)
    .sentCount(sentCount)
    .skippedCount(skippedCount)
    .failedCount(failedCount)
    .failedFiles(failedFiles)
    .message(message)
    .fileCount(fileCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)