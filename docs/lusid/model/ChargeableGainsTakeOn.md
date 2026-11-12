# com.finbourne.sdk.services.lusid.model.ChargeableGainsTakeOn
classname ChargeableGainsTakeOn
Carried-forward chargeable-gains balances for a tax-lot taken on under the UK chargeable gains accounting method

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | Available values: Section104Pool, Holding1982, Holding1965. | [default to String]
**indexation** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**indexedTo** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**originalCost** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**marketValue1982** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**rebasingElection** | **Boolean** |  | [optional] [default to Boolean]
**additions** | [**List&lt;ChargeableGainsTakeOnAddition&gt;**](ChargeableGainsTakeOnAddition.md) |  | [optional] [default to List<ChargeableGainsTakeOnAddition>]

```java
import com.finbourne.sdk.services.lusid.model.ChargeableGainsTakeOn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String role = "example role";
@javax.annotation.Nullable java.math.BigDecimal indexation = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime indexedTo = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal originalCost = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal marketValue1982 = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Boolean rebasingElection = true;
@javax.annotation.Nullable List<ChargeableGainsTakeOnAddition> additions = new List<ChargeableGainsTakeOnAddition>();


ChargeableGainsTakeOn chargeableGainsTakeOnInstance = new ChargeableGainsTakeOn()
    .role(role)
    .indexation(indexation)
    .indexedTo(indexedTo)
    .originalCost(originalCost)
    .marketValue1982(marketValue1982)
    .rebasingElection(rebasingElection)
    .additions(additions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)