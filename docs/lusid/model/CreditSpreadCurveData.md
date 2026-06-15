# com.finbourne.sdk.services.lusid.model.CreditSpreadCurveData
classname CreditSpreadCurveData
A credit spread curve matching tenors against par spread quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the curve | [default to String]
**tenors** | **List&lt;String&gt;** | The tenors for which the rates apply  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**spreads** | **List&lt;java.math.BigDecimal&gt;** | Par spread quotes corresponding to the tenors. | [default to List<java.math.BigDecimal>]
**recoveryRate** | **java.math.BigDecimal** | The recovery rate in default. | [default to java.math.BigDecimal]
**referenceDate** | [**OffsetDateTime**](OffsetDateTime.md) | If tenors are provided, this is the date against which the tenors will be resolved.  This is of importance to CDX spread quotes, which are usually quoted in tenors relative to the CDX start date.  In this case, the ReferenceDate would be equal to the CDX start date, and the BaseDate would be the date for which the spreads are valid.  If not provided, this defaults to the BaseDate of the curve. | [optional] [default to OffsetDateTime]
**maturities** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The maturity dates for which the rates apply.  Either tenors or maturities should be provided, not both. | [optional] [default to List<OffsetDateTime>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.CreditSpreadCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
String domCcy = "example domCcy";
List<String> tenors = new List<String>();
List<java.math.BigDecimal> spreads = new List<java.math.BigDecimal>();
java.math.BigDecimal recoveryRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime referenceDate = OffsetDateTime.now();
@javax.annotation.Nullable List<OffsetDateTime> maturities = new List<OffsetDateTime>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();


CreditSpreadCurveData creditSpreadCurveDataInstance = new CreditSpreadCurveData()
    .baseDate(baseDate)
    .domCcy(domCcy)
    .tenors(tenors)
    .spreads(spreads)
    .recoveryRate(recoveryRate)
    .referenceDate(referenceDate)
    .maturities(maturities)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)