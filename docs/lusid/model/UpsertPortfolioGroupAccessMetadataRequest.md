# com.finbourne.sdk.services.lusid.model.UpsertPortfolioGroupAccessMetadataRequest
classname UpsertPortfolioGroupAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to portfolio groups that match the identifier | [default to List<AccessMetadataValue>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertPortfolioGroupAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AccessMetadataValue> metadata = new List<AccessMetadataValue>();


UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequestInstance = new UpsertPortfolioGroupAccessMetadataRequest()
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)