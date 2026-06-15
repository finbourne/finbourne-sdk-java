# com.finbourne.sdk.services.lusid.model.AllocationServiceRunResponse
classname AllocationServiceRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) |  | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationServiceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ResourceId> values = new List<ResourceId>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();


AllocationServiceRunResponse allocationServiceRunResponseInstance = new AllocationServiceRunResponse()
    .values(values)
    .failed(failed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)