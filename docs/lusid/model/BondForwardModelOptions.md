# com.finbourne.sdk.services.lusid.model.BondForwardModelOptions
classname BondForwardModelOptions
Model options for bond forward pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions, BondForwardModelOptions. | [default to String]
**bondForwardProjectionType** | **String** | Determines how the forward price of the deliverable bond is projected to the settlement date.                Supported string (enumeration) values are: [QuotedContractPrice, ForwardProjectedFromFundingCurve,  DeliverableSpreadAnchoredToQuote].  Defaults to QuotedContractPrice - the original quote-driven behaviour - when not supplied, so  options persisted before this property existed keep the behaviour they were saved under.                ForwardProjectedFromFundingCurve carries the deliverable&#39;s quoted dirty spot to settlement on the  discount curve. DeliverableSpreadAnchoredToQuote does the same carry but models that spot as well,  off the spread anchored for the deliverable in the base market, which is what gives the forward  the deliverable&#39;s own curve delta rather than only the carry&#39;s - the larger of the two terms. It  requires the deliverable to be a mastered Bond or ComplexBond settling in the forward&#39;s own  currency, and a credit-spread curve or ZSpread quote to be resolvable for it. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BondForwardModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String bondForwardProjectionType = "example bondForwardProjectionType";


BondForwardModelOptions bondForwardModelOptionsInstance = new BondForwardModelOptions()
    .bondForwardProjectionType(bondForwardProjectionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)