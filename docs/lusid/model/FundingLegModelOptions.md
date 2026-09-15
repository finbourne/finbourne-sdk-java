# com.finbourne.sdk.services.lusid.model.FundingLegModelOptions
classname FundingLegModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions, BondForwardModelOptions. | [default to String]
**expectedFundingLegNotional** | **String** | Assumption made on future expected notional of the funding leg. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundingLegModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String expectedFundingLegNotional = "example expectedFundingLegNotional";


FundingLegModelOptions fundingLegModelOptionsInstance = new FundingLegModelOptions()
    .expectedFundingLegNotional(expectedFundingLegNotional);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)