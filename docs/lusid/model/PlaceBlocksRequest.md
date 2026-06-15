# com.finbourne.sdk.services.lusid.model.PlaceBlocksRequest
classname PlaceBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;PlacementRequest&gt;**](PlacementRequest.md) | A collection of PlacementRequest. | [default to List<PlacementRequest>]

```java
import com.finbourne.sdk.services.lusid.model.PlaceBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PlacementRequest> requests = new List<PlacementRequest>();


PlaceBlocksRequest placeBlocksRequestInstance = new PlaceBlocksRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)