# com.finbourne.sdk.services.lusid.model.BondForwardCashSettlementEvent
classname BondForwardCashSettlementEvent
Cash settlement of a BondForward at its settlement date:  the forward closes against a single net payment of the clean price difference, and no bond changes  hands. Unlike a commodity forward the underlying is a mastered, quoted instrument, so LUSID computes  the settlement amount from the underlying's quote rather than taking a pre-netted figure; a supplied  referencePrice wins and the quote is not consulted.  Accrued does not enter the payoff, by cancellation rather than entitlement: both sides of the  difference accrue to the same date, so the accrued is identical on each and drops out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent. | [default to String]
**agreedCleanPrice** | **java.math.BigDecimal** | The agreed price, percent of par, carried from the definition. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Face amount per unit, carried from the definition. It scales the payoff, so it is rejected where it  differs from the instrument&#39;s own value. | [default to java.math.BigDecimal]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The forward&#39;s contractual settlement date, on which the price difference fixes. | [optional] [default to OffsetDateTime]
**referencePrice** | **java.math.BigDecimal** | The underlying&#39;s clean price, percent of par, at the settlement date. Null resolves from the  underlying&#39;s quote; a supplied value wins and the quote is not consulted. | [optional] [default to java.math.BigDecimal]
**settlementAmountPerUnit** | **java.math.BigDecimal** | Output only: the net settlement per unit, computed from the reference price, the agreed price and  the contract size. A supplied value is overwritten. Negative is valid and means the holder pays. | [optional] [default to java.math.BigDecimal]
**settlementCurrency** | **String** | Currency the net amount settles in, being the forward&#39;s domestic currency. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the net payment settles. Null means the maturity date; cash-settled forwards commonly pay  a day or two after the price fixes. Rejected where earlier than the maturity date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.BondForwardCashSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal agreedCleanPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal contractSize = new java.math.BigDecimal("100.00");
OffsetDateTime maturityDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal referencePrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal settlementAmountPerUnit = new java.math.BigDecimal("100.00");
String settlementCurrency = "example settlementCurrency";
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();


BondForwardCashSettlementEvent bondForwardCashSettlementEventInstance = new BondForwardCashSettlementEvent()
    .agreedCleanPrice(agreedCleanPrice)
    .contractSize(contractSize)
    .maturityDate(maturityDate)
    .referencePrice(referencePrice)
    .settlementAmountPerUnit(settlementAmountPerUnit)
    .settlementCurrency(settlementCurrency)
    .settlementDate(settlementDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)