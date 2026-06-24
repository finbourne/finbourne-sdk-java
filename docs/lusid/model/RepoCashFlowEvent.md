# com.finbourne.sdk.services.lusid.model.RepoCashFlowEvent
classname RepoCashFlowEvent
Event representing a repurchase agreement cashflow.   For example, cashflow for a partial closure of the   repurchase agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the counterparties become entitled   to exchange cash as part of a partial closure of the   repurchase agreement. The date must be before or on   the settlement date, and on or before the maturity   date of the repo. This is a required field. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the exchange of cash is settled.   The date must be on or after the entitlement date,  and on or before the maturity date of the repo.   This is a required field. | [optional] [default to OffsetDateTime]
**cashFlowPerUnit** | **java.math.BigDecimal** | The amount of cash to be exchanged for each unit   of the instrument held on the entitlement date. | [default to java.math.BigDecimal]
**currency** | **String** | The currency in which the cashflow is paid. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RepoCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime entitlementDate = OffsetDateTime.now();
OffsetDateTime settlementDate = OffsetDateTime.now();
java.math.BigDecimal cashFlowPerUnit = new java.math.BigDecimal("100.00");
String currency = "example currency";


RepoCashFlowEvent repoCashFlowEventInstance = new RepoCashFlowEvent()
    .entitlementDate(entitlementDate)
    .settlementDate(settlementDate)
    .cashFlowPerUnit(cashFlowPerUnit)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)