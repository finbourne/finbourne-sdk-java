# com.finbourne.sdk.services.lusid.model.DiscountingDependency
classname DiscountingDependency
For indicating a dependency on discounting for a given currency.  E.g Valuing a Bond with the Discounting model will declare a DiscountingDependency  for the domestic currency of the bond to account for the time-value of the future cashFlows of the bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**currency** | **String** | The currency that needs to be discounted. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.DiscountingDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
OffsetDateTime date = OffsetDateTime.now();


DiscountingDependency discountingDependencyInstance = new DiscountingDependency()
    .currency(currency)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)