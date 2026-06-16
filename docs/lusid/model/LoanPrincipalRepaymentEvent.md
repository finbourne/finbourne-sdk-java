# com.finbourne.sdk.services.lusid.model.LoanPrincipalRepaymentEvent
classname LoanPrincipalRepaymentEvent
Event to signify the repayment of some or all of the principal balance of a loan contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the Principal is due to be paid. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the Principal is paid automatically or not.  Exactly one election must be provided. | [optional] [default to List<LapseElection>]
**fraction** | **java.math.BigDecimal** | Fraction of the outstanding settled principal balance to be repaid. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. Ignored if the field Amount is set to a value different than zero. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | Amount to be repaid (independent of the fraction).  This field is not used at all if not set or set to 0, in this case the fraction field will be used instead.  Otherwise, the fraction field is ignored. | [optional] [default to java.math.BigDecimal]
**withInterest** | **Boolean** | If set to true, then active contracts whose balance is reduced by the repayment will have  their accrued interest repaid proportionally to the balance reduction. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.LoanPrincipalRepaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable java.math.BigDecimal fraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
Boolean withInterest = true;


LoanPrincipalRepaymentEvent loanPrincipalRepaymentEventInstance = new LoanPrincipalRepaymentEvent()
    .paymentDate(paymentDate)
    .currency(currency)
    .lapseElections(lapseElections)
    .fraction(fraction)
    .amount(amount)
    .withInterest(withInterest);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)