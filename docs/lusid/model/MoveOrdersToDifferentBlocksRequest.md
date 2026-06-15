# com.finbourne.sdk.services.lusid.model.MoveOrdersToDifferentBlocksRequest
classname MoveOrdersToDifferentBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;BlockAndOrderIdRequest&gt;**](BlockAndOrderIdRequest.md) | A collection of BlockAndOrderId. | [default to List<BlockAndOrderIdRequest>]

```java
import com.finbourne.sdk.services.lusid.model.MoveOrdersToDifferentBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<BlockAndOrderIdRequest> requests = new List<BlockAndOrderIdRequest>();


MoveOrdersToDifferentBlocksRequest moveOrdersToDifferentBlocksRequestInstance = new MoveOrdersToDifferentBlocksRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)