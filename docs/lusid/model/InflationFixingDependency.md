# com.finbourne.sdk.services.lusid.model.InflationFixingDependency
classname InflationFixingDependency
For indicating a dependency upon an inflation fixing

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**type** | **String** | The Type of fixing (index, ratio or assumption) | [default to String]
**code** | **String** | The Code of the fixing, typically the index name | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt of the inflation fixing | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.InflationFixingDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String code = "example code";
OffsetDateTime date = OffsetDateTime.now();


InflationFixingDependency inflationFixingDependencyInstance = new InflationFixingDependency()
    .type(type)
    .code(code)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)