# com.finbourne.sdk.services.lusid.model.DrawingEvent
classname DrawingEvent
Mandatory partial bond redemption (DRAW) where the issuer lottery-selects specific bonds for early redemption.  The affected face amount (AFFB) is pre-determined externally from the vendor notification and supplied on the event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the cash actually flows for the drawn portion of the holding. | [optional] [default to OffsetDateTime]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Lottery Date (&#x3D; Record Date). Holdings are snapshotted at the close of this date to determine the affected balance. | [optional] [default to OffsetDateTime]
**affectedAmount** | **java.math.BigDecimal** | Affected face amount (AFFB) — the lottery-selected portion of the holding that is redeemed. Must be strictly positive. | [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | Redemption price per unit (OFFR / 100). Clean price convention.  Optional: AFFB is typically known before the issuer publishes OFFR, so a null price is permitted on upsert. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | Settlement currency for the redemption. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DrawingEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
OffsetDateTime effectiveDate = OffsetDateTime.now();
java.math.BigDecimal affectedAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pricePerUnit = new java.math.BigDecimal("100.00");
String currency = "example currency";


DrawingEvent drawingEventInstance = new DrawingEvent()
    .paymentDate(paymentDate)
    .effectiveDate(effectiveDate)
    .affectedAmount(affectedAmount)
    .pricePerUnit(pricePerUnit)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)