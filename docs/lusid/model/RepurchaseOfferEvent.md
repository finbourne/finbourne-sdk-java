# com.finbourne.sdk.services.lusid.model.RepurchaseOfferEvent
classname RepurchaseOfferEvent
Representation of a repurchase offer corporate action.  Represents an offer by the issuer to repurchase its own shares from a shareholder at a given price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the event. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the issuer or by an agent of the issuer as the latest date to respond to the offer. Must be before or equal to the PaymentDate. | [optional] [default to OffsetDateTime]
**repurchaseQuantity** | **java.math.BigDecimal** | Quantity of the security to be repurchased. | [default to java.math.BigDecimal]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. Only 1 should be provided. | [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Only 1 should be provided.  Allows the user to opt out of the offer. | [default to List<LapseElection>]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Only 1 should be provided. | [default to List<TenderOfferElection>]
**prorationRate** | **java.math.BigDecimal** | The fraction used to calculate a proportional adjustment for RepurchaseQuantity when a full period is not used.  Defaults to 1 if not set. Must be greater than 0 and less than or equal to 1. | [optional] [default to java.math.BigDecimal]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the account servicer as the latest date to respond to the offer.  Optional. If set, must be before or equal to MarketDeadlineDate.  Defaults to MarketDeadlineDate if not set. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Optional CTEN early-tender deadline. If set, must be on or before ResponseDeadlineDate.  Used for bond tender offers where early tenders attract a premium. | [optional] [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** | Bond-specific minimum instructable face amount. Optional.  Must be strictly positive when set. | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** | Bond-specific increment above MinPieceSize. Optional.  When set, MinPieceSize must also be set. Must be strictly positive. | [optional] [default to java.math.BigDecimal]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Optional per-unit accrued interest on the accepted face amount, from the last coupon date  up to (but excluding) PaymentDate. Bond-like instruments only. If left empty,  resolves it internally at event time from the bond&#39;s coupon schedule and market data. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RepurchaseOfferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime marketDeadlineDate = OffsetDateTime.now();
java.math.BigDecimal repurchaseQuantity = new java.math.BigDecimal("100.00");
List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
List<LapseElection> lapseElections = new List<LapseElection>();
List<TenderOfferElection> tenderOfferElections = new List<TenderOfferElection>();
java.math.BigDecimal prorationRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime responseDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime earlyResponseDeadline = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal minPieceSize = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal minIncrement = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal accruedInterestPerUnit = new java.math.BigDecimal("100.00");


RepurchaseOfferEvent repurchaseOfferEventInstance = new RepurchaseOfferEvent()
    .paymentDate(paymentDate)
    .marketDeadlineDate(marketDeadlineDate)
    .repurchaseQuantity(repurchaseQuantity)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections)
    .tenderOfferElections(tenderOfferElections)
    .prorationRate(prorationRate)
    .responseDeadlineDate(responseDeadlineDate)
    .earlyResponseDeadline(earlyResponseDeadline)
    .minPieceSize(minPieceSize)
    .minIncrement(minIncrement)
    .accruedInterestPerUnit(accruedInterestPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)