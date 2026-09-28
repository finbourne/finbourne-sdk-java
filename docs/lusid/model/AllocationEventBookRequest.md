# com.finbourne.sdk.services.lusid.model.AllocationEventBookRequest
classname AllocationEventBookRequest
The request used to book a computed Allocation Event: the reference under which its shares were posted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingReference** | **String** | The reference under which the computed shares were posted, for instance a journal entry code. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bookingReference = "example bookingReference";


AllocationEventBookRequest allocationEventBookRequestInstance = new AllocationEventBookRequest()
    .bookingReference(bookingReference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)