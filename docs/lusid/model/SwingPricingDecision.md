# com.finbourne.sdk.services.lusid.model.SwingPricingDecision
classname SwingPricingDecision
What the NAV type's swing pricing rule decided for a valuation point: the net dealing flow it measured, how  it compared with the threshold, and the pricing basis the point was valued on as a result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netDealingFlow** | **java.math.BigDecimal** | The net dealing flow the rule measured for the valuation point, in the fund currency. Subscriptions are positive and redemptions negative. | [optional] [default to java.math.BigDecimal]
**netDealingFlowPercentageOfNav** | **java.math.BigDecimal** | The net dealing flow as a percentage of the previous valuation point&#39;s NAV. Zero when there is no previous NAV to measure against. | [optional] [default to java.math.BigDecimal]
**thresholdPercentageOfNav** | **java.math.BigDecimal** | The threshold the rule compared the flow with. | [optional] [default to java.math.BigDecimal]
**direction** | **String** | Whether the fund swung and which way: None, Inflow or Outflow. | [optional] [default to String]
**pricingBasisApplied** | **String** | The pricing basis the valuation point was valued on after the rule was applied. Absent when the fund did not swing and the NAV type defers to the recipe. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SwingPricingDecision;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal netDealingFlow = new java.math.BigDecimal("100.00");
java.math.BigDecimal netDealingFlowPercentageOfNav = new java.math.BigDecimal("100.00");
java.math.BigDecimal thresholdPercentageOfNav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String direction = "example direction";
@javax.annotation.Nullable String pricingBasisApplied = "example pricingBasisApplied";


SwingPricingDecision swingPricingDecisionInstance = new SwingPricingDecision()
    .netDealingFlow(netDealingFlow)
    .netDealingFlowPercentageOfNav(netDealingFlowPercentageOfNav)
    .thresholdPercentageOfNav(thresholdPercentageOfNav)
    .direction(direction)
    .pricingBasisApplied(pricingBasisApplied);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)