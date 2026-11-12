# com.finbourne.sdk.services.lusid.model.StripBondModelOptions
classname StripBondModelOptions
Model options for StripBond pricing: how a strip's cash receipts are split between income and return of  capital. Set on the VendorModelRule for StripBond under the BondLookupPricer, SimpleStatic or  OverrideOnlyPricer model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions, BondForwardModelOptions, SimpleModelOptions, StripBondModelOptions. | [default to String]
**stripAccountingChoice** | **String** | How a StripBond&#39;s cash receipts are split between income and return of capital.  Null means CostRecovery: the effective yield is 0, every receipt returns capital until cost is recovered.  QuotedYield reads the strip&#39;s EffectiveYield quote at the parent flow&#39;s ex-date.  CashAsReceived applies no yield: each receipt is booked as the parent paid it, an interest-only strip&#39;s  cash as income and a principal-only strip&#39;s as return of capital.                Supported string (enumeration) values are: [CostRecovery, QuotedYield, CashAsReceived]. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StripBondModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String stripAccountingChoice = "example stripAccountingChoice";


StripBondModelOptions stripBondModelOptionsInstance = new StripBondModelOptions()
    .stripAccountingChoice(stripAccountingChoice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)