# com.finbourne.sdk.services.lusid.model.CancelTransferAgencyTransactionRequest
classname CancelTransferAgencyTransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**transactionId** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CancelTransferAgencyTransactionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
String transactionId = "example transactionId";


CancelTransferAgencyTransactionRequest cancelTransferAgencyTransactionRequestInstance = new CancelTransferAgencyTransactionRequest()
    .portfolioId(portfolioId)
    .transactionId(transactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)