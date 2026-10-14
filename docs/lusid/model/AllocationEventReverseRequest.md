# com.finbourne.sdk.services.lusid.model.AllocationEventReverseRequest
classname AllocationEventReverseRequest
The request used to reverse a booked Allocation Event: why, and when the mirror postings are dated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the booked event is being reversed. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date to post the mirror entries at. Defaults to the original event date unless that period is closed, when it defaults to the current date. | [optional] [default to OffsetDateTime]
**backdated** | **Boolean** | Whether to post the mirror entries at the original event date even when that period is closed. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventReverseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String reason = "example reason";
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
Boolean backdated = true;


AllocationEventReverseRequest allocationEventReverseRequestInstance = new AllocationEventReverseRequest()
    .reason(reason)
    .effectiveAt(effectiveAt)
    .backdated(backdated);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)