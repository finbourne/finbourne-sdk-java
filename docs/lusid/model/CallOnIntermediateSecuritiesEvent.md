# com.finbourne.sdk.services.lusid.model.CallOnIntermediateSecuritiesEvent
classname CallOnIntermediateSecuritiesEvent
CallOnIntermediateSecuritiesEvent event (EXRI), representing an exercise on intermediate securities resulting from an intermediate securities distribution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the issue ends. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the event. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**price** | **java.math.BigDecimal** | The price at which new units are purchased. | [default to java.math.BigDecimal]
**exerciseCurrency** | **String** | The currency of the exercise. | [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this event. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse election for this event. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.CallOnIntermediateSecuritiesEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime expiryDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
NewInstrument newInstrument = new NewInstrument();
UnitsRatio unitsRatio = new UnitsRatio();
java.math.BigDecimal price = new java.math.BigDecimal("100.00");
String exerciseCurrency = "example exerciseCurrency";
@javax.annotation.Nullable List<OptionExerciseElection> optionExerciseElections = new List<OptionExerciseElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


CallOnIntermediateSecuritiesEvent callOnIntermediateSecuritiesEventInstance = new CallOnIntermediateSecuritiesEvent()
    .expiryDate(expiryDate)
    .paymentDate(paymentDate)
    .newInstrument(newInstrument)
    .unitsRatio(unitsRatio)
    .price(price)
    .exerciseCurrency(exerciseCurrency)
    .optionExerciseElections(optionExerciseElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)