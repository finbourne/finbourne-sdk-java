# com.finbourne.sdk.services.lusid.model.ChargeableGainsTakeOnAddition
classname ChargeableGainsTakeOnAddition
One acquisition added to a taken-on 1982 holding since 31 March 1982, carried as its own record inside the holding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**cost** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**indexation** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**paidCost** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ChargeableGainsTakeOnAddition;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal indexation = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal paidCost = new java.math.BigDecimal("100.00");


ChargeableGainsTakeOnAddition chargeableGainsTakeOnAdditionInstance = new ChargeableGainsTakeOnAddition()
    .date(date)
    .cost(cost)
    .indexation(indexation)
    .paidCost(paidCost);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)