# com.finbourne.sdk.services.lusid.model.UpdateMatchingRulesetRequest
classname UpdateMatchingRulesetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the matching ruleset. | [default to String]
**recType** | **String** | The type of reconciliation to perform. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**datasetSchemas** | [**RecDatasetSchemas**](RecDatasetSchemas.md) |  | [optional] [default to RecDatasetSchemas]
**filters** | [**GroupReconciliationFilters**](GroupReconciliationFilters.md) |  | [optional] [default to GroupReconciliationFilters]
**coreRules** | [**List&lt;CoreMatchingRule&gt;**](CoreMatchingRule.md) | The core comparison rules evaluated as derivation formulae against each side of the reconciliation. | [default to List<CoreMatchingRule>]
**aggregateRules** | [**List&lt;AggregateMatchingRule&gt;**](AggregateMatchingRule.md) | The aggregate comparison rules evaluated as derivation formulae against values on each side of the reconciliation and operation to aggregate those values. | [default to List<AggregateMatchingRule>]
**coreTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to core rule matching, in the specified order. | [optional] [default to List<ToleranceBase>]
**aggregateTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to aggregate rule matching. | [optional] [default to List<ToleranceBase>]
**allowPartialMatching** | **Boolean** | Whether to permit partial matches when applying rules. | [optional] [default to Boolean]
**supplementalAttributes** | [**List&lt;SupplementalAttribute&gt;**](SupplementalAttribute.md) | Supplemental attributes that decorate reconciliation results with additional values without participating in the reconciliation itself. | [optional] [default to List<SupplementalAttribute>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateMatchingRulesetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String recType = "example recType";
RecDatasetSchemas datasetSchemas = new RecDatasetSchemas();
GroupReconciliationFilters filters = new GroupReconciliationFilters();
List<CoreMatchingRule> coreRules = new List<CoreMatchingRule>();
List<AggregateMatchingRule> aggregateRules = new List<AggregateMatchingRule>();
@javax.annotation.Nullable List<ToleranceBase> coreTolerances = new List<ToleranceBase>();
@javax.annotation.Nullable List<ToleranceBase> aggregateTolerances = new List<ToleranceBase>();
Boolean allowPartialMatching = true;
@javax.annotation.Nullable List<SupplementalAttribute> supplementalAttributes = new List<SupplementalAttribute>();


UpdateMatchingRulesetRequest updateMatchingRulesetRequestInstance = new UpdateMatchingRulesetRequest()
    .displayName(displayName)
    .recType(recType)
    .datasetSchemas(datasetSchemas)
    .filters(filters)
    .coreRules(coreRules)
    .aggregateRules(aggregateRules)
    .coreTolerances(coreTolerances)
    .aggregateTolerances(aggregateTolerances)
    .allowPartialMatching(allowPartialMatching)
    .supplementalAttributes(supplementalAttributes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)