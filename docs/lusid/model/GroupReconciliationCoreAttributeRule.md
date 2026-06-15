# com.finbourne.sdk.services.lusid.model.GroupReconciliationCoreAttributeRule
classname GroupReconciliationCoreAttributeRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationCoreComparisonRuleOperand**](GroupReconciliationCoreComparisonRuleOperand.md) |  | [default to GroupReconciliationCoreComparisonRuleOperand]
**right** | [**GroupReconciliationCoreComparisonRuleOperand**](GroupReconciliationCoreComparisonRuleOperand.md) |  | [default to GroupReconciliationCoreComparisonRuleOperand]
**allowableStringMappings** | [**List&lt;GroupReconciliationComparisonRuleStringValueMap&gt;**](GroupReconciliationComparisonRuleStringValueMap.md) | The string mappings to use when comparing | [optional] [default to List<GroupReconciliationComparisonRuleStringValueMap>]
**isComparisonCaseSensitive** | **Boolean** | Whether the compare keys and strings mappings case sensitive or not | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationCoreAttributeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationCoreComparisonRuleOperand left = new GroupReconciliationCoreComparisonRuleOperand();
GroupReconciliationCoreComparisonRuleOperand right = new GroupReconciliationCoreComparisonRuleOperand();
@javax.annotation.Nullable List<GroupReconciliationComparisonRuleStringValueMap> allowableStringMappings = new List<GroupReconciliationComparisonRuleStringValueMap>();
Boolean isComparisonCaseSensitive = true;


GroupReconciliationCoreAttributeRule groupReconciliationCoreAttributeRuleInstance = new GroupReconciliationCoreAttributeRule()
    .left(left)
    .right(right)
    .allowableStringMappings(allowableStringMappings)
    .isComparisonCaseSensitive(isComparisonCaseSensitive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)