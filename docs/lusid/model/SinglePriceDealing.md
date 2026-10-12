# com.finbourne.sdk.services.lusid.model.SinglePriceDealing
classname SinglePriceDealing
The single dealing price a share class publishes at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingPrice** | **java.math.BigDecimal** | The price subscriptions and redemptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue. | [optional] [default to java.math.BigDecimal]
**swung** | **Boolean** | Whether the dealing price moved away from its baseline. | [default to Boolean]
**swingDirection** | **String** | Offer when a net inflow swung the price up, Bid when a net outflow swung it down. Absent when the price did not swing. | [optional] [default to String]
**swingFrom** | **String** | The baseline the price swung away from. Absent when it did not swing. | [optional] [default to String]
**perValuationSource** | **String** | Bid or Offer when the dealing price is that side&#39;s share class price read as published, from a Bid or Offer baseline or a Market swing. Absent when the price is the mid or a stored spread was applied to it. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread applied, in basis points. Absent when the price did not swing or swung to a market price. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SinglePriceDealing;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal dealingPrice = new java.math.BigDecimal("100.00");
Boolean swung = true;
@javax.annotation.Nullable String swingDirection = "example swingDirection";
@javax.annotation.Nullable String swingFrom = "example swingFrom";
@javax.annotation.Nullable String perValuationSource = "example perValuationSource";
@javax.annotation.Nullable java.math.BigDecimal spreadBps = new java.math.BigDecimal("100.00");


SinglePriceDealing singlePriceDealingInstance = new SinglePriceDealing()
    .dealingPrice(dealingPrice)
    .swung(swung)
    .swingDirection(swingDirection)
    .swingFrom(swingFrom)
    .perValuationSource(perValuationSource)
    .spreadBps(spreadBps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)