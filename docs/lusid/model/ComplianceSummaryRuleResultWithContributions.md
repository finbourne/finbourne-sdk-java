# com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResultWithContributions
classname ComplianceSummaryRuleResultWithContributions

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
**ruleBreakdown** | [**List&lt;ComplianceRuleBreakdownWithContributions&gt;**](ComplianceRuleBreakdownWithContributions.md) |  | [default to List<ComplianceRuleBreakdownWithContributions>]
**otherPositionsConsidered** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The rest of the basis the rule was measured against but did not directly evaluate — the positions in  the referenced/denominator (or initial) group that are not in the RuleBreakdown&#39;s  contributions. Together with those contributions this forms the whole basis, with no overlap, so a  breach can be explained against the full picture (e.g. the non-equity remainder behind an equity limit).  Empty when the rule evaluated everything it considered. | [default to List<ComplianceRuleContribution>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResultWithContributions;
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
List<ComplianceRuleBreakdownWithContributions> ruleBreakdown = new List<ComplianceRuleBreakdownWithContributions>();
List<ComplianceRuleContribution> otherPositionsConsidered = new List<ComplianceRuleContribution>();


ComplianceSummaryRuleResultWithContributions complianceSummaryRuleResultWithContributionsInstance = new ComplianceSummaryRuleResultWithContributions()
    .ruleId(ruleId)
    .templateId(templateId)
    .variation(variation)
    .ruleStatus(ruleStatus)
    .affectedPortfolios(affectedPortfolios)
    .affectedOrders(affectedOrders)
    .parametersUsed(parametersUsed)
    .ruleBreakdown(ruleBreakdown)
    .otherPositionsConsidered(otherPositionsConsidered);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)