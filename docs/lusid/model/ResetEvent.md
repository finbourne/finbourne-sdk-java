# com.finbourne.sdk.services.lusid.model.ResetEvent
classname ResetEvent
Definition of a reset event.  This is an event that describes a reset or fixing for an instrument such as the floating payment on  a swap cash flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent. | [default to String]
**value** | **java.math.BigDecimal** | The quantity associated with the reset. This will only be populated if the information is known. | [optional] [default to java.math.BigDecimal]
**resetType** | **String** | The type of the reset; e.g. RIC, Currency-pair | [default to String]
**fixingSource** | **String** | Fixing identification source, if available. | [optional] [default to String]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the reset fixes, or is observed upon. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ResetEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal value = new java.math.BigDecimal("100.00");
String resetType = "example resetType";
@javax.annotation.Nullable String fixingSource = "example fixingSource";
OffsetDateTime fixingDate = OffsetDateTime.now();


ResetEvent resetEventInstance = new ResetEvent()
    .value(value)
    .resetType(resetType)
    .fixingSource(fixingSource)
    .fixingDate(fixingDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)