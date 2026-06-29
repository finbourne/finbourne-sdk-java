# com.finbourne.sdk.services.lusid.model.TriggerEvent
classname TriggerEvent
Definition of a trigger event.  This is an event that occurs on transformation of an option instrument being  triggered by a barrier/touch price level being hit by the underlying asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent. | [default to String]
**level** | **java.math.BigDecimal** | The underlying price level that triggers the event | [default to java.math.BigDecimal]
**triggerType** | **String** | The type of the trigger; valid options are Knock-In, Knock-Out, Touch or No-Touch | [default to String]
**triggerDirection** | **String** | The direction of the trigger; valid options are Up and Down | [default to String]
**triggerDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the trigger happens at. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the trigger takes effect. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.TriggerEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal level = new java.math.BigDecimal("100.00");
String triggerType = "example triggerType";
String triggerDirection = "example triggerDirection";
OffsetDateTime triggerDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();


TriggerEvent triggerEventInstance = new TriggerEvent()
    .level(level)
    .triggerType(triggerType)
    .triggerDirection(triggerDirection)
    .triggerDate(triggerDate)
    .maturityDate(maturityDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)