# com.finbourne.sdk.services.lusid.model.ComplianceComparisonOperand
classname ComplianceComparisonOperand
One side of a comparison: the sub-expression that produced it and, where the group carried the data to evaluate it,  its value. The value is absent for a non-numeric constant, a reference list, or an operand the group held no data for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** |  | [default to String]
**value** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceComparisonOperand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String expression = "example expression";
@javax.annotation.Nullable java.math.BigDecimal value = new java.math.BigDecimal("100.00");


ComplianceComparisonOperand complianceComparisonOperandInstance = new ComplianceComparisonOperand()
    .expression(expression)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)