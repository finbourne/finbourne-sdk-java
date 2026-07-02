# com.finbourne.sdk.services.lusid.model.EarlyRedemptionEvent
classname EarlyRedemptionEvent
Early redemption as a consequence of a bond being called or putted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of redemption.  For internally generated European callables, this is set to the exercise date.  For internally generated American callables, this is set to the start of the exercise period. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the redemption. | [default to String]
**earlyRedemptionElections** | [**List&lt;EarlyRedemptionElection&gt;**](EarlyRedemptionElection.md) | EarlyRedemptionElection for the redemption.  Used to trigger the redemption. | [default to List<EarlyRedemptionElection>]
**redemptionPercentage** | **java.math.BigDecimal** | Percentage of the issued amount to be redeemed, value between 0 and 1, where 1 is a full redemption | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | The price, or strike, that each unit is redeemed at. | [optional] [default to java.math.BigDecimal]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Unpaid accrued interest also repaid as part of the redemption, per unit.  Optional field.  If left empty, will be resolved internally by calculating the accrued owed on the EffectiveDate.  This process may require additional market data. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.EarlyRedemptionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime effectiveDate = OffsetDateTime.now();
String currency = "example currency";
List<EarlyRedemptionElection> earlyRedemptionElections = new List<EarlyRedemptionElection>();
java.math.BigDecimal redemptionPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pricePerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal accruedInterestPerUnit = new java.math.BigDecimal("100.00");


EarlyRedemptionEvent earlyRedemptionEventInstance = new EarlyRedemptionEvent()
    .effectiveDate(effectiveDate)
    .currency(currency)
    .earlyRedemptionElections(earlyRedemptionElections)
    .redemptionPercentage(redemptionPercentage)
    .pricePerUnit(pricePerUnit)
    .accruedInterestPerUnit(accruedInterestPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)