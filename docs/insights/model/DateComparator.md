# com.finbourne.sdk.services.insights.model.DateComparator
classname DateComparator
Filters a date/time field by comparing it to a supplied date/time value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** | The comparison to apply between the field and Finbourne.Insights.WebApi.Dtos.Querying.DateComparator.Value. One of the Finbourne.Insights.WebApi.Dtos.Querying.DateOperation values (e.g. Before, OnOrAfter); discoverable via the queryable-fields metadata endpoint. | [default to String]
**value** | [**OffsetDateTime**](OffsetDateTime.md) | The value to compare the field against. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.insights.model.DateComparator;
import java.util.*;
import java.lang.System;
import java.net.URI;

String operation = "example operation";
OffsetDateTime value = OffsetDateTime.now();


DateComparator dateComparatorInstance = new DateComparator()
    .operation(operation)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)