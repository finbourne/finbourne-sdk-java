# com.finbourne.sdk.services.lusid.model.UpsertComplianceRuleV3Request
classname UpsertComplianceRuleV3Request
A request to create or update a V3 compliance rule. A V3 rule's own record fully describes what it  checks: the subject it runs over, the filter selecting rows, the grouping and measure reducing them to a  number, and the check that number must satisfy. Shares no type with ComplianceV1/V2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [default to Boolean]
**subject** | **String** | Available values: Holdings, Orders. | [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [default to ComplianceRuleV3Check]
**computedFilter** | [**ComplianceRuleV3ComputedFilter**](ComplianceRuleV3ComputedFilter.md) |  | [optional] [default to ComplianceRuleV3ComputedFilter]

```java
import com.finbourne.sdk.services.lusid.model.UpsertComplianceRuleV3Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean active = true;
String subject = "example subject";
ComplianceRuleV3FilterNode filter = new ComplianceRuleV3FilterNode();
@javax.annotation.Nullable List<String> groupBy = new List<String>();
ComplianceRuleV3Measure measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check check = new ComplianceRuleV3Check();
ComplianceRuleV3ComputedFilter computedFilter = new ComplianceRuleV3ComputedFilter();


UpsertComplianceRuleV3Request upsertComplianceRuleV3RequestInstance = new UpsertComplianceRuleV3Request()
    .id(id)
    .name(name)
    .description(description)
    .active(active)
    .subject(subject)
    .filter(filter)
    .groupBy(groupBy)
    .measure(measure)
    .check(check)
    .computedFilter(computedFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)