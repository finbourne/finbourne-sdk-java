# com.finbourne.sdk.services.horizon.model.ResolveFailedDeliveryResponse
classname ResolveFailedDeliveryResponse
Response from resolving the failed deliveries for a batch without retry. Resolution is batch-level, so Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.ResolveFailedDeliveryResponse.ResolvedCount is the number of failed deliveries marked resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**resolvedCount** | **Integer** |  | [default to Integer]
**resolved** | **Boolean** |  | [default to Boolean]
**resolvedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**resolutionReason** | **String** |  | [default to String]
**message** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ResolveFailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String batchReferenceId = "example batchReferenceId";
Integer resolvedCount = new Integer("100.00");
Boolean resolved = true;
OffsetDateTime resolvedAt = OffsetDateTime.now();
String resolutionReason = "example resolutionReason";
String message = "example message";


ResolveFailedDeliveryResponse resolveFailedDeliveryResponseInstance = new ResolveFailedDeliveryResponse()
    .batchReferenceId(batchReferenceId)
    .resolvedCount(resolvedCount)
    .resolved(resolved)
    .resolvedAt(resolvedAt)
    .resolutionReason(resolutionReason)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)