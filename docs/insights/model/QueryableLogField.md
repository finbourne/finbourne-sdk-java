# com.finbourne.sdk.services.insights.model.QueryableLogField
classname QueryableLogField
Describes a field of a log type that can be selected and (where Finbourne.Insights.WebApi.Dtos.Querying.QueryableLogField.Filterable is set) filtered when querying logs, including the comparator operations available for it. Returned by the queryable-fields metadata endpoint so a UI can advertise the correct comparators for each field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field, as used when requesting it or filtering on it (case-insensitive). | [default to String]
**dataType** | **String** | The data type of the field: Text, Numeric, Date or Boolean. | [default to String]
**supportedOperations** | **List&lt;String&gt;** | The comparator operations available for this field. Empty when the field is not filterable. | [default to List<String>]
**filterable** | **Boolean** | Whether the field can be used in a filter. | [optional] [default to Boolean]
**alwaysReturned** | **Boolean** | Whether the field is always returned (and therefore need not be requested). | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.insights.model.QueryableLogField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String dataType = "example dataType";
List<String> supportedOperations = new List<String>();
Boolean filterable = true;
Boolean alwaysReturned = true;


QueryableLogField queryableLogFieldInstance = new QueryableLogField()
    .name(name)
    .dataType(dataType)
    .supportedOperations(supportedOperations)
    .filterable(filterable)
    .alwaysReturned(alwaysReturned);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)