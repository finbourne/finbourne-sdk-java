# com.finbourne.sdk.services.lusid.model.VendorDependency
classname VendorDependency
For indicating a dependency on some opaque market data requested by an outside vendor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**vendorName** | **String** | The name of the outside vendor | [default to String]
**vendorPath** | **List&lt;String&gt;** | The specific dependency path | [default to List<String>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.VendorDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String vendorName = "example vendorName";
List<String> vendorPath = new List<String>();
OffsetDateTime date = OffsetDateTime.now();


VendorDependency vendorDependencyInstance = new VendorDependency()
    .vendorName(vendorName)
    .vendorPath(vendorPath)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)