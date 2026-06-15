# com.finbourne.sdk.services.lusid.model.PlacementSetRequest
classname PlacementSetRequest
A request to create or update multiple Placements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;PlacementRequest&gt;**](PlacementRequest.md) | A collection of PlacementRequests. | [optional] [default to List<PlacementRequest>]

```java
import com.finbourne.sdk.services.lusid.model.PlacementSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<PlacementRequest> requests = new List<PlacementRequest>();


PlacementSetRequest placementSetRequestInstance = new PlacementSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)