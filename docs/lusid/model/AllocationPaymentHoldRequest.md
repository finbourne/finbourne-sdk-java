# com.finbourne.sdk.services.lusid.model.AllocationPaymentHoldRequest
classname AllocationPaymentHoldRequest
The request used to place, move or release a hold on a partner's payment against an allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The hold status to set: Blocked, Escrow or Released. A hold may only be released by a different user from the one who placed it. | [default to String]
**reason** | **String** | The reason for the hold. | [optional] [default to String]
**reference** | **String** | An external reference for the hold, such as a compliance case number. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPaymentHoldRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
@javax.annotation.Nullable String reason = "example reason";
@javax.annotation.Nullable String reference = "example reference";


AllocationPaymentHoldRequest allocationPaymentHoldRequestInstance = new AllocationPaymentHoldRequest()
    .status(status)
    .reason(reason)
    .reference(reference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)