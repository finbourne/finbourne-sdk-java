# com.finbourne.sdk.services.lusid.model.DutchAuctionEvent
classname DutchAuctionEvent
Dutch Auction Event (DTCH) — a voluntary corporate action with price-discovery, proration,  and per-holder bid audit. Tri-modal: CASH (uniform clearing-price cash buyback via  TenderOfferElection), SECU (clean security-for-security exchange via SecurityOfferElection),  or CASE (security exchange with signed per-unit cash settlement via CashAndSecurityOfferElection).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date for both the security and cash legs of the auction. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issuer or acquirer instruction deadline. | [optional] [default to OffsetDateTime]
**currency** | **String** | Event settlement currency (ISO 4217). | [default to String]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Populated on the CASH path (Count &#x3D;&#x3D; 1);  empty on the SECU and CASE paths. | [optional] [default to List<TenderOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. Populated on the SECU path (Count &#x3D;&#x3D; 1);  empty on the CASH and CASE paths. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. Populated on the CASE path  (Count &#x3D;&#x3D; 1); empty on the CASH and SECU paths. | [optional] [default to List<CashAndSecurityOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Required on all three paths (Count &#x3D;&#x3D; 1).  Allows the holder to opt out of the offer (NOAC). | [optional] [default to List<LapseElection>]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Account-servicer response deadline. Defaults to MarketDeadlineDate when not supplied.  When provided, must be on or before MarketDeadlineDate. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Early-participation deadline. When provided, must be on or before ResponseDeadlineDate. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date of the event. Optional; carried for cross-event consistency. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the event. Optional and not required by AMI-SeCo for DTCH  (the event is instruction-driven via QINS, not record-date-driven). | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Public announcement date of the auction. Optional. | [optional] [default to OffsetDateTime]
**targetQuantity** | **java.math.BigDecimal** | Total quantity of securities sought by the issuer or acquirer. Optional. | [optional] [default to java.math.BigDecimal]
**prorationRate** | **java.math.BigDecimal** | Proportional adjustment applied to the security and cash legs on all paths.  Must be in (0, 1]. | [optional] [default to java.math.BigDecimal]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Cash-in-lieu price per fractional unit on the SECU and CASE paths.  Null indicates round-down disposition of fractional remainders.  Distinct from the CASE path&#39;s main cash settlement (which lives on CashAndSecurityOfferElection). | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Currency of the cash-in-lieu paid on fractional remainders on the SECU and CASE paths.  Required when FractionalUnitsCashPrice is non-null. | [optional] [default to String]
**bidPrice** | **java.math.BigDecimal** | Per-holder bid price submitted at instruction time. Audit-only; no calculation impact. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DutchAuctionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime marketDeadlineDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable List<TenderOfferElection> tenderOfferElections = new List<TenderOfferElection>();
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<CashAndSecurityOfferElection> cashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable OffsetDateTime responseDeadlineDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime earlyResponseDeadline = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime exDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime recordDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime announcementDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal targetQuantity = new java.math.BigDecimal("100.00");
java.math.BigDecimal prorationRate = new java.math.BigDecimal("100.00");
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable java.math.BigDecimal bidPrice = new java.math.BigDecimal("100.00");


DutchAuctionEvent dutchAuctionEventInstance = new DutchAuctionEvent()
    .paymentDate(paymentDate)
    .marketDeadlineDate(marketDeadlineDate)
    .currency(currency)
    .tenderOfferElections(tenderOfferElections)
    .securityOfferElections(securityOfferElections)
    .cashAndSecurityOfferElections(cashAndSecurityOfferElections)
    .lapseElections(lapseElections)
    .responseDeadlineDate(responseDeadlineDate)
    .earlyResponseDeadline(earlyResponseDeadline)
    .exDate(exDate)
    .recordDate(recordDate)
    .announcementDate(announcementDate)
    .targetQuantity(targetQuantity)
    .prorationRate(prorationRate)
    .newInstrument(newInstrument)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .bidPrice(bidPrice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)