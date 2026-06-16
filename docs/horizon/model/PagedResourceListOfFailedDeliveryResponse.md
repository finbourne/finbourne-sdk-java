# com.finbourne.sdk.services.horizon.model.PagedResourceListOfFailedDeliveryResponse
classname PagedResourceListOfFailedDeliveryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;FailedDeliveryResponse&gt;**](FailedDeliveryResponse.md) |  | [default to List<FailedDeliveryResponse>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.horizon.model.PagedResourceListOfFailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<FailedDeliveryResponse> values = new List<FailedDeliveryResponse>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfFailedDeliveryResponse pagedResourceListOfFailedDeliveryResponseInstance = new PagedResourceListOfFailedDeliveryResponse()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)