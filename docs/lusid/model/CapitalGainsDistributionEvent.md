# com.finbourne.sdk.services.lusid.model.CapitalGainsDistributionEvent
classname CapitalGainsDistributionEvent
Capital Gains Distribution event (CAPG). Distributes realised capital gains from a fund's asset sales  as a gross cash rate per eligible unit. Supports a currency-choice variant (CHOS) under  MandatoryWithChoices participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash distribution is paid to shareholders. Required. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the distribution is not owed to the buying party. Required. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date positions are struck for entitlement. Optional. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the event was announced. Optional. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | The cash elections for this event. For Mandatory participation supply a single declared election;  for MandatoryWithChoices supply one per available currency, with IsDeclared set on the declared  option and IsChosen on the elected option. | [optional] [default to List<CashElection>]

```java
import com.finbourne.sdk.services.lusid.model.CapitalGainsDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
@javax.annotation.Nullable List<CashElection> cashElections = new List<CashElection>();


CapitalGainsDistributionEvent capitalGainsDistributionEventInstance = new CapitalGainsDistributionEvent()
    .paymentDate(paymentDate)
    .exDate(exDate)
    .recordDate(recordDate)
    .announcementDate(announcementDate)
    .cashElections(cashElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)