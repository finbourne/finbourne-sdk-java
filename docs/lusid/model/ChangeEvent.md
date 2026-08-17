# com.finbourne.sdk.services.lusid.model.ChangeEvent
classname ChangeEvent
Change event (CHAN) — a reorganisation in which an instrument's certificates, name, or  terms are changed. Holders of record on the record date have their positions converted  automatically to the new instrument at a fixed 1:1 ratio on the payment date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, ChangeEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent. | [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date — the eligibility cutoff. Holders of record on this date enter the  change. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date — the date the change fires and the paired StockMovement  transactions land. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**changeType** | **String** | The nature of the change — one of \&quot;Certificates\&quot;, \&quot;Name\&quot;, or \&quot;Terms\&quot;. Available values: Certificates, Name, Terms. | [default to String]
**termTarget** | **String** | The target of a terms change — one of \&quot;InstrumentDefinitionField\&quot; or  \&quot;InstrumentProperty\&quot;. Only applicable when ChangeType is \&quot;Terms\&quot;. Available values: InstrumentDefinitionField, InstrumentProperty. | [optional] [default to String]
**termTargetIdentifier** | **String** | The identifier of the term target being changed. Must be paired with TermTarget. | [optional] [default to String]
**additionalInformation** | **String** | Free-text additional information describing the change. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ChangeEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
NewInstrument newInstrument = new NewInstrument();
UnitsRatio unitsRatio = new UnitsRatio();
String changeType = "example changeType";
@javax.annotation.Nullable String termTarget = "example termTarget";
@javax.annotation.Nullable String termTargetIdentifier = "example termTargetIdentifier";
@javax.annotation.Nullable String additionalInformation = "example additionalInformation";


ChangeEvent changeEventInstance = new ChangeEvent()
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .newInstrument(newInstrument)
    .unitsRatio(unitsRatio)
    .changeType(changeType)
    .termTarget(termTarget)
    .termTargetIdentifier(termTargetIdentifier)
    .additionalInformation(additionalInformation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)