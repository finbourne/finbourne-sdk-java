# com.finbourne.sdk.services.lusid.model.WholeLoanFacility
classname WholeLoanFacility
Whole Loan Facility. A loan facility wholly funded by a single lender: it shares the contractual terms, schedules  and instrument events of a LoanFacility, but ownership is not shared pro-rata across investors, and it is valued  at par rather than from a price quote. Like a LoanFacility, this is a lightweight instrument which acts as a  placeholder for the state that is built from the instrument events, with its contracts modelled via FlexibleLoan  instruments in LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward, PreferredShare, CapitalInterest, WholeLoanFacility. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**initialCommitment** | **java.math.BigDecimal** | The initial commitment for the whole loan facility. | [default to java.math.BigDecimal]
**loanType** | **String** | LoanType for this facility. The facility can either be a revolving or a  term loan. Available values: Revolver, TermLoan. | [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Repayment schedules for the facility. | [default to List<Schedule>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.WholeLoanFacility;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
java.math.BigDecimal initialCommitment = new java.math.BigDecimal("100.00");
String loanType = "example loanType";
List<Schedule> schedules = new List<Schedule>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


WholeLoanFacility wholeLoanFacilityInstance = new WholeLoanFacility()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .initialCommitment(initialCommitment)
    .loanType(loanType)
    .schedules(schedules)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)