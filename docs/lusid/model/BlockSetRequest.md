# com.finbourne.sdk.services.lusid.model.BlockSetRequest
classname BlockSetRequest
A request to create or update multiple Blocks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;BlockRequest&gt;**](BlockRequest.md) | A collection of BlockRequests. | [optional] [default to List<BlockRequest>]

```java
import com.finbourne.sdk.services.lusid.model.BlockSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<BlockRequest> requests = new List<BlockRequest>();


BlockSetRequest blockSetRequestInstance = new BlockSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)