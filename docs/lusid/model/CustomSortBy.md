# com.finbourne.sdk.services.lusid.model.CustomSortBy
classname CustomSortBy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the field to sort by. | [default to String]
**priorityValues** | **List&lt;String&gt;** | An optional list of priority field values to sort by, in the order they should be prioritized. | [optional] [default to List<String>]
**remainderOrder** | **String** | The sorting direction for the remaining field values. Either ascending (ASC) or descending (DESC). Available values: ASC, DESC. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CustomSortBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable List<String> priorityValues = new List<String>();
String remainderOrder = "example remainderOrder";


CustomSortBy customSortByInstance = new CustomSortBy()
    .fieldName(fieldName)
    .priorityValues(priorityValues)
    .remainderOrder(remainderOrder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)