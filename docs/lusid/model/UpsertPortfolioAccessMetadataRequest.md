# com.finbourne.sdk.services.lusid.model.UpsertPortfolioAccessMetadataRequest
classname UpsertPortfolioAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to portfolios that match the identifier | [default to List<AccessMetadataValue>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertPortfolioAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AccessMetadataValue> metadata = new List<AccessMetadataValue>();


UpsertPortfolioAccessMetadataRequest upsertPortfolioAccessMetadataRequestInstance = new UpsertPortfolioAccessMetadataRequest()
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)