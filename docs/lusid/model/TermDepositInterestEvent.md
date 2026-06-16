# com.finbourne.sdk.services.lusid.model.TermDepositInterestEvent
classname TermDepositInterestEvent
Definition of a Term Deposit Interest Event.  This is an event that describes the occurence of interest on a term deposit ().

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**currency** | **String** | Currency of the interest payment. | [default to String]
**interestPerUnit** | **java.math.BigDecimal** | The interest payment made per unit of the held . | [optional] [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the interest payment. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.TermDepositInterestEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal interestPerUnit = new java.math.BigDecimal("100.00");
OffsetDateTime paymentDate = OffsetDateTime.now();


TermDepositInterestEvent termDepositInterestEventInstance = new TermDepositInterestEvent()
    .currency(currency)
    .interestPerUnit(interestPerUnit)
    .paymentDate(paymentDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)