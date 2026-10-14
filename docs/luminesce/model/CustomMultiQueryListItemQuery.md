# com.finbourne.sdk.services.luminesce.model.CustomMultiQueryListItemQuery
classname CustomMultiQueryListItemQuery
One of the queries of a Finbourne.Honeycomb.WebApi.BackgroundQueries.MultiQuery.CustomMultiQueryListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name given to the query in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**hasResult** | **Boolean** | Whether its results may be fetched | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.CustomMultiQueryListItemQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
BackgroundQueryState Boolean hasResult = true;


CustomMultiQueryListItemQuery customMultiQueryListItemQueryInstance = new CustomMultiQueryListItemQuery()
    .name(name)
    .state(state)
    .hasResult(hasResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)