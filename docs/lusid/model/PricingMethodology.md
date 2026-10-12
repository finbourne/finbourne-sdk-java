# com.finbourne.sdk.services.lusid.model.PricingMethodology
classname PricingMethodology
How a fund prices its share classes for dealing. A Single fund deals at one price per class, which starts at a  baseline and may swing with the fund's net cashflow. A Dual fund deals at a bid and an offer per class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outputShape** | **String** | How many dealing prices each share class publishes: Single, one price that subscriptions and redemptions both deal at, or Dual, a bid that redemptions deal at and an offer that subscriptions deal at. Available values: Single, Dual. | [default to String]
**swingPolicy** | [**SwingPolicy**](SwingPolicy.md) |  | [optional] [default to SwingPolicy]
**priceLabels** | **String** | What a Dual fund&#39;s two prices are. BidOffer is the only label available: the bid and the offer, including notional dealing costs, that the valuation recipe of each active NAV type publishes. Required for a Dual fund and must be omitted for a Single fund. Available values: BidOffer, CreationCancellation. | [optional] [default to String]
**derivation** | [**DualPriceDerivation**](DualPriceDerivation.md) |  | [optional] [default to DualPriceDerivation]

```java
import com.finbourne.sdk.services.lusid.model.PricingMethodology;
import java.util.*;
import java.lang.System;
import java.net.URI;

String outputShape = "example outputShape";
SwingPolicy swingPolicy = new SwingPolicy();
@javax.annotation.Nullable String priceLabels = "example priceLabels";
DualPriceDerivation derivation = new DualPriceDerivation();


PricingMethodology pricingMethodologyInstance = new PricingMethodology()
    .outputShape(outputShape)
    .swingPolicy(swingPolicy)
    .priceLabels(priceLabels)
    .derivation(derivation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)