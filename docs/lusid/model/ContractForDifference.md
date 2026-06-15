# com.finbourne.sdk.services.lusid.model.ContractForDifference
classname ContractForDifference
LUSID representation of a Contract for Difference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the CFD. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date for the CFD. If CFDType is Futures, this should be set to be the maturity date of the underlying  future. If CFDType is Cash, this should not be set. | [optional] [default to OffsetDateTime]
**code** | **String** | The code of the underlying. | [optional] [default to String]
**contractSize** | **java.math.BigDecimal** | The size of the CFD contract, this should represent the total number of stocks that the CFD represents.   This field is optional, if not set it will default to 1. | [optional] [default to java.math.BigDecimal]
**payCcy** | **String** | The currency that this CFD pays out, this can be different to the UnderlyingCcy. | [default to String]
**referenceRate** | **java.math.BigDecimal** | The reference rate of the CFD, this can be set to 0 but not negative values.  This field is optional, if not set it will default to 0. | [optional] [default to java.math.BigDecimal]
**type** | **String** | The type of CFD.    Supported string (enumeration) values are: [Cash, Futures]. | [default to String]
**underlyingCcy** | **String** | The currency of the underlying | [optional] [default to String]
**underlyingIdentifier** | **String** | External market codes and identifiers for the CFD, e.g. RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. | [optional] [default to String]
**lotSize** | **Integer** | CFD LotSize, the minimum number of shares that can be bought or sold at once.  Optional, if set must be non-negative, if not set defaults to 1. | [optional] [default to Integer]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.ContractForDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
@javax.annotation.Nullable String code = "example code";
java.math.BigDecimal contractSize = new java.math.BigDecimal("100.00");
String payCcy = "example payCcy";
java.math.BigDecimal referenceRate = new java.math.BigDecimal("100.00");
String type = "example type";
@javax.annotation.Nullable String underlyingCcy = "example underlyingCcy";
@javax.annotation.Nullable String underlyingIdentifier = "example underlyingIdentifier";
Integer lotSize = new Integer("100.00");
LusidInstrument underlying = new LusidInstrument();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


ContractForDifference contractForDifferenceInstance = new ContractForDifference()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .code(code)
    .contractSize(contractSize)
    .payCcy(payCcy)
    .referenceRate(referenceRate)
    .type(type)
    .underlyingCcy(underlyingCcy)
    .underlyingIdentifier(underlyingIdentifier)
    .lotSize(lotSize)
    .underlying(underlying)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)