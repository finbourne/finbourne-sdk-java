# com.finbourne.sdk.services.lusid.model.ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery
classname ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery
A version of the resource list for use with list endpoints that use the POST verb instead of GET, allowing  the endpoint to return the POST body(s) that can be sent in conjunction with the Next Page and/or Previous  Page links to retrieve the next/previous page of results. This should make it easier for SDK consumers to  fluently page through results. The PagedResourceList only exposes a page token string, typically for use in  a query parameter, and thus is more suited to GET endpoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;SettlementActivity&gt;**](SettlementActivity.md) | The resources to list. | [default to List<SettlementActivity>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**postBody** | [**SettlementActivityQuery**](SettlementActivityQuery.md) |  | [optional] [default to SettlementActivityQuery]
**nextPage** | [**SettlementActivityQuery**](SettlementActivityQuery.md) |  | [optional] [default to SettlementActivityQuery]
**previousPage** | [**SettlementActivityQuery**](SettlementActivityQuery.md) |  | [optional] [default to SettlementActivityQuery]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<SettlementActivity> values = new List<SettlementActivity>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
SettlementActivityQuery postBody = new SettlementActivityQuery();
SettlementActivityQuery nextPage = new SettlementActivityQuery();
SettlementActivityQuery previousPage = new SettlementActivityQuery();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery resourceListWithPostBodiesOfSettlementActivityToSettlementActivityQueryInstance = new ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery()
    .values(values)
    .href(href)
    .postBody(postBody)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)