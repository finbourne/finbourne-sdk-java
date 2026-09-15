# com.finbourne.sdk.services.lusid.model.GetTransferRequest
classname GetTransferRequest
The transfer to read. Every part of its identity is required: a transfer is identified by its scope, its code  and the two portfolios its in and out transaction are booked into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.GetTransferRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transferId = new ResourceId();
ResourceId portfolioIdOut = new ResourceId();
ResourceId portfolioIdIn = new ResourceId();
@javax.annotation.Nullable List<String> propertyKeys = new List<String>();


GetTransferRequest getTransferRequestInstance = new GetTransferRequest()
    .transferId(transferId)
    .portfolioIdOut(portfolioIdOut)
    .portfolioIdIn(portfolioIdIn)
    .propertyKeys(propertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)