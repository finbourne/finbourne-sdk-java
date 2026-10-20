# com.finbourne.sdk.services.lusid.model.DisputeMarginCallRequest
classname DisputeMarginCallRequest
Disputes a margin call: moves the agreed amount now and leaves the rest of the demand in dispute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedAmount** | **java.math.BigDecimal** | The amount to move now; the rest of the counterparty&#39;s demand is left in dispute. | [default to java.math.BigDecimal]
**reason** | **String** | Why the call is disputed. | [default to String]
**owner** | **String** | Who owns the dispute. Defaults to the caller if not specified. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DisputeMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal agreedAmount = new java.math.BigDecimal("100.00");
String reason = "example reason";
@javax.annotation.Nullable String owner = "example owner";


DisputeMarginCallRequest disputeMarginCallRequestInstance = new DisputeMarginCallRequest()
    .agreedAmount(agreedAmount)
    .reason(reason)
    .owner(owner);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)