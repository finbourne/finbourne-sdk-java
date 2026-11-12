# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Response
classname ComplianceRuleV3Response
A V3 compliance rule as returned by the API: its identity and administrative fields, its full  definition, and its version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [optional] [default to Boolean]
**subject** | **String** | Available values: Holdings, Orders. | [optional] [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [optional] [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [optional] [default to ComplianceRuleV3Check]
**computedFilter** | [**ComplianceRuleV3ComputedFilter**](ComplianceRuleV3ComputedFilter.md) |  | [optional] [default to ComplianceRuleV3ComputedFilter]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean active = true;
@javax.annotation.Nullable String subject = "example subject";
ComplianceRuleV3FilterNode filter = new ComplianceRuleV3FilterNode();
@javax.annotation.Nullable List<String> groupBy = new List<String>();
ComplianceRuleV3Measure measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check check = new ComplianceRuleV3Check();
ComplianceRuleV3ComputedFilter computedFilter = new ComplianceRuleV3ComputedFilter();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ComplianceRuleV3Response complianceRuleV3ResponseInstance = new ComplianceRuleV3Response()
    .id(id)
    .name(name)
    .description(description)
    .active(active)
    .subject(subject)
    .filter(filter)
    .groupBy(groupBy)
    .measure(measure)
    .check(check)
    .computedFilter(computedFilter)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)