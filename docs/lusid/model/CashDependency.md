# com.finbourne.sdk.services.lusid.model.CashDependency
classname CashDependency
For indicating a dependency upon a currency.  E.g. A Bond will declare a CashDependency for its domestic currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**currency** | **String** | The Currency that is depended upon. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CashDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
OffsetDateTime date = OffsetDateTime.now();


CashDependency cashDependencyInstance = new CashDependency()
    .currency(currency)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)