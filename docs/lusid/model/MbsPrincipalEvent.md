# com.finbourne.sdk.services.lusid.model.MbsPrincipalEvent
classname MbsPrincipalEvent
Definition of an MBS Principal Event  This is an event that describes the occurence of a cashflow due to a mortgage-backed security principal payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent, DepositInterestCapitalisationEvent. | [default to String]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the principal payment, usually several weeks prior to the payment date | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the principal | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the principal is paid | [default to String]
**principalPerUnit** | **java.math.BigDecimal** | The principal amount received for each unit of the instrument held on the ex date | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | Redemption price per unit (OFFR / 100) of principal repaid. Clean price convention: a value of 1 is par.  Optional; a null is read as 1, so an omitted price is par. Separates the cash paid from the principal extinguished. | [optional] [default to java.math.BigDecimal]
**previousFactor** | **java.math.BigDecimal** | The pool factor in force until the redemption (factor) date, as notified (AMI-SeCo Previous Factor).  Optional; recorded for reconciliation and not consumed by the transaction template. Must be supplied together with nextFactor. | [optional] [default to java.math.BigDecimal]
**nextFactor** | **java.math.BigDecimal** | The pool factor applicable after the redemption (factor) date, as notified (AMI-SeCo Next Factor).  Optional; recorded for reconciliation and not consumed by the transaction template. Must be supplied together with previousFactor. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MbsPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal principalPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pricePerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal previousFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal nextFactor = new java.math.BigDecimal("100.00");


MbsPrincipalEvent mbsPrincipalEventInstance = new MbsPrincipalEvent()
    .exDate(exDate)
    .paymentDate(paymentDate)
    .currency(currency)
    .principalPerUnit(principalPerUnit)
    .pricePerUnit(pricePerUnit)
    .previousFactor(previousFactor)
    .nextFactor(nextFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)