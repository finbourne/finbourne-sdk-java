# com.finbourne.sdk.services.lusid.model.CapitalDistributionEvent
classname CapitalDistributionEvent
A capital distribution paid out to shareholders.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend was announced / declared. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible elections for this event, each keyed with a unique identifier. | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company begins distributing the dividend. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CapitalDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
List<CashElection> cashElections = new List<CashElection>();
OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();


CapitalDistributionEvent capitalDistributionEventInstance = new CapitalDistributionEvent()
    .announcementDate(announcementDate)
    .cashElections(cashElections)
    .exDate(exDate)
    .paymentDate(paymentDate)
    .recordDate(recordDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)