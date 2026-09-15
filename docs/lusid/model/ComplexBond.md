# com.finbourne.sdk.services.lusid.model.ComplexBond
classname ComplexBond
LUSID representation of a Complex Bond.  Including Floating, Fixed-to-float, Sinkable, Callable, Puttable, and Mortgage Backed Securities.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward, PreferredShare, CapitalInterest. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [optional] [default to Map<String, String>]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal * Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon, StandardWithCappedAccruedInterest]. | [optional] [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | schedules. | [optional] [default to List<Schedule>]
**originalIssuePrice** | **java.math.BigDecimal** | The price the complex bond was issued at. This is to be entered as a percentage of par, for example a value of 98.5 would represent 98.5%. | [optional] [default to java.math.BigDecimal]
**parPerUnit** | **java.math.BigDecimal** | Optional value used to scale accrued interest and coupon amounts only (not CleanPV), in addition to  currentNotional and units. If you do not set this field, the value is 1 and no amount changes.  A model that calculates the price from the cash flows, for example Discounting, includes the scaled coupons   in the PV and thus in the CleanPV. The CleanPV exclusion applies to a quoted price. | [optional] [default to java.math.BigDecimal]
**issueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the bond was issued to the market. This may be after the StartDate (dated date) from which interest accrues, for example for agency mortgage-backed securities. The payment schedule is unchanged, but no coupon entitlement (ex-dividend) date can fall before this date: a buyer settling on the issue date is entitled to the first coupon, and accrued interest includes completed-but-unpaid coupons until their entitlement passes. | [optional] [default to OffsetDateTime]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. | [optional] [default to List<RoundingConvention>]
**assetBacked** | **Boolean** | If this flag is set to true, then the outstanding notional and principal repayments will be calculated based  on pool factors in the quote store. Usually AssetBacked bonds also require a RollConvention setting of   within the FlowConventions any given rates schedule (to ensure payment dates always happen on the same day  of the month) and US Agency MBSs with Pay Delay features also require their rates schedules to include an  ExDividendConfiguration to drive the lag between interest accrual and payment. | [optional] [default to Boolean]
**assetPoolIdentifier** | **String** | Identifier used to retrieve pool factor information about this bond from the quote store. This is typically  the bond&#39;s ISIN, but can also be ClientInternal. Please ensure you align the MarketDataKeyRule with the  correct Quote (Quote.ClientInternal.* or Quote.Isin.*) | [optional] [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.ComplexBond;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String calculationType = "example calculationType";
@javax.annotation.Nullable List<Schedule> schedules = new List<Schedule>();
@javax.annotation.Nullable java.math.BigDecimal originalIssuePrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal parPerUnit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime issueDate = OffsetDateTime.now();
@javax.annotation.Nullable List<RoundingConvention> roundingConventions = new List<RoundingConvention>();
@javax.annotation.Nullable Boolean assetBacked = true;
@javax.annotation.Nullable String assetPoolIdentifier = "example assetPoolIdentifier";
TradingConventions tradingConventions = new TradingConventions();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


ComplexBond complexBondInstance = new ComplexBond()
    .identifiers(identifiers)
    .calculationType(calculationType)
    .schedules(schedules)
    .originalIssuePrice(originalIssuePrice)
    .parPerUnit(parPerUnit)
    .issueDate(issueDate)
    .roundingConventions(roundingConventions)
    .assetBacked(assetBacked)
    .assetPoolIdentifier(assetPoolIdentifier)
    .tradingConventions(tradingConventions)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)