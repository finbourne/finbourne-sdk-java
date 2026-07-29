# com.finbourne.sdk.services.lusid.model.PaymentInstruction
classname PaymentInstruction
A Payment Instruction groups one or more Payment Records into a single block  for transmission to a downstream treasury management system via the Horizon integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**paymentRecordIds** | [**List&lt;PaymentRecordReference&gt;**](PaymentRecordReference.md) | One or more Payment Records batched into this instruction block. All referenced Payment Records must share the same currency as the top-level currency field. | [default to List<PaymentRecordReference>]
**currency** | **String** | ISO 4217 currency code. All referenced Payment Records must share this currency value. | [default to String]
**totalPaymentAmount** | **java.math.BigDecimal** | Total payment amount across all referenced Payment Records. | [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The value date on which settlement is due. ISO 8601 date. | [default to OffsetDateTime]
**payorPaymentDetailsReference** | [**PaymentDetailsReferenceResponse**](PaymentDetailsReferenceResponse.md) |  | [default to PaymentDetailsReferenceResponse]
**payeePaymentDetailsReference** | [**PaymentDetailsReferenceResponse**](PaymentDetailsReferenceResponse.md) |  | [default to PaymentDetailsReferenceResponse]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this Payment Instruction. | [optional] [default to Map<String, PerpetualProperty>]
**status** | [**PaymentInstructionStatus**](PaymentInstructionStatus.md) |  | [default to PaymentInstructionStatus]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PaymentInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
List<PaymentRecordReference> paymentRecordIds = new List<PaymentRecordReference>();
String currency = "example currency";
java.math.BigDecimal totalPaymentAmount = new java.math.BigDecimal("100.00");
OffsetDateTime paymentDate = OffsetDateTime.now();
PaymentDetailsReferenceResponse payorPaymentDetailsReference = new PaymentDetailsReferenceResponse();
PaymentDetailsReferenceResponse payeePaymentDetailsReference = new PaymentDetailsReferenceResponse();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
PaymentInstructionStatus status = new PaymentInstructionStatus();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PaymentInstruction paymentInstructionInstance = new PaymentInstruction()
    .id(id)
    .paymentRecordIds(paymentRecordIds)
    .currency(currency)
    .totalPaymentAmount(totalPaymentAmount)
    .paymentDate(paymentDate)
    .payorPaymentDetailsReference(payorPaymentDetailsReference)
    .payeePaymentDetailsReference(payeePaymentDetailsReference)
    .properties(properties)
    .status(status)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)