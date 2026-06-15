# com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateAttributeRule
classname GroupReconciliationAggregateAttributeRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationAggregateComparisonRuleOperand**](GroupReconciliationAggregateComparisonRuleOperand.md) |  | [default to GroupReconciliationAggregateComparisonRuleOperand]
**right** | [**GroupReconciliationAggregateComparisonRuleOperand**](GroupReconciliationAggregateComparisonRuleOperand.md) |  | [default to GroupReconciliationAggregateComparisonRuleOperand]
**tolerance** | [**GroupReconciliationComparisonRuleTolerance**](GroupReconciliationComparisonRuleTolerance.md) |  | [optional] [default to GroupReconciliationComparisonRuleTolerance]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateAttributeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationAggregateComparisonRuleOperand left = new GroupReconciliationAggregateComparisonRuleOperand();
GroupReconciliationAggregateComparisonRuleOperand right = new GroupReconciliationAggregateComparisonRuleOperand();
GroupReconciliationComparisonRuleTolerance tolerance = new GroupReconciliationComparisonRuleTolerance();


GroupReconciliationAggregateAttributeRule groupReconciliationAggregateAttributeRuleInstance = new GroupReconciliationAggregateAttributeRule()
    .left(left)
    .right(right)
    .tolerance(tolerance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)