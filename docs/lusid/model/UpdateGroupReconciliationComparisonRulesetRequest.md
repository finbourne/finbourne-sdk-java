# com.finbourne.sdk.services.lusid.model.UpdateGroupReconciliationComparisonRulesetRequest
classname UpdateGroupReconciliationComparisonRulesetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the ruleset | [default to String]
**reconciliationType** | **String** | The type of reconciliation to perform. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**filters** | [**GroupReconciliationFilters**](GroupReconciliationFilters.md) |  | [optional] [default to GroupReconciliationFilters]
**coreAttributeRules** | [**List&lt;GroupReconciliationCoreAttributeRule&gt;**](GroupReconciliationCoreAttributeRule.md) | The core comparison rules | [default to List<GroupReconciliationCoreAttributeRule>]
**aggregateAttributeRules** | [**List&lt;GroupReconciliationAggregateAttributeRule&gt;**](GroupReconciliationAggregateAttributeRule.md) | The aggregate comparison rules | [default to List<GroupReconciliationAggregateAttributeRule>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateGroupReconciliationComparisonRulesetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String reconciliationType = "example reconciliationType";
GroupReconciliationFilters filters = new GroupReconciliationFilters();
List<GroupReconciliationCoreAttributeRule> coreAttributeRules = new List<GroupReconciliationCoreAttributeRule>();
List<GroupReconciliationAggregateAttributeRule> aggregateAttributeRules = new List<GroupReconciliationAggregateAttributeRule>();


UpdateGroupReconciliationComparisonRulesetRequest updateGroupReconciliationComparisonRulesetRequestInstance = new UpdateGroupReconciliationComparisonRulesetRequest()
    .displayName(displayName)
    .reconciliationType(reconciliationType)
    .filters(filters)
    .coreAttributeRules(coreAttributeRules)
    .aggregateAttributeRules(aggregateAttributeRules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)