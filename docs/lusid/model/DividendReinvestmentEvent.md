# com.finbourne.sdk.services.lusid.model.DividendReinvestmentEvent
classname DividendReinvestmentEvent
Event for dividend reinvestments.  Elections for cash or the associated security.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend was announced / declared. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | CashElection for this DividendReinvestmentEvent | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company pays out dividends to shareholders. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]
**securityElections** | [**List&lt;SecurityElection&gt;**](SecurityElection.md) | SecurityElection for this DividendReinvestmentEvent | [default to List<SecurityElection>]
**securitySettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the additional units.  Equal to the PaymentDate if not provided. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.DividendReinvestmentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
List<CashElection> cashElections = new List<CashElection>();
OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
List<SecurityElection> securityElections = new List<SecurityElection>();
@javax.annotation.Nullable OffsetDateTime securitySettlementDate = OffsetDateTime.now();


DividendReinvestmentEvent dividendReinvestmentEventInstance = new DividendReinvestmentEvent()
    .announcementDate(announcementDate)
    .cashElections(cashElections)
    .exDate(exDate)
    .paymentDate(paymentDate)
    .recordDate(recordDate)
    .securityElections(securityElections)
    .securitySettlementDate(securitySettlementDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)