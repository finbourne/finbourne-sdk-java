# com.finbourne.sdk.services.lusid.model.ConstantVolatilitySurface
classname ConstantVolatilitySurface
Market Data required to build a volatility surface for pricing.  Single constant volatility point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date of the engine - this is the reference date for resolution of tenors. | [default to OffsetDateTime]
**assetType** | **String** | What is the asset that the engine is for.  Supported string (enumeration) values are: [Cash, Commodity, Credit, Equity, Fx, Rates, FxVol, IrVol, EquityVol, HolidayCalendar, IndexConvention, FlowConvention, CdsFlowConvention, CorporateActions, FxForwards, Quote, Inflation, EquityCurve, All, VendorOpaque]. | [default to String]
**lineage** | **String** |  | [optional] [default to String]
**volatility** | **java.math.BigDecimal** | Volatility value. | [default to java.math.BigDecimal]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.ConstantVolatilitySurface;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
String assetType = "example assetType";
@javax.annotation.Nullable String lineage = "example lineage";
java.math.BigDecimal volatility = new java.math.BigDecimal("100.00");
Version version = new Version();


ConstantVolatilitySurface constantVolatilitySurfaceInstance = new ConstantVolatilitySurface()
    .baseDate(baseDate)
    .assetType(assetType)
    .lineage(lineage)
    .volatility(volatility)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)