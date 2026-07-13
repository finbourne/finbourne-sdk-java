# com.finbourne.sdk.services.lusid.model.ConversionEvent
classname ConversionEvent
Conversion Event (CONV) - Conversion of securities (generally convertible bonds or preferred shares) into  another form of securities (usually common shares) at a pre-stated price/ratio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent. | [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required.  Date at which positions are struck at the end of the day to  note which parties will receive the relevant amount of  entitlement, due to be distributed on the PaymentDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required. Date on which the movement is due to take place (cash and/or securities). | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date/time that the account servicer has set as the deadline to respond,  with instructions, to an outstanding event. Not required. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date/time which the issuer or issuer&#39;s agent has set as the deadline to respond,  with an instruction, to an outstanding offer or privilege. Not required. | [optional] [default to OffsetDateTime]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date which establishes when the conversion is recognised. | [optional] [default to OffsetDateTime]
**periodOfAction** | [**EventDateRange**](EventDateRange.md) |  | [optional] [default to EventDateRange]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. Not required.  If provided, must have FractionalUnitsCashCurrency too. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. Not required.  If provided, must have FractionalUnitsCashPrice too. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible security offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:     This list must have exactly one election that is chosen and default.  CashAndSecurityOfferElections and CashOfferElections &lt;b&gt; must be null or empty&lt;/b&gt;.     If the ParticipationType is Voluntary:     This list can be empty,  so long as CashAndSecurityOfferElections or CashOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible cash and security offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:    This list &lt;b&gt; must be null or empty&lt;/b&gt;.    If the ParticipationType is Voluntary:    This list can be empty,  so long as SecurityOfferElections or CashOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<CashAndSecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible cash offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:    This list &lt;b&gt; must be null or empty&lt;/b&gt;.    If the ParticipationType is Voluntary:    This list can be empty,  so long as SecurityOfferElections or CashAndSecurityOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible lapse elections for this conversion event. There must be at most one election of this type.    If provided, the holder is not entitled to receive anything for the conversion. | [optional] [default to List<LapseElection>]
**conversionType** | **String** | The type of conversion. Regular for standard conversions; Exchange144A for SEC Rule 144A exchanges.                Supported string (enumeration) values are: [Regular, Exchange144A]. Available values: Regular, Exchange144A. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ConversionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable OffsetDateTime responseDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime marketDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveDate = OffsetDateTime.now();
EventDateRange periodOfAction = new EventDateRange();
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<CashAndSecurityOfferElection> cashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable String conversionType = "example conversionType";


ConversionEvent conversionEventInstance = new ConversionEvent()
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .newInstrument(newInstrument)
    .responseDeadlineDate(responseDeadlineDate)
    .marketDeadlineDate(marketDeadlineDate)
    .effectiveDate(effectiveDate)
    .periodOfAction(periodOfAction)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .securityOfferElections(securityOfferElections)
    .cashAndSecurityOfferElections(cashAndSecurityOfferElections)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections)
    .conversionType(conversionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)