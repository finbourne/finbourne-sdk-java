# com.finbourne.sdk.services.lusid.model.LoanFacilityContractRolloverEvent
classname LoanFacilityContractRolloverEvent
Event for rolling over one or more FlexibleLoan contracts into one or more different FlexibleLoan contracts against the same facility.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Effective date of the event. | [optional] [default to OffsetDateTime]
**rolloverConstituents** | [**List&lt;RolloverConstituent&gt;**](RolloverConstituent.md) | Source and target contracts of the rollover. That is, a set of contracts and their respective changes to balance  Expect at least one contract to as the source of the rollover and at least one target contract. | [default to List<RolloverConstituent>]
**withInterest** | **Boolean** | If set to true, then active contracts whose balance is reduced by the rollover will have their accrued interest  repaid pro rata to the balance reduction. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.LoanFacilityContractRolloverEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
List<RolloverConstituent> rolloverConstituents = new List<RolloverConstituent>();
Boolean withInterest = true;


LoanFacilityContractRolloverEvent loanFacilityContractRolloverEventInstance = new LoanFacilityContractRolloverEvent()
    .date(date)
    .rolloverConstituents(rolloverConstituents)
    .withInterest(withInterest);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)