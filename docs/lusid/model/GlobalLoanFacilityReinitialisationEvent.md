# com.finbourne.sdk.services.lusid.model.GlobalLoanFacilityReinitialisationEvent
classname GlobalLoanFacilityReinitialisationEvent
Sets the global state of a LoanFacility - its commitment and the balance of each of its contracts - so that  an existing book can be migrated onto LUSID without replaying the credit events that would otherwise have  built that state up from inception.                A loan facility keeps global state shared by every investor, and that state is only ever built through  movements, so it cannot be declared through SetHoldings the way a self-contained holding can. Every later  event scales against this global state, so it has to be correct before anything else is booked.                This event carries no investor-level data. Investor positions are set separately by an  InvestorLoanFacilityReinitialisationEvent, keeping the shared facility and the individual position apart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent. | [default to String]
**contractStates** | [**List&lt;GlobalLoanFacilityContractState&gt;**](GlobalLoanFacilityContractState.md) | The desired global state of each contract under the facility. At least one contract is expected. | [default to List<GlobalLoanFacilityContractState>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Effective date of the reinitialisation. | [optional] [default to OffsetDateTime]
**globalCommitment** | **java.math.BigDecimal** | The desired total commitment of the facility, in the facility currency. Must be positive. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.GlobalLoanFacilityReinitialisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<GlobalLoanFacilityContractState> contractStates = new List<GlobalLoanFacilityContractState>();
OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal globalCommitment = new java.math.BigDecimal("100.00");


GlobalLoanFacilityReinitialisationEvent globalLoanFacilityReinitialisationEventInstance = new GlobalLoanFacilityReinitialisationEvent()
    .contractStates(contractStates)
    .date(date)
    .globalCommitment(globalCommitment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)