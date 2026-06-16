# com.finbourne.sdk.services.lusid.model.CdxCreditEvent
classname CdxCreditEvent
Definition of a credit event for credit default swap index (CDX) instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | The Type of Event. Available values: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit default - i.e. date on which the debt issuer defaulted on its repayment obligation. | [optional] [default to OffsetDateTime]
**auctionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit event auction - i.e. date on which the defaulted debt is sold via auction, and a recovery rate determined. | [optional] [default to OffsetDateTime]
**recoveryRate** | **java.math.BigDecimal** | The fraction of the defaulted debt that can be recovered. | [optional] [default to java.math.BigDecimal]
**constituentWeight** | **java.math.BigDecimal** | The relative weight of the CDX constituent. | [default to java.math.BigDecimal]
**constituentReference** | **String** | Reference value used to identify the CDX constituent. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the credit event auction settlement. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CdxCreditEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime auctionDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal recoveryRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal constituentWeight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String constituentReference = "example constituentReference";
@javax.annotation.Nullable OffsetDateTime paymentDate = OffsetDateTime.now();


CdxCreditEvent cdxCreditEventInstance = new CdxCreditEvent()
    .effectiveDate(effectiveDate)
    .auctionDate(auctionDate)
    .recoveryRate(recoveryRate)
    .constituentWeight(constituentWeight)
    .constituentReference(constituentReference)
    .paymentDate(paymentDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)