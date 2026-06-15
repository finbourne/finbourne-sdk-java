# com.finbourne.sdk.services.lusid.model.ReconcileNumericRule
classname ReconcileNumericRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleType** | **String** | Available values: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact. | [default to String]
**comparisonType** | **String** | Available values: Exact, AbsoluteDifference, RelativeDifference. | [default to String]
**tolerance** | **java.math.BigDecimal** | For a numeric type only (i.e. decimal, integer, date or datetime offset possibly controversially), this is the quantity used in the comparison.  The units of the tolerance must be set appropriately for the item being compared.  For a number such as a currency or amount that will be a simple quantity, for a DateTime or DateTimeOffset it should be days. If fewer than a single day then this should be  passed as a fraction. | [optional] [default to java.math.BigDecimal]
**appliesTo** | [**AggregateSpec**](AggregateSpec.md) |  | [default to AggregateSpec]

```java
import com.finbourne.sdk.services.lusid.model.ReconcileNumericRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String comparisonType = "example comparisonType";
java.math.BigDecimal tolerance = new java.math.BigDecimal("100.00");
AggregateSpec appliesTo = new AggregateSpec();


ReconcileNumericRule reconcileNumericRuleInstance = new ReconcileNumericRule()
    .comparisonType(comparisonType)
    .tolerance(tolerance)
    .appliesTo(appliesTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)