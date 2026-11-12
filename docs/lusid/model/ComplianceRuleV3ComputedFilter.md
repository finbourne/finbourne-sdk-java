# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3ComputedFilter
classname ComplianceRuleV3ComputedFilter
An optional inner test selecting survivors before the measure: an optional grouping, the measure to  compute per group, and the check the group's measure must satisfy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [default to ComplianceRuleV3Check]
**selectOutsideBounds** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3ComputedFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> groupBy = new List<String>();
ComplianceRuleV3Measure measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check check = new ComplianceRuleV3Check();
Boolean selectOutsideBounds = true;


ComplianceRuleV3ComputedFilter complianceRuleV3ComputedFilterInstance = new ComplianceRuleV3ComputedFilter()
    .groupBy(groupBy)
    .measure(measure)
    .check(check)
    .selectOutsideBounds(selectOutsideBounds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)