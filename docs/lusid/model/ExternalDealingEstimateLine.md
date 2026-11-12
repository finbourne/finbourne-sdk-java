# com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateLine
classname ExternalDealingEstimateLine
One order within an external order set: a share class, a direction and either a number of units or an amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**tradeType** | **String** | Available values: Subscription, Redemption, SwitchOut, SwitchIn, TransferOut, TransferIn. | [default to String]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**amount** | [**ExternalDealingEstimateAmount**](ExternalDealingEstimateAmount.md) |  | [optional] [default to ExternalDealingEstimateAmount]

```java
import com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentIdentifierType = "example instrumentIdentifierType";
String instrumentIdentifier = "example instrumentIdentifier";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String tradeType = "example tradeType";
@javax.annotation.Nullable java.math.BigDecimal units = new java.math.BigDecimal("100.00");
ExternalDealingEstimateAmount amount = new ExternalDealingEstimateAmount();


ExternalDealingEstimateLine externalDealingEstimateLineInstance = new ExternalDealingEstimateLine()
    .instrumentIdentifierType(instrumentIdentifierType)
    .instrumentIdentifier(instrumentIdentifier)
    .instrumentScope(instrumentScope)
    .tradeType(tradeType)
    .units(units)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)