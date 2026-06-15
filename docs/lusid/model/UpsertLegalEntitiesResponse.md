# com.finbourne.sdk.services.lusid.model.UpsertLegalEntitiesResponse
classname UpsertLegalEntitiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, LegalEntity&gt;**](LegalEntity.md) | The legal entities which have been successfully updated or created. | [optional] [default to Map<String, LegalEntity>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The legal entities that could not be updated or created or were left unchanged without error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertLegalEntitiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, LegalEntity> values = new Map<String, LegalEntity>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertLegalEntitiesResponse upsertLegalEntitiesResponseInstance = new UpsertLegalEntitiesResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)