# com.finbourne.sdk.services.lusid.model.FundCalendarEntry
classname FundCalendarEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry. | [default to String]
**variant** | **String** | The Variant of the Calendar Entry. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [default to String]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**previousEntry** | [**PreviousFundCalendarEntry**](PreviousFundCalendarEntry.md) |  | [optional] [default to PreviousFundCalendarEntry]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**entryType** | **String** | The type of the Fund Calendar Entry. Available values: ValuationPointFundCalendarEntry, BookmarkFundCalendarEntry. | [default to String]
**status** | **String** | The status of the Fund Calendar Entry. Can be &#39;Estimate&#39;, &#39;Unofficial&#39; or &#39;Final&#39;. | [optional] [default to String]
**applyClearDown** | **Boolean** | Set to true if that closed period should have the clear down applied. | [default to Boolean]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties for the Calendar Entry. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]
**leaderNavTypeCode** | **String** | The code of the Nav Type that this Nav Type will follow when set. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundCalendarEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String variant = "example variant";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String navTypeCode = "example navTypeCode";
ResourceId timelineId = new ResourceId();
PreviousFundCalendarEntry previousEntry = new PreviousFundCalendarEntry();
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
String entryType = "example entryType";
@javax.annotation.Nullable String status = "example status";
Boolean applyClearDown = true;
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String leaderNavTypeCode = "example leaderNavTypeCode";


FundCalendarEntry fundCalendarEntryInstance = new FundCalendarEntry()
    .code(code)
    .variant(variant)
    .displayName(displayName)
    .description(description)
    .navTypeCode(navTypeCode)
    .timelineId(timelineId)
    .previousEntry(previousEntry)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .entryType(entryType)
    .status(status)
    .applyClearDown(applyClearDown)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride)
    .properties(properties)
    .version(version)
    .href(href)
    .leaderNavTypeCode(leaderNavTypeCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)