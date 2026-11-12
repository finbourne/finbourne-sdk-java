# com.finbourne.sdk.services.lusid.model.UnsettledTransactionCounterLegRevaluation
classname UnsettledTransactionCounterLegRevaluation
The receiving (counter) leg of an FX forward revalued into the fund's base currency at the valuation point's  FX rates. Populated only for FX forward transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localCurrency** | **String** | The currency of the FX forward&#39;s receiving (counter) leg. | [optional] [default to String]
**localAmount** | **java.math.BigDecimal** | The amount of the receiving leg in its own currency. | [optional] [default to java.math.BigDecimal]
**baseCurrency** | **String** | The fund&#39;s base currency. | [optional] [default to String]
**bookedBaseAmount** | **java.math.BigDecimal** | The receiving leg amount in base currency at the rate booked on the transaction. Null when no booked rate was recorded. | [optional] [default to java.math.BigDecimal]
**revaluationFxRate** | **java.math.BigDecimal** | The FX rate from the counter-leg currency to base currency at the valuation point&#39;s effective date. Null when the rate could not be resolved. | [optional] [default to java.math.BigDecimal]
**revaluedBaseAmount** | **java.math.BigDecimal** | The receiving leg amount in base currency revalued at the valuation point&#39;s FX rate. Null when the revaluation rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRateEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the quote used for the counter-leg revaluation FX rate. Null for same-currency legs or when the rate is missing. | [optional] [default to OffsetDateTime]
**status** | **String** | Whether counter-leg revaluation succeeded (Revalued), was not needed (SameCurrency), or failed due to a missing FX rate (MissingFxRate). | [optional] [default to String]
**problems** | [**List&lt;RevaluationProblem&gt;**](RevaluationProblem.md) | Reasons why any counter-leg amounts could not be populated. Empty when revaluation succeeded. | [optional] [default to List<RevaluationProblem>]

```java
import com.finbourne.sdk.services.lusid.model.UnsettledTransactionCounterLegRevaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String localCurrency = "example localCurrency";
java.math.BigDecimal localAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable java.math.BigDecimal bookedBaseAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal revaluationFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal revaluedBaseAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime revaluationFxRateEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable List<RevaluationProblem> problems = new List<RevaluationProblem>();


UnsettledTransactionCounterLegRevaluation unsettledTransactionCounterLegRevaluationInstance = new UnsettledTransactionCounterLegRevaluation()
    .localCurrency(localCurrency)
    .localAmount(localAmount)
    .baseCurrency(baseCurrency)
    .bookedBaseAmount(bookedBaseAmount)
    .revaluationFxRate(revaluationFxRate)
    .revaluedBaseAmount(revaluedBaseAmount)
    .revaluationFxRateEffectiveAt(revaluationFxRateEffectiveAt)
    .status(status)
    .problems(problems);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)