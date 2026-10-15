# com.finbourne.sdk.services.lusid.model.AllocationPaymentHold
classname AllocationPaymentHold
A hold placed on a partner's payment against an allocation event, blocking receipt until it is released  by a second user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner whose payment is held. | [default to String]
**status** | **String** | The hold status: Blocked, Escrow or Released. | [default to String]
**reason** | **String** | The reason for the hold. | [optional] [default to String]
**reference** | **String** | An external reference for the hold, such as a compliance case number. | [optional] [default to String]
**placedBy** | **String** | The user who placed the hold. | [default to String]
**placedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the hold was placed. | [default to OffsetDateTime]
**releasedBy** | **String** | The user who released the hold, or null while it is active. | [optional] [default to String]
**releasedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the hold was released, or null while it is active. | [optional] [default to OffsetDateTime]
**active** | **Boolean** | Whether the hold is currently blocking receipt of the partner&#39;s payment. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPaymentHold;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId allocationEventId = new ResourceId();
String investorRecordId = "example investorRecordId";
String status = "example status";
@javax.annotation.Nullable String reason = "example reason";
@javax.annotation.Nullable String reference = "example reference";
String placedBy = "example placedBy";
OffsetDateTime placedAt = OffsetDateTime.now();
@javax.annotation.Nullable String releasedBy = "example releasedBy";
@javax.annotation.Nullable OffsetDateTime releasedAt = OffsetDateTime.now();
Boolean active = true;


AllocationPaymentHold allocationPaymentHoldInstance = new AllocationPaymentHold()
    .allocationEventId(allocationEventId)
    .investorRecordId(investorRecordId)
    .status(status)
    .reason(reason)
    .reference(reference)
    .placedBy(placedBy)
    .placedAt(placedAt)
    .releasedBy(releasedBy)
    .releasedAt(releasedAt)
    .active(active);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)