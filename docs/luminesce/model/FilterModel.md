# com.finbourne.sdk.services.luminesce.model.FilterModel
classname FilterModel
Representation of the data used in a filter for the where clause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterType** | [**FilterType**](FilterType.md) |  | [default to FilterType]
**type** | [**Type**](Type.md) |  | [optional] [default to Type]
**filter** | **String** | The filter value | [optional] [default to String]
**filterTo** | **java.math.BigDecimal** | The upper bound filter value for the number filter type | [optional] [default to java.math.BigDecimal]
**values** | **List&lt;String&gt;** | An array of possible values for the set filter type | [optional] [default to List<String>]
**dateFrom** | **String** | A lower bound date for the date filter type | [optional] [default to String]
**dateTo** | **String** | An upper bound date for the date filter type | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.FilterModel;
import java.util.*;
import java.lang.System;
import java.net.URI;

FilterType Type @javax.annotation.Nullable String filter = "example filter";
@javax.annotation.Nullable java.math.BigDecimal filterTo = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<String> values = new List<String>();
@javax.annotation.Nullable String dateFrom = "example dateFrom";
@javax.annotation.Nullable String dateTo = "example dateTo";


FilterModel filterModelInstance = new FilterModel()
    .filterType(filterType)
    .type(type)
    .filter(filter)
    .filterTo(filterTo)
    .values(values)
    .dateFrom(dateFrom)
    .dateTo(dateTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)