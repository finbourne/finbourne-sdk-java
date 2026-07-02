# com.finbourne.sdk.services.lusid.model.LoanInterestRepaymentEvent
classname LoanInterestRepaymentEvent
Event to signify the repayment of interest accrued against a loan holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the interest is due to be paid. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]
**fraction** | **java.math.BigDecimal** | Fraction of the accrued on the holding to be repaid.  Must be between 0 and 1, inclusive.  Defaults to 1 if not set. | [optional] [default to java.math.BigDecimal]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the interest is paid automatically or not.  Exactly one election must be provided. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.LoanInterestRepaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
String currency = "example currency";
java.math.BigDecimal fraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


LoanInterestRepaymentEvent loanInterestRepaymentEventInstance = new LoanInterestRepaymentEvent()
    .paymentDate(paymentDate)
    .exDate(exDate)
    .currency(currency)
    .fraction(fraction)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)