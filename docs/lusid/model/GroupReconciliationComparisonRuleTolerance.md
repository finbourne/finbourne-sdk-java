# com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleTolerance
classname GroupReconciliationComparisonRuleTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of tolerance to allow. Available values: Relative, Absolute. | [default to String]
**value** | **java.math.BigDecimal** | The decimal value of how much tolerance to allow when comparing in relative (i.e percentage) or absolute terms depending on the ToleranceType specified | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");


GroupReconciliationComparisonRuleTolerance groupReconciliationComparisonRuleToleranceInstance = new GroupReconciliationComparisonRuleTolerance()
    .type(type)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)