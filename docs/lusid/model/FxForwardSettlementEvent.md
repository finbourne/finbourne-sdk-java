# com.finbourne.sdk.services.lusid.model.FxForwardSettlementEvent
classname FxForwardSettlementEvent
Settlement for FX Forward, including NDF and deliverable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | Maturity date of the forward | [optional] [default to OffsetDateTime]
**domAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the DomCcy (domestic currency) | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the forward | [default to String]
**fgnAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the FgnCcy (foreign currency) | [default to java.math.BigDecimal]
**fgnCcy** | **String** | The foreign currency of the forward. | [default to String]
**isNdf** | **Boolean** | Is this settlement corresponding to a deliverable forward, or an NDF | [default to Boolean]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional.  Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  Date of the FxRate fixings. | [optional] [default to OffsetDateTime]
**settlementCcy** | **String** | Optional.  Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  May be set to either DomCcy or FgnCcy, or a third currency. | [optional] [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | Optional.  Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  CashFlow per unit.  Paid in the SettlementCcy. | [optional] [default to java.math.BigDecimal]
**domesticToForeignRate** | **java.math.BigDecimal** | Domestic currency to foreign currency FX rate.  Not required, only used to override quotes. | [optional] [default to java.math.BigDecimal]
**domesticToSettlementRate** | **java.math.BigDecimal** | Domestic currency to settlement currency FX rate  Not required, only used to override quotes. | [optional] [default to java.math.BigDecimal]
**foreignToSettlementRate** | **java.math.BigDecimal** | Foreign currency to settlement currency FX rate  Not required, only used to override quotes. | [optional] [readonly] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime maturityDate = OffsetDateTime.now();
java.math.BigDecimal domAmountPerUnit = new java.math.BigDecimal("100.00");
String domCcy = "example domCcy";
java.math.BigDecimal fgnAmountPerUnit = new java.math.BigDecimal("100.00");
String fgnCcy = "example fgnCcy";
Boolean isNdf = true;
@javax.annotation.Nullable OffsetDateTime fixingDate = OffsetDateTime.now();
@javax.annotation.Nullable String settlementCcy = "example settlementCcy";
@javax.annotation.Nullable java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal domesticToForeignRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal domesticToSettlementRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal foreignToSettlementRate = new java.math.BigDecimal("100.00");


FxForwardSettlementEvent fxForwardSettlementEventInstance = new FxForwardSettlementEvent()
    .maturityDate(maturityDate)
    .domAmountPerUnit(domAmountPerUnit)
    .domCcy(domCcy)
    .fgnAmountPerUnit(fgnAmountPerUnit)
    .fgnCcy(fgnCcy)
    .isNdf(isNdf)
    .fixingDate(fixingDate)
    .settlementCcy(settlementCcy)
    .cashFlowPerUnit(cashFlowPerUnit)
    .domesticToForeignRate(domesticToForeignRate)
    .domesticToSettlementRate(domesticToSettlementRate)
    .foreignToSettlementRate(foreignToSettlementRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)