# com.finbourne.sdk.services.lusid.model.UpsertTransferAgencyTransactionFromOrderRequest
classname UpsertTransferAgencyTransactionFromOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTransferAgencyTransactionFromOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
OffsetDateTime priceDate = OffsetDateTime.now();


UpsertTransferAgencyTransactionFromOrderRequest upsertTransferAgencyTransactionFromOrderRequestInstance = new UpsertTransferAgencyTransactionFromOrderRequest()
    .orderId(orderId)
    .priceDate(priceDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)