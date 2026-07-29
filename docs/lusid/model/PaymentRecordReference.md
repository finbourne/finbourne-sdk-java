# com.finbourne.sdk.services.lusid.model.PaymentRecordReference
classname PaymentRecordReference
Identifies a Payment Record attached to a specific transaction within a portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**transactionId** | **String** | The ID of the cash transaction within the portfolio to which the Payment Record is attached. | [default to String]
**paymentRecordId** | **String** | The unique identifier of the Payment Record attached to the above transaction. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PaymentRecordReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
String transactionId = "example transactionId";
String paymentRecordId = "example paymentRecordId";


PaymentRecordReference paymentRecordReferenceInstance = new PaymentRecordReference()
    .portfolioId(portfolioId)
    .transactionId(transactionId)
    .paymentRecordId(paymentRecordId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)