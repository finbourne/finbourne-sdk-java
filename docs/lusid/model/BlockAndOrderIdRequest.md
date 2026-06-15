# com.finbourne.sdk.services.lusid.model.BlockAndOrderIdRequest
classname BlockAndOrderIdRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationBlockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.BlockAndOrderIdRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId destinationBlockId = new ResourceId();
ResourceId orderId = new ResourceId();


BlockAndOrderIdRequest blockAndOrderIdRequestInstance = new BlockAndOrderIdRequest()
    .destinationBlockId(destinationBlockId)
    .orderId(orderId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)