# com.finbourne.sdk.services.lusid.model.TaxReturnResponse
classname TaxReturnResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**status** | **String** | The workflow status of the return. Available values: Draft, Prepared, Reviewed, SignedOff, Final. Available values: Draft, Prepared, Reviewed, SignedOff, Final. | [optional] [default to String]
**steps** | [**List&lt;TaxReturnWorkflowStep&gt;**](TaxReturnWorkflowStep.md) | The workflow history of the return in the order the steps were taken. | [optional] [default to List<TaxReturnWorkflowStep>]
**lineA** | [**List&lt;TaxReturnDisposalRow&gt;**](TaxReturnDisposalRow.md) | Chargeable gains and allowable losses on actual disposals in the period. | [optional] [default to List<TaxReturnDisposalRow>]
**lineATotal** | **java.math.BigDecimal** | The total of line A, in whole pounds. | [optional] [default to java.math.BigDecimal]
**vintages** | [**List&lt;TaxReturnVintage&gt;**](TaxReturnVintage.md) | The deemed-disposal vintages, one per period, that feed line D. | [optional] [default to List<TaxReturnVintage>]
**instalments** | [**List&lt;TaxReturnSpreadInstalment&gt;**](TaxReturnSpreadInstalment.md) | The instalments of earlier vintages that fall into the period. | [optional] [default to List<TaxReturnSpreadInstalment>]
**lineDTotal** | **java.math.BigDecimal** | The total of line D, in whole pounds. | [optional] [default to java.math.BigDecimal]
**loanRelationships** | [**List&lt;TaxReturnLoanRelationshipRow&gt;**](TaxReturnLoanRelationshipRow.md) | The loan relationship and derivative holdings that make up line LR. Empty for a fund. | [optional] [default to List<TaxReturnLoanRelationshipRow>]
**lineLRTotal** | **java.math.BigDecimal** | The total of line LR, in whole pounds. Zero for a fund. | [optional] [default to java.math.BigDecimal]
**outside** | [**List&lt;TaxReturnExcludedRow&gt;**](TaxReturnExcludedRow.md) | The holdings excluded from the return, with the reason. | [optional] [default to List<TaxReturnExcludedRow>]
**summary** | [**List&lt;TaxReturnMemoRow&gt;**](TaxReturnMemoRow.md) | Memo rows such as the tax at the applicable rate and the minimum-profits trade profit. | [optional] [default to List<TaxReturnMemoRow>]
**syncBreakOpen** | **Boolean** | True when the tax records are out of sync with the ledger and the return cannot advance past Reviewed. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable List<TaxReturnWorkflowStep> steps = new List<TaxReturnWorkflowStep>();
@javax.annotation.Nullable List<TaxReturnDisposalRow> lineA = new List<TaxReturnDisposalRow>();
java.math.BigDecimal lineATotal = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReturnVintage> vintages = new List<TaxReturnVintage>();
@javax.annotation.Nullable List<TaxReturnSpreadInstalment> instalments = new List<TaxReturnSpreadInstalment>();
java.math.BigDecimal lineDTotal = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReturnLoanRelationshipRow> loanRelationships = new List<TaxReturnLoanRelationshipRow>();
java.math.BigDecimal lineLRTotal = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<TaxReturnExcludedRow> outside = new List<TaxReturnExcludedRow>();
@javax.annotation.Nullable List<TaxReturnMemoRow> summary = new List<TaxReturnMemoRow>();
Boolean syncBreakOpen = true;


TaxReturnResponse taxReturnResponseInstance = new TaxReturnResponse()
    .fundId(fundId)
    .period(period)
    .status(status)
    .steps(steps)
    .lineA(lineA)
    .lineATotal(lineATotal)
    .vintages(vintages)
    .instalments(instalments)
    .lineDTotal(lineDTotal)
    .loanRelationships(loanRelationships)
    .lineLRTotal(lineLRTotal)
    .outside(outside)
    .summary(summary)
    .syncBreakOpen(syncBreakOpen);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)