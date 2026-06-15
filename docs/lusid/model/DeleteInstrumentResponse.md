# com.finbourne.sdk.services.lusid.model.DeleteInstrumentResponse
classname DeleteInstrumentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which the instrument was deleted. | [default to OffsetDateTime]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteInstrumentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
OffsetDateTime asAt = OffsetDateTime.now();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteInstrumentResponse deleteInstrumentResponseInstance = new DeleteInstrumentResponse()
    .href(href)
    .asAt(asAt)
    .stagedModifications(stagedModifications)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)