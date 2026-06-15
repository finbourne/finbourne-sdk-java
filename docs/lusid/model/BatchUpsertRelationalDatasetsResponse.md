# com.finbourne.sdk.services.lusid.model.BatchUpsertRelationalDatasetsResponse
classname BatchUpsertRelationalDatasetsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, RelationalDataPointResponse&gt;**](RelationalDataPointResponse.md) | A list of data points that were successfully upserted. | [default to Map<String, RelationalDataPointResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A list of data points that failed to be upserted, along with the associated error message. | [optional] [default to Map<String, ErrorDetail>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertRelationalDatasetsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, RelationalDataPointResponse> values = new Map<String, RelationalDataPointResponse>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertRelationalDatasetsResponse batchUpsertRelationalDatasetsResponseInstance = new BatchUpsertRelationalDatasetsResponse()
    .values(values)
    .failed(failed)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)