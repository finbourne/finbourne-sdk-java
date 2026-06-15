# com.finbourne.sdk.services.lusid.model.ResourceListOfListComplexMarketDataWithMetaDataResponse
classname ResourceListOfListComplexMarketDataWithMetaDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ListComplexMarketDataWithMetaDataResponse&gt;**](ListComplexMarketDataWithMetaDataResponse.md) |  | [default to List<ListComplexMarketDataWithMetaDataResponse>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfListComplexMarketDataWithMetaDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ListComplexMarketDataWithMetaDataResponse> values = new List<ListComplexMarketDataWithMetaDataResponse>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfListComplexMarketDataWithMetaDataResponse resourceListOfListComplexMarketDataWithMetaDataResponseInstance = new ResourceListOfListComplexMarketDataWithMetaDataResponse()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)