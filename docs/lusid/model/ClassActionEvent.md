# com.finbourne.sdk.services.lusid.model.ClassActionEvent
classname ClassActionEvent
Class Action Event (CLSA) — a voluntary corporate action under which security holders  receive cash compensation from a court-approved settlement fund following litigation  against an issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the settlement distribution is paid to the holder. | [optional] [default to OffsetDateTime]
**filingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Court-set deadline for submitting a proof of claim. | [optional] [default to OffsetDateTime]
**classPeriodStart** | [**OffsetDateTime**](OffsetDateTime.md) | Lower bound of the eligibility window (inclusive). | [optional] [default to OffsetDateTime]
**classPeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | Upper bound of the eligibility window (inclusive). | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date from which the security trades without the settlement right.  Null for most class actions where no ex date is defined. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which positions are struck for notification scope. Informational only. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement public-announcement or court-approval date. | [optional] [default to OffsetDateTime]
**caseReference** | **String** | Lawsuit or settlement-fund identifier (court case number, fund name). Audit-only. | [optional] [default to String]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Cash offer elections for this event. Exactly one entry carrying the per-share  settlement amount as CashOfferPrice and settlement currency as CashOfferCurrency. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections for this event. Exactly one entry (NOAC) with IsDefault &#x3D; true. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.ClassActionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime filingDeadline = OffsetDateTime.now();
OffsetDateTime classPeriodStart = OffsetDateTime.now();
OffsetDateTime classPeriodEnd = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
@javax.annotation.Nullable String caseReference = "example caseReference";
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


ClassActionEvent classActionEventInstance = new ClassActionEvent()
    .paymentDate(paymentDate)
    .filingDeadline(filingDeadline)
    .classPeriodStart(classPeriodStart)
    .classPeriodEnd(classPeriodEnd)
    .exDate(exDate)
    .recordDate(recordDate)
    .announcementDate(announcementDate)
    .caseReference(caseReference)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)