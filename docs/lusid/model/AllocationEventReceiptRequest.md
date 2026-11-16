# com.finbourne.sdk.services.lusid.model.AllocationEventReceiptRequest
classname AllocationEventReceiptRequest
The request used to record cash received from an investor against a booked capital call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the cash came from. | [default to String]
**amount** | **java.math.BigDecimal** | The cash the partner sent, as sent and before any bank charge: in the payment currency if one is given and otherwise in the event currency. | [default to java.math.BigDecimal]
**receiptDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was received. | [default to OffsetDateTime]
**paymentCurrency** | **String** | The ISO 4217 code of the currency the cash arrived in, when it differs from the event currency. | [optional] [default to String]
**paymentFxRate** | **java.math.BigDecimal** | The rate the payment was converted at, as units of event currency per unit of payment currency. Required with a payment currency. | [optional] [default to java.math.BigDecimal]
**noticeFxRate** | **java.math.BigDecimal** | The rate the call was noticed at in the payment currency, in the same terms as the payment FX rate. With one, only the rate&#39;s effect on the payment is an FX difference; without one a payment converting to less than the call is simply short. Only with a payment currency. | [optional] [default to java.math.BigDecimal]
**bankCharge** | **java.math.BigDecimal** | Any bank charge deducted from the cash before it arrived, in the event currency. | [optional] [default to java.math.BigDecimal]
**bankChargeBearer** | **String** | Who bears the bank charge: Partner leaves it outstanding on the investor, Fund books it as a fund expense. Defaults to the map&#39;s policy. | [optional] [default to String]
**reference** | **String** | The caller&#39;s reference for the payment, for instance a bank statement line or a source row id, of 1 to 128 characters. Optional. Posting the same reference again with the same investor record, amount, currency and receipt date returns the event unchanged and writes nothing; with other content it is refused. Without a reference a repeated receipt is a second payment, warned as a possible duplicate when an earlier receipt matches it. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventReceiptRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
OffsetDateTime receiptDate = OffsetDateTime.now();
@javax.annotation.Nullable String paymentCurrency = "example paymentCurrency";
@javax.annotation.Nullable java.math.BigDecimal paymentFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal noticeFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal bankCharge = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String bankChargeBearer = "example bankChargeBearer";
@javax.annotation.Nullable String reference = "example reference";


AllocationEventReceiptRequest allocationEventReceiptRequestInstance = new AllocationEventReceiptRequest()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .receiptDate(receiptDate)
    .paymentCurrency(paymentCurrency)
    .paymentFxRate(paymentFxRate)
    .noticeFxRate(noticeFxRate)
    .bankCharge(bankCharge)
    .bankChargeBearer(bankChargeBearer)
    .reference(reference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)