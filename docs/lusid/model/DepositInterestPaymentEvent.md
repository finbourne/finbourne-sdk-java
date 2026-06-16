# com.finbourne.sdk.services.lusid.model.DepositInterestPaymentEvent
classname DepositInterestPaymentEvent
Event to signify the repayment of interest accrued against a deposit holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the interest is due to be paid. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DepositInterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
String currency = "example currency";


DepositInterestPaymentEvent depositInterestPaymentEventInstance = new DepositInterestPaymentEvent()
    .paymentDate(paymentDate)
    .exDate(exDate)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)