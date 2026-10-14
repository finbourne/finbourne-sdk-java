# com.finbourne.sdk.services.lusid.model.AllocationEventUnbookRequest
classname AllocationEventUnbookRequest
The request used to take a half-booked Allocation Event back to Computed, cancelling what it wrote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the half-booked event is being taken back to Computed. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventUnbookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reason = "example reason";


AllocationEventUnbookRequest allocationEventUnbookRequestInstance = new AllocationEventUnbookRequest()
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)