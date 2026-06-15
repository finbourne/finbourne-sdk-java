# com.finbourne.sdk.services.lusid.model.FundingLegOptions
classname FundingLegOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**expectedFundingLegNotional** | **String** | Assumption made on future expected notional of the funding leg. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundingLegOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String expectedFundingLegNotional = "example expectedFundingLegNotional";


FundingLegOptions fundingLegOptionsInstance = new FundingLegOptions()
    .expectedFundingLegNotional(expectedFundingLegNotional);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)