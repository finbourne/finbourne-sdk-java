# com.finbourne.sdk.services.lusid.model.TaxLedgerReconciliationHoldingResponse
classname TaxLedgerReconciliationHoldingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**ledgerRealised** | **java.math.BigDecimal** | The realised gain or loss recorded in the ledger for the holding. | [optional] [default to java.math.BigDecimal]
**ledgerUnrealisedMovement** | **java.math.BigDecimal** | The movement in unrealised gain or loss recorded in the ledger for the holding. | [optional] [default to java.math.BigDecimal]
**taxRealisedUnindexed** | **java.math.BigDecimal** | The realised gain or loss for tax before indexation. | [optional] [default to java.math.BigDecimal]
**taxUnrealisedMovementUnindexed** | **java.math.BigDecimal** | The movement in the unrealised gain or loss for tax before indexation. | [optional] [default to java.math.BigDecimal]
**deemedDisposalNet** | **java.math.BigDecimal** | The net deemed-disposal amount for the holding. | [optional] [default to java.math.BigDecimal]
**loanRelationshipNet** | **java.math.BigDecimal** | The net loan relationship credit or debit for the holding. | [optional] [default to java.math.BigDecimal]
**category** | **String** | The reconciliation category of the difference, when there is one. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxLedgerReconciliationHoldingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
java.math.BigDecimal ledgerRealised = new java.math.BigDecimal("100.00");
java.math.BigDecimal ledgerUnrealisedMovement = new java.math.BigDecimal("100.00");
java.math.BigDecimal taxRealisedUnindexed = new java.math.BigDecimal("100.00");
java.math.BigDecimal taxUnrealisedMovementUnindexed = new java.math.BigDecimal("100.00");
java.math.BigDecimal deemedDisposalNet = new java.math.BigDecimal("100.00");
java.math.BigDecimal loanRelationshipNet = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String category = "example category";
java.math.BigDecimal difference = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String explanation = "example explanation";


TaxLedgerReconciliationHoldingResponse taxLedgerReconciliationHoldingResponseInstance = new TaxLedgerReconciliationHoldingResponse()
    .fundId(fundId)
    .period(period)
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .portfolioCode(portfolioCode)
    .ledgerRealised(ledgerRealised)
    .ledgerUnrealisedMovement(ledgerUnrealisedMovement)
    .taxRealisedUnindexed(taxRealisedUnindexed)
    .taxUnrealisedMovementUnindexed(taxUnrealisedMovementUnindexed)
    .deemedDisposalNet(deemedDisposalNet)
    .loanRelationshipNet(loanRelationshipNet)
    .category(category)
    .difference(difference)
    .explanation(explanation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)