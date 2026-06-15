# com.finbourne.sdk.services.lusid.model.FxForwardModelOptions
classname FxForwardModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**forwardRateObservableType** | **String** | Available values: ForwardPoints, ForwardRate, RatesCurve, FxForwardCurve, Invalid. | [default to String]
**discountingMethod** | **String** | Available values: Standard, ConstantTimeValueOfMoney, Invalid. | [default to String]
**convertToReportCcy** | **Boolean** | Convert all FX flows to the report currency  By setting this all FX forwards will be priced using Forward Curves that have Report Currency as the base. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String forwardRateObservableType = "example forwardRateObservableType";
String discountingMethod = "example discountingMethod";
Boolean convertToReportCcy = true;


FxForwardModelOptions fxForwardModelOptionsInstance = new FxForwardModelOptions()
    .forwardRateObservableType(forwardRateObservableType)
    .discountingMethod(discountingMethod)
    .convertToReportCcy(convertToReportCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)