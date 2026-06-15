# com.finbourne.sdk.services.lusid.model.FxForwardsDependency
classname FxForwardsDependency
Indicates a dependency on an FxForwardCurve.  Identical to Fx dependencies in the meaning of domestic and foreign currencies, but describes a *set* of fx rates.  These rates are quoted rates for fx forwards, which can be used to interpolate the forward rate at a specific time in the future.  In the case of pips, the absolute rates can be expressed as rate = spotFx + pips / pipsPerUnit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**domesticCurrency** | **String** | DomesticCurrency is the first currency in a currency pair quote e.g. eur-gbp, eur is the domestic currency. | [default to String]
**foreignCurrency** | **String** | ForeignCurrency is the second currency in a currency pair quote e.g. eur-gbp, gbp is the foreign currency. | [default to String]
**curveType** | **String** | Used to describe the format in which the curve is expressed  e.g. FxFwdCurve (general term to describe any representation), TenorFxFwdCurve, PipsFxFwdCurve. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardsDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domesticCurrency = "example domesticCurrency";
String foreignCurrency = "example foreignCurrency";
String curveType = "example curveType";
OffsetDateTime date = OffsetDateTime.now();


FxForwardsDependency fxForwardsDependencyInstance = new FxForwardsDependency()
    .domesticCurrency(domesticCurrency)
    .foreignCurrency(foreignCurrency)
    .curveType(curveType)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)