# com.finbourne.sdk.services.lusid.model.TransferAgencyTransactionCancellationResult
classname TransferAgencyTransactionCancellationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionId** | **String** |  | [optional] [default to String]
**amendedCashTransactionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyTransactionCancellationResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
@javax.annotation.Nullable String transactionId = "example transactionId";
@javax.annotation.Nullable String amendedCashTransactionId = "example amendedCashTransactionId";


TransferAgencyTransactionCancellationResult transferAgencyTransactionCancellationResultInstance = new TransferAgencyTransactionCancellationResult()
    .orderId(orderId)
    .transactionId(transactionId)
    .amendedCashTransactionId(amendedCashTransactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)