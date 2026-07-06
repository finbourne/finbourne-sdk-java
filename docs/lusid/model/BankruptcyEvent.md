# com.finbourne.sdk.services.lusid.model.BankruptcyEvent
classname BankruptcyEvent
A Bankruptcy (BRUP) event recording the legal status of a company unable to meet its financial  obligations. Pure informational marker — generates no transactions and has no position impact.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the bankruptcy filing or court ruling. | [optional] [default to OffsetDateTime]
**notificationType** | **String** | Notification type: NEWM (new announcement), REPL (replacement/correction), or CANC (proceedings dismissed). Available values: NEWM, REPL, CANC. | [default to String]
**claimFilingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Date by which creditors must file a proof of claim. Optional — null when not applicable.  If provided, overrides EffectiveDate as the settle date of the resulting virtual transactions. | [optional] [default to OffsetDateTime]
**narrative** | **String** | Free-text detail: court, jurisdiction, trustee, plan reference. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BankruptcyEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
String notificationType = "example notificationType";
@javax.annotation.Nullable OffsetDateTime claimFilingDeadline = OffsetDateTime.now();
@javax.annotation.Nullable String narrative = "example narrative";


BankruptcyEvent bankruptcyEventInstance = new BankruptcyEvent()
    .effectiveDate(effectiveDate)
    .notificationType(notificationType)
    .claimFilingDeadline(claimFilingDeadline)
    .narrative(narrative);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)