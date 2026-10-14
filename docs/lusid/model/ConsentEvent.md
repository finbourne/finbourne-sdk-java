# com.finbourne.sdk.services.lusid.model.ConsentEvent
classname ConsentEvent
A consent solicitation (CONS) or a bondholder meeting's fee (BMET): voluntary when holders respond to it, mandatory when it pays a fee to every eligible holder without an instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent. | [default to String]
**consentType** | **String** | The type of consent solicitation. Optional; omitting it records Unknown.                Supported string (enumeration) values are: [ChangeInTerms, DueAndPayable, Unknown]. Available values: ChangeInTerms, DueAndPayable, Unknown. | [optional] [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The last date to submit instructions. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-set outer deadline. Must be greater than or equal to ResponseDeadline. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Deadline for instructions that qualify for an early fee. Optional. When set, must be earlier than ResponseDeadline. Must be null on a Mandatory event. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the fee is paid. Required when a CashOfferElection or a fee-bearing ConsentGrantedElection is offered; otherwise must be null. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Options that pay a cash fee to the holder who chooses them, whatever the vote: for example a fee for voting against, for a split vote or for an ineligible-holder confirmation. Keys are free-form and unique across all election lists. The price is quoted per 1,000 of face for bonds (the current notional at the record date: amortised face for a ComplexBond, inflation-adjusted face for an InflationLinkedBond) and per unit for equities and simple instruments. On a Mandatory event, exactly one, both default and chosen. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible lapse elections for this event (NOAC). | [optional] [default to List<LapseElection>]
**consentGrantedElections** | [**List&lt;ConsentGrantedElection&gt;**](ConsentGrantedElection.md) | List of possible consent-granted elections for this event (CONY), each optionally carrying a consent fee. | [optional] [default to List<ConsentGrantedElection>]
**consentDeniedElections** | [**List&lt;ConsentDeniedElection&gt;**](ConsentDeniedElection.md) | List of possible consent-denied elections for this event (CONN). | [optional] [default to List<ConsentDeniedElection>]
**abstainElections** | [**List&lt;AbstainElection&gt;**](AbstainElection.md) | List of possible abstain elections for this event (ABST). | [optional] [default to List<AbstainElection>]

```java
import com.finbourne.sdk.services.lusid.model.ConsentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String consentType = "example consentType";
OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime responseDeadline = OffsetDateTime.now();
OffsetDateTime marketDeadline = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime earlyResponseDeadline = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable List<ConsentGrantedElection> consentGrantedElections = new List<ConsentGrantedElection>();
@javax.annotation.Nullable List<ConsentDeniedElection> consentDeniedElections = new List<ConsentDeniedElection>();
@javax.annotation.Nullable List<AbstainElection> abstainElections = new List<AbstainElection>();


ConsentEvent consentEventInstance = new ConsentEvent()
    .consentType(consentType)
    .recordDate(recordDate)
    .responseDeadline(responseDeadline)
    .marketDeadline(marketDeadline)
    .earlyResponseDeadline(earlyResponseDeadline)
    .paymentDate(paymentDate)
    .cashOfferElections(cashOfferElections)
    .lapseElections(lapseElections)
    .consentGrantedElections(consentGrantedElections)
    .consentDeniedElections(consentDeniedElections)
    .abstainElections(abstainElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)