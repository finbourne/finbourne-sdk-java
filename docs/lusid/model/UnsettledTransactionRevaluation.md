# com.finbourne.sdk.services.lusid.model.UnsettledTransactionRevaluation
classname UnsettledTransactionRevaluation
The transaction's total consideration in base currency, both at the rate it was booked at and revalued at the  valuation point's FX rate. Rates and amounts are null when they could not be resolved; Problems explains why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localCurrency** | **String** | The settlement currency of the transaction (the &#39;local&#39; currency for revaluation purposes). | [optional] [default to String]
**localAmount** | **java.math.BigDecimal** | The total consideration in the settlement currency, as booked. | [optional] [default to java.math.BigDecimal]
**baseCurrency** | **String** | The fund&#39;s base currency. | [optional] [default to String]
**baseFxRate** | **java.math.BigDecimal** | The FX rate from settlement currency to base currency at the time the transaction was booked. Null when no booked rate was recorded. | [optional] [default to java.math.BigDecimal]
**baseAmount** | **java.math.BigDecimal** | The total consideration in base currency at the booked FX rate. Null when the booked rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRate** | **java.math.BigDecimal** | The FX rate from settlement currency to base currency at the valuation point&#39;s effective date. Null when the rate could not be resolved. | [optional] [default to java.math.BigDecimal]
**revaluedBaseAmount** | **java.math.BigDecimal** | The total consideration in base currency revalued at the valuation point&#39;s FX rate. Null when the revaluation rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRateEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the quote used for the revaluation FX rate. Null for same-currency transactions or when the rate is missing. | [optional] [default to OffsetDateTime]
**status** | **String** | Whether revaluation succeeded (Revalued), was not needed (SameCurrency), or failed due to a missing FX rate (MissingFxRate). | [optional] [default to String]
**problems** | [**List&lt;RevaluationProblem&gt;**](RevaluationProblem.md) | Reasons why any of the amounts could not be populated. Empty when revaluation succeeded. | [optional] [default to List<RevaluationProblem>]
**counterLeg** | [**UnsettledTransactionCounterLegRevaluation**](UnsettledTransactionCounterLegRevaluation.md) |  | [optional] [default to UnsettledTransactionCounterLegRevaluation]

```java
import com.finbourne.sdk.services.lusid.model.UnsettledTransactionRevaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String localCurrency = "example localCurrency";
java.math.BigDecimal localAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable java.math.BigDecimal baseFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal baseAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal revaluationFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal revaluedBaseAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime revaluationFxRateEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable List<RevaluationProblem> problems = new List<RevaluationProblem>();
UnsettledTransactionCounterLegRevaluation counterLeg = new UnsettledTransactionCounterLegRevaluation();


UnsettledTransactionRevaluation unsettledTransactionRevaluationInstance = new UnsettledTransactionRevaluation()
    .localCurrency(localCurrency)
    .localAmount(localAmount)
    .baseCurrency(baseCurrency)
    .baseFxRate(baseFxRate)
    .baseAmount(baseAmount)
    .revaluationFxRate(revaluationFxRate)
    .revaluedBaseAmount(revaluedBaseAmount)
    .revaluationFxRateEffectiveAt(revaluationFxRateEffectiveAt)
    .status(status)
    .problems(problems)
    .counterLeg(counterLeg);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)