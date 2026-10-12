# com.finbourne.sdk.services.lusid.model.DualPriceDerivation
classname DualPriceDerivation
How a Dual fund derives its dealing prices from one real price by fixed spreads.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**realSide** | **String** | The price read from the valuation: Bid or Offer, from which the other side is derived, or Mid, the share class unit price, from which both sides are derived, for a fund whose market data has no bid or offer. Available values: Bid, Offer, Mid. | [default to String]
**includeNdc** | **Boolean** | Whether the real side is read including notional dealing costs, which needs the NAV type to have a notional dealing cost table. Must be false for Mid. | [default to Boolean]
**bidSpreadBps** | **java.math.BigDecimal** | How far below the real price the bid is set, in basis points of the real price. Zero or more. Required when the bid is derived, for an Offer or Mid real side, and absent for a Bid one. | [optional] [default to java.math.BigDecimal]
**offerSpreadBps** | **java.math.BigDecimal** | How far above the real price the offer is set, in basis points of the real price. Zero or more. Required when the offer is derived, for a Bid or Mid real side, and absent for an Offer one. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DualPriceDerivation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String realSide = "example realSide";
Boolean includeNdc = true;
@javax.annotation.Nullable java.math.BigDecimal bidSpreadBps = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal offerSpreadBps = new java.math.BigDecimal("100.00");


DualPriceDerivation dualPriceDerivationInstance = new DualPriceDerivation()
    .realSide(realSide)
    .includeNdc(includeNdc)
    .bidSpreadBps(bidSpreadBps)
    .offerSpreadBps(offerSpreadBps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)