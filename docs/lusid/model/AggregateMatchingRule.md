# com.finbourne.sdk.services.lusid.model.AggregateMatchingRule
classname AggregateMatchingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The reference name of the rule. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**leftOperation** | **String** | Group-level operation applied to the left side&#39;s per-item values during reconciliation, e.g. Sum, Average, Count. Available values: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]
**rightOperation** | **String** | Group-level operation applied to the right side&#39;s per-item values during reconciliation, e.g. Sum, Average, Count. Available values: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregateMatchingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleName = "example ruleName";
String leftFormula = "example leftFormula";
String leftOperation = "example leftOperation";
String rightFormula = "example rightFormula";
String rightOperation = "example rightOperation";


AggregateMatchingRule aggregateMatchingRuleInstance = new AggregateMatchingRule()
    .ruleName(ruleName)
    .leftFormula(leftFormula)
    .leftOperation(leftOperation)
    .rightFormula(rightFormula)
    .rightOperation(rightOperation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)