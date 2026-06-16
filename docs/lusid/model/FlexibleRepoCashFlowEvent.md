# com.finbourne.sdk.services.lusid.model.FlexibleRepoCashFlowEvent
classname FlexibleRepoCashFlowEvent
Definition of FlexibleRepoCashFlowEvent which represents a cash transfer as part of a repo contract modelled  as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the cash payment settles. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the recipient of the cash payment is entitled to receive the cash. This is a required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the payment. This is a required field. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | Amount of cash to be paid per unit of the instrument.  This amount is signed to indicate direction of the payment, i.e. as part of the purchase leg vs the repurchase leg.  This field is optional. If not specified, the system will not generate a virtual transaction for this event. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FlexibleRepoCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime settlementDate = OffsetDateTime.now();
OffsetDateTime entitlementDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");


FlexibleRepoCashFlowEvent flexibleRepoCashFlowEventInstance = new FlexibleRepoCashFlowEvent()
    .settlementDate(settlementDate)
    .entitlementDate(entitlementDate)
    .currency(currency)
    .cashFlowPerUnit(cashFlowPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)