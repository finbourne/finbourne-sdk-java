# com.finbourne.sdk.services.lusid.model.DiscountFactorCurveData
classname DiscountFactorCurveData
A curve containing discount factors and dates to which they apply

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | BaseDate for the Curve | [default to OffsetDateTime]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates for which the discount factors apply | [default to List<OffsetDateTime>]
**discountFactors** | **List&lt;java.math.BigDecimal&gt;** | Discount factors to be applied to cashflow on the specified dates | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.DiscountFactorCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
List<OffsetDateTime> dates = new List<OffsetDateTime>();
List<java.math.BigDecimal> discountFactors = new List<java.math.BigDecimal>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();


DiscountFactorCurveData discountFactorCurveDataInstance = new DiscountFactorCurveData()
    .baseDate(baseDate)
    .dates(dates)
    .discountFactors(discountFactors)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)