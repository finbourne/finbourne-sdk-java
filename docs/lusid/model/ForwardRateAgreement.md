# com.finbourne.sdk.services.lusid.model.ForwardRateAgreement
classname ForwardRateAgreement
LUSID representation of a Forward Rate Agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the FRA | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the rate to be paid, the reference rate, is confirmed/observed. | [default to OffsetDateTime]
**fraRate** | **java.math.BigDecimal** | The rate at which the FRA is traded. | [default to java.math.BigDecimal]
**notional** | **java.math.BigDecimal** | The amount for which the FRA is traded. | [default to java.math.BigDecimal]
**indexConvention** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.ForwardRateAgreement;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
OffsetDateTime fixingDate = OffsetDateTime.now();
java.math.BigDecimal fraRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
IndexConvention indexConvention = new IndexConvention();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


ForwardRateAgreement forwardRateAgreementInstance = new ForwardRateAgreement()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .fixingDate(fixingDate)
    .fraRate(fraRate)
    .notional(notional)
    .indexConvention(indexConvention)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)