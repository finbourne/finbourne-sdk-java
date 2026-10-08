# com.finbourne.sdk.services.lusid.model.SwingPricingRule
classname SwingPricingRule
Moves a NAV type's pricing basis with its net dealing flow. When the flow, as a percentage of the previous  valuation point's NAV, exceeds the threshold the fund is valued on the inflow or outflow basis instead of  the NAV type's own basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresholdPercentageOfNav** | **java.math.BigDecimal** | The net dealing flow, as a percentage of the previous valuation point&#39;s NAV, above which the fund swings. Must be zero or more; zero swings on any non-zero flow. | [default to java.math.BigDecimal]
**inflowBasis** | **String** | The pricing basis the fund is valued on when net subscriptions exceed the threshold: Mid, Bid or Ask. Defaults to Ask. Available values: Mid, Bid, Ask. | [optional] [default to String]
**outflowBasis** | **String** | The pricing basis the fund is valued on when net redemptions exceed the threshold: Mid, Bid or Ask. Defaults to Bid. Available values: Mid, Bid, Ask. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SwingPricingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal thresholdPercentageOfNav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String inflowBasis = "example inflowBasis";
@javax.annotation.Nullable String outflowBasis = "example outflowBasis";


SwingPricingRule swingPricingRuleInstance = new SwingPricingRule()
    .thresholdPercentageOfNav(thresholdPercentageOfNav)
    .inflowBasis(inflowBasis)
    .outflowBasis(outflowBasis);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)