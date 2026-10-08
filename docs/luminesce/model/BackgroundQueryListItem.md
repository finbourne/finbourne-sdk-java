# com.finbourne.sdk.services.luminesce.model.BackgroundQueryListItem
classname BackgroundQueryListItem
A background query the calling user currently has available to them

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the query | [optional] [default to String]
**query** | **String** | The LuminesceSql of the original request | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**when** | [**OffsetDateTime**](OffsetDateTime.md) | When the state of this query (and so its data) was last updated (UTC) | [optional] [default to OffsetDateTime]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the query (and its data) may be removed (UTC) | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundQueryListItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String executionId = "example executionId";
@javax.annotation.Nullable String query = "example query";
@javax.annotation.Nullable String queryName = "example queryName";
BackgroundQueryState OffsetDateTime when = OffsetDateTime.now();
OffsetDateTime expiresAt = OffsetDateTime.now();


BackgroundQueryListItem backgroundQueryListItemInstance = new BackgroundQueryListItem()
    .executionId(executionId)
    .query(query)
    .queryName(queryName)
    .state(state)
    .when(when)
    .expiresAt(expiresAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)