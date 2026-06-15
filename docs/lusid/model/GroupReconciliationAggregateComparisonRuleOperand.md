# com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateComparisonRuleOperand
classname GroupReconciliationAggregateComparisonRuleOperand

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the value to compare | [default to String]
**operation** | **String** | What to do with the value pointed to by the key, e.g. Sum. Only \&quot;Value is allowed for core rules\&quot;. Available values: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateComparisonRuleOperand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String operation = "example operation";


GroupReconciliationAggregateComparisonRuleOperand groupReconciliationAggregateComparisonRuleOperandInstance = new GroupReconciliationAggregateComparisonRuleOperand()
    .key(key)
    .operation(operation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)