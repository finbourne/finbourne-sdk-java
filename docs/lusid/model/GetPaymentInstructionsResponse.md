# com.finbourne.sdk.services.lusid.model.GetPaymentInstructionsResponse
classname GetPaymentInstructionsResponse
The response from getting Payment Instructions by payment record id. Each requested payment record id  appears in exactly one of Values or Failed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, PaymentInstruction&gt;**](PaymentInstruction.md) | The Payment Instructions that were found, keyed by the payment record id used to retrieve them. Only Payment Instructions that were found will be contained in this collection. | [optional] [default to Map<String, PaymentInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The payment record ids that did not resolve to a Payment Instruction, along with the nature of the failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetPaymentInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PaymentInstruction> values = new Map<String, PaymentInstruction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetPaymentInstructionsResponse getPaymentInstructionsResponseInstance = new GetPaymentInstructionsResponse()
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)