# com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiaryRow
classname InstrumentPaymentDiaryRow
An individual row containing details of a single cashflow in the diary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | The quantity (amount) that will be paid. Note that this can be empty if the payment is in the future and a model is used that cannot estimate it. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The payment currency of the cash flow. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the given cash flow is due to be paid. | [optional] [default to OffsetDateTime]
**payOrReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. | [optional] [default to String]
**accrualStart** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which accruals start for this cashflow. | [optional] [default to OffsetDateTime]
**accrualEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which accruals end for this cashflow. | [optional] [default to OffsetDateTime]
**cashFlowType** | **String** | The type of cashflow. | [optional] [default to String]
**isCashFlowDetermined** | **Boolean** | Is the cashflow determined as of the effective date time. | [optional] [default to Boolean]
**isCashFlowHistoric** | **Boolean** | Has the cashflow been paid, i.e. has it become a historic cashflow, as of the date and time pointed to be effectiveAt. | [optional] [default to Boolean]
**discountFactor** | **java.math.BigDecimal** | Weighting factor to discount cashflow to the present value. | [optional] [default to java.math.BigDecimal]
**discountedExpectedCashFlowAmount** | **java.math.BigDecimal** | The expected cashflow amount taking into account the discount factor. | [optional] [default to java.math.BigDecimal]
**dayCountFraction** | **java.math.BigDecimal** | The day count fraction, if appropriate. | [optional] [default to java.math.BigDecimal]
**forwardRate** | **java.math.BigDecimal** | Forward rate for cash flow if appropriate. (as in for a rates fixed or floating leg) | [optional] [default to java.math.BigDecimal]
**resetRate** | **java.math.BigDecimal** | The value of the reset, if any. | [optional] [default to java.math.BigDecimal]
**spread** | **java.math.BigDecimal** | The spread that exists on the payoff. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiaryRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String currency = "example currency";
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable String payOrReceive = "example payOrReceive";
OffsetDateTime accrualStart = OffsetDateTime.now();
OffsetDateTime accrualEnd = OffsetDateTime.now();
@javax.annotation.Nullable String cashFlowType = "example cashFlowType";
Boolean isCashFlowDetermined = true;
Boolean isCashFlowHistoric = true;
java.math.BigDecimal discountFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal discountedExpectedCashFlowAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dayCountFraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal forwardRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal resetRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal spread = new java.math.BigDecimal("100.00");


InstrumentPaymentDiaryRow instrumentPaymentDiaryRowInstance = new InstrumentPaymentDiaryRow()
    .quantity(quantity)
    .currency(currency)
    .paymentDate(paymentDate)
    .payOrReceive(payOrReceive)
    .accrualStart(accrualStart)
    .accrualEnd(accrualEnd)
    .cashFlowType(cashFlowType)
    .isCashFlowDetermined(isCashFlowDetermined)
    .isCashFlowHistoric(isCashFlowHistoric)
    .discountFactor(discountFactor)
    .discountedExpectedCashFlowAmount(discountedExpectedCashFlowAmount)
    .dayCountFraction(dayCountFraction)
    .forwardRate(forwardRate)
    .resetRate(resetRate)
    .spread(spread);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)