# com.finbourne.sdk.services.lusid.model.AllocationEventTransferConsideration
classname AllocationEventTransferConsideration
The consideration paid for a transferred capital interest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The consideration amount. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the consideration. | [default to String]
**recordOnly** | **Boolean** | Whether the consideration is recorded for reference only, with no cash movement booked. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventTransferConsideration;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
Boolean recordOnly = true;


AllocationEventTransferConsideration allocationEventTransferConsiderationInstance = new AllocationEventTransferConsideration()
    .amount(amount)
    .currency(currency)
    .recordOnly(recordOnly);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)