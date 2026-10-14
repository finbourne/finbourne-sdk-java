# com.finbourne.sdk.services.luminesce.model.CustomMultiQueryListItem
classname CustomMultiQueryListItem
A custom multi-query the calling user currently has results of available to them

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the multi-query, its queries having ExecutionIds of &#x60;{ExecutionId}_{Name}&#x60; | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When it was started (UTC) | [optional] [default to OffsetDateTime]
**when** | [**OffsetDateTime**](OffsetDateTime.md) | When the state of it was last updated (UTC) | [optional] [default to OffsetDateTime]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When it (and the data of its queries) may be removed (UTC) | [optional] [default to OffsetDateTime]
**queries** | [**List&lt;CustomMultiQueryListItemQuery&gt;**](CustomMultiQueryListItemQuery.md) | Its queries whose results may be fetched (those that are external results), in request order | [optional] [default to List<CustomMultiQueryListItemQuery>]

```java
import com.finbourne.sdk.services.luminesce.model.CustomMultiQueryListItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String executionId = "example executionId";
@javax.annotation.Nullable String queryName = "example queryName";
BackgroundQueryState @javax.annotation.Nullable OffsetDateTime startedAt = OffsetDateTime.now();
OffsetDateTime when = OffsetDateTime.now();
OffsetDateTime expiresAt = OffsetDateTime.now();
@javax.annotation.Nullable List<CustomMultiQueryListItemQuery> queries = new List<CustomMultiQueryListItemQuery>();


CustomMultiQueryListItem customMultiQueryListItemInstance = new CustomMultiQueryListItem()
    .executionId(executionId)
    .queryName(queryName)
    .state(state)
    .startedAt(startedAt)
    .when(when)
    .expiresAt(expiresAt)
    .queries(queries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)