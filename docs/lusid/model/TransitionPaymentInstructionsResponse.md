# com.finbourne.sdk.services.lusid.model.TransitionPaymentInstructionsResponse
classname TransitionPaymentInstructionsResponse
The response from transitioning the status of a set of Payment Instructions. Each request key from the  incoming map appears in exactly one of Values or Failed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, PaymentInstruction&gt;**](PaymentInstruction.md) | The Payment Instructions that were transitioned successfully, at their new status, keyed by the ephemeral request key supplied by the caller. | [optional] [default to Map<String, PaymentInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Details of the requested transitions that failed, keyed by the ephemeral request key supplied by the caller. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransitionPaymentInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PaymentInstruction> values = new Map<String, PaymentInstruction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransitionPaymentInstructionsResponse transitionPaymentInstructionsResponseInstance = new TransitionPaymentInstructionsResponse()
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)