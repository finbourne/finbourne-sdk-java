# com.finbourne.sdk.services.lusid.model.InvestorLoanFacilityReinitialisationEvent
classname InvestorLoanFacilityReinitialisationEvent
Sets one investor's loan-facility position at tax lot granularity - contract balances, accrued interest and  cost - on lots a trade has already opened, where those are not simply the pro-rata share the trade derived  from the facility's global state. Every figure is an absolute target, not a delta.                Tax lot ids are only unique within a portfolio, and the event lives on a corporate action source that  several portfolios can share, so it names the portfolio it corrects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent. | [default to String]
**contractAllocations** | [**List&lt;LoanFacilityTaxLotAllocation&gt;**](LoanFacilityTaxLotAllocation.md) | Investor-level state per contract per tax lot - the balance, and the accrued interest on it where  that is stated rather than derived. Each entry names its own contract, so a tax lot holding a balance  on two contracts appears twice. May be omitted for a fully undrawn lot named in TaxLotStates. | [optional] [default to List<LoanFacilityTaxLotAllocation>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Effective date of the reinitialisation. The tax lots it names must already have been opened, and  settled, by a trade dated no later than this. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | Scope of the portfolio whose lots the event corrects. | [default to String]
**portfolioCode** | **String** | Code of the portfolio whose lots the event corrects. | [default to String]
**taxLotStates** | [**List&lt;LoanFacilityTaxLotState&gt;**](LoanFacilityTaxLotState.md) | Facility-level state per tax lot - cost, and the facility&#39;s own accrual on its undrawn amount. Keyed  on the tax lot alone, so a lot holding balances on several contracts has one entry here and one  ContractAllocation per contract. | [optional] [default to List<LoanFacilityTaxLotState>]

```java
import com.finbourne.sdk.services.lusid.model.InvestorLoanFacilityReinitialisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<LoanFacilityTaxLotAllocation> contractAllocations = new List<LoanFacilityTaxLotAllocation>();
OffsetDateTime date = OffsetDateTime.now();
String portfolioScope = "example portfolioScope";
String portfolioCode = "example portfolioCode";
@javax.annotation.Nullable List<LoanFacilityTaxLotState> taxLotStates = new List<LoanFacilityTaxLotState>();


InvestorLoanFacilityReinitialisationEvent investorLoanFacilityReinitialisationEventInstance = new InvestorLoanFacilityReinitialisationEvent()
    .contractAllocations(contractAllocations)
    .date(date)
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .taxLotStates(taxLotStates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)