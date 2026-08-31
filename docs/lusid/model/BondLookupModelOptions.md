# com.finbourne.sdk.services.lusid.model.BondLookupModelOptions
classname BondLookupModelOptions
Model options for the quote-anchored bond lookup pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions. | [default to String]
**spreadAnchoredRisk** | **Boolean** | Price the bond by discounting its own cashflows over its discounting curve at a constant  spread, instead of marking it to its quoted price. Marking to a quote declares no curve  dependency, so a lookup-priced bond reports no curve delta at all. In this mode the pricer  declares both the discounting curve and a ZSpread quote for the instrument and prices off  them, so holding the spread fixed while the curve is perturbed produces the curve&#39;s delta.  Off by default, as the mode changes both the declared dependencies and where the price  comes from. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.BondLookupModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean spreadAnchoredRisk = true;


BondLookupModelOptions bondLookupModelOptionsInstance = new BondLookupModelOptions()
    .spreadAnchoredRisk(spreadAnchoredRisk);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)