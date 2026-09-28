# com.finbourne.sdk.services.lusid.model.AllocationEventReallocateRequest
classname AllocationEventReallocateRequest
The request used to recompute an unbooked Allocation Event: why, and with which basis values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the event is being recomputed. | [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | Optional replacement basis values per investor record. | [optional] [default to List<AllocationMapBasisValue>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventReallocateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reason = "example reason";
@javax.annotation.Nullable List<AllocationMapBasisValue> basisValues = new List<AllocationMapBasisValue>();


AllocationEventReallocateRequest allocationEventReallocateRequestInstance = new AllocationEventReallocateRequest()
    .reason(reason)
    .basisValues(basisValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)