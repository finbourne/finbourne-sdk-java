# com.finbourne.sdk.services.lusid.model.InflationIndexationEvent
classname InflationIndexationEvent
The day-on-day change in the indexed face of an inflation-linked bond, as its inflation index ratio moves  from one day to the next. A memo event: downstream it books a transaction whose units carry the day's indexed-face  change (the principal uplift) and whose cash is zero; nothing moves.  Mandatory participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent, DepositInterestCapitalisationEvent, PartialRedemptionWithoutReductionOfNominalValueEvent, StripBondCashflowEvent, CapitalisationEvent, SharesPremiumDividendEvent, CashDistributionFromNonEligibleSecuritiesSalesEvent, InflationIndexationEvent. | [default to String]
**currency** | **String** | The bond&#39;s domestic currency. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The instant from which the new index ratio applies: the bond&#39;s local midnight on the indexation day. On an  event LUSID generates it is returned in UTC, and the event id names the bond&#39;s local calendar day. An  upserted event may give it with any offset; it is normalised to UTC when stored. | [optional] [default to OffsetDateTime]
**indexRatioAfter** | **java.math.BigDecimal** | The bond&#39;s un-floored inflation index ratio on the event date. | [default to java.math.BigDecimal]
**indexRatioBefore** | **java.math.BigDecimal** | The bond&#39;s un-floored inflation index ratio on the day before the event date. | [default to java.math.BigDecimal]
**indexedFaceChangePerUnit** | **java.math.BigDecimal** | The day&#39;s change in indexed face per unit: the un-indexed face per unit multiplied by  (index ratio after minus index ratio before). | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.InflationIndexationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
OffsetDateTime eventDate = OffsetDateTime.now();
java.math.BigDecimal indexRatioAfter = new java.math.BigDecimal("100.00");
java.math.BigDecimal indexRatioBefore = new java.math.BigDecimal("100.00");
java.math.BigDecimal indexedFaceChangePerUnit = new java.math.BigDecimal("100.00");


InflationIndexationEvent inflationIndexationEventInstance = new InflationIndexationEvent()
    .currency(currency)
    .eventDate(eventDate)
    .indexRatioAfter(indexRatioAfter)
    .indexRatioBefore(indexRatioBefore)
    .indexedFaceChangePerUnit(indexedFaceChangePerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)