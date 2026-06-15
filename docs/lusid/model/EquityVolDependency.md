# com.finbourne.sdk.services.lusid.model.EquityVolDependency
classname EquityVolDependency
Economic dependency required to price Equity derivative products that contain optionality.  Equity Vol surface is a grid of implied volatilities for an array of strikes and tenors,  derived from vanilla option prices in the market.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | [default to String]
**domesticCurrency** | **String** | The domestic currency of the instrument declaring this dependency. | [default to String]
**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.EquityVolDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String domesticCurrency = "example domesticCurrency";
String volType = "example volType";
OffsetDateTime date = OffsetDateTime.now();


EquityVolDependency equityVolDependencyInstance = new EquityVolDependency()
    .code(code)
    .domesticCurrency(domesticCurrency)
    .volType(volType)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)