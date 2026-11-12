# com.finbourne.sdk.services.lusid.model.EstimateValuationOutcome
classname EstimateValuationOutcome
Where a net cashflow leads the methodology: whether and which way it swings, the spread and tier it lands in, and the dealing price that results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**swung** | **Boolean** | Whether the methodology swings the price on this net cashflow. | [default to Boolean]
**swingDirection** | **String** | &#39;Bid&#39; or &#39;Offer&#39;, the side the price swings to. Absent when it does not swing. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread applied, in basis points. Absent when the price does not swing or the spread comes from the market. | [optional] [default to java.math.BigDecimal]
**tierMatched** | [**SwingSpreadTierBounds**](SwingSpreadTierBounds.md) |  | [optional] [default to SwingSpreadTierBounds]
**dealingPrice** | **java.math.BigDecimal** | The dealing price the methodology publishes on this net cashflow. Absent when the baseline price is unavailable. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.EstimateValuationOutcome;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean swung = true;
@javax.annotation.Nullable String swingDirection = "example swingDirection";
@javax.annotation.Nullable java.math.BigDecimal spreadBps = new java.math.BigDecimal("100.00");
SwingSpreadTierBounds tierMatched = new SwingSpreadTierBounds();
@javax.annotation.Nullable java.math.BigDecimal dealingPrice = new java.math.BigDecimal("100.00");


EstimateValuationOutcome estimateValuationOutcomeInstance = new EstimateValuationOutcome()
    .swung(swung)
    .swingDirection(swingDirection)
    .spreadBps(spreadBps)
    .tierMatched(tierMatched)
    .dealingPrice(dealingPrice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)