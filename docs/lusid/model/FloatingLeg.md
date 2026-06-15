# com.finbourne.sdk.services.lusid.model.FloatingLeg
classname FloatingLeg
LUSID representation of a Floating Rate Leg.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**legDefinition** | [**LegDefinition**](LegDefinition.md) |  | [default to LegDefinition]
**notional** | **java.math.BigDecimal** | Scaling factor to apply to leg quantities. | [default to java.math.BigDecimal]
**overrides** | [**FixedLegAllOfOverrides**](FixedLegAllOfOverrides.md) |  | [optional] [default to FixedLegAllOfOverrides]
**capRate** | **java.math.BigDecimal** | The maximum floating rate which a cashflow can accrue. | [optional] [default to java.math.BigDecimal]
**floorRate** | **java.math.BigDecimal** | The minimum floating rate which a cashflow can accrue. | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.FloatingLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
LegDefinition legDefinition = new LegDefinition();
java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable FixedLegAllOfOverrides overrides = new FixedLegAllOfOverrides();
@javax.annotation.Nullable java.math.BigDecimal capRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal floorRate = new java.math.BigDecimal("100.00");
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


FloatingLeg floatingLegInstance = new FloatingLeg()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .legDefinition(legDefinition)
    .notional(notional)
    .overrides(overrides)
    .capRate(capRate)
    .floorRate(floorRate)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)