# com.finbourne.sdk.services.lusid.model.UpsertCustomEntitiesResponse
classname UpsertCustomEntitiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities which have been successfully updated or created. | [optional] [default to Map<String, CustomEntityResponse>]
**staged** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities that have been staged for update or creation. | [optional] [default to Map<String, CustomEntityResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The custom-entities that could not be updated or created or were left unchanged without error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCustomEntitiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, CustomEntityResponse> values = new Map<String, CustomEntityResponse>();
@javax.annotation.Nullable Map<String, CustomEntityResponse> staged = new Map<String, CustomEntityResponse>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertCustomEntitiesResponse upsertCustomEntitiesResponseInstance = new UpsertCustomEntitiesResponse()
    .href(href)
    .values(values)
    .staged(staged)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)