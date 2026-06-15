# com.finbourne.sdk.services.lusid.model.EquityModelOptions
classname EquityModelOptions
Model options for equity related pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**equityForwardProjectionType** | **String** | Determines how forward equity prices should be projected.                Supported string (enumeration) values are: [FlatForwardCurveFromSpot, EquityCurveByPrices, ForwardProjectedFromRatesCurve]. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EquityModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String equityForwardProjectionType = "example equityForwardProjectionType";


EquityModelOptions equityModelOptionsInstance = new EquityModelOptions()
    .equityForwardProjectionType(equityForwardProjectionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)