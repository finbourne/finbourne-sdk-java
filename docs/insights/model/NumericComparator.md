# com.finbourne.sdk.services.insights.model.NumericComparator
classname NumericComparator
Filters a numeric field by comparing it to a supplied numeric value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.NumericComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.NumericOperation values (e.g. EqualTo, GreaterThan); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **java.math.BigDecimal** | The value to compare the field against. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.insights.model.NumericComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String operation = "example operation";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");


NumericComparator numericComparatorInstance = new NumericComparator()
    .operation(operation)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)