# com.finbourne.sdk.services.lusid.model.AllocationServiceRunResponse
classname AllocationServiceRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The placements that were allocated successfully. | [optional] [default to List<ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The placements that could not be allocated, keyed by placement, with the reason. | [optional] [default to Map<String, ErrorDetail>]
**allocations** | [**List&lt;AllocationServiceRunAllocation&gt;**](AllocationServiceRunAllocation.md) | Every allocation the run touched across the successful placements, each with its outcome. | [optional] [default to List<AllocationServiceRunAllocation>]
**warnings** | [**List&lt;AllocationServiceRunWarning&gt;**](AllocationServiceRunWarning.md) | Warnings raised while allocating the successful placements. | [optional] [default to List<AllocationServiceRunWarning>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationServiceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ResourceId> values = new List<ResourceId>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<AllocationServiceRunAllocation> allocations = new List<AllocationServiceRunAllocation>();
@javax.annotation.Nullable List<AllocationServiceRunWarning> warnings = new List<AllocationServiceRunWarning>();


AllocationServiceRunResponse allocationServiceRunResponseInstance = new AllocationServiceRunResponse()
    .values(values)
    .failed(failed)
    .allocations(allocations)
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)