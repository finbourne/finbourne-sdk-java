# com.finbourne.sdk.services.lusid.model.TaxFundReconciliationHoldingResponse
classname TaxFundReconciliationHoldingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**companyAmount** | **java.math.BigDecimal** | The company-level amount for the holding. | [optional] [default to java.math.BigDecimal]
**fundProxies** | [**List&lt;TaxFundReconciliationProxyRow&gt;**](TaxFundReconciliationProxyRow.md) | The member funds&#39; notional figures for the holding. | [optional] [default to List<TaxFundReconciliationProxyRow>]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**category** | **String** | The reconciliation category of the difference, when there is one. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxFundReconciliationHoldingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
java.math.BigDecimal companyAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxFundReconciliationProxyRow> fundProxies = new List<TaxFundReconciliationProxyRow>();
java.math.BigDecimal difference = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String category = "example category";
@javax.annotation.Nullable String explanation = "example explanation";


TaxFundReconciliationHoldingResponse taxFundReconciliationHoldingResponseInstance = new TaxFundReconciliationHoldingResponse()
    .fundId(fundId)
    .period(period)
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .companyAmount(companyAmount)
    .fundProxies(fundProxies)
    .difference(difference)
    .category(category)
    .explanation(explanation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)