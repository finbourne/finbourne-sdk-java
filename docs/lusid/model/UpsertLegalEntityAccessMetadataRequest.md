# com.finbourne.sdk.services.lusid.model.UpsertLegalEntityAccessMetadataRequest
classname UpsertLegalEntityAccessMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) | The access control metadata to assign to a Legal Entity that matches the identifier | [optional] [default to List<AccessMetadataValue>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertLegalEntityAccessMetadataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<AccessMetadataValue> metadata = new List<AccessMetadataValue>();


UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequestInstance = new UpsertLegalEntityAccessMetadataRequest()
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)