# com.finbourne.sdk.services.lusid.model.DeleteInstrumentsResponse
classname DeleteInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which the instrument was deleted. | [default to OffsetDateTime]
**staged** | [**Map&lt;String, StagedModificationsInfo&gt;**](StagedModificationsInfo.md) | Information about the pending staged modifications for the current entity. | [optional] [readonly] [default to Map<String, StagedModificationsInfo>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteInstrumentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, StagedModificationsInfo> staged = new Map<String, StagedModificationsInfo>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteInstrumentsResponse deleteInstrumentsResponseInstance = new DeleteInstrumentsResponse()
    .href(href)
    .asAt(asAt)
    .staged(staged)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)