# com.finbourne.sdk.services.lusid.model.QuoteDependency
classname QuoteDependency
For indicating a dependency on the value of an asset at a point in time.  If the time is omitted, then the dependency is interpreted as the latest value with respect to anything observing it.  E.g. An EquitySwap will declare a dependency on the current price of the underlying equity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**marketIdentifier** | **String** | Type of the code identifying the asset, e.g. ISIN or CUSIP | [default to String]
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt of the quote for the identified entity. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.QuoteDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketIdentifier = "example marketIdentifier";
String code = "example code";
OffsetDateTime date = OffsetDateTime.now();


QuoteDependency quoteDependencyInstance = new QuoteDependency()
    .marketIdentifier(marketIdentifier)
    .code(code)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)