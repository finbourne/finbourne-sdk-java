# com.finbourne.sdk.services.lusid.model.BonusIssueEvent
classname BonusIssueEvent
Representation of a Bonus Issue corporate action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the Bonus Issue is announced. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-date of the Bonus Issue. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the Bonus Issue. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the Bonus Issue is executed. | [optional] [default to OffsetDateTime]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | Possible SecurityElections for this Bonus Issue event, if any. | [optional] [default to List<SecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Possible CashOfferElections for this Bonus Issue event, if any. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Possible LapseElections for this Bonus Issue event, if any. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.sdk.services.lusid.model.BonusIssueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();


BonusIssueEvent bonusIssueEventInstance = new BonusIssueEvent()
    .announcementDate(announcementDate)
    .exDate(exDate)
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .securityOfferElections(securityOfferElections)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)