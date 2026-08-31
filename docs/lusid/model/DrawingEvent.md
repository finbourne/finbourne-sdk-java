# com.finbourne.sdk.services.lusid.model.DrawingEvent
classname DrawingEvent
Mandatory partial bond redemption (DRAW) where the issuer lottery-selects specific bonds for early redemption.  The affected face amount (AFFB) is the lottery-selected portion of a holding that is redeemed. Because the  lottery selects per holder, AFFB genuinely differs between portfolios holding the same instrument, so it is  supplied per portfolio via an instrument event instruction rather than on the event itself. The event-level  AffectedAmount remains available as an optional fallback applied uniformly to every holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the cash actually flows for the drawn portion of the holding. | [optional] [default to OffsetDateTime]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Lottery Date (&#x3D; Record Date). Holdings are snapshotted at the close of this date to determine the affected balance. | [optional] [default to OffsetDateTime]
**affectedAmount** | **java.math.BigDecimal** | Affected face amount (AFFB) — the lottery-selected portion of the holding that is redeemed, applied uniformly  to every portfolio holding the instrument. Optional: because the lottery selects per holder, AFFB is normally  supplied per portfolio via an instrument event instruction instead. When supplied it must be strictly positive.  A portfolio with neither an instruction nor an event-level value is treated as unaffected (UNAF). | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | Redemption price per unit (OFFR / 100). Clean price convention.  Optional: AFFB is typically known before the issuer publishes OFFR, so a null price is permitted on upsert. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | Settlement currency for the redemption. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DrawingEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime effectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal affectedAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pricePerUnit = new java.math.BigDecimal("100.00");
String currency = "example currency";


DrawingEvent drawingEventInstance = new DrawingEvent()
    .paymentDate(paymentDate)
    .effectiveDate(effectiveDate)
    .affectedAmount(affectedAmount)
    .pricePerUnit(pricePerUnit)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)