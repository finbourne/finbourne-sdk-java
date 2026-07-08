# com.finbourne.sdk.services.lusid.model.CapletFloorletCashFlowEvent
classname CapletFloorletCashFlowEvent
Definition of a cap or floor (or collar) cash flow event.  This is an event that describes the occurence of a caplet or floorlet payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent. | [default to String]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Ex-Dividend / entitlement date of the cashflow payment.  Required field. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the cashflow payment  Required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the cashflow payment | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The total payment per unit of the held instrument, if entitled.  Not required. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CapletFloorletCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime entitlementDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
String currency = "example currency";
java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");


CapletFloorletCashFlowEvent capletFloorletCashFlowEventInstance = new CapletFloorletCashFlowEvent()
    .entitlementDate(entitlementDate)
    .paymentDate(paymentDate)
    .currency(currency)
    .cashFlowPerUnit(cashFlowPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)