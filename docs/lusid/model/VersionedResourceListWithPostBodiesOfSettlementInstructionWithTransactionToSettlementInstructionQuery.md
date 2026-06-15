# com.finbourne.sdk.services.lusid.model.VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery
classname VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;SettlementInstructionWithTransaction&gt;**](SettlementInstructionWithTransaction.md) | The resources to list. | [default to List<SettlementInstructionWithTransaction>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**postBody** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**nextPage** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**previousPage** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
List<SettlementInstructionWithTransaction> values = new List<SettlementInstructionWithTransaction>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
SettlementInstructionQuery postBody = new SettlementInstructionQuery();
SettlementInstructionQuery nextPage = new SettlementInstructionQuery();
SettlementInstructionQuery previousPage = new SettlementInstructionQuery();
@javax.annotation.Nullable List<Link> links = new List<Link>();


VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery versionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQueryInstance = new VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery()
    .version(version)
    .values(values)
    .href(href)
    .postBody(postBody)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)