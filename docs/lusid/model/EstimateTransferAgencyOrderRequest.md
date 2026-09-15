# com.finbourne.sdk.services.lusid.model.EstimateTransferAgencyOrderRequest
classname EstimateTransferAgencyOrderRequest
A request to estimate the values of one order. `OrderId` is required whether or not the order has been  saved, because it is the identity the estimate is returned against. Supply `Order` to estimate values  that differ from - or do not yet exist in - the saved order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**order** | [**TransferAgencyOrderToEstimate**](TransferAgencyOrderToEstimate.md) |  | [optional] [default to TransferAgencyOrderToEstimate]
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.EstimateTransferAgencyOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
TransferAgencyOrderToEstimate order = new TransferAgencyOrderToEstimate();
@javax.annotation.Nullable OffsetDateTime priceDate = OffsetDateTime.now();


EstimateTransferAgencyOrderRequest estimateTransferAgencyOrderRequestInstance = new EstimateTransferAgencyOrderRequest()
    .orderId(orderId)
    .order(order)
    .priceDate(priceDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)