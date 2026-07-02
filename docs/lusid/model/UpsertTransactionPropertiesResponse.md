# com.finbourne.sdk.services.lusid.model.UpsertTransactionPropertiesResponse
classname UpsertTransactionPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties that were upserted on the transaction. | [optional] [default to Map<String, PerpetualProperty>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to the upsert event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTransactionPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertTransactionPropertiesResponse upsertTransactionPropertiesResponseInstance = new UpsertTransactionPropertiesResponse()
    .href(href)
    .version(version)
    .properties(properties)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)