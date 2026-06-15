# com.finbourne.sdk.services.lusid.model.OpaqueDependency
classname OpaqueDependency
Represents a dependency that could not be understood as an externally exposed dependency.  If this is an unexpected dependency, then please contact support.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OpaqueDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;



OpaqueDependency opaqueDependencyInstance = new OpaqueDependency()
    ;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)