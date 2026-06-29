# com.finbourne.sdk.services.lusid.model.EarlyCloseOutEvent
classname EarlyCloseOutEvent
Early close out event - Ending an OTC instrument early.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent. | [default to String]
**closeOutAmount** | **java.math.BigDecimal** | The amount to be closed out early. Required. Must be strictly positive. | [default to java.math.BigDecimal]
**closeOutCcy** | **String** | The currency corresponding to the amount to be closed out early. Required. | [default to String]
**closeOutToOtherRate** | **java.math.BigDecimal** | The rate between close out amount and other amount. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event. | [optional] [default to OffsetDateTime]
**otherAmount** | **java.math.BigDecimal** | The other amount to be closed out early. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**otherCcy** | **String** | The currency corresponding to the other amount to be closed out early. Optional. | [optional] [default to String]
**otherToCloseOutRate** | **java.math.BigDecimal** | The rate between other amount and close out amount. Optional. If provided, must be strictly positive. | [optional] [default to java.math.BigDecimal]
**settlementCcy** | **String** | The settlement currency. Required. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EarlyCloseOutEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal closeOutAmount = new java.math.BigDecimal("100.00");
String closeOutCcy = "example closeOutCcy";
@javax.annotation.Nullable java.math.BigDecimal closeOutToOtherRate = new java.math.BigDecimal("100.00");
OffsetDateTime effectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal otherAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String otherCcy = "example otherCcy";
@javax.annotation.Nullable java.math.BigDecimal otherToCloseOutRate = new java.math.BigDecimal("100.00");
String settlementCcy = "example settlementCcy";


EarlyCloseOutEvent earlyCloseOutEventInstance = new EarlyCloseOutEvent()
    .closeOutAmount(closeOutAmount)
    .closeOutCcy(closeOutCcy)
    .closeOutToOtherRate(closeOutToOtherRate)
    .effectiveDate(effectiveDate)
    .otherAmount(otherAmount)
    .otherCcy(otherCcy)
    .otherToCloseOutRate(otherToCloseOutRate)
    .settlementCcy(settlementCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)