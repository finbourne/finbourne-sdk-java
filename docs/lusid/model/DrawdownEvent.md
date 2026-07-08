# com.finbourne.sdk.services.lusid.model.DrawdownEvent
classname DrawdownEvent
Event to draw down balance from a LoanFacility to a FlexLoan contract holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent. | [default to String]
**amount** | **java.math.BigDecimal** | Amount to be drawn down.  Must be positive. | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the drawdown | [optional] [default to OffsetDateTime]
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**agencyFxRate** | **java.math.BigDecimal** | Agency FX rate for multi-currency drawdowns.  When a drawdown is in a currency that&#39;s different to the facility&#39;s, an agency FX rate is specified for converting drawdown amount into facility currency to alter the facility&#39;s balance.  Default value of 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DrawdownEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
OffsetDateTime date = OffsetDateTime.now();
ContractDetails contractDetails = new ContractDetails();
java.math.BigDecimal agencyFxRate = new java.math.BigDecimal("100.00");


DrawdownEvent drawdownEventInstance = new DrawdownEvent()
    .amount(amount)
    .date(date)
    .contractDetails(contractDetails)
    .agencyFxRate(agencyFxRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)