# com.finbourne.sdk.services.lusid.model.DiaryEntry
classname DiaryEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**aborId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**diaryEntryCode** | **String** | The code of the diary entry. | [optional] [default to String]
**type** | **String** | The type of the diary entry. Available values: PeriodBoundary, ValuationPoint, Other. | [default to String]
**name** | **String** | The name of the diary entry. | [optional] [default to String]
**status** | **String** | The status of the diary entry. Statuses are constrained and defaulted by &#39;Type&#39; specified.     Type &#39;Other&#39; defaults to &#39;Undefined&#39; and supports &#39;Undefined&#39;, &#39;Estimate&#39;, &#39;Candidate&#39;, and &#39;Final&#39;.    Type &#39;PeriodBoundary&#39; defaults to &#39;Estimate&#39; when closing a period, and supports &#39;Estimate&#39; and &#39;Final&#39; for closing periods and &#39;Final&#39; for locking periods.    Type &#39;ValuationPoint&#39; defaults to &#39;Estimate&#39; when upserting a diary entry, moves to &#39;Candidate&#39; or &#39;Final&#39; when a ValuationPoint is accepted, and &#39;Final&#39; when it is finalised. Available values: Undefined, Estimate, Final, Candidate, Unofficial. | [default to String]
**applyClearDown** | **Boolean** | Defaults to false. Set to true if you want that the closed period to have the clear down applied. Available values: Undefined, Estimate, Final, Candidate, Unofficial. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**previousEntryTime** | [**OffsetDateTime**](OffsetDateTime.md) | The entry time of the previous diary entry. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DiaryEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId aborId = new ResourceId();
@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";
String type = "example type";
@javax.annotation.Nullable String name = "example name";
String status = "example status";
Boolean applyClearDown = true;
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime queryAsAt = OffsetDateTime.now();
OffsetDateTime previousEntryTime = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DiaryEntry diaryEntryInstance = new DiaryEntry()
    .href(href)
    .aborId(aborId)
    .diaryEntryCode(diaryEntryCode)
    .type(type)
    .name(name)
    .status(status)
    .applyClearDown(applyClearDown)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .previousEntryTime(previousEntryTime)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)