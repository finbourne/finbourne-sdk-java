# com.finbourne.sdk.services.lusid.model.InflationLeg
classname InflationLeg
LUSID representation of an Inflation Leg.  This leg instrument is part of the InflationSwap instrument, but can also be used as a standalone instrument.  The implementation supports the following inflation leg types:  * Zero Coupon inflation leg (CPI Leg), with a single payment at maturity.  * Year on Year inflation leg  * LPI Swap Leg (capped and floored YoY)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**baseCPI** | **java.math.BigDecimal** | Optional BaseCPI, if specified it will be used in place of BaseCPI(StartDate).  This should not be required for standard inflation swaps. | [optional] [default to java.math.BigDecimal]
**calculationType** | **String** | The calculation type.  ZeroCoupon is used for CPILegs where there is a single payment at maturity of  Notional * (CPI(T) / CPI(T0) - 1)  where CPI(T0) is the BaseCPI of this leg  YearOnYear is used for YoY and LPI swap legs where there is a series of annual payments  Notional * dayCount * (CPI(t) / CPI(t-1) - 1)  If a cap and floor is added to this it becomes an LPI swap leg.  Compounded is used for inflation swap legs where there is a series of annual payments  Notional * dayCount * (CPI(t) / CPI(T0) - 1)  i.e. the BaseCPI is used every year. These swaps are not as common as CPI or    Supported string (enumeration) values are: [ZeroCoupon, YearOnYear, Compounded]. | [default to String]
**capRate** | **java.math.BigDecimal** | Optional cap, needed for LPI Legs or CPI Legs with Caps | [optional] [default to java.math.BigDecimal]
**floorRate** | **java.math.BigDecimal** | Optional floor, needed for LPI Legs or CPI Legs with Floors. | [optional] [default to java.math.BigDecimal]
**inflationIndexConventions** | [**InflationIndexConventions**](InflationIndexConventions.md) |  | [default to InflationIndexConventions]
**notional** | **java.math.BigDecimal** | The notional | [default to java.math.BigDecimal]
**payReceive** | **String** | PayReceive flag for the inflation leg.  This field is optional and defaults to Pay.    Supported string (enumeration) values are: [Pay, Receive]. | [optional] [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.InflationLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
FlowConventions flowConventions = new FlowConventions();
@javax.annotation.Nullable java.math.BigDecimal baseCPI = new java.math.BigDecimal("100.00");
String calculationType = "example calculationType";
@javax.annotation.Nullable java.math.BigDecimal capRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal floorRate = new java.math.BigDecimal("100.00");
InflationIndexConventions inflationIndexConventions = new InflationIndexConventions();
java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String payReceive = "example payReceive";
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


InflationLeg inflationLegInstance = new InflationLeg()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .flowConventions(flowConventions)
    .baseCPI(baseCPI)
    .calculationType(calculationType)
    .capRate(capRate)
    .floorRate(floorRate)
    .inflationIndexConventions(inflationIndexConventions)
    .notional(notional)
    .payReceive(payReceive)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)