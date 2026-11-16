# com.finbourne.sdk.services.lusid.model.AllocationEventRefundPayment
classname AllocationEventRefundPayment
One payment of a refund owed to an investor record on a booked capital call, as recorded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is paid to. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount paid, in the event currency. Must be positive, no finer than the currency&#39;s minor unit, and no more than the refund still payable to the investor record on the event. | [optional] [default to java.math.BigDecimal]
**paidDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was paid out. Not before the receipt that created the refund payable. | [optional] [default to OffsetDateTime]
**reference** | **String** | The caller&#39;s reference for the payment, for instance a payment instruction id. Posting the same reference again returns the event unchanged and writes nothing. | [optional] [default to String]
**postingId** | **String** | The identifier of the fund-side posting the payment was written under. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventRefundPayment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
OffsetDateTime paidDate = OffsetDateTime.now();
@javax.annotation.Nullable String reference = "example reference";
@javax.annotation.Nullable String postingId = "example postingId";


AllocationEventRefundPayment allocationEventRefundPaymentInstance = new AllocationEventRefundPayment()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .paidDate(paidDate)
    .reference(reference)
    .postingId(postingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)