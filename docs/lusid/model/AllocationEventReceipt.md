# com.finbourne.sdk.services.lusid.model.AllocationEventReceipt
classname AllocationEventReceipt
One receipt of cash against a booked capital call, as recorded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the cash came from. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The cash received, in the event currency after any FX conversion. | [optional] [default to java.math.BigDecimal]
**receiptDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was received. | [optional] [default to OffsetDateTime]
**applied** | **java.math.BigDecimal** | How much of the receipt was applied to what the investor owed. | [optional] [default to java.math.BigDecimal]
**refund** | **java.math.BigDecimal** | How much of the receipt exceeded what the investor owed and became a refund payable. | [optional] [default to java.math.BigDecimal]
**paymentCurrency** | **String** | The ISO 4217 code of the currency the cash arrived in, when it differs from the event currency. | [optional] [default to String]
**paymentFxRate** | **java.math.BigDecimal** | The rate the payment was converted at, as units of event currency per unit of payment currency. Required with a payment currency. | [optional] [default to java.math.BigDecimal]
**fxDifference** | **java.math.BigDecimal** | The part of the difference between the payment converted at the notice rate and at the payment rate that the fund did not absorb; positive when the rate moved against the fund. Zero without a notice rate. | [optional] [default to java.math.BigDecimal]
**bankCharge** | **java.math.BigDecimal** | Any bank charge deducted from the cash before it arrived, in the event currency. | [optional] [default to java.math.BigDecimal]
**bankChargeBearer** | **String** | Who bears the bank charge: Partner leaves it outstanding on the investor, Fund books it as a fund expense. Defaults to the map&#39;s policy. | [optional] [default to String]
**shortfallWrittenOff** | **java.math.BigDecimal** | Any small shortfall within the map&#39;s tolerance that was written off rather than left outstanding. | [optional] [default to java.math.BigDecimal]
**postingId** | **String** | The identifier of the receipt posting on the investor&#39;s line. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventReceipt;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
OffsetDateTime receiptDate = OffsetDateTime.now();
java.math.BigDecimal applied = new java.math.BigDecimal("100.00");
java.math.BigDecimal refund = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String paymentCurrency = "example paymentCurrency";
@javax.annotation.Nullable java.math.BigDecimal paymentFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal fxDifference = new java.math.BigDecimal("100.00");
java.math.BigDecimal bankCharge = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String bankChargeBearer = "example bankChargeBearer";
java.math.BigDecimal shortfallWrittenOff = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String postingId = "example postingId";


AllocationEventReceipt allocationEventReceiptInstance = new AllocationEventReceipt()
    .investorRecordId(investorRecordId)
    .amount(amount)
    .receiptDate(receiptDate)
    .applied(applied)
    .refund(refund)
    .paymentCurrency(paymentCurrency)
    .paymentFxRate(paymentFxRate)
    .fxDifference(fxDifference)
    .bankCharge(bankCharge)
    .bankChargeBearer(bankChargeBearer)
    .shortfallWrittenOff(shortfallWrittenOff)
    .postingId(postingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)