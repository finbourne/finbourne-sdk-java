# com.finbourne.sdk.services.lusid.model.CancelSwapEvent
classname CancelSwapEvent
A cancel opportunity on a cancellable InterestRateSwap, generated once per date in the swap's cancel  schedule. The holder submits the SubscribeElection by the NoticeDueDate to cancel  the swap, and the opportunity lapses if no election is made. When the swap is cancelled, the current  period's coupon still settles and the position then closes at zero cost and proceeds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent. | [default to String]
**cancelDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the swap terminates if cancellation is elected. Always a date from the swap&#39;s cancel  schedule. | [optional] [default to OffsetDateTime]
**noticeDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date by which the election must be made, else the cancel opportunity lapses. Derived from the  CancelDate and the swap&#39;s notice convention. Must be &lt;&#x3D; CancelDate. | [optional] [default to OffsetDateTime]
**subscribeElections** | [**List&lt;SubscribeElection&gt;**](SubscribeElection.md) | The elections available on this cancel opportunity: exactly one SubscribeElection, keyed &#39;Cancel&#39;.  A chosen election cancels the swap. No chosen election means the opportunity lapsed and the swap  continues unchanged. | [optional] [default to List<SubscribeElection>]

```java
import com.finbourne.sdk.services.lusid.model.CancelSwapEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime cancelDate = OffsetDateTime.now();
OffsetDateTime noticeDueDate = OffsetDateTime.now();
@javax.annotation.Nullable List<SubscribeElection> subscribeElections = new List<SubscribeElection>();


CancelSwapEvent cancelSwapEventInstance = new CancelSwapEvent()
    .cancelDate(cancelDate)
    .noticeDueDate(noticeDueDate)
    .subscribeElections(subscribeElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)