# com.finbourne.sdk.services.lusid.model.Fee
classname Fee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**feeCode** | **String** | The code of the Fee. | [optional] [default to String]
**feeTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Fee. | [default to String]
**description** | **String** | A description for the Fee. | [optional] [default to String]
**origin** | **String** | The origin or source of the Fee accrual. | [optional] [default to String]
**calculationBase** | **String** | The calculation base for a Fee that is calculated using a percentage (TotalAnnualAccrualAmount and CalculationBase cannot both be present). When the Fee is a ShareClass Fee (i.e: when ShareClasses contains at least one value), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;ShareClass.GAV\&quot;, \&quot;ShareClass.GAV - ShareClass.Fees[ShareClassFeeCode1].Amount\&quot;, \&quot;ShareClass.Fees[ShareClassFeeCode1].CalculationBase\&quot;. When the Fee is a NonShareClassSpecific Fee (i.e: when ShareClasses contains no values), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;GAV\&quot;, \&quot;GAV - Fees[NonClassSpecificFeeCode1].Amount\&quot;, \&quot;Fees[NonClassSpecificFeeCode1].CalculationBase\&quot;.  | [optional] [default to String]
**accrualCurrency** | **String** | The accrual currency. | [default to String]
**treatment** | **String** | The accrual period of the Fee. Available values: Daily, Monthly. | [default to String]
**totalAnnualAccrualAmount** | **java.math.BigDecimal** | The total annual accrued amount for the Fee. (TotalAnnualAccrualAmount and CalculationBase cannot both be present) | [optional] [default to java.math.BigDecimal]
**feeRatePercentage** | **java.math.BigDecimal** | The annual rate applied to the CalculationBase for a &#39;FixedPercentage&#39; Fee, expressed as a multiplier rather than a percentage: 0.052 means 5.2% of the base per year. (Required when CalculationBase is present and not compatible with TotalAnnualAccrualAmount) | [optional] [default to java.math.BigDecimal]
**payableFrequency** | **String** | The payable frequency for the Fee. Available values: Annually, Quarterly, Monthly. | [default to String]
**businessDayConvention** | **String** | The business day convention to use for Fee calculations on weekends or holidays. Available values: None, P, Previous, F, Following. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the Fee. | [default to OffsetDateTime]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the Fee. | [optional] [default to OffsetDateTime]
**anchorDate** | [**DayMonth**](DayMonth.md) |  | [optional] [default to DayMonth]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shareClasses** | **List&lt;String&gt;** | The short codes of the ShareClasses that the Fee should be applied to. Optional: if this is null or empty, then the Fee will be divided between all the ShareClasses of the Fund according to the capital ratio. | [optional] [default to List<String>]
**navTypeCode** | **String** | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] [default to String]
**feeCalculationType** | **String** | How the Fee accrual amount is calculated. Supported values: &#39;FixedAnnual&#39; (a fixed annual amount, requires TotalAnnualAccrualAmount), &#39;FixedDaily&#39; (a fixed daily amount, requires DailyAccrualAmount), &#39;FixedPercentage&#39; (a fixed percentage of the CalculationBase, requires FeeRatePercentage), &#39;VariablePercentage&#39; (a percentage of the CalculationBase resolved from a rate source at each accrual date, requires VariablePercentageSource), &#39;Tiered&#39; (a single rate applied to the whole CalculationBase, chosen by the tier the base falls in, requires Tiers), &#39;Blended&#39; (each tier&#39;s rate applied to the portion of the CalculationBase within that tier, requires Tiers). Optional: when not provided it is inferred as &#39;FixedAnnual&#39; if TotalAnnualAccrualAmount is populated and &#39;FixedPercentage&#39; otherwise, so existing requests keep their behaviour; the new calculation types must be requested explicitly. Available values: FixedAnnual, FixedDaily, FixedPercentage, VariablePercentage, Tiered, Blended. | [optional] [default to String]
**dailyAccrualAmount** | **java.math.BigDecimal** | The fixed daily accrued amount for a &#39;FixedDaily&#39; Fee, in the fund currency. The amount accrues for each day of the accrual period with no annualisation or day-count proration; Treatment does not affect it. | [optional] [default to java.math.BigDecimal]
**variablePercentageSource** | **String** | The source of the rate for a &#39;VariablePercentage&#39; Fee, in the form \&quot;scope/provider/instrumentIdType/instrumentId\&quot; identifying a Rate quote series in the quote store. At each accrual date the most recent rate at or before that date is used; if no rate can be found the valuation point calculation fails. The quote&#39;s normalised value (its value divided by any scale factor) is applied like FeeRatePercentage, as a multiplier of the CalculationBase: a rate of 5.2% must normalise to 0.052. | [optional] [default to String]
**variablePercentageSourceOffset** | **java.math.BigDecimal** | An optional adjustment added to the rate resolved from the VariablePercentageSource, expressed as a factor like FeeRatePercentage (e.g. 0.0025 adds 25 basis points). | [optional] [default to java.math.BigDecimal]
**tiers** | [**List&lt;FeeRateTier&gt;**](FeeRateTier.md) | The rate tiers for a &#39;Tiered&#39; or &#39;Blended&#39; Fee: between 2 and 10 tiers over the CalculationBase. Every tier except the last must have a Threshold, and thresholds must be positive and strictly increasing; a base equal to a Threshold falls in that tier, and the final tier covers the balance above the last threshold. A &#39;Tiered&#39; Fee applies the rate of the tier the whole base falls in; a &#39;Blended&#39; Fee applies each tier&#39;s rate to the portion of the base within that tier. | [optional] [default to List<FeeRateTier>]
**feeCap** | **java.math.BigDecimal** | An optional annual cap on the accrued fee for &#39;FixedPercentage&#39;, &#39;VariablePercentage&#39;, &#39;Tiered&#39; and &#39;Blended&#39; Fees, in the fund currency and assessed period-to-date. Each day accrues only up to the amount left under the cap for the current fee year, which runs from one AnchorDate to the next; once the cap is reached nothing further accrues until the next AnchorDate. | [optional] [default to java.math.BigDecimal]
**feeFloor** | **java.math.BigDecimal** | An optional annual floor on the calculated fee for &#39;FixedPercentage&#39;, &#39;VariablePercentage&#39;, &#39;Tiered&#39; and &#39;Blended&#39; Fees, in the fund currency. The annualised fee amount is raised to the floor before being prorated to each accrual day. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Fee;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String feeCode = "example feeCode";
ResourceId feeTypeId = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String origin = "example origin";
@javax.annotation.Nullable String calculationBase = "example calculationBase";
String accrualCurrency = "example accrualCurrency";
String treatment = "example treatment";
@javax.annotation.Nullable java.math.BigDecimal totalAnnualAccrualAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal feeRatePercentage = new java.math.BigDecimal("100.00");
String payableFrequency = "example payableFrequency";
String businessDayConvention = "example businessDayConvention";
OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime endDate = OffsetDateTime.now();
DayMonth anchorDate = new DayMonth();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable List<String> shareClasses = new List<String>();
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";
@javax.annotation.Nullable String feeCalculationType = "example feeCalculationType";
@javax.annotation.Nullable java.math.BigDecimal dailyAccrualAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String variablePercentageSource = "example variablePercentageSource";
@javax.annotation.Nullable java.math.BigDecimal variablePercentageSourceOffset = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<FeeRateTier> tiers = new List<FeeRateTier>();
@javax.annotation.Nullable java.math.BigDecimal feeCap = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal feeFloor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<Link> links = new List<Link>();


Fee feeInstance = new Fee()
    .href(href)
    .feeCode(feeCode)
    .feeTypeId(feeTypeId)
    .displayName(displayName)
    .description(description)
    .origin(origin)
    .calculationBase(calculationBase)
    .accrualCurrency(accrualCurrency)
    .treatment(treatment)
    .totalAnnualAccrualAmount(totalAnnualAccrualAmount)
    .feeRatePercentage(feeRatePercentage)
    .payableFrequency(payableFrequency)
    .businessDayConvention(businessDayConvention)
    .startDate(startDate)
    .endDate(endDate)
    .anchorDate(anchorDate)
    .properties(properties)
    .version(version)
    .portfolioId(portfolioId)
    .shareClasses(shareClasses)
    .navTypeCode(navTypeCode)
    .feeCalculationType(feeCalculationType)
    .dailyAccrualAmount(dailyAccrualAmount)
    .variablePercentageSource(variablePercentageSource)
    .variablePercentageSourceOffset(variablePercentageSourceOffset)
    .tiers(tiers)
    .feeCap(feeCap)
    .feeFloor(feeFloor)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)