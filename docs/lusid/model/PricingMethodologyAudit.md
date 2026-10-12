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


PricingMethodologyAudit pricingMethodologyAuditInstance = new PricingMethodologyAudit()
    .netCashflow(netCashflow)
    .netCashflowPctOfNav(netCashflowPctOfNav)
    .spreadsApplied(spreadsApplied)
    .engineProposal(engineProposal)
    .override(override)
    .inflowTrigger(inflowTrigger)
    .outflowTrigger(outflowTrigger)
    .dealingFlows(dealingFlows);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)