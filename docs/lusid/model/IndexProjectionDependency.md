# com.finbourne.sdk.services.lusid.model.IndexProjectionDependency
classname IndexProjectionDependency
Represents either a dependency on projections of an index.  E.g. If the interest leg of a swap is a FloatingLeg, then it will declare an IndexProjectionDependency upon pricing.  This is to indicate that pricing the floating leg requires predictions of future fixings of the index.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**currency** | **String** | The currency of the corresponding IndexConvention. E.g. this would be USD for a convention named USD.6M.LIBOR | [default to String]
**tenor** | **String** | The tenor of the corresponding IndexConvention. E.g. this would be \&quot;6M\&quot; for a convention named USD.6M.LIBOR | [default to String]
**indexName** | **String** | The IndexName of the corresponding IndexConvention. E.g. this would be \&quot;LIBOR\&quot; for a convention named USD.6M.LIBOR | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.IndexProjectionDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
String tenor = "example tenor";
String indexName = "example indexName";
OffsetDateTime date = OffsetDateTime.now();


IndexProjectionDependency indexProjectionDependencyInstance = new IndexProjectionDependency()
    .currency(currency)
    .tenor(tenor)
    .indexName(indexName)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)