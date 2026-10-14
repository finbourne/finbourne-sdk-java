# com.finbourne.sdk.services.lusid.model.CapitalInterestTransferEvent
classname CapitalInterestTransferEvent
The movement of a proportion of a CapitalInterest line's capital balances from one line to another.  The source (Out) side moves every balance by the fraction; the destination (In) side receives the  amounts given on the event. Mode distinguishes a genuine transfer between investors from a correction  of a mis-booked position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the transfer takes effect. | [optional] [default to OffsetDateTime]
**direction** | **String** | Which side of the transfer this event books: &#39;Out&#39; on the source line or &#39;In&#39; on the destination line. Available values: Out, In. | [default to String]
**fraction** | **java.math.BigDecimal** | The fraction of the source line being transferred. Must be greater than zero and at most one;  a fraction of one moves the whole line. | [default to java.math.BigDecimal]
**fromLineId** | **String** | The identifier of the line the balances move from. | [default to String]
**toLineId** | **String** | The identifier of the line the balances move to. | [default to String]
**mode** | **String** | &#39;Transfer&#39; for a genuine transfer between investors or &#39;Correction&#39; for a backdated fix of a  mis-booked position. Defaults to &#39;Transfer&#39;. Available values: Transfer, Correction. | [optional] [default to String]
**toPortfolioId** | **String** | The identifier of the portfolio holding the destination line, if different from the source. | [optional] [default to String]
**considerationAmount** | **java.math.BigDecimal** | The consideration paid for the transferred interest, if any. Must not be negative. | [optional] [default to java.math.BigDecimal]
**considerationCurrency** | **String** | The currency of the consideration, if any. | [optional] [default to String]
**considerationRecordOnly** | **Boolean** | True when the consideration is recorded for information only and does not settle. | [optional] [default to Boolean]
**reason** | **String** | The reason for the transfer, if given: &#39;TaxStatusChange&#39;, &#39;Redomicile&#39;, &#39;SecondaryBuyerIneligible&#39;,  &#39;BenefitPlanLimit&#39;, &#39;WrongVehicleAtClose&#39;, &#39;AffiliateTransfer&#39;, &#39;Regulatory&#39;, &#39;VehicleMergerOrClosure&#39;,  &#39;NomineeUnwind&#39; or &#39;BlockerOrAivElection&#39;. Available values: None, TaxStatusChange, Redomicile, SecondaryBuyerIneligible, BenefitPlanLimit, WrongVehicleAtClose, AffiliateTransfer, Regulatory, VehicleMergerOrClosure, NomineeUnwind, BlockerOrAivElection. | [optional] [default to String]
**scope** | **String** | &#39;Whole&#39; to move the whole line or &#39;Deal&#39; to move only one deal&#39;s balances. &#39;Deal&#39; is only allowed  with reason &#39;BlockerOrAivElection&#39;. Defaults to &#39;Whole&#39;. Available values: Whole, Deal. | [optional] [default to String]
**dealId** | **String** | The identifier of the deal the transfer relates to, if any. | [optional] [default to String]
**taxTreatmentAcknowledged** | **Boolean** | Acknowledges that the tax treatment of a blocker or AIV election has been reviewed. Required to be  true when the reason is &#39;BlockerOrAivElection&#39;. | [optional] [default to Boolean]
**committedCapitalAmount** | **java.math.BigDecimal** | The committed capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**calledCommitmentAmount** | **java.math.BigDecimal** | The called part of the commitment received by the destination line, which lowers its uncalled commitment. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**paidInCapitalAmount** | **java.math.BigDecimal** | The paid-in capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnedCapitalAmount** | **java.math.BigDecimal** | The returned capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallableCapitalAmount** | **java.math.BigDecimal** | The recallable capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**nonRecallableCapitalAmount** | **java.math.BigDecimal** | The non-recallable capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**fundedCapitalAmount** | **java.math.BigDecimal** | The funded capital received by the destination line, for a line whose drawdowns were booked against the stored funded balance rather than paid-in capital. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CapitalInterestTransferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
String direction = "example direction";
java.math.BigDecimal fraction = new java.math.BigDecimal("100.00");
String fromLineId = "example fromLineId";
String toLineId = "example toLineId";
@javax.annotation.Nullable String mode = "example mode";
@javax.annotation.Nullable String toPortfolioId = "example toPortfolioId";
@javax.annotation.Nullable java.math.BigDecimal considerationAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String considerationCurrency = "example considerationCurrency";
@javax.annotation.Nullable Boolean considerationRecordOnly = true;
@javax.annotation.Nullable String reason = "example reason";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String dealId = "example dealId";
@javax.annotation.Nullable Boolean taxTreatmentAcknowledged = true;
@javax.annotation.Nullable java.math.BigDecimal committedCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal calledCommitmentAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal paidInCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal returnedCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal recallableCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal nonRecallableCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fundedCapitalAmount = new java.math.BigDecimal("100.00");


CapitalInterestTransferEvent capitalInterestTransferEventInstance = new CapitalInterestTransferEvent()
    .date(date)
    .direction(direction)
    .fraction(fraction)
    .fromLineId(fromLineId)
    .toLineId(toLineId)
    .mode(mode)
    .toPortfolioId(toPortfolioId)
    .considerationAmount(considerationAmount)
    .considerationCurrency(considerationCurrency)
    .considerationRecordOnly(considerationRecordOnly)
    .reason(reason)
    .scope(scope)
    .dealId(dealId)
    .taxTreatmentAcknowledged(taxTreatmentAcknowledged)
    .committedCapitalAmount(committedCapitalAmount)
    .calledCommitmentAmount(calledCommitmentAmount)
    .paidInCapitalAmount(paidInCapitalAmount)
    .returnedCapitalAmount(returnedCapitalAmount)
    .recallableCapitalAmount(recallableCapitalAmount)
    .nonRecallableCapitalAmount(nonRecallableCapitalAmount)
    .fundedCapitalAmount(fundedCapitalAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)