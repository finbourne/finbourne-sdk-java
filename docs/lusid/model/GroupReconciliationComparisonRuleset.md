# com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleset
classname GroupReconciliationComparisonRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the ruleset | [default to String]
**reconciliationType** | **String** | The type of reconciliation to perform. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**filters** | [**GroupReconciliationFilters**](GroupReconciliationFilters.md) |  | [optional] [default to GroupReconciliationFilters]
**coreAttributeRules** | [**List&lt;GroupReconciliationCoreAttributeRule&gt;**](GroupReconciliationCoreAttributeRule.md) | The core comparison rules | [default to List<GroupReconciliationCoreAttributeRule>]
**aggregateAttributeRules** | [**List&lt;GroupReconciliationAggregateAttributeRule&gt;**](GroupReconciliationAggregateAttributeRule.md) | The aggregate comparison rules | [default to List<GroupReconciliationAggregateAttributeRule>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleset;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
String reconciliationType = "example reconciliationType";
GroupReconciliationFilters filters = new GroupReconciliationFilters();
List<GroupReconciliationCoreAttributeRule> coreAttributeRules = new List<GroupReconciliationCoreAttributeRule>();
List<GroupReconciliationAggregateAttributeRule> aggregateAttributeRules = new List<GroupReconciliationAggregateAttributeRule>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GroupReconciliationComparisonRuleset groupReconciliationComparisonRulesetInstance = new GroupReconciliationComparisonRuleset()
    .id(id)
    .displayName(displayName)
    .reconciliationType(reconciliationType)
    .filters(filters)
    .coreAttributeRules(coreAttributeRules)
    .aggregateAttributeRules(aggregateAttributeRules)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)