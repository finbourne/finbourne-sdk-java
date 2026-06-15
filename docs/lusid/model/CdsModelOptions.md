# com.finbourne.sdk.services.lusid.model.CdsModelOptions
classname CdsModelOptions
Model options for credit default instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**useFactorsForCurrentNotional** | **Boolean** | Determines if calculations that use current notional apply use a constituent weight factor from a quote representing a default. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CdsModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean useFactorsForCurrentNotional = true;


CdsModelOptions cdsModelOptionsInstance = new CdsModelOptions()
    .useFactorsForCurrentNotional(useFactorsForCurrentNotional);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)