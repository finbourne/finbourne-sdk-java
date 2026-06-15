# com.finbourne.sdk.services.lusid.model.CalendarDependency
classname CalendarDependency
For indicating a dependency upon calendar codes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**calendars** | **List&lt;String&gt;** | The Codes of the calendars that are depended upon. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.CalendarDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> calendars = new List<String>();


CalendarDependency calendarDependencyInstance = new CalendarDependency()
    .calendars(calendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)