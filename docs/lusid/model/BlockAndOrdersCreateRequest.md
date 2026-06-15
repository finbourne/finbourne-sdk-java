# com.finbourne.sdk.services.lusid.model.BlockAndOrdersCreateRequest
classname BlockAndOrdersCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;BlockAndOrdersRequest&gt;**](BlockAndOrdersRequest.md) | A collection of BlockAndOrdersRequest. | [default to List<BlockAndOrdersRequest>]

```java
import com.finbourne.sdk.services.lusid.model.BlockAndOrdersCreateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<BlockAndOrdersRequest> requests = new List<BlockAndOrdersRequest>();


BlockAndOrdersCreateRequest blockAndOrdersCreateRequestInstance = new BlockAndOrdersCreateRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)