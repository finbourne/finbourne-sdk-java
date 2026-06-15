# com.finbourne.sdk.services.lusid.model.ValuationPointOverview
classname ValuationPointOverview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**diaryEntryCode** | **String** | The code for the Valuation Point. | [default to String]
**diaryEntryVariant** | **String** | The Variant for the Valuation Point. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the last Valuation Point. | [default to OffsetDateTime]
**effectiveTo** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the current Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the Valuation Point. Defaults to latest. | [optional] [default to OffsetDateTime]
**type** | **String** | The type of the diary entry. This is &#39;ValuationPoint&#39;. Available values: PeriodBoundary, ValuationPoint, Other. | [default to String]
**status** | **String** | The status of the Valuation Point. Available values: Undefined, Estimate, Final, Candidate, Unofficial, Rejected. | [default to String]
**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund or Share Class at the Valuation Point. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. | [default to java.math.BigDecimal]
**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund or Share Class at the Valuation Point. This represents the GAV with any fees applied in the period. | [default to java.math.BigDecimal]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointOverview;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String diaryEntryVariant = "example diaryEntryVariant";
OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime effectiveTo = OffsetDateTime.now();
OffsetDateTime queryAsAt = OffsetDateTime.now();
String type = "example type";
String status = "example status";
java.math.BigDecimal gav = new java.math.BigDecimal("100.00");
java.math.BigDecimal nav = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationPointOverview valuationPointOverviewInstance = new ValuationPointOverview()
    .href(href)
    .diaryEntryCode(diaryEntryCode)
    .diaryEntryVariant(diaryEntryVariant)
    .effectiveFrom(effectiveFrom)
    .effectiveTo(effectiveTo)
    .queryAsAt(queryAsAt)
    .type(type)
    .status(status)
    .gav(gav)
    .nav(nav)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)