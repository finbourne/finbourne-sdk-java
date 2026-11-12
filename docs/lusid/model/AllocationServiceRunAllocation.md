# com.finbourne.sdk.services.lusid.model.AllocationServiceRunAllocation
classname AllocationServiceRunAllocation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocation** | [**Allocation**](Allocation.md) |  | [optional] [default to Allocation]
**outcome** | **String** | What the run did to this allocation. One of: Created (by this run), Updated (an existing allocation  whose fields changed), Unchanged (an existing allocation the run left as it was), Cancelled (moved to a  cancelled state or reduced to zero quantity), Skipped (left alone because transactions are already booked  against it; see the SkippedBooked warning). | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationServiceRunAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId placementId = new ResourceId();
Allocation allocation = new Allocation();
@javax.annotation.Nullable String outcome = "example outcome";


AllocationServiceRunAllocation allocationServiceRunAllocationInstance = new AllocationServiceRunAllocation()
    .placementId(placementId)
    .allocation(allocation)
    .outcome(outcome);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)