# com.finbourne.sdk.services.lusid.model.FutureMarkToMarketEvent
classname FutureMarkToMarketEvent
Definition of a Future Mark to Market Event.  Represents 'Mark to Market' daily settlement of Future instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the mark to market event. | [optional] [default to OffsetDateTime]
**settlementCurrency** | **String** | The currency in which the Future contract is paid. | [default to String]
**notionalAmountPerUnit** | **java.math.BigDecimal** | The notional value of the contract on the effective date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FutureMarkToMarketEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
String settlementCurrency = "example settlementCurrency";
@javax.annotation.Nullable java.math.BigDecimal notionalAmountPerUnit = new java.math.BigDecimal("100.00");


FutureMarkToMarketEvent futureMarkToMarketEventInstance = new FutureMarkToMarketEvent()
    .effectiveDate(effectiveDate)
    .settlementCurrency(settlementCurrency)
    .notionalAmountPerUnit(notionalAmountPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)