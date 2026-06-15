# com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResult
classname ComplianceSummaryRuleResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**variation** | **String** |  | [default to String]
**ruleStatus** | **String** |  | [default to String]
**affectedPortfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**parametersUsed** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**ruleBreakdown** | [**List&lt;ComplianceRuleBreakdown&gt;**](ComplianceRuleBreakdown.md) |  | [default to List<ComplianceRuleBreakdown>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ruleId = new ResourceId();
ResourceId templateId = new ResourceId();
String variation = "example variation";
String ruleStatus = "example ruleStatus";
List<ResourceId> affectedPortfolios = new List<ResourceId>();
List<ResourceId> affectedOrders = new List<ResourceId>();
Map<String, String> parametersUsed = new Map<String, String>();
List<ComplianceRuleBreakdown> ruleBreakdown = new List<ComplianceRuleBreakdown>();


ComplianceSummaryRuleResult complianceSummaryRuleResultInstance = new ComplianceSummaryRuleResult()
    .ruleId(ruleId)
    .templateId(templateId)
    .variation(variation)
    .ruleStatus(ruleStatus)
    .affectedPortfolios(affectedPortfolios)
    .affectedOrders(affectedOrders)
    .parametersUsed(parametersUsed)
    .ruleBreakdown(ruleBreakdown);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)