# com.finbourne.sdk.services.lusid.model.TransferAgencyTransactionFromOrderResult
classname TransferAgencyTransactionFromOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**securityTransactionId** | **String** |  | [optional] [default to String]
**amendedCashTransactionId** | **String** |  | [optional] [default to String]
**price** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyTransactionFromOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
@javax.annotation.Nullable String securityTransactionId = "example securityTransactionId";
@javax.annotation.Nullable String amendedCashTransactionId = "example amendedCashTransactionId";
java.math.BigDecimal price = new java.math.BigDecimal("100.00");
java.math.BigDecimal units = new java.math.BigDecimal("100.00");


TransferAgencyTransactionFromOrderResult transferAgencyTransactionFromOrderResultInstance = new TransferAgencyTransactionFromOrderResult()
    .orderId(orderId)
    .securityTransactionId(securityTransactionId)
    .amendedCashTransactionId(amendedCashTransactionId)
    .price(price)
    .units(units);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)