# com.finbourne.sdk.services.lusid.model.AllocationEventRefundPaymentRequest
classname AllocationEventRefundPaymentRequest
The request used to pay out a refund owed to an investor whose receipt against a booked capital call exceeded  what it owed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is paid to. | [default to String]
**amount** | **java.math.BigDecimal** | The amount paid, in the event currency. Must be positive, no finer than the currency&#39;s minor unit, and no more than the refund still payable to the investor record on the event. | [default to java.math.BigDecimal]
**paidDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was paid out. Not before the receipt that created the refund payable. | [default to OffsetDateTime]
**reference** | **String** | The caller&#39;s reference for the payment, for instance a payment instruction id. Posting the same reference again returns the event unchanged and writes nothing. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventRefundPaymentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
OffsetDateTime paidDate = OffsetDateTime.now();
String reference = "example reference";


AllocationEventRefundPaymentRequest allocationEventRefundPaymentRequestInstance = new AllocationEventRefundPaymentRequest()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .paidDate(paidDate)
    .reference(reference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)