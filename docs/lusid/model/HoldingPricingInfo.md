# com.finbourne.sdk.services.lusid.model.HoldingPricingInfo
classname HoldingPricingInfo
Enables price quotes to be created from Holding fields as either overrides or fallbacks to the Market Data  resolution process. For example, we may wish to price an instrument at Cost if Market Data resolution fails.  We may also wish to always price Bonds using the LastTradedPrice on the corresponding Holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fallbackField** | **String** | The default Holding field to fall back on if the Market Data resolution process fails to find a price quote. Available values: None, UnitCost, LastTradedPrice, UnitAmortisedCost, UnitCostClean, UnitCostDirty, UnitAmortisedCostClean, UnitAmortisedCostDirty. | [optional] [default to String]
**overrideField** | **String** | The default Holding field to be used as an override for instrument price quotes. This cannot be specified  along with a FallbackField or any SpecificFallbacks, since we&#39;ll never attempt Market Data resolution  for price quotes if this field is populated. Available values: None, UnitCost, LastTradedPrice, UnitAmortisedCost, UnitCostClean, UnitCostDirty, UnitAmortisedCostClean, UnitAmortisedCostDirty. | [optional] [default to String]
**specificFallbacks** | [**List&lt;SpecificHoldingPricingInfo&gt;**](SpecificHoldingPricingInfo.md) | Allows a user to specify fallbacks using Holding fields for sources that match a particular DependencySourceFilter. | [optional] [default to List<SpecificHoldingPricingInfo>]
**specificOverrides** | [**List&lt;SpecificHoldingPricingInfo&gt;**](SpecificHoldingPricingInfo.md) | Allows a user to specify overrides using Holding fields for sources that match a particular DependencySourceFilter. | [optional] [default to List<SpecificHoldingPricingInfo>]

```java
import com.finbourne.sdk.services.lusid.model.HoldingPricingInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String fallbackField = "example fallbackField";
@javax.annotation.Nullable String overrideField = "example overrideField";
@javax.annotation.Nullable List<SpecificHoldingPricingInfo> specificFallbacks = new List<SpecificHoldingPricingInfo>();
@javax.annotation.Nullable List<SpecificHoldingPricingInfo> specificOverrides = new List<SpecificHoldingPricingInfo>();


HoldingPricingInfo holdingPricingInfoInstance = new HoldingPricingInfo()
    .fallbackField(fallbackField)
    .overrideField(overrideField)
    .specificFallbacks(specificFallbacks)
    .specificOverrides(specificOverrides);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)