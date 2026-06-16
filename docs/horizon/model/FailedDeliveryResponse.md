# com.finbourne.sdk.services.horizon.model.FailedDeliveryResponse
classname FailedDeliveryResponse
A batch's failed deliveries returned by the list endpoint, aggregated to one row per batch. Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.FailedDeliveryResponse.FailedCount is the number of failed deliveries in the batch and Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.FailedDeliveryResponse.FailureReason is the comma-separated set of their failure reasons.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**failedCount** | **Integer** |  | [default to Integer]
**failureReason** | **String** |  | [default to String]
**lastAttemptAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**attemptCount** | **Integer** |  | [default to Integer]
**resolved** | **Boolean** |  | [default to Boolean]
**resolvedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**resolutionReason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.FailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String batchReferenceId = "example batchReferenceId";
UUID runId = "example runId";
OffsetDateTime runStartTime = OffsetDateTime.now();
Integer failedCount = new Integer("100.00");
String failureReason = "example failureReason";
OffsetDateTime lastAttemptAt = OffsetDateTime.now();
Integer attemptCount = new Integer("100.00");
Boolean resolved = true;
@javax.annotation.Nullable OffsetDateTime resolvedAt = OffsetDateTime.now();
@javax.annotation.Nullable String resolutionReason = "example resolutionReason";


FailedDeliveryResponse failedDeliveryResponseInstance = new FailedDeliveryResponse()
    .batchReferenceId(batchReferenceId)
    .runId(runId)
    .runStartTime(runStartTime)
    .failedCount(failedCount)
    .failureReason(failureReason)
    .lastAttemptAt(lastAttemptAt)
    .attemptCount(attemptCount)
    .resolved(resolved)
    .resolvedAt(resolvedAt)
    .resolutionReason(resolutionReason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)