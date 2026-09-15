# com.finbourne.sdk.services.lusid.model.FxForwardModelOptions
classname FxForwardModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions, BondForwardModelOptions. | [default to String]
**forwardRateObservableType** | **String** | Available values: ForwardPoints, ForwardRate, RatesCurve, FxForwardCurve, Invalid. | [default to String]
**discountingMethod** | **String** | Available values: Standard, ConstantTimeValueOfMoney, Invalid. | [default to String]
**convertToReportCcy** | **Boolean** | Convert all FX flows to the report currency  By setting this all FX forwards will be priced using Forward Curves that have Report Currency as the base. | [default to Boolean]
**allowSpotFallbackForReportCcy** | **Boolean** | When converting to the report currency, allow falling back to pricing off the natural-pair forward  and converting to the report currency at spot when the report-currency cross forward curves are not  available. Defaults to false, in which case the report-currency cross forwards are required. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String forwardRateObservableType = "example forwardRateObservableType";
String discountingMethod = "example discountingMethod";
Boolean convertToReportCcy = true;
Boolean allowSpotFallbackForReportCcy = true;


FxForwardModelOptions fxForwardModelOptionsInstance = new FxForwardModelOptions()
    .forwardRateObservableType(forwardRateObservableType)
    .discountingMethod(discountingMethod)
    .convertToReportCcy(convertToReportCcy)
    .allowSpotFallbackForReportCcy(allowSpotFallbackForReportCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)