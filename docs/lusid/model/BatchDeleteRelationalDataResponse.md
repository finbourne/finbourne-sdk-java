# com.finbourne.sdk.services.lusid.model.BatchDeleteRelationalDataResponse
classname BatchDeleteRelationalDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **Map&lt;String, String&gt;** | A list of data points that were successfully upserted. | [default to Map<String, String>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A list of data points that failed to be upserted, along with the associated error message. | [optional] [default to Map<String, ErrorDetail>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]

```java
import com.finbourne.sdk.services.lusid.model.BatchDeleteRelationalDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> values = new Map<String, String>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");


BatchDeleteRelationalDataResponse batchDeleteRelationalDataResponseInstance = new BatchDeleteRelationalDataResponse()
    .values(values)
    .failed(failed)
    .href(href);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)