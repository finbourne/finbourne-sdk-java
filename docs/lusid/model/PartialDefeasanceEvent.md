# com.finbourne.sdk.services.lusid.model.PartialDefeasanceEvent
classname PartialDefeasanceEvent
Partial Defeasance event (PDEF). A mandatory notification that a bond issuer has escrow-funded  (defeased) a portion of an outstanding issue. No cash flows to holders at this event; the position  is marked pre-refunded and its effective maturity is updated to the future call date carried in  ActualPayDate. The actual cash and position retirement arrive later via a separate  mandatory call event. Supports a Partial Pre-Refunding variant (PPRE).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**refundedFraction** | **java.math.BigDecimal** | The issue-level fraction allocated to the refunded (pre-refunded / escrowed) portion. Strictly  in the half-open interval (0, 1]; the non-refunded fraction is the derived complement. This is a  required field. | [default to java.math.BigDecimal]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the defeasance status takes effect on the position. This is a required field. | [optional] [default to OffsetDateTime]
**actualPayDate** | [**OffsetDateTime**](OffsetDateTime.md) | The future call date when the bond will actually be retired, used to update the position&#39;s  effective maturity in analytics. Must be on or after EffectiveDate. This is a  required field. | [optional] [default to OffsetDateTime]
**refundedInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**newSecuritiesIndicator** | **String** | Optional audit field preserving the wire-side codeword used for the refunded portion.  Supported string (enumeration) values are: [REFU, DEFE]. Both encodings carry identical semantics. Available values: REFU, DEFE. | [optional] [default to String]
**additionalBusinessProcess** | **String** | Optional variant indicator. Supported string (enumeration) values are: [PPRE]. Absence (null)  encodes the default Partial Defeasance variant. Available values: PPRE. | [optional] [default to String]
**lotteryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The wire&#39;s lottery date; null when the wire carried a sentinel value. | [optional] [default to OffsetDateTime]
**publicationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional informational date identifying when the defeasance was publicly noticed. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The wire&#39;s record date; typically null for a notification event with no distribution. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional informational announcement date; null when not provided. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PartialDefeasanceEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal refundedFraction = new java.math.BigDecimal("100.00");
OffsetDateTime effectiveDate = OffsetDateTime.now();
OffsetDateTime actualPayDate = OffsetDateTime.now();
NewInstrument refundedInstrument = new NewInstrument();
@javax.annotation.Nullable String newSecuritiesIndicator = "example newSecuritiesIndicator";
@javax.annotation.Nullable String additionalBusinessProcess = "example additionalBusinessProcess";
@javax.annotation.Nullable OffsetDateTime lotteryDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime publicationDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();


PartialDefeasanceEvent partialDefeasanceEventInstance = new PartialDefeasanceEvent()
    .refundedFraction(refundedFraction)
    .effectiveDate(effectiveDate)
    .actualPayDate(actualPayDate)
    .refundedInstrument(refundedInstrument)
    .newSecuritiesIndicator(newSecuritiesIndicator)
    .additionalBusinessProcess(additionalBusinessProcess)
    .lotteryDate(lotteryDate)
    .publicationDate(publicationDate)
    .recordDate(recordDate)
    .announcementDate(announcementDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)