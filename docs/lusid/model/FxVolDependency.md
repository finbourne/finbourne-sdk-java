# com.finbourne.sdk.services.lusid.model.FxVolDependency
classname FxVolDependency
Economic dependency required to price FX derivative products that contain optionality.  FX Vol surface is a grid of implied volatilities for an array of strikes and tenors,  derived from vanilla option prices in the market.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**domesticCurrency** | **String** | DomesticCurrency is the first currency in a currency pair quote e.g. eur-gbp, eur is the domestic currency. | [default to String]
**foreignCurrency** | **String** | ForeignCurrency is the second currency in a currency pair quote e.g. eur-gbp, gbp is the foreign currency. | [default to String]
**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.FxVolDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domesticCurrency = "example domesticCurrency";
String foreignCurrency = "example foreignCurrency";
String volType = "example volType";
OffsetDateTime date = OffsetDateTime.now();


FxVolDependency fxVolDependencyInstance = new FxVolDependency()
    .domesticCurrency(domesticCurrency)
    .foreignCurrency(foreignCurrency)
    .volType(volType)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)