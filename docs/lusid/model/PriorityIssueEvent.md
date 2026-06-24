# com.finbourne.sdk.services.lusid.model.PriorityIssueEvent
classname PriorityIssueEvent
Priority Issue Event (PRIO) — a voluntary corporate action in which an issuer offers existing  security holders preferential rights to subscribe for new securities at a defined subscription  price before the offer is opened to the wider market. Holders may subscribe up to a basic  entitlement (SECU) and, where offered, apply for additional securities beyond the basic  entitlement (OVER, subject to proration). No instruction (NOAC) results in no transaction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the priority issue was announced. Optional, informational. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | First business day on which the security trades without the entitlement. Optional.  When not supplied, transaction-template generation falls back to RecordDate | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date — holders of record on this date are eligible to subscribe. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The account-servicer instruction deadline. Must be less than or equal to MarketDeadline. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-agent deadline. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which cash is debited and the new securities are credited. | [optional] [default to OffsetDateTime]
**securitySettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the security leg settles when it differs from the cash leg. Optional.  When not supplied, transaction-template generation falls back to PaymentDate | [optional] [default to OffsetDateTime]
**subscriptionPrice** | **java.math.BigDecimal** | The subscription price per new unit. Applies to both SECU and OVER subscriptions.  Must be greater than zero. | [optional] [default to java.math.BigDecimal]
**subscriptionCurrency** | **String** | Currency of the SubscriptionPrice. | [optional] [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**prorationRate** | **java.math.BigDecimal** | The proration rate applied to OVER subscriptions when the offer is oversubscribed.  Treated as 1 (full allocation) when not supplied. Must be greater than 0 and less than  or equal to 1. SECU basic entitlement is never prorated. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Price per fractional unit used to compute cash-in-lieu for fractional entitlement remainders.  When not supplied, fractional residuals are discarded with no cash-in-lieu.  Forms an optional pair with FractionalUnitsCashCurrency — both must be supplied together. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Currency of FractionalUnitsCashPrice. Required if and only if FractionalUnitsCashPrice is supplied. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | Security offer elections — exactly one entry keyed &#39;SECU&#39; (basic entitlement) and an optional  entry keyed &#39;OVER&#39; (over-subscription) when the issuer offers the over-subscription facility. | [optional] [default to List<SecurityOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections — exactly one entry keyed &#39;NOAC&#39;, recording the holder&#39;s explicit no-action election. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.PriorityIssueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime responseDeadline = OffsetDateTime.now();
OffsetDateTime marketDeadline = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime securitySettlementDate = OffsetDateTime.now();
java.math.BigDecimal subscriptionPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String subscriptionCurrency = "example subscriptionCurrency";
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable java.math.BigDecimal prorationRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


PriorityIssueEvent priorityIssueEventInstance = new PriorityIssueEvent()
    .announcementDate(announcementDate)
    .exDate(exDate)
    .recordDate(recordDate)
    .responseDeadline(responseDeadline)
    .marketDeadline(marketDeadline)
    .paymentDate(paymentDate)
    .securitySettlementDate(securitySettlementDate)
    .subscriptionPrice(subscriptionPrice)
    .subscriptionCurrency(subscriptionCurrency)
    .newInstrument(newInstrument)
    .prorationRate(prorationRate)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .securityOfferElections(securityOfferElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)