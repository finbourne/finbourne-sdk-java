# com.finbourne.sdk.services.lusid.model.PaymentInstructionRequest
classname PaymentInstructionRequest
A request to create or update a Payment Instruction. Status is not accepted here —  status transitions are managed exclusively via the dedicated Payment Instruction status API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**paymentRecordIds** | [**List&lt;PaymentRecordReference&gt;**](PaymentRecordReference.md) | One or more Payment Records batched into this instruction block. All referenced Payment Records must share the same currency as the top-level currency field. | [default to List<PaymentRecordReference>]
**currency** | **String** | ISO 4217 currency code. All referenced Payment Records must share this currency value. | [default to String]
**totalPaymentAmount** | **java.math.BigDecimal** | Total payment amount across all referenced Payment Records. | [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The value date on which settlement is due. ISO 8601 date. | [default to OffsetDateTime]
**payorPaymentDetailsReference** | [**PaymentDetailsReference**](PaymentDetailsReference.md) |  | [default to PaymentDetailsReference]
**payeePaymentDetailsReference** | [**PaymentDetailsReference**](PaymentDetailsReference.md) |  | [default to PaymentDetailsReference]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this Payment Instruction. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.PaymentInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
List<PaymentRecordReference> paymentRecordIds = new List<PaymentRecordReference>();
String currency = "example currency";
java.math.BigDecimal totalPaymentAmount = new java.math.BigDecimal("100.00");
OffsetDateTime paymentDate = OffsetDateTime.now();
PaymentDetailsReference payorPaymentDetailsReference = new PaymentDetailsReference();
PaymentDetailsReference payeePaymentDetailsReference = new PaymentDetailsReference();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


PaymentInstructionRequest paymentInstructionRequestInstance = new PaymentInstructionRequest()
    .id(id)
    .paymentRecordIds(paymentRecordIds)
    .currency(currency)
    .totalPaymentAmount(totalPaymentAmount)
    .paymentDate(paymentDate)
    .payorPaymentDetailsReference(payorPaymentDetailsReference)
    .payeePaymentDetailsReference(payeePaymentDetailsReference)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)