# com.finbourne.sdk.services.lusid.model.BatchUpsertPortfolioAccessMetadataRequest
classname BatchUpsertPortfolioAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**metadata** | [**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md) |  | [default to Map<String, List<AccessMetadataValue>>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertPortfolioAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
Map<String, List<AccessMetadataValue>> metadata = new Map<String, List<AccessMetadataValue>>();


BatchUpsertPortfolioAccessMetadataRequest batchUpsertPortfolioAccessMetadataRequestInstance = new BatchUpsertPortfolioAccessMetadataRequest()
    .portfolioId(portfolioId)
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)