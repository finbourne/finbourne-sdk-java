# com.finbourne.sdk.services.lusid.model.FlexibleRepoFullClosureEvent
classname FlexibleRepoFullClosureEvent
Event to trigger the full closure of a repurchase agreement booked as a FlexibleRepo.  Specific to a FlexibleRepo instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the closure begins  This is a required field, unless otherwise supplied via \&quot;EventDateStamps\&quot; in  the instrument event upsert request. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which closure takes place, i.e., when all repurchase trades settle. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.FlexibleRepoFullClosureEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime entitlementDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();


FlexibleRepoFullClosureEvent flexibleRepoFullClosureEventInstance = new FlexibleRepoFullClosureEvent()
    .entitlementDate(entitlementDate)
    .settlementDate(settlementDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)