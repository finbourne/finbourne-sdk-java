# com.finbourne.sdk.services.lusid.model.ClosedPeriod
classname ClosedPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period | [optional] [default to String]
**displayName** | **String** | The name of the Closed Period. | [optional] [default to String]
**description** | **String** | A description for the Closed Period. | [optional] [default to String]
**effectiveStart** | [**OffsetDateTime**](OffsetDateTime.md) | The effective start of the Closed Period | [optional] [default to OffsetDateTime]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end of the Closed Period | [optional] [default to OffsetDateTime]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt closed datetime for the Closed Period | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**postCloseActivities** | [**List&lt;PostCloseActivity&gt;**](PostCloseActivity.md) | All the post close activities for the closed period. | [optional] [default to List<PostCloseActivity>]
**holdingsAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**valuationAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for performing valuations in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**branchStatus** | **String** | The branch status of the closed period, e.g. Confirmed/Unconfirmed. | [optional] [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ClosedPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String closedPeriodId = "example closedPeriodId";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime effectiveStart = OffsetDateTime.now();
OffsetDateTime effectiveEnd = OffsetDateTime.now();
OffsetDateTime asAtClosed = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<PostCloseActivity> postCloseActivities = new List<PostCloseActivity>();
@javax.annotation.Nullable OffsetDateTime holdingsAsAtClosedOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationAsAtClosedOverride = OffsetDateTime.now();
@javax.annotation.Nullable String branchStatus = "example branchStatus";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


ClosedPeriod closedPeriodInstance = new ClosedPeriod()
    .closedPeriodId(closedPeriodId)
    .displayName(displayName)
    .description(description)
    .effectiveStart(effectiveStart)
    .effectiveEnd(effectiveEnd)
    .asAtClosed(asAtClosed)
    .properties(properties)
    .version(version)
    .postCloseActivities(postCloseActivities)
    .holdingsAsAtClosedOverride(holdingsAsAtClosedOverride)
    .valuationAsAtClosedOverride(valuationAsAtClosedOverride)
    .branchStatus(branchStatus)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)