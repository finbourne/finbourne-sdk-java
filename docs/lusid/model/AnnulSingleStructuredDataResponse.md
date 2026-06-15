# com.finbourne.sdk.services.lusid.model.AnnulSingleStructuredDataResponse
classname AnnulSingleStructuredDataResponse
The response to a request to annul (delete) a set of structured data from Lusid. This might have been for market data or some other structured entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the identifier was annulled | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AnnulSingleStructuredDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
OffsetDateTime value = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AnnulSingleStructuredDataResponse annulSingleStructuredDataResponseInstance = new AnnulSingleStructuredDataResponse()
    .href(href)
    .value(value)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)