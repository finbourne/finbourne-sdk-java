# com.finbourne.sdk.services.horizon.model.PagedResourceListOfTpfFileDeliveryResponse
classname PagedResourceListOfTpfFileDeliveryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;TpfFileDeliveryResponse&gt;**](TpfFileDeliveryResponse.md) |  | [default to List<TpfFileDeliveryResponse>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.horizon.model.PagedResourceListOfTpfFileDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<TpfFileDeliveryResponse> values = new List<TpfFileDeliveryResponse>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfTpfFileDeliveryResponse pagedResourceListOfTpfFileDeliveryResponseInstance = new PagedResourceListOfTpfFileDeliveryResponse()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)