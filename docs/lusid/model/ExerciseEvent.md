# com.finbourne.sdk.services.lusid.model.ExerciseEvent
classname ExerciseEvent
Definition of an exercise event.  This is an event that occurs on transformation of an instrument owing to exercise. e.g. an option of  some type into its underlying.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**instrument** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**anchorDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the exercise window starts, or point it takes effect on. | [default to OffsetDateTime]
**eventWindowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date the exercise window ends, or point it takes effect on. | [optional] [readonly] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ExerciseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidInstrument instrument = new LusidInstrument();
OffsetDateTime anchorDate = OffsetDateTime.now();
OffsetDateTime eventWindowEnd = OffsetDateTime.now();


ExerciseEvent exerciseEventInstance = new ExerciseEvent()
    .instrument(instrument)
    .anchorDate(anchorDate)
    .eventWindowEnd(eventWindowEnd);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)