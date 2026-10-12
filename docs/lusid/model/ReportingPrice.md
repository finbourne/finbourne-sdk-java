# com.finbourne.sdk.services.lusid.model.ReportingPrice
classname ReportingPrice
A share class price a fund publishes at each valuation point under a label of its own, alongside the dealing price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The share class price published: Mid, the unit price, or Bid, Offer, BidIncNdc or OfferIncNdc, as the valuation recipe of each active NAV type publishes it. Available values: Mid, Bid, Offer, BidIncNdc, OfferIncNdc, Creation, Cancellation. | [default to String]
**label** | **String** | The name the price is published under in the share class&#39;s reporting prices. Unique within the fund. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReportingPrice;
import java.util.*;
import java.lang.System;
import java.net.URI;

String source = "example source";
String label = "example label";


ReportingPrice reportingPriceInstance = new ReportingPrice()
    .source(source)
    .label(label);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)