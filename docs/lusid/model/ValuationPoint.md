# com.finbourne.sdk.services.lusid.model.ValuationPoint
classname ValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**valuationPointCode** | **String** | The code of the Valuation Point. | [optional] [default to String]
**variant** | **String** | The Variant name for the Valuation Point. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**status** | **String** | The status of the Valuation Point. Available values: Undefined, Estimate, Final, Candidate, Unofficial, Rejected. | [default to String]
**applyClearDown** | **Boolean** | Indicates whether a clear down was applied when the Valuation Point was created. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the Valuation Point. This is the AsAt time that will be used when requests are made using the entry. | [optional] [default to OffsetDateTime]
**holdingsAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for building holdings in the Valuation Point. | [optional] [default to OffsetDateTime]
**valuationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for performing valuations in the Valuation Point. | [optional] [default to OffsetDateTime]
**previous** | [**PreviousValuationPoint**](PreviousValuationPoint.md) |  | [optional] [default to PreviousValuationPoint]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Valuation Point properties. These are from the &#39;DiaryEntry&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String variant = "example variant";
@javax.annotation.Nullable String name = "example name";
String status = "example status";
Boolean applyClearDown = true;
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime queryAsAt = OffsetDateTime.now();
OffsetDateTime holdingsAsAt = OffsetDateTime.now();
OffsetDateTime valuationAsAt = OffsetDateTime.now();
PreviousValuationPoint previous = new PreviousValuationPoint();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationPoint valuationPointInstance = new ValuationPoint()
    .href(href)
    .valuationPointCode(valuationPointCode)
    .variant(variant)
    .name(name)
    .status(status)
    .applyClearDown(applyClearDown)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .holdingsAsAt(holdingsAsAt)
    .valuationAsAt(valuationAsAt)
    .previous(previous)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)