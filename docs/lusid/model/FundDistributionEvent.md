# com.finbourne.sdk.services.lusid.model.FundDistributionEvent
classname FundDistributionEvent
A distribution from the fund to the holder of a CapitalInterest. A recallable distribution restores  unfunded capital (the fund may call it again); a non-recallable distribution permanently returns capital.                The total amount may optionally be broken down into slots by character (returnOfCapital, realisedGain,  dividend, interest, otherIncome, carryPaid, withholding, returnOfExcess). When any slot amount is supplied  the slot amounts must sum to the total, one transaction is booked per populated slot, and the recallable  portion of each of the five capital/income characters is given by its matching Recallable amount.  Without slots a single legacy distribution transaction is booked for the total, recallable according  to isRecallable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the distribution takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount distributed. Must be positive. When slot amounts are supplied they must sum to this total. | [default to java.math.BigDecimal]
**isRecallable** | **Boolean** | Legacy flag, used only when no slot amount is supplied: true when the fund may recall the whole  distributed amount, so the distribution restores unfunded capital rather than permanently returning  it. Defaults to false. Must not be combined with slot amounts. | [optional] [default to Boolean]
**returnOfCapitalAmount** | **java.math.BigDecimal** | The part of the distribution that returns capital. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**realisedGainAmount** | **java.math.BigDecimal** | The part of the distribution that is realised gain. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**dividendAmount** | **java.math.BigDecimal** | The part of the distribution that is dividend income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**interestAmount** | **java.math.BigDecimal** | The part of the distribution that is interest income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**otherIncomeAmount** | **java.math.BigDecimal** | The part of the distribution that is other income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnOfCapitalRecallableAmount** | **java.math.BigDecimal** | The recallable portion of returnOfCapitalAmount. Optional; must not exceed returnOfCapitalAmount. | [optional] [default to java.math.BigDecimal]
**realisedGainRecallableAmount** | **java.math.BigDecimal** | The recallable portion of realisedGainAmount. Optional; must not exceed realisedGainAmount. | [optional] [default to java.math.BigDecimal]
**dividendRecallableAmount** | **java.math.BigDecimal** | The recallable portion of dividendAmount. Optional; must not exceed dividendAmount. | [optional] [default to java.math.BigDecimal]
**interestRecallableAmount** | **java.math.BigDecimal** | The recallable portion of interestAmount. Optional; must not exceed interestAmount. | [optional] [default to java.math.BigDecimal]
**otherIncomeRecallableAmount** | **java.math.BigDecimal** | The recallable portion of otherIncomeAmount. Optional; must not exceed otherIncomeAmount. | [optional] [default to java.math.BigDecimal]
**carryPaidAmount** | **java.math.BigDecimal** | The part of the distribution that is carried interest paid to the general partner. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**withholdingAmount** | **java.math.BigDecimal** | The part of the distribution withheld for tax (a deemed distribution). Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnOfExcessAmount** | **java.math.BigDecimal** | The part of the distribution that returns capital called in excess. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The date until which the recallable portions may be recalled, if limited. Must not precede the distribution date. | [optional] [default to OffsetDateTime]
**dealId** | **String** | The identifier of the deal the distribution relates to, if any. | [optional] [default to String]
**allocationEventId** | **String** | The identifier of the allocation event the distribution relates to, if any. | [optional] [default to String]
**waterfallTier** | **String** | The waterfall tier the distribution was paid under, if any. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
Boolean isRecallable = true;
@javax.annotation.Nullable java.math.BigDecimal returnOfCapitalAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal realisedGainAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dividendAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal interestAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal otherIncomeAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal returnOfCapitalRecallableAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal realisedGainRecallableAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dividendRecallableAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal interestRecallableAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal otherIncomeRecallableAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal carryPaidAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal withholdingAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal returnOfExcessAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime recallableUntil = OffsetDateTime.now();
@javax.annotation.Nullable String dealId = "example dealId";
@javax.annotation.Nullable String allocationEventId = "example allocationEventId";
@javax.annotation.Nullable String waterfallTier = "example waterfallTier";


FundDistributionEvent fundDistributionEventInstance = new FundDistributionEvent()
    .date(date)
    .amount(amount)
    .isRecallable(isRecallable)
    .returnOfCapitalAmount(returnOfCapitalAmount)
    .realisedGainAmount(realisedGainAmount)
    .dividendAmount(dividendAmount)
    .interestAmount(interestAmount)
    .otherIncomeAmount(otherIncomeAmount)
    .returnOfCapitalRecallableAmount(returnOfCapitalRecallableAmount)
    .realisedGainRecallableAmount(realisedGainRecallableAmount)
    .dividendRecallableAmount(dividendRecallableAmount)
    .interestRecallableAmount(interestRecallableAmount)
    .otherIncomeRecallableAmount(otherIncomeRecallableAmount)
    .carryPaidAmount(carryPaidAmount)
    .withholdingAmount(withholdingAmount)
    .returnOfExcessAmount(returnOfExcessAmount)
    .recallableUntil(recallableUntil)
    .dealId(dealId)
    .allocationEventId(allocationEventId)
    .waterfallTier(waterfallTier);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)