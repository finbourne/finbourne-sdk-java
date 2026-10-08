# com.finbourne.sdk.services.lusid.model.FundDetails
classname FundDetails
The details of a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the fund which is the same as the base currency of all the portfolios of the fund&#39;s Abor. | [optional] [default to String]
**pricingBasis** | **String** | The side of the quote the NAV type valued the fund on: Mid, Bid or Ask. Absent when the NAV type defers to the valuation recipe&#39;s own pricing basis. When the NAV type has a swing pricing rule this is the basis the rule applied. | [optional] [default to String]
**swingPricing** | [**SwingPricingDecision**](SwingPricingDecision.md) |  | [optional] [default to SwingPricingDecision]

```java
import com.finbourne.sdk.services.lusid.model.FundDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String pricingBasis = "example pricingBasis";
SwingPricingDecision swingPricing = new SwingPricingDecision();


FundDetails fundDetailsInstance = new FundDetails()
    .currency(currency)
    .pricingBasis(pricingBasis)
    .swingPricing(swingPricing);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)