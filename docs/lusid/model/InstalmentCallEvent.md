# com.finbourne.sdk.services.lusid.model.InstalmentCallEvent
classname InstalmentCallEvent
Instalment Call Event (PPMT) — the issuer calls the next instalment due on a partly-paid equity line.  The holder pays the call price per unit and the holding moves from the partly-paid line to the  line carrying the higher paid-up amount. Under MandatoryWithChoices the holder may instead lapse,  in which case nothing moves and the partly-paid line survives.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent, DepositInterestCapitalisationEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the call cash and the replacement units settle. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which entitlement is struck. Optional; when absent, entitlement strikes on the payment date. | [optional] [default to OffsetDateTime]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deadline by which the holder must instruct. Required when the participation type is  MandatoryWithChoices; must be null when it is Mandatory. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deadline by which the custodian must forward instructions to the market. Required when the  participation type is MandatoryWithChoices; must be null when it is Mandatory. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**callPricePerUnit** | **java.math.BigDecimal** | The amount of money payable per eligible unit on this instalment, in the call currency.  This is money per unit, not a percentage of the issue price: a 40 per cent call on a 2.50 issue  price is supplied as 1.00. | [default to java.math.BigDecimal]
**callCurrency** | **String** | The currency in which the call settles. Must match the currency of the new instrument. | [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | The election to pay the call and receive the new instrument. Exactly one is required.  Under Mandatory participation it must be both default and chosen. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | The election to decline the call, leaving the partly-paid line unchanged. Exactly one is required  under MandatoryWithChoices participation; none may be supplied under Mandatory participation. | [optional] [default to List<LapseElection>]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor.  Supported values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, BankerRounding. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to. Not used by any of the supported rounding conventions. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.InstalmentCallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime responseDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime marketDeadlineDate = OffsetDateTime.now();
NewInstrument newInstrument = new NewInstrument();
UnitsRatio unitsRatio = new UnitsRatio();
java.math.BigDecimal callPricePerUnit = new java.math.BigDecimal("100.00");
String callCurrency = "example callCurrency";
@javax.annotation.Nullable List<OptionExerciseElection> optionExerciseElections = new List<OptionExerciseElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable String fractionalUnitsRoundingConvention = "example fractionalUnitsRoundingConvention";
@javax.annotation.Nullable Integer fractionalUnitsDecimalPlaces = new Integer("100.00");


InstalmentCallEvent instalmentCallEventInstance = new InstalmentCallEvent()
    .paymentDate(paymentDate)
    .recordDate(recordDate)
    .responseDeadlineDate(responseDeadlineDate)
    .marketDeadlineDate(marketDeadlineDate)
    .newInstrument(newInstrument)
    .unitsRatio(unitsRatio)
    .callPricePerUnit(callPricePerUnit)
    .callCurrency(callCurrency)
    .optionExerciseElections(optionExerciseElections)
    .lapseElections(lapseElections)
    .fractionalUnitsRoundingConvention(fractionalUnitsRoundingConvention)
    .fractionalUnitsDecimalPlaces(fractionalUnitsDecimalPlaces);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)