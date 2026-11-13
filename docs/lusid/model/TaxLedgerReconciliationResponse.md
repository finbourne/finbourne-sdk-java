# com.finbourne.sdk.services.lusid.model.TaxLedgerReconciliationResponse
classname TaxLedgerReconciliationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**ledgerCapitalGainLoss** | **java.math.BigDecimal** | The realised and unrealised capital gain or loss recorded in the ledger for the period. | [optional] [default to java.math.BigDecimal]
**comparableTaxFigure** | **java.math.BigDecimal** | The tax figure on the same basis as the ledger, before the return adjustments. | [optional] [default to java.math.BigDecimal]
**differences** | [**List&lt;TaxReconciliationDifferenceRow&gt;**](TaxReconciliationDifferenceRow.md) | The explained differences between the two sides, by holding. | [optional] [default to List<TaxReconciliationDifferenceRow>]
**unexplained** | **java.math.BigDecimal** | The part of the difference not explained by any category. Nil when the reconciliation is complete. | [optional] [default to java.math.BigDecimal]
**bridge** | [**List&lt;TaxReconciliationBridgeRow&gt;**](TaxReconciliationBridgeRow.md) | The bridge from the ledger figure to the return total. | [optional] [default to List<TaxReconciliationBridgeRow>]
**returnTotal** | **java.math.BigDecimal** | The total of lines A, D and LR. | [optional] [default to java.math.BigDecimal]
**bridgeUnexplained** | **java.math.BigDecimal** | The part of the bridge not explained. Nil when the bridge is complete. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxLedgerReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
java.math.BigDecimal ledgerCapitalGainLoss = new java.math.BigDecimal("100.00");
java.math.BigDecimal comparableTaxFigure = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReconciliationDifferenceRow> differences = new List<TaxReconciliationDifferenceRow>();
java.math.BigDecimal unexplained = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReconciliationBridgeRow> bridge = new List<TaxReconciliationBridgeRow>();
java.math.BigDecimal returnTotal = new java.math.BigDecimal("100.00");
java.math.BigDecimal bridgeUnexplained = new java.math.BigDecimal("100.00");


TaxLedgerReconciliationResponse taxLedgerReconciliationResponseInstance = new TaxLedgerReconciliationResponse()
    .fundId(fundId)
    .period(period)
    .ledgerCapitalGainLoss(ledgerCapitalGainLoss)
    .comparableTaxFigure(comparableTaxFigure)
    .differences(differences)
    .unexplained(unexplained)
    .bridge(bridge)
    .returnTotal(returnTotal)
    .bridgeUnexplained(bridgeUnexplained);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)