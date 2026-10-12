# com.finbourne.sdk.services.lusid.model.DualPriceDealing
classname DualPriceDealing
The bid and offer dealing prices a share class of a Dual fund publishes at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingBid** | **java.math.BigDecimal** | The price redemptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue or the valuation did not price the side. | [optional] [default to java.math.BigDecimal]
**dealingOffer** | **java.math.BigDecimal** | The price subscriptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue or the valuation did not price the side. | [optional] [default to java.math.BigDecimal]
**bidPerValuationSource** | **String** | The share class price the dealing bid was read or derived from: Bid when it is the bid read as published, Offer or Mid when it was derived from that price. Absent when nothing was dealt. | [optional] [default to String]
**offerPerValuationSource** | **String** | The share class price the dealing offer was read or derived from: Offer when it is the offer read as published, Bid or Mid when it was derived from that price. Absent when nothing was dealt. | [optional] [default to String]
**bidSpreadBps** | **java.math.BigDecimal** | The spread, in basis points, the dealing bid was set below the price it was derived from by. Absent when the bid was read. | [optional] [default to java.math.BigDecimal]
**offerSpreadBps** | **java.math.BigDecimal** | The spread, in basis points, the dealing offer was set above the price it was derived from by. Absent when the offer was read. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DualPriceDealing;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal dealingBid = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dealingOffer = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String bidPerValuationSource = "example bidPerValuationSource";
@javax.annotation.Nullable String offerPerValuationSource = "example offerPerValuationSource";
@javax.annotation.Nullable java.math.BigDecimal bidSpreadBps = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal offerSpreadBps = new java.math.BigDecimal("100.00");


DualPriceDealing dualPriceDealingInstance = new DualPriceDealing()
    .dealingBid(dealingBid)
    .dealingOffer(dealingOffer)
    .bidPerValuationSource(bidPerValuationSource)
    .offerPerValuationSource(offerPerValuationSource)
    .bidSpreadBps(bidSpreadBps)
    .offerSpreadBps(offerSpreadBps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)