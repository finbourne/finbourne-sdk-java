# com.finbourne.sdk.services.horizon.model.InstanceRunResponse
classname InstanceRunResponse
Response containing details of a single run for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**batchReferenceId** | [**UUID**](UUID.md) |  | [default to UUID]
**attempt** | **Integer** |  | [optional] [default to Integer]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**duration** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**triggeredBy** | **String** |  | [optional] [default to String]
**total** | **Integer** |  | [default to Integer]
**sentCount** | **Long** |  | [default to Long]
**skippedCount** | **Long** |  | [default to Long]
**failedCount** | **Long** |  | [default to Long]
**failedFiles** | **Integer** |  | [default to Integer]

```java
import com.finbourne.sdk.services.horizon.model.InstanceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID runId = "example runId";
UUID batchReferenceId = "example batchReferenceId";
@javax.annotation.Nullable Integer attempt = new Integer("100.00");
OffsetDateTime startTime = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime endTime = OffsetDateTime.now();
@javax.annotation.Nullable String duration = "example duration";
String status = "example status";
@javax.annotation.Nullable String triggeredBy = "example triggeredBy";
Integer total = new Integer("100.00");
Long sentCount = new Long("100.00");
Long skippedCount = new Long("100.00");
Long failedCount = new Long("100.00");
Integer failedFiles = new Integer("100.00");


InstanceRunResponse instanceRunResponseInstance = new InstanceRunResponse()
    .runId(runId)
    .batchReferenceId(batchReferenceId)
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
    .failedFiles(failedFiles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)