# com.finbourne.sdk.services.lusid.model.TransactionTemplateSpecification
classname TransactionTemplateSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** | Available values: Internal, TransitionEvent, CouponEvent, OpenEvent, CloseEvent, BondDefaultEvent, CashDividendEvent, StockSplitEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, Unknown, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, EarlyCloseOutEvent, DepositRollEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent. | [default to String]
**supportedInstrumentTypes** | **List&lt;String&gt;** |  | [default to List<String>]
**supportedParticipationTypes** | **List&lt;String&gt;** |  | [default to List<String>]
**supportedElectionTypes** | [**List&lt;ElectionSpecification&gt;**](ElectionSpecification.md) |  | [default to List<ElectionSpecification>]
**supportedTemplateFields** | [**List&lt;TemplateField&gt;**](TemplateField.md) |  | [default to List<TemplateField>]
**eligibilityCalculation** | [**EligibilityCalculation**](EligibilityCalculation.md) |  | [default to EligibilityCalculation]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTemplateSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentEventType = "example instrumentEventType";
List<String> supportedInstrumentTypes = new List<String>();
List<String> supportedParticipationTypes = new List<String>();
List<ElectionSpecification> supportedElectionTypes = new List<ElectionSpecification>();
List<TemplateField> supportedTemplateFields = new List<TemplateField>();
EligibilityCalculation eligibilityCalculation = new EligibilityCalculation();


TransactionTemplateSpecification transactionTemplateSpecificationInstance = new TransactionTemplateSpecification()
    .instrumentEventType(instrumentEventType)
    .supportedInstrumentTypes(supportedInstrumentTypes)
    .supportedParticipationTypes(supportedParticipationTypes)
    .supportedElectionTypes(supportedElectionTypes)
    .supportedTemplateFields(supportedTemplateFields)
    .eligibilityCalculation(eligibilityCalculation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)