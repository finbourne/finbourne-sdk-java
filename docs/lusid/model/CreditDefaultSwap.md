# com.finbourne.sdk.services.lusid.model.CreditDefaultSwap
classname CreditDefaultSwap
LUSID representation of a Credit Default Swap (CDS).                This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).                | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | ProtectionLeg | Cash flows occurring in the case of default. |  | 2 | PremiumLeg | The premium payments made by the protection buyer. |  | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**ticker** | **String** | A ticker to uniquely specify the entity against which the CDS is written. Defaults to \&quot;DefaultCDSTicker\&quot;. | [optional] [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**CdsFlowConventions**](CdsFlowConventions.md) |  | [optional] [default to CdsFlowConventions]
**couponRate** | **java.math.BigDecimal** | The coupon rate paid on each payment date of the premium leg as a fraction of 100 percent, e.g. \&quot;0.05\&quot; meaning 500 basis points or 5%.  For a standard corporate CDS (North American) this must be either 100bps or 500bps. | [default to java.math.BigDecimal]
**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**notional** | **java.math.BigDecimal** | The notional protected by the Credit Default Swap | [optional] [default to java.math.BigDecimal]
**protectionDetailSpecification** | [**CdsProtectionDetailSpecification**](CdsProtectionDetailSpecification.md) |  | [optional] [default to CdsProtectionDetailSpecification]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.CreditDefaultSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ticker = "example ticker";
OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
CdsFlowConventions flowConventions = new CdsFlowConventions();
java.math.BigDecimal couponRate = new java.math.BigDecimal("100.00");
FlowConventionName conventionName = new FlowConventionName();
@javax.annotation.Nullable java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
CdsProtectionDetailSpecification protectionDetailSpecification = new CdsProtectionDetailSpecification();
@javax.annotation.Nullable List<AdditionalPayment> additionalPayments = new List<AdditionalPayment>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


CreditDefaultSwap creditDefaultSwapInstance = new CreditDefaultSwap()
    .ticker(ticker)
    .startDate(startDate)
    .maturityDate(maturityDate)
    .flowConventions(flowConventions)
    .couponRate(couponRate)
    .conventionName(conventionName)
    .notional(notional)
    .protectionDetailSpecification(protectionDetailSpecification)
    .additionalPayments(additionalPayments)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)