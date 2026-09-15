# com.finbourne.sdk.services.lusid.model.PreferredShare
classname PreferredShare
LUSID representation of a preferred (preference) share: an equity-classified security that pays an  intrinsic, schedule-driven dividend of DividendRate x ParValue. The schedule is perpetual unless a  MaturityDate is supplied, in which case the share redeems at par on that date.  It carries Bond's shape rather than Equity's - StartDate, MaturityDate and FlowConventions are real,  settable properties - but its dividend is a flat amount per period rather than a day-count-weighted  coupon, and its schedule can be open ended.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward, PreferredShare, CapitalInterest. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is the first dividend accrual start date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The redemption date of a dated series. Omit it for a perpetual, which is the default: there is  no sentinel date for the client to supply, and a distant date such as one in the year 9999 is  taken literally and schedules a par redemption on it. | [optional] [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**identifiers** | [**PreferredShareAllOfIdentifiers**](PreferredShareAllOfIdentifiers.md) |  | [optional] [default to PreferredShareAllOfIdentifiers]
**domCcy** | **String** | The domestic currency of the instrument. It is the currency of the dividends and of ParValue. | [default to String]
**callSchedule** | [**OptionalitySchedule**](OptionalitySchedule.md) |  | [optional] [default to OptionalitySchedule]
**cfiCode** | **String** | The ISO 10962 CFI code, if the client stores one. Free text, not validated against the standard. | [optional] [default to String]
**conversionSchedule** | [**BondConversionSchedule**](BondConversionSchedule.md) |  | [optional] [default to BondConversionSchedule]
**dividendRate** | **java.math.BigDecimal** | The fixed annualised dividend rate applied to ParValue, so 0.06 is 6%. A scalar for the life of  the share: there is no rate reset, so a fixed-to-floating preferred carries the rate for the  current period and is re-upserted at each reset. | [default to java.math.BigDecimal]
**firstDividendDate** | [**OffsetDateTime**](OffsetDateTime.md) | Anchors a short or long first dividend period. Omitted means no stub. | [optional] [default to OffsetDateTime]
**isCumulative** | **Boolean** | Whether a missed dividend accumulates as arrears rather than being forfeited. The client must  state it; there is no default. | [default to Boolean]
**lotSize** | **Integer** | The minimum number of shares that can be traded at once. Microstructure only: it has no effect  on valuation or on cash flows. Defaults to 1. | [optional] [default to Integer]
**parValue** | **java.math.BigDecimal** | The liquidation preference per share. It is the base for the dividend, for the call strike and  for the redemption amount. It is not a price multiplier. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PreferredShare;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
FlowConventions flowConventions = new FlowConventions();
@javax.annotation.Nullable PreferredShareAllOfIdentifiers identifiers = new PreferredShareAllOfIdentifiers();
String domCcy = "example domCcy";
OptionalitySchedule callSchedule = new OptionalitySchedule();
@javax.annotation.Nullable String cfiCode = "example cfiCode";
BondConversionSchedule conversionSchedule = new BondConversionSchedule();
java.math.BigDecimal dividendRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime firstDividendDate = OffsetDateTime.now();
Boolean isCumulative = true;
Integer lotSize = new Integer("100.00");
java.math.BigDecimal parValue = new java.math.BigDecimal("100.00");


PreferredShare preferredShareInstance = new PreferredShare()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .flowConventions(flowConventions)
    .identifiers(identifiers)
    .domCcy(domCcy)
    .callSchedule(callSchedule)
    .cfiCode(cfiCode)
    .conversionSchedule(conversionSchedule)
    .dividendRate(dividendRate)
    .firstDividendDate(firstDividendDate)
    .isCumulative(isCumulative)
    .lotSize(lotSize)
    .parValue(parValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)