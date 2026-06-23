# com.finbourne.sdk.services.lusid.model.FlexibleRepoCollateralEvent
classname FlexibleRepoCollateralEvent
Definition of FlexibleRepoCollateralEvent which represents a single collateral transfer as part of a repo contract  modelled as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which the transfer of units settles. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which the recipient of the collateral is entitled to the units being transferred. This is a required field. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount of collateral being transferred as part of the repo contract.  Signed to indicate direction of transfer. This is a required field. | [default to java.math.BigDecimal]
**collateralInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]

```java
import com.finbourne.sdk.services.lusid.model.FlexibleRepoCollateralEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime settlementDate = OffsetDateTime.now();
OffsetDateTime entitlementDate = OffsetDateTime.now();
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
NewInstrument collateralInstrument = new NewInstrument();


FlexibleRepoCollateralEvent flexibleRepoCollateralEventInstance = new FlexibleRepoCollateralEvent()
    .settlementDate(settlementDate)
    .entitlementDate(entitlementDate)
    .amount(amount)
    .collateralInstrument(collateralInstrument);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)