# com.finbourne.sdk.services.insights.model.TextComparator
classname TextComparator
Filters a text field. Single-value operations (EqualTo, NotEqualTo, StartsWith, EndsWith) compare the field to Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Value; set operations (In, NotIn) compare it to Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Values. Exactly one of Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Value or Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Values is supplied, matching the chosen Finbourne.Insights.WebApi.Dtos.Querying.TextComparator.Operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and the supplied value(s). One of the Finbourne.Insights.WebApi.Dtos.Querying.TextOperation values (e.g. EqualTo, StartsWith, In); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **String** | The value to compare the field against, for the single-value operations (EqualTo, NotEqualTo, StartsWith, EndsWith). | [optional] [default to String]
**values** | **List&lt;String&gt;** | The set of values to compare the field against, for the set operations (In, NotIn). | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.insights.model.TextComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String operation = "example operation";
@javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable List<String> values = new List<String>();


TextComparator textComparatorInstance = new TextComparator()
    .operation(operation)
    .value(value)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)