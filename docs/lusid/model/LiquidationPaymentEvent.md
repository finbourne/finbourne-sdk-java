# com.finbourne.sdk.services.lusid.model.LiquidationPaymentEvent
classname LiquidationPaymentEvent
A liquidation payment event (LIQU).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The announcement date. Optional; informational only. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | The cash offer elections for this event. | [default to List<CashOfferElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-date. Optional; informational only — entitlement uses RecordDate. | [optional] [default to OffsetDateTime]
**isFinal** | **Boolean** | True if this is the final distribution and the position should be closed; false for a partial distribution  where the position is retained and cost basis is reduced by the cash amount. | [default to Boolean]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash distribution is settled. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date used to determine eligible holdings via settled units. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.LiquidationPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable OffsetDateTime exDate = OffsetDateTime.now();
Boolean isFinal = true;
OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime recordDate = OffsetDateTime.now();


LiquidationPaymentEvent liquidationPaymentEventInstance = new LiquidationPaymentEvent()
    .announcementDate(announcementDate)
    .cashOfferElections(cashOfferElections)
    .exDate(exDate)
    .isFinal(isFinal)
    .paymentDate(paymentDate)
    .recordDate(recordDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)