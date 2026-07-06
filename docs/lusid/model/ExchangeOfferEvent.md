# com.finbourne.sdk.services.lusid.model.ExchangeOfferEvent
classname ExchangeOfferEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**eventSource** | **String** |  | [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) |  | [optional] [default to List<CashOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) |  | [optional] [default to List<SecurityOfferElection>]
**mixedLotConstituentsElections** | [**List&lt;MixedLotConstituentsElection&gt;**](MixedLotConstituentsElection.md) |  | [optional] [default to List<MixedLotConstituentsElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) |  | [optional] [default to List<LapseElection>]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** |  | [optional] [default to String]
**instructionReference** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExchangeOfferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();
String eventSource = "example eventSource";
NewInstrument newInstrument = new NewInstrument();
@javax.annotation.Nullable List<CashOfferElection> cashOfferElections = new List<CashOfferElection>();
@javax.annotation.Nullable List<SecurityOfferElection> securityOfferElections = new List<SecurityOfferElection>();
@javax.annotation.Nullable List<MixedLotConstituentsElection> mixedLotConstituentsElections = new List<MixedLotConstituentsElection>();
@javax.annotation.Nullable List<LapseElection> lapseElections = new List<LapseElection>();
@javax.annotation.Nullable java.math.BigDecimal minPieceSize = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal minIncrement = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fractionalUnitsCashCurrency = "example fractionalUnitsCashCurrency";
@javax.annotation.Nullable String instructionReference = "example instructionReference";


ExchangeOfferEvent exchangeOfferEventInstance = new ExchangeOfferEvent()
    .effectiveDate(effectiveDate)
    .settlementDate(settlementDate)
    .eventSource(eventSource)
    .newInstrument(newInstrument)
    .cashOfferElections(cashOfferElections)
    .securityOfferElections(securityOfferElections)
    .mixedLotConstituentsElections(mixedLotConstituentsElections)
    .lapseElections(lapseElections)
    .minPieceSize(minPieceSize)
    .minIncrement(minIncrement)
    .fractionalUnitsCashPrice(fractionalUnitsCashPrice)
    .fractionalUnitsCashCurrency(fractionalUnitsCashCurrency)
    .instructionReference(instructionReference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)