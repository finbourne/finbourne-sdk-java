# com.finbourne.sdk.services.lusid.model.AllocationEventBookRequest
classname AllocationEventBookRequest
The request used to book a computed Allocation Event: the reference under which its shares are posted, and  whether to only show what would be posted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingReference** | **String** | The reference under which the computed shares were posted, for instance a journal entry code. | [default to String]
**dryRun** | **Boolean** | Whether to only build and return the posting plan without writing anything. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bookingReference = "example bookingReference";
Boolean dryRun = true;


AllocationEventBookRequest allocationEventBookRequestInstance = new AllocationEventBookRequest()
    .bookingReference(bookingReference)
    .dryRun(dryRun);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)