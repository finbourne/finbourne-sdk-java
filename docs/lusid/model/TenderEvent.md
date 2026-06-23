# com.finbourne.sdk.services.lusid.model.TenderEvent
classname TenderEvent
Tender Event (TEND).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent. | [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the tender is announced. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the event. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the event. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractionalUnits. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. | [optional] [default to List<CashAndSecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. | [optional] [default to List<CashOfferElection>]

```java
import com.finbourne.sdk.services.lusid.model.TenderEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<CashAndSecurityOfferElection> cashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();


TenderEvent tenderEventInstance = new TenderEvent()
    .announcementDate(announcementDate)
    .exDate(exDate)
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .newInstrument(newInstrument)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .securityOfferElections(securityOfferElections)
    .cashAndSecurityOfferElections(cashAndSecurityOfferElections)
    .cashOfferElections(cashOfferElections);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)