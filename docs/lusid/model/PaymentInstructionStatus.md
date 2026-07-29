# com.finbourne.sdk.services.lusid.model.PaymentInstructionStatus
classname PaymentInstructionStatus
The current status of a Payment Instruction. Managed exclusively via the dedicated  status transition API — not accepted on upsert.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentValue** | **String** | The current status value. One of: Created, Staged, Released, Instructed, Sent, Cancelled. | [default to String]
**asAtLastTransition** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp of the most recent status transition. | [default to OffsetDateTime]
**userIdLastTransition** | **String** | The ID of the user who made the most recent status transition. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PaymentInstructionStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currentValue = "example currentValue";
OffsetDateTime asAtLastTransition = OffsetDateTime.now();
String userIdLastTransition = "example userIdLastTransition";


PaymentInstructionStatus paymentInstructionStatusInstance = new PaymentInstructionStatus()
    .currentValue(currentValue)
    .asAtLastTransition(asAtLastTransition)
    .userIdLastTransition(userIdLastTransition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)