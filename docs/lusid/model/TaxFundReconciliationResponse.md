# com.finbourne.sdk.services.lusid.model.TaxFundReconciliationResponse
classname TaxFundReconciliationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**companyTotal** | **java.math.BigDecimal** | The company-level total of lines A, D and LR. | [optional] [default to java.math.BigDecimal]
**sumOfFundProxies** | **java.math.BigDecimal** | The sum of the member funds&#39; notional totals. | [optional] [default to java.math.BigDecimal]
**differences** | [**List&lt;TaxReconciliationDifferenceRow&gt;**](TaxReconciliationDifferenceRow.md) | The explained differences between the two sides, by holding. | [optional] [default to List<TaxReconciliationDifferenceRow>]
**unexplained** | **java.math.BigDecimal** | The part of the difference not explained by any category. Nil when the reconciliation is complete. | [optional] [default to java.math.BigDecimal]
**companyLineD** | **java.math.BigDecimal** | Line D at company level. | [optional] [default to java.math.BigDecimal]
**fundsLineD** | **java.math.BigDecimal** | The sum of line D across the member funds. | [optional] [default to java.math.BigDecimal]
**companyLineLR** | **java.math.BigDecimal** | Line LR at company level. | [optional] [default to java.math.BigDecimal]
**fundsLineLR** | **java.math.BigDecimal** | The sum of line LR across the member funds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxFundReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
java.math.BigDecimal companyTotal = new java.math.BigDecimal("100.00");
java.math.BigDecimal sumOfFundProxies = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReconciliationDifferenceRow> differences = new List<TaxReconciliationDifferenceRow>();
java.math.BigDecimal unexplained = new java.math.BigDecimal("100.00");
java.math.BigDecimal companyLineD = new java.math.BigDecimal("100.00");
java.math.BigDecimal fundsLineD = new java.math.BigDecimal("100.00");
java.math.BigDecimal companyLineLR = new java.math.BigDecimal("100.00");
java.math.BigDecimal fundsLineLR = new java.math.BigDecimal("100.00");


TaxFundReconciliationResponse taxFundReconciliationResponseInstance = new TaxFundReconciliationResponse()
    .fundId(fundId)
    .period(period)
    .companyTotal(companyTotal)
    .sumOfFundProxies(sumOfFundProxies)
    .differences(differences)
    .unexplained(unexplained)
    .companyLineD(companyLineD)
    .fundsLineD(fundsLineD)
    .companyLineLR(companyLineLR)
    .fundsLineLR(fundsLineLR);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)