# com.finbourne.sdk.services.lusid.model.EligibleCollateralRowRequest
classname EligibleCollateralRowRequest
One class of eligible collateral and how it is valued, as supplied when a schedule is created or upserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The stable key the row is referred to by. Unique within the schedule. | [default to String]
**description** | **String** | A description of the row. Optional. | [optional] [default to String]
**selector** | [**EligibleCollateralAssetSelectorRequest**](EligibleCollateralAssetSelectorRequest.md) |  | [default to EligibleCollateralAssetSelectorRequest]
**valuationPercentage** | **java.math.BigDecimal** | The fraction of an asset&#39;s value that is accepted as collateral, for example 0.95 for 95%. Greater than 0 and at most 1. | [default to java.math.BigDecimal]
**fxHaircut** | **java.math.BigDecimal** | The further fraction deducted when the asset&#39;s currency is not the agreement&#39;s base currency, so that the effective valuation percentage is ValuationPercentage * (1 - FxHaircut). At least 0 and less than 1. Not allowed for a BaseCurrencyCash selector. Optional. | [optional] [default to java.math.BigDecimal]
**minResidualMaturityYears** | **java.math.BigDecimal** | The inclusive lower bound of the residual maturity in years that the row applies to. Only allowed for an Instrument selector. Optional. | [optional] [default to java.math.BigDecimal]
**maxResidualMaturityYears** | **java.math.BigDecimal** | The exclusive upper bound of the residual maturity in years that the row applies to. Only allowed for an Instrument selector. Optional. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.EligibleCollateralRowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String description = "example description";
EligibleCollateralAssetSelectorRequest selector = new EligibleCollateralAssetSelectorRequest();
java.math.BigDecimal valuationPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fxHaircut = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal minResidualMaturityYears = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal maxResidualMaturityYears = new java.math.BigDecimal("100.00");


EligibleCollateralRowRequest eligibleCollateralRowRequestInstance = new EligibleCollateralRowRequest()
    .code(code)
    .description(description)
    .selector(selector)
    .valuationPercentage(valuationPercentage)
    .fxHaircut(fxHaircut)
    .minResidualMaturityYears(minResidualMaturityYears)
    .maxResidualMaturityYears(maxResidualMaturityYears);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)