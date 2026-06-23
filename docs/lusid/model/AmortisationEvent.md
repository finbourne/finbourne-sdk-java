# com.finbourne.sdk.services.lusid.model.AmortisationEvent
classname AmortisationEvent
Definition of an Amortisation event.  This is an event that describes the occurence of amortisation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent. | [default to String]
**amountReduced** | **java.math.BigDecimal** | The amount reduced in this amortisation event.  That is, the difference between the previous notional amount and the current notional amount as set in this event. | [default to java.math.BigDecimal]
**domCcy** | **String** | Domestic currency of the originating instrument | [default to String]
**payReceive** | **String** | Is this event in relation to the Pay or Receive leg | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the principal payment is to be made. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AmortisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amountReduced = new java.math.BigDecimal("100.00");
String domCcy = "example domCcy";
String payReceive = "example payReceive";
OffsetDateTime paymentDate = OffsetDateTime.now();


AmortisationEvent amortisationEventInstance = new AmortisationEvent()
    .amountReduced(amountReduced)
    .domCcy(domCcy)
    .payReceive(payReceive)
    .paymentDate(paymentDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)