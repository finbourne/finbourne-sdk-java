# com.finbourne.sdk.services.lusid.model.SecurityWriteOffEvent
classname SecurityWriteOffEvent
Security write-off (WOFF) — removes a security holding from the portfolio at zero proceeds following an  issuer-, lender-, or regulator-declared write-off. The full eligible holding is debited on the PaymentDate;  no cash is received and no new security is credited. Supports Mandatory and Voluntary participation; on the  Voluntary path the holder submits a SubscribeElection to recognise (apply) the write-off.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Positions are struck at close of business on this date to determine eligible holdings. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the security debit is processed in LUSID; no cash payment is associated. Must be &gt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the issuer, agent or regulator announces the write-off. Optional — null when no separate  announcement date is provided. When populated, must be &lt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]
**subscribeElections** | [**List&lt;SubscribeElection&gt;**](SubscribeElection.md) | List of possible subscribe elections for this event. Populated on the Voluntary path only, where the  holder elects to recognise (apply) the write-off. Ignored on the Mandatory path. | [optional] [default to List<SubscribeElection>]

```java
import com.finbourne.sdk.services.lusid.model.SecurityWriteOffEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
@javax.annotation.Nullable List<SubscribeElection> subscribeElections = new List<SubscribeElection>();


SecurityWriteOffEvent securityWriteOffEventInstance = new SecurityWriteOffEvent()
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .announcementDate(announcementDate)
    .subscribeElections(subscribeElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)