# com.finbourne.sdk.services.lusid.model.ConsentEvent
classname ConsentEvent
Consent Event (CONS) — a voluntary corporate action where an issuer seeks approval  from security holders to amend the terms of an outstanding instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**consentType** | **String** | The type of consent solicitation.                Supported string (enumeration) values are: [ChangeInTerms, DueAndPayable]. Available values: ChangeInTerms, DueAndPayable. | [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The last date to submit instructions. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-set outer deadline. Must be greater than or equal to ResponseDeadline. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Deadline for early consent. Required when a CONY-early CashOfferElection is offered.  Must be earlier than ResponseDeadline. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the consent fee is paid. Required when any CashOfferElection is offered. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible cash offer elections for this event. Each tier (CONY-standard, CONY-early)  is modelled as a separate entry; the election carries the per-unit fee rate and currency. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible lapse elections for this event (NOAC, CONN, ABST). | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.ConsentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String consentType = "example consentType";
OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime responseDeadline = OffsetDateTime.now();
OffsetDateTime marketDeadline = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime earlyResponseDeadline = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


ConsentEvent consentEventInstance = new ConsentEvent()
    .consentType(consentType)
    .recordDate(recordDate)
    .responseDeadline(responseDeadline)
    .marketDeadline(marketDeadline)
    .earlyResponseDeadline(earlyResponseDeadline)
    .paymentDate(paymentDate)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)