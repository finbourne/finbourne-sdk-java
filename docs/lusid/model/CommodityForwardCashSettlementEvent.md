# com.finbourne.sdk.services.lusid.model.CommodityForwardCashSettlementEvent
classname CommodityForwardCashSettlementEvent
Cash settlement of a cash-delivery CommodityForward at maturity. The cash flow per unit is the  pre-netted settlement price (forward price minus strike) supplied externally via the quote store;  LUSID does not compute the difference itself. A negative cash flow per unit is valid and means the  position was out of the money at settlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The single settlement / maturity date of the forward. Required. | [optional] [default to OffsetDateTime]
**domCcy** | **String** | Settlement currency of the forward. Required. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The pre-netted settlement amount per unit (current forward price minus strike), supplied  externally via the quote store. Optional — absent until the settlement price has been loaded.  Negative when the position is out of the money. | [optional] [default to java.math.BigDecimal]
**cashFlowAmount** | **java.math.BigDecimal** | The realised cash amount, calculated as CashFlowPerUnit multiplied by the eligible balance.  Optional — it needs holdings-level data so it is never populated by the instrument layer.  Carries the sign of CashFlowPerUnit. | [optional] [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** | Agreed forward price at trade inception. Optional, and reference only — it is not used in the  settlement calculation; it is carried for auditability. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CommodityForwardCashSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
@javax.annotation.Nullable java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal cashFlowAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal strike = new java.math.BigDecimal("100.00");


CommodityForwardCashSettlementEvent commodityForwardCashSettlementEventInstance = new CommodityForwardCashSettlementEvent()
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .cashFlowPerUnit(cashFlowPerUnit)
    .cashFlowAmount(cashFlowAmount)
    .strike(strike);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)