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
**feeRatePercentage** | **java.math.BigDecimal** | The fee rate percentage. (Required when CalculationBase is present and not compatible with TotalAnnualAccrualAmount) | [optional] [default to java.math.BigDecimal]
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
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)