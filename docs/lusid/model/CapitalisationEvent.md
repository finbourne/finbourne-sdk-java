# com.finbourne.sdk.services.lusid.model.CapitalisationEvent
classname CapitalisationEvent
Capitalisation (CAPI, AMI-SeCo SCoRE section 4.10): an increase in the current principal of a debt instrument  without an increase in its nominal value, normally from incorporating due but unpaid interest into the  principal. A notified CAPI on a ComplexBond, recording the factor before (previousFactor) and after  (nextFactor) the event. Mandatory and purely informational: it generates no cash flow, movements or  transactions. The capitalisation itself is booked by the bond's PikSchedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, BondForwardCashSettlementEvent, BondForwardTerminationEvent, AmendCommitmentEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, DividendSuspensionEvent, LoanInterestCapitalisationEvent, TotalReturnSwapCashFlowEvent, GlobalLoanFacilityReinitialisationEvent, InvestorLoanFacilityReinitialisationEvent, CapitalCallReceiptEvent, RecallableCapitalExpiryEvent, CapitalInterestTransferEvent, FacilityDrawEvent, FacilityRepaymentEvent, FacilityInterestEvent, FacilityCommitmentFeeEvent, InstalmentCallEvent, DepositInterestCapitalisationEvent, PartialRedemptionWithoutReductionOfNominalValueEvent, StripBondCashflowEvent, CapitalisationEvent, SharesPremiumDividendEvent, CashDistributionFromNonEligibleSecuritiesSalesEvent, InflationIndexationEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the next factor applies (:98A::EFFD). Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date (:98A::PAYD). Optional and informational; it may fall before effectiveDate. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date (:98A::RDTE). Optional and informational; when supplied it must not fall after  effectiveDate. | [optional] [default to OffsetDateTime]
**previousFactor** | **java.math.BigDecimal** | The factor, current principal per unit of nominal, in force before the event (:92A::PRFC). Optional, but  supplied together with nextFactor or not at all; greater than 0 when supplied. An event without the  factors is stored as economically incomplete. | [optional] [default to java.math.BigDecimal]
**nextFactor** | **java.math.BigDecimal** | The factor, current principal per unit of nominal, in force from effectiveDate (:92A::NWFC). Optional, but  supplied together with previousFactor or not at all; not less than previousFactor when supplied. | [optional] [default to java.math.BigDecimal]
**interestRate** | **java.math.BigDecimal** | The annual interest rate capitalised, as a fraction, so 6 per cent is 0.06 (:92A::INTP). Optional and  informational; not negative when supplied. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The currency of the capitalised principal (:11A::DENO). Optional and informational. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CapitalisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal previousFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal nextFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal interestRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String currency = "example currency";


CapitalisationEvent capitalisationEventInstance = new CapitalisationEvent()
    .effectiveDate(effectiveDate)
    .paymentDate(paymentDate)
    .recordDate(recordDate)
    .previousFactor(previousFactor)
    .nextFactor(nextFactor)
    .interestRate(interestRate)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)