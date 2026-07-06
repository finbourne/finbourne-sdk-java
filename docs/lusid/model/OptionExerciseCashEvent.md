# com.finbourne.sdk.services.lusid.model.OptionExerciseCashEvent
classname OptionExerciseCashEvent
Event for cash option exercises.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The cashflow per unit | [optional] [default to java.math.BigDecimal]
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The exercise date of the option. | [optional] [default to OffsetDateTime]
**deliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The delivery date of the option. | [optional] [default to OffsetDateTime]
**exerciseType** | **String** | The optionality type of the underlying option. Available values: None, European, Bermudan, American. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [optional] [default to OffsetDateTime]
**moneyness** | **String** | The moneyness of the option. Available values: Unknown, InTheMoney, OutOfTheMoney, AtTheMoney. | [optional] [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this OptionExercisePhysicalEvent. | [optional] [default to List<OptionExerciseElection>]
**optionType** | **String** | Type of optionality that is present. Available values: None, Call, Put. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the option. | [optional] [default to OffsetDateTime]
**strikeCurrency** | **String** | The strike currency of the equity option. | [default to String]
**strikePerUnit** | **java.math.BigDecimal** | The strike of the equity option times the number of shares to exchange if exercised. | [default to java.math.BigDecimal]
**underlyingValuePerUnit** | **java.math.BigDecimal** | The underlying price times the number of shares to exchange if exercised. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.OptionExerciseCashEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime exerciseDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime deliveryDate = OffsetDateTime.now();
String exerciseType = "example exerciseType";
OffsetDateTime maturityDate = OffsetDateTime.now();
@javax.annotation.Nullable String moneyness = "example moneyness";
@javax.annotation.Nullable List<OptionExerciseElection> optionExerciseElections = new List<OptionExerciseElection>();
String optionType = "example optionType";
OffsetDateTime startDate = OffsetDateTime.now();
String strikeCurrency = "example strikeCurrency";
java.math.BigDecimal strikePerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal underlyingValuePerUnit = new java.math.BigDecimal("100.00");


OptionExerciseCashEvent optionExerciseCashEventInstance = new OptionExerciseCashEvent()
    .cashFlowPerUnit(cashFlowPerUnit)
    .exerciseDate(exerciseDate)
    .deliveryDate(deliveryDate)
    .exerciseType(exerciseType)
    .maturityDate(maturityDate)
    .moneyness(moneyness)
    .optionExerciseElections(optionExerciseElections)
    .optionType(optionType)
    .startDate(startDate)
    .strikeCurrency(strikeCurrency)
    .strikePerUnit(strikePerUnit)
    .underlyingValuePerUnit(underlyingValuePerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)