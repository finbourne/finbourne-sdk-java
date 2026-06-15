# com.finbourne.sdk.services.lusid.model.BatchUpsertPortfolioAccessMetadataResponse
classname BatchUpsertPortfolioAccessMetadataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, BatchUpsertPortfolioAccessMetadataResponseItem&gt;**](BatchUpsertPortfolioAccessMetadataResponseItem.md) | The items have been successfully updated or created. | [optional] [default to Map<String, BatchUpsertPortfolioAccessMetadataResponseItem>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The items that could not be updated or created along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertPortfolioAccessMetadataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, BatchUpsertPortfolioAccessMetadataResponseItem> values = new Map<String, BatchUpsertPortfolioAccessMetadataResponseItem>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertPortfolioAccessMetadataResponse batchUpsertPortfolioAccessMetadataResponseInstance = new BatchUpsertPortfolioAccessMetadataResponse()
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)