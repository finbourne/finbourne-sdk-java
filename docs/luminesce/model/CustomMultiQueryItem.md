# com.finbourne.sdk.services.luminesce.model.CustomMultiQueryItem
classname CustomMultiQueryItem
One query within a Finbourne.Honeycomb.WebApi.BackgroundQueries.MultiQuery.CustomMultiQueryRequest, given as either raw LuminesceSql or a saved query reference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Unique name of the query, of at most 31 characters. Later queries refer to this one&#39;s results as &#x60;@Name&#x60;, and it names the result in any export. | [default to String]
**sql** | **String** | The LuminesceSql to run.  Exactly one of this and &#x60;SavedQuery&#x60; must be given. | [optional] [default to String]
**savedQuery** | **String** | A key within the Saved Queries (of the Workspaces API) to load the SQL from.  Exactly one of this and &#x60;Sql&#x60; must be given. e.g. &#x60;personal/YourUserId/items/queries/SomeQuery&#x60; or &#x60;shared/SomeWorkspace/items/queries/SomeQuery&#x60;. | [optional] [default to String]
**isExternalResult** | **Boolean** | Should the results of this query be fetchable / exported?  If false it is only an intermediate step for later queries. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.CustomMultiQueryItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String sql = "example sql";
@javax.annotation.Nullable String savedQuery = "example savedQuery";
Boolean isExternalResult = true;


CustomMultiQueryItem customMultiQueryItemInstance = new CustomMultiQueryItem()
    .name(name)
    .sql(sql)
    .savedQuery(savedQuery)
    .isExternalResult(isExternalResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)