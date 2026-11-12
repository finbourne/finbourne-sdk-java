# com.finbourne.sdk.services.lusid.model.ComplianceRuleBreakdownWithContributions
classname ComplianceRuleBreakdownWithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **Integer** | A stable identifier for this group within the rule, matching the same group in the rule-result endpoint. | [default to Integer]
**status** | **String** | The status of this subset of results. | [default to String]
**groupKey** | [**ComplianceGroupKey**](ComplianceGroupKey.md) |  | [optional] [default to ComplianceGroupKey]
**nav** | **java.math.BigDecimal** | The portfolio net asset value the group sits within. Absent where no contribution carried it. | [optional] [default to java.math.BigDecimal]
**results** | **Map&lt;String, java.math.BigDecimal&gt;** | The valuation result totals the group aggregated. Omitted when empty. | [optional] [default to Map<String, java.math.BigDecimal>]
**comparisons** | [**List&lt;ComplianceComparison&gt;**](ComplianceComparison.md) | Every leaf comparison the check criterion made for this group, drawn from both the hard and the soft limit.  Omitted for a group no check reached. | [optional] [default to List<ComplianceComparison>]
**properties** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) | The property values the group aggregated. Omitted when empty. | [optional] [default to Map<String, List<Property>>]
**formulaValues** | **Map&lt;String, java.math.BigDecimal&gt;** | The value each formula within the check criterion evaluated to for this group. Omitted when empty. | [optional] [default to Map<String, java.math.BigDecimal>]
**contributions** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The per-position contributions aggregated into this rule breakdown group. Empty when the run  genuinely produced no contributions; a run with no recorded breakdown (e.g. one that predates  this feature) returns a 404 rather than this response. | [default to List<ComplianceRuleContribution>]
**missingDataInformation** | **List&lt;String&gt;** | List of string information detailing data that was missing from contributions processed in this rule. Omitted when empty. | [optional] [default to List<String>]
**contributionCount** | **Integer** | The number of contributions aggregated into this group, before any cap. | [default to Integer]
**contributionsTruncated** | **Boolean** | Whether the reported contributions were capped below ContributionCount. Always false today. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleBreakdownWithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer groupId = new Integer("100.00");
String status = "example status";
ComplianceGroupKey groupKey = new ComplianceGroupKey();
@javax.annotation.Nullable java.math.BigDecimal nav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, java.math.BigDecimal> results = new Map<String, java.math.BigDecimal>();
@javax.annotation.Nullable List<ComplianceComparison> comparisons = new List<ComplianceComparison>();
@javax.annotation.Nullable Map<String, List<Property>> properties = new Map<String, List<Property>>();
@javax.annotation.Nullable Map<String, java.math.BigDecimal> formulaValues = new Map<String, java.math.BigDecimal>();
List<ComplianceRuleContribution> contributions = new List<ComplianceRuleContribution>();
@javax.annotation.Nullable List<String> missingDataInformation = new List<String>();
Integer contributionCount = new Integer("100.00");
Boolean contributionsTruncated = true;


ComplianceRuleBreakdownWithContributions complianceRuleBreakdownWithContributionsInstance = new ComplianceRuleBreakdownWithContributions()
    .groupId(groupId)
    .status(status)
    .groupKey(groupKey)
    .nav(nav)
    .results(results)
    .comparisons(comparisons)
    .properties(properties)
    .formulaValues(formulaValues)
    .contributions(contributions)
    .missingDataInformation(missingDataInformation)
    .contributionCount(contributionCount)
    .contributionsTruncated(contributionsTruncated);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)