# com.finbourne.sdk.services.lusid.model.CapitalCallEvent
classname CapitalCallEvent
A call of committed capital on a CapitalInterest: the fund draws down the amount from the investor's  unfunded commitment, moving it to funded capital.                The total amount may optionally be broken down into slots (investment, managementFee, otherFee,  partnershipExpense, organisationalCost, recall, equalisationInterest, latePaymentInterest). When any  slot amount is supplied the slot amounts must sum to the total and one transaction is booked per  populated slot; otherwise a single legacy drawdown transaction is booked for the total.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the capital call takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount of committed capital called. Must be positive. When slot amounts are  supplied they must sum to this total. | [default to java.math.BigDecimal]
**investmentAmount** | **java.math.BigDecimal** | The part of the call that funds investments. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**managementFeeAmount** | **java.math.BigDecimal** | The part of the call that pays management fees. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**otherFeeAmount** | **java.math.BigDecimal** | The part of the call that pays other fees. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**partnershipExpenseAmount** | **java.math.BigDecimal** | The part of the call that pays partnership expenses. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**organisationalCostAmount** | **java.math.BigDecimal** | The part of the call that pays organisational costs. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallAmount** | **java.math.BigDecimal** | The part of the call that re-draws previously distributed recallable capital. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**equalisationInterestAmount** | **java.math.BigDecimal** | The part of the call that is equalisation interest. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**latePaymentInterestAmount** | **java.math.BigDecimal** | The part of the call that is late payment interest. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**outsideCommitmentSlots** | **List&lt;String&gt;** | The slots (names without the Amount suffix, e.g. \&quot;managementFee\&quot;) called outside the commitment,  so that they do not reduce the uncalled commitment. When omitted, defaults to equalisationInterest  and latePaymentInterest. | [optional] [default to List<String>]
**dealId** | **String** | The identifier of the deal the call relates to, if any. | [optional] [default to String]
**allocationEventId** | **String** | The identifier of the allocation event the call relates to, if any. | [optional] [default to String]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the call notice was issued, if known. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CapitalCallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal investmentAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal managementFeeAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal otherFeeAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal partnershipExpenseAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal organisationalCostAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal recallAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal equalisationInterestAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal latePaymentInterestAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<String> outsideCommitmentSlots = new List<String>();
@javax.annotation.Nullable String dealId = "example dealId";
@javax.annotation.Nullable String allocationEventId = "example allocationEventId";
@javax.annotation.Nullable OffsetDateTime noticeDate = OffsetDateTime.now();


CapitalCallEvent capitalCallEventInstance = new CapitalCallEvent()
    .date(date)
    .amount(amount)
    .investmentAmount(investmentAmount)
    .managementFeeAmount(managementFeeAmount)
    .otherFeeAmount(otherFeeAmount)
    .partnershipExpenseAmount(partnershipExpenseAmount)
    .organisationalCostAmount(organisationalCostAmount)
    .recallAmount(recallAmount)
    .equalisationInterestAmount(equalisationInterestAmount)
    .latePaymentInterestAmount(latePaymentInterestAmount)
    .outsideCommitmentSlots(outsideCommitmentSlots)
    .dealId(dealId)
    .allocationEventId(allocationEventId)
    .noticeDate(noticeDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)