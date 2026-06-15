# com.finbourne.sdk.services.lusid.model.LoanFacilityDelayedCompensationPaymentEvent
classname LoanFacilityDelayedCompensationPaymentEvent
event paying out the cumulative delayed-compensation pot on a secondary-market loan-facility  trade whose actual SettleDate is strictly after Transaction/default/ContractualSettlementDate. Generated  on the trade's actual SettleDate; amount equals the integrated daily increment over the open-on-the-left,  closed-on-the-right interval (ContractualSettlementDate, min(SettleDate, EarlyTerminationDate)].                Forecast accuracy depends entirely on the user's recorded SettleDate being a realistic estimate; if the  user fudges the settle date well into the future, the cashflow forecast will be wrong by the same factor.                Amount is always positive on the wire. Buyer-vs-seller sign is applied downstream by the transaction-template  specification, mirroring how BuyFacility / SellFacility already invert their cash legs against the same payload.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the delayed-compensation pot is due to be paid. Kept as a separate field so a configurable  settlement-to-payment lag can be introduced later if the pot accrues using daily OIS rates; in the first  delivery PaymentDate equals ExDate. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the delayed-compensation pot is calculated up to. Equals the trade&#39;s actual SettleDate after  any active TradeAmendments at the firing effectiveAt. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the payment, in the contract domestic currency. fx-conversion to the facility currency is  handled downstream in the same way as for LoanInterestRepaymentEvent. | [default to String]
**amount** | **java.math.BigDecimal** | Cumulative pot value to be paid out on PaymentDate, expressed in the event&#39;s Currency. Always positive  on the wire; buyer-vs-seller sign is applied by the transaction-template specification per the original  trade side. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.LoanFacilityDelayedCompensationPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
String currency = "example currency";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


LoanFacilityDelayedCompensationPaymentEvent loanFacilityDelayedCompensationPaymentEventInstance = new LoanFacilityDelayedCompensationPaymentEvent()
    .paymentDate(paymentDate)
    .exDate(exDate)
    .currency(currency)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)