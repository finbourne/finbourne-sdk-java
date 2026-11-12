# com.finbourne.sdk.services.lusid.model.PricingMethodologyAudit
classname PricingMethodologyAudit
The working behind a share class's dealing price: the net cashflow it was decided on, the spread applied and  what the methodology alone proposed, with how any Market swing triggers were evaluated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netCashflow** | **java.math.BigDecimal** | The fund&#39;s net dealing cashflow for the valuation point, in the fund currency. An inflow is positive and an outflow negative. | [default to java.math.BigDecimal]
**netCashflowPctOfNav** | **java.math.BigDecimal** | The net cashflow as a percentage of the previous valuation point&#39;s NAV. Absent when there is no previous NAV to measure it against. | [optional] [default to java.math.BigDecimal]
**spreadsApplied** | [**SwingSpreadApplied**](SwingSpreadApplied.md) |  | [optional] [default to SwingSpreadApplied]
**engineProposal** | [**PricingMethodologyEngineProposal**](PricingMethodologyEngineProposal.md) |  | [default to PricingMethodologyEngineProposal]
**override** | [**PricingMethodologyOverride**](PricingMethodologyOverride.md) |  | [optional] [default to PricingMethodologyOverride]
**inflowTrigger** | [**SwingTriggerEvaluation**](SwingTriggerEvaluation.md) |  | [optional] [default to SwingTriggerEvaluation]
**outflowTrigger** | [**SwingTriggerEvaluation**](SwingTriggerEvaluation.md) |  | [optional] [default to SwingTriggerEvaluation]
**dealingFlows** | [**DealingFlowSummary**](DealingFlowSummary.md) |  | [optional] [default to DealingFlowSummary]
**estimateValuation** | [**EstimateValuation**](EstimateValuation.md) |  | [optional] [default to EstimateValuation]
**approvalStatus** | **String** | Where a manually approved swing decision stands. Pending until a manager approves or overrides the engine&#39;s proposal, or when the proposal has changed since the decision was taken; Approved when the decision equals the proposal; Overridden when it differs. Absent when the swing policy approves automatically. | [optional] [default to String]
**dealingLinesNotValued** | [**List&lt;DealingLineNotValued&gt;**](DealingLineNotValued.md) | The dealing lines read for the swing decision that could not be valued into the share class currency: an amount in a currency that is neither the fund&#39;s nor any share class&#39;s, or a weight-only line. While any are present and no pricingMethodologyOverride has been submitted, no swing decision is taken, the dealing price is absent and the valuation point cannot be finalised; under an override the override&#39;s price stands and the lines remain listed here. Absent when every line was valued or the methodology does not swing. | [optional] [default to List<DealingLineNotValued>]
**completeness** | [**DealingBookCompleteness**](DealingBookCompleteness.md) |  | [optional] [default to DealingBookCompleteness]

```java
import com.finbourne.sdk.services.lusid.model.PricingMethodologyAudit;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal netCashflow = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal netCashflowPctOfNav = new java.math.BigDecimal("100.00");
SwingSpreadApplied spreadsApplied = new SwingSpreadApplied();
PricingMethodologyEngineProposal engineProposal = new PricingMethodologyEngineProposal();
PricingMethodologyOverride override = new PricingMethodologyOverride();
SwingTriggerEvaluation inflowTrigger = new SwingTriggerEvaluation();
SwingTriggerEvaluation outflowTrigger = new SwingTriggerEvaluation();
DealingFlowSummary dealingFlows = new DealingFlowSummary();
EstimateValuation estimateValuation = new EstimateValuation();
@javax.annotation.Nullable String approvalStatus = "example approvalStatus";
@javax.annotation.Nullable List<DealingLineNotValued> dealingLinesNotValued = new List<DealingLineNotValued>();
DealingBookCompleteness completeness = new DealingBookCompleteness();


PricingMethodologyAudit pricingMethodologyAuditInstance = new PricingMethodologyAudit()
    .netCashflow(netCashflow)
    .netCashflowPctOfNav(netCashflowPctOfNav)
    .spreadsApplied(spreadsApplied)
    .engineProposal(engineProposal)
    .override(override)
    .inflowTrigger(inflowTrigger)
    .outflowTrigger(outflowTrigger)
    .dealingFlows(dealingFlows)
    .estimateValuation(estimateValuation)
    .approvalStatus(approvalStatus)
    .dealingLinesNotValued(dealingLinesNotValued)
    .completeness(completeness);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)