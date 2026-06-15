# com.finbourne.sdk.services.lusid.model.Bond
classname Bond
LUSID representation of a Vanilla Fixed Rate Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The Start date of the bond, this is normally when accrual of the first coupon begins. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The Maturity date of the bond, this is when the last coupon accrual period ends.  Note that while most bonds have their last payment on this date there are some cases where the final payment is the next working day. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions. | [default to String]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset.  This might be reduced through its lifetime in the event of amortisation or similar. | [default to java.math.BigDecimal]
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | [default to java.math.BigDecimal]
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [optional] [default to Map<String, String>]
**exDividendDays** | **Integer** | Optional. Number of calendar days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, then there is no ex-dividend period.                NOTE: This field is deprecated.  If you wish to set the ExDividendDays on a bond, please use the ExDividendConfiguration. | [optional] [default to Integer]
**initialCouponDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional and to be DEPRECATED. If set, this is the date at which the bond begins to accrue interest. Instead, this information should be entered in the field StartDate. | [optional] [default to OffsetDateTime]
**firstCouponPayDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the first coupon of the bond is paid. This is required for bonds that have a long first coupon or short first coupon. The first coupon pay date is used  as an anchor to compare with the start date and determine if this is a long/short coupon period. | [optional] [default to OffsetDateTime]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal * Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon, StandardWithCappedAccruedInterest]. | [optional] [default to String]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. | [optional] [default to List<RoundingConvention>]
**exDividendConfiguration** | [**ExDividendConfiguration**](ExDividendConfiguration.md) |  | [optional] [default to ExDividendConfiguration]
**originalIssuePrice** | **java.math.BigDecimal** | The price the bond was issued at. This is to be entered as a percentage of par, for example a value of 98.5 would represent 98.5%. | [optional] [default to java.math.BigDecimal]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.Bond;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
FlowConventions flowConventions = new FlowConventions();
java.math.BigDecimal principal = new java.math.BigDecimal("100.00");
java.math.BigDecimal couponRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable Integer exDividendDays = new Integer("100.00");
@javax.annotation.Nullable OffsetDateTime initialCouponDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime firstCouponPayDate = OffsetDateTime.now();
@javax.annotation.Nullable String calculationType = "example calculationType";
@javax.annotation.Nullable List<RoundingConvention> roundingConventions = new List<RoundingConvention>();
ExDividendConfiguration exDividendConfiguration = new ExDividendConfiguration();
@javax.annotation.Nullable java.math.BigDecimal originalIssuePrice = new java.math.BigDecimal("100.00");
TradingConventions tradingConventions = new TradingConventions();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


Bond bondInstance = new Bond()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .flowConventions(flowConventions)
    .principal(principal)
    .couponRate(couponRate)
    .identifiers(identifiers)
    .exDividendDays(exDividendDays)
    .initialCouponDate(initialCouponDate)
    .firstCouponPayDate(firstCouponPayDate)
    .calculationType(calculationType)
    .roundingConventions(roundingConventions)
    .exDividendConfiguration(exDividendConfiguration)
    .originalIssuePrice(originalIssuePrice)
    .tradingConventions(tradingConventions)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)