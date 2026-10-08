# com.finbourne.sdk.services.lusid.model.BankruptcyEvent
classname BankruptcyEvent
A Bankruptcy (BRUP) event recording the legal status of a company unable to meet its financial  obligations. With no elections it is a pure informational marker, generating no transactions and  having no position impact. It may also carry a ballot: one CashOfferElection per option that pays  cash and one LapseElection per option that pays nothing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the bankruptcy filing or court ruling. | [optional] [default to OffsetDateTime]
**notificationType** | **String** | Notification type: NEWM (new announcement), REPL (replacement/correction), or CANC (proceedings dismissed). Available values: NEWM, REPL, CANC. | [default to String]
**claimFilingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Date by which creditors must file a proof of claim. Optional — null when not applicable.  If provided, overrides EffectiveDate as the settle date of the resulting virtual transactions. | [optional] [default to OffsetDateTime]
**narrative** | **String** | Free-text detail: court, jurisdiction, trustee, plan reference. Optional. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the cash leg. Required when a CashOfferElection is offered, and accepted  but unused otherwise — inbound ballot notifications populate a pay date on pure votes that  settle no cash. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | One election per ballot option that pays cash, keyed \&quot;{OptionNumber}-{OptionCode}\&quot;, for  example \&quot;1-CASH\&quot;. Each election&#39;s CashOfferPrice is per eligible unit, not per 1000 of face.  Defaults to an empty list. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | One election per ballot option that pays nothing — consent granted with no fee, consent  denied, abstain, or no action — keyed \&quot;{OptionNumber}-{OptionCode}\&quot;, for example \&quot;6-NOAC\&quot;.  Keys are free-form because a real ballot carries CONY twice and CONN twice. Defaults to an  empty list. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.BankruptcyEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
String notificationType = "example notificationType";
@javax.annotation.Nullable OffsetDateTime claimFilingDeadline = OffsetDateTime.now();
@javax.annotation.Nullable String narrative = "example narrative";
@javax.annotation.Nullable OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


BankruptcyEvent bankruptcyEventInstance = new BankruptcyEvent()
    .effectiveDate(effectiveDate)
    .notificationType(notificationType)
    .claimFilingDeadline(claimFilingDeadline)
    .narrative(narrative)
    .paymentDate(paymentDate)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)