# com.finbourne.sdk.services.lusid.model.BondOptionTerminationEvent
classname BondOptionTerminationEvent
Bond option termination — the underlying bond of a BondOption was redeemed early (called), which  terminates the option and settles its residual intrinsic value against the price the underlying was  actually called at. Posted against the option's own instrument by the feed or orchestration layer:  LUSID does not derive it from the underlying's own EarlyRedemptionEvent, because the corporate action  dependency graph is self-keyed by LUID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent. | [default to String]
**terminationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the option terminates, being the effective date of the underlying bond&#39;s early redemption. | [optional] [default to OffsetDateTime]
**callPrice** | **java.math.BigDecimal** | The price the underlying bond was actually redeemed at, as a percentage of par. Must be supplied:  it comes from the underlying&#39;s own redemption and cannot be inferred from the option. | [default to java.math.BigDecimal]
**settlementCurrency** | **String** | The currency the residual settlement is paid in, being the option&#39;s domestic currency. | [default to String]
**domCcy** | **String** | The domestic currency of the option. | [default to String]
**settlementAmountPerUnit** | **java.math.BigDecimal** | The residual intrinsic value settled per contract. Computed by LUSID from the call price and the  option&#39;s strike and contract size, so it is not supplied on the request; zero is a legitimate value  when the option terminates worthless. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BondOptionTerminationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime terminationDate = OffsetDateTime.now();
java.math.BigDecimal callPrice = new java.math.BigDecimal("100.00");
String settlementCurrency = "example settlementCurrency";
String domCcy = "example domCcy";
@javax.annotation.Nullable java.math.BigDecimal settlementAmountPerUnit = new java.math.BigDecimal("100.00");


BondOptionTerminationEvent bondOptionTerminationEventInstance = new BondOptionTerminationEvent()
    .terminationDate(terminationDate)
    .callPrice(callPrice)
    .settlementCurrency(settlementCurrency)
    .domCcy(domCcy)
    .settlementAmountPerUnit(settlementAmountPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)