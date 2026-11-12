# com.finbourne.sdk.services.lusid.model.AllocationServiceRunWarning
classname AllocationServiceRunWarning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**code** | **String** | The kind of warning. One of: OffMinimumIncrement (an allocation&#39;s quantity is not a multiple of the  instrument&#39;s minimum increment), SkippedBooked (an allocation was not changed because transactions are  already booked against it), ExecutionNotAllocated (an execution was excluded from the run). | [optional] [default to String]
**message** | **String** | A description of the warning and, where known, why it arose. | [optional] [default to String]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**executionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.AllocationServiceRunWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId placementId = new ResourceId();
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String message = "example message";
ResourceId allocationId = new ResourceId();
ResourceId portfolioId = new ResourceId();
ResourceId executionId = new ResourceId();


AllocationServiceRunWarning allocationServiceRunWarningInstance = new AllocationServiceRunWarning()
    .placementId(placementId)
    .code(code)
    .message(message)
    .allocationId(allocationId)
    .portfolioId(portfolioId)
    .executionId(executionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)