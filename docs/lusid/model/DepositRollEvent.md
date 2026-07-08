# com.finbourne.sdk.services.lusid.model.DepositRollEvent
classname DepositRollEvent
Event used to represent a roll on a FlexibleDeposit instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent. | [default to String]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date of the roll event. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the roll event. | [optional] [default to OffsetDateTime]
**principalUpdates** | [**RollPrincipalUpdates**](RollPrincipalUpdates.md) |  | [default to RollPrincipalUpdates]
**interestUpdates** | [**RollInterestUpdates**](RollInterestUpdates.md) |  | [default to RollInterestUpdates]
**newSchedule** | [**Schedule**](Schedule.md) |  | [optional] [default to Schedule]

```java
import com.finbourne.sdk.services.lusid.model.DepositRollEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime entitlementDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();
RollPrincipalUpdates principalUpdates = new RollPrincipalUpdates();
RollInterestUpdates interestUpdates = new RollInterestUpdates();
Schedule newSchedule = new Schedule();


DepositRollEvent depositRollEventInstance = new DepositRollEvent()
    .entitlementDate(entitlementDate)
    .settlementDate(settlementDate)
    .principalUpdates(principalUpdates)
    .interestUpdates(interestUpdates)
    .newSchedule(newSchedule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)