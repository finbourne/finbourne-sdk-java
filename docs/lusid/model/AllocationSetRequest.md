# com.finbourne.sdk.services.lusid.model.AllocationSetRequest
classname AllocationSetRequest
A request to create or update multiple Allocations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationRequests** | [**List&lt;AllocationRequest&gt;**](AllocationRequest.md) | A collection of AllocationRequests. | [optional] [default to List<AllocationRequest>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<AllocationRequest> allocationRequests = new List<AllocationRequest>();


AllocationSetRequest allocationSetRequestInstance = new AllocationSetRequest()
    .allocationRequests(allocationRequests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)