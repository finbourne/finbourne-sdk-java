# com.finbourne.sdk.services.lusid.model.FacilityInterestEvent
classname FacilityInterestEvent
Interest accrued on the drawn balance of a fund-level credit facility for a period, at the facility rate  on the given day-count basis: outstanding x rate x days / basis. A partnership expense that is allocated  to partners like other fund expenses; it never moves a partner's capital balances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent, DepositInterestCapitalisationEvent. | [default to String]
**facilityId** | **String** | The code of the facility on the fund that the event relates to. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the accrual period. | [optional] [default to OffsetDateTime]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the accrual period; the date the interest is booked. | [optional] [default to OffsetDateTime]
**outstanding** | **java.math.BigDecimal** | The drawn balance the interest accrues on, in the facility currency. Must be positive. | [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | The annual interest rate of the facility (reference rate plus margin) as a decimal fraction, e.g. 0.06 for 6%. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day-count convention the accrual is calculated on, e.g. Act360, Act365 or Thirty360. | [default to String]
**currency** | **String** | The currency of the facility, in which the amount is denominated. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FacilityInterestEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String facilityId = "example facilityId";
OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal outstanding = new java.math.BigDecimal("100.00");
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
String dayCountConvention = "example dayCountConvention";
String currency = "example currency";


FacilityInterestEvent facilityInterestEventInstance = new FacilityInterestEvent()
    .facilityId(facilityId)
    .periodStart(periodStart)
    .date(date)
    .outstanding(outstanding)
    .rate(rate)
    .dayCountConvention(dayCountConvention)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)