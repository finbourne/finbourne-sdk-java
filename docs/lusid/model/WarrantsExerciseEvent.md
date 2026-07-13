# com.finbourne.sdk.services.lusid.model.WarrantsExerciseEvent
classname WarrantsExerciseEvent
Warrants Exercise (EXWA) — the holder's election to exercise an outstanding warrant, paying the  strike and receiving the underlying security, or to let it lapse at zero proceeds. Elective  (Voluntary / MandatoryWithChoices) on EquityOption (EquityOptionType = Warrant) and SimpleInstrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The DvP settlement date on which the strike is paid and the underlying is delivered.  Must be on or after PeriodOfActionEnd. | [optional] [default to OffsetDateTime]
**periodOfActionStart** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the exercise window. | [optional] [default to OffsetDateTime]
**periodOfActionEnd** | [**OffsetDateTime**](OffsetDateTime.md) | End of the exercise window. | [optional] [default to OffsetDateTime]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Holder response deadline. Required when participation is MandatoryWithChoices. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Market deadline. Required when participation is MandatoryWithChoices. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Early response deadline. Optional; populated by some vendor wires. | [optional] [default to OffsetDateTime]
**strikePerUnit** | **java.math.BigDecimal** | Cash payable per warrant on exercise. Null-allowed on upsert if the warrant instrument resolves  a non-null EquityOption.Strike (instrument-level fallback applied later). If supplied, must be  strictly positive and accompanied by a StrikeCurrency. | [optional] [default to java.math.BigDecimal]
**strikeCurrency** | **String** | Currency of the strike (ISO 4217 3-letter code). Required if StrikePerUnit is non-null. | [optional] [default to String]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [optional] [default to UnitsRatio]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**fractionDisposition** | **String** | Handling of fractional underlying units. Defaults to round-down (RDDN) in the holdings engine when null.                Supported string (enumeration) values are: [RDDN, CINL]. Available values: RDDN, CINL. | [optional] [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise elections for this event. At least one entry. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections for this event. Required when participation is MandatoryWithChoices or when the  issuer publishes a no-action default. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.WarrantsExerciseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime periodOfActionStart = OffsetDateTime.now();
OffsetDateTime periodOfActionEnd = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime responseDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime marketDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime earlyResponseDeadline = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal strikePerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String strikeCurrency = "example strikeCurrency";
UnitsRatio unitsRatio = new UnitsRatio();
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable String fractionDisposition = "example fractionDisposition";
@javax.annotation.Nullable List<OptionExerciseElection> optionExerciseElections = new List<OptionExerciseElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


WarrantsExerciseEvent warrantsExerciseEventInstance = new WarrantsExerciseEvent()
    .paymentDate(paymentDate)
    .periodOfActionStart(periodOfActionStart)
    .periodOfActionEnd(periodOfActionEnd)
    .responseDeadlineDate(responseDeadlineDate)
    .marketDeadlineDate(marketDeadlineDate)
    .earlyResponseDeadline(earlyResponseDeadline)
    .strikePerUnit(strikePerUnit)
    .strikeCurrency(strikeCurrency)
    .unitsRatio(unitsRatio)
    .newInstrument(newInstrument)
    .fractionDisposition(fractionDisposition)
    .optionExerciseElections(optionExerciseElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)