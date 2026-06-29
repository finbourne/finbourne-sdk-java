# com.finbourne.sdk.services.lusid.model.FlexibleRepoInterestPaymentEvent
classname FlexibleRepoInterestPaymentEvent
Definition of FlexibleRepoInterestPaymentEvent, which represents the regular interest payments associated with an  open repo contract modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the interest payment. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | EntitlementDate of the interest payment. This is a required field. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the interest payment. This is a required field. | [default to String]
**interestPerUnit** | **java.math.BigDecimal** | Interest payment per unit held of the FlexibleRepo. This field is optional. If not specified, the system  will not generate a virtual transaction for this event | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FlexibleRepoInterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime settlementDate = OffsetDateTime.now();
OffsetDateTime entitlementDate = OffsetDateTime.now();
String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal interestPerUnit = new java.math.BigDecimal("100.00");


FlexibleRepoInterestPaymentEvent flexibleRepoInterestPaymentEventInstance = new FlexibleRepoInterestPaymentEvent()
    .settlementDate(settlementDate)
    .entitlementDate(entitlementDate)
    .currency(currency)
    .interestPerUnit(interestPerUnit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)