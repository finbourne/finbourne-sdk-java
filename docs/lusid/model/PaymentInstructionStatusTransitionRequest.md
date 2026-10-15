# com.finbourne.sdk.services.lusid.model.PaymentInstructionStatusTransitionRequest
classname PaymentInstructionStatusTransitionRequest
A request to move one Payment Instruction to a new status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**status** | **String** | The status to move the Payment Instruction to. One of: Created, Staged, Released, Instructed, Sent, Cancelled, Failed. The transition must be permitted from the instruction&#39;s current status. Available values: Created, Staged, Released, Instructed, Sent, Cancelled, Failed. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PaymentInstructionStatusTransitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String status = "example status";


PaymentInstructionStatusTransitionRequest paymentInstructionStatusTransitionRequestInstance = new PaymentInstructionStatusTransitionRequest()
    .id(id)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)