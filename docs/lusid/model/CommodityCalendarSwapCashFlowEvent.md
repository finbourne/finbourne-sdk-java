# com.finbourne.sdk.services.lusid.model.CommodityCalendarSwapCashFlowEvent
classname CommodityCalendarSwapCashFlowEvent
Cash settlement of one calendar-average period of a CommodityCalendarSwap. One event fires per period  end date defined by the swap's schedule, including the final period; PeriodNumber identifies which.  The cash flow per unit is the pre-netted settlement price (the calendar average of the observed  commodity price minus the strike) supplied externally via the quote store — LUSID computes neither the  average nor the netting. A negative value is valid and means the period settled out of the money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent. | [default to String]
**periodEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the settling period, derived from the swap&#39;s schedule. The period settles against  the calendar average of the observed commodity price up to this date. Required, and the effective  date of the event. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the period, already adjusted for the schedule&#39;s business day convention,  payment calendars and coupon lag. Required. This is when the cash moves; the event itself is  effective at PeriodEndDate. | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency the period settles in, taken from the schedule&#39;s payment currency. Required. | [default to String]
**periodNumber** | **Integer** | The sequential number of the settling period, with the first period being 1 and the final period  being the total number of periods in the schedule. Required. | [default to Integer]
**quantityPerPeriod** | **java.math.BigDecimal** | The notional commodity quantity referenced by the period, and the number of units by which the  holding is reduced when the period settles. Required. | [default to java.math.BigDecimal]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-dividend date of the cash flow. Always equal to PeriodEndDate, since entitlement is  determined by the holding on the period end date. Required. | [optional] [default to OffsetDateTime]
**cashFlowPerUnit** | **java.math.BigDecimal** | The pre-netted settlement amount per unit for the period (the calendar average of the observed  commodity price minus the strike), supplied externally via the quote store. Optional — absent until  the settlement price has been resolved. Negative when the period settled out of the money. | [optional] [default to java.math.BigDecimal]
**cashFlowAmount** | **java.math.BigDecimal** | The settlement amount for the period, calculated as CashFlowPerUnit multiplied by  QuantityPerPeriod. Optional — absent until the settlement price has been resolved. Carries the  sign of CashFlowPerUnit. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CommodityCalendarSwapCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime periodEndDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
String currency = "example currency";
Integer periodNumber = new Integer("100.00");
java.math.BigDecimal quantityPerPeriod = new java.math.BigDecimal("100.00");
OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal cashFlowAmount = new java.math.BigDecimal("100.00");


CommodityCalendarSwapCashFlowEvent commodityCalendarSwapCashFlowEventInstance = new CommodityCalendarSwapCashFlowEvent()
    .periodEndDate(periodEndDate)
    .paymentDate(paymentDate)
    .currency(currency)
    .periodNumber(periodNumber)
    .quantityPerPeriod(quantityPerPeriod)
    .exDate(exDate)
    .cashFlowPerUnit(cashFlowPerUnit)
    .cashFlowAmount(cashFlowAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)