# com.finbourne.sdk.services.lusid.model.Facility
classname Facility

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**facilityCode** | **String** | The code of the Facility, unique within the Fund. | [optional] [default to String]
**displayName** | **String** | The name of the Facility. | [default to String]
**description** | **String** | A description for the Facility. | [optional] [default to String]
**lender** | **String** | The name of the lender providing the Facility. | [default to String]
**limit** | **java.math.BigDecimal** | The committed limit of the Facility. Must be greater than zero. | [default to java.math.BigDecimal]
**currency** | **String** | The three-letter currency code in which the Facility is denominated. | [default to String]
**rateReference** | **String** | The reference rate the Facility interest is based on, for example SOFR. Optional. | [optional] [default to String]
**margin** | **java.math.BigDecimal** | The margin over the reference rate, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**commitmentFeeRate** | **java.math.BigDecimal** | The annual commitment fee rate charged on the undrawn balance, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day count convention used to accrue interest. One of: Act360, Act365, Act365F, Thirty360. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Facility;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String facilityCode = "example facilityCode";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String lender = "example lender";
java.math.BigDecimal limit = new java.math.BigDecimal("100.00");
String currency = "example currency";
@javax.annotation.Nullable String rateReference = "example rateReference";
java.math.BigDecimal margin = new java.math.BigDecimal("100.00");
java.math.BigDecimal commitmentFeeRate = new java.math.BigDecimal("100.00");
String dayCountConvention = "example dayCountConvention";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Facility facilityInstance = new Facility()
    .href(href)
    .facilityCode(facilityCode)
    .displayName(displayName)
    .description(description)
    .lender(lender)
    .limit(limit)
    .currency(currency)
    .rateReference(rateReference)
    .margin(margin)
    .commitmentFeeRate(commitmentFeeRate)
    .dayCountConvention(dayCountConvention)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)