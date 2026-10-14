# com.finbourne.sdk.services.lusid.model.AllocationEventReversal
classname AllocationEventReversal
How a booked Allocation Event was reversed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** | The reference the mirror postings were written under: the original booking reference with a -REV suffix. | [optional] [default to String]
**reason** | **String** | Why the event was reversed. | [optional] [default to String]
**reversedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the event was reversed. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date the mirror postings were posted at. | [optional] [default to OffsetDateTime]
**backdated** | **Boolean** | Whether the mirror postings were posted at the original event date despite the period being closed. | [optional] [default to Boolean]
**refundPayable** | [**List&lt;AllocationEventRefund&gt;**](AllocationEventRefund.md) | Cash owed back to investors who had already paid in when the event was reversed. | [optional] [default to List<AllocationEventRefund>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventReversal;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String reference = "example reference";
@javax.annotation.Nullable String reason = "example reason";
OffsetDateTime reversedAt = OffsetDateTime.now();
OffsetDateTime effectiveAt = OffsetDateTime.now();
Boolean backdated = true;
@javax.annotation.Nullable List<AllocationEventRefund> refundPayable = new List<AllocationEventRefund>();


AllocationEventReversal allocationEventReversalInstance = new AllocationEventReversal()
    .reference(reference)
    .reason(reason)
    .reversedAt(reversedAt)
    .effectiveAt(effectiveAt)
    .backdated(backdated)
    .refundPayable(refundPayable);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)