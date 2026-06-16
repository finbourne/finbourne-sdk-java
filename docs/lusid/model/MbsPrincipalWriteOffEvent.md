# com.finbourne.sdk.services.lusid.model.MbsPrincipalWriteOffEvent
classname MbsPrincipalWriteOffEvent
Definition of an MBS Principal Write Off Event  This is an event that describes the occurence of a cashflow due to a mortgage-backed security principal write off.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the principal payment, usually several weeks prior to the payment date | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the principal that is written off | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the principal write off is notated | [default to String]
**principalPerUnit** | **java.math.BigDecimal** | The principal amount to be written off for each unit of the instrument held on the ex date | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MbsPrincipalWriteOffEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal principalPerUnit = new java.math.BigDecimal("100.00");


MbsPrincipalWriteOffEvent mbsPrincipalWriteOffEventInstance = new MbsPrincipalWriteOffEvent()
    .exDate(exDate)
    .paymentDate(paymentDate)
    .currency(currency)
    .principalPerUnit(principalPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)