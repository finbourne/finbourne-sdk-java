# com.finbourne.sdk.services.insights.model.BooleanComparator
classname BooleanComparator
Filters a boolean field by comparing it to a supplied boolean value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.BooleanComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.BooleanOperation values (EqualTo, NotEqualTo); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | **Boolean** | The value to compare the field against. | [default to Boolean]

```java
import com.finbourne.sdk.services.insights.model.BooleanComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String operation = "example operation";
Boolean value = true;


BooleanComparator booleanComparatorInstance = new BooleanComparator()
    .operation(operation)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)