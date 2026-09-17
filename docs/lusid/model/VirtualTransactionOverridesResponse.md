# com.finbourne.sdk.services.lusid.model.VirtualTransactionOverridesResponse
classname VirtualTransactionOverridesResponse
The overrides and suppressions affecting a single instrument event in the requested portfolio. A derived  portfolio is affected by its own record and by every record held by an ancestor, so one record per  holding portfolio is returned, nearest first.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**instrumentEventId** | **String** | The identifier of the instrument event whose overrides and suppressions are returned. | [default to String]
**records** | [**List&lt;VirtualTransactionOverrideRecord&gt;**](VirtualTransactionOverrideRecord.md) | The override and suppression records affecting the requested portfolio for this instrument event, nearest first. A derived portfolio is affected by its own record and by every record held by an ancestor. | [optional] [default to List<VirtualTransactionOverrideRecord>]
**live** | **List&lt;String&gt;** | The virtual transaction ids the event currently generates in the requested portfolio that no returned record targets, and so keep generating unmodified. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VirtualTransactionOverridesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String instrumentEventId = "example instrumentEventId";
@javax.annotation.Nullable List<VirtualTransactionOverrideRecord> records = new List<VirtualTransactionOverrideRecord>();
@javax.annotation.Nullable List<String> live = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


VirtualTransactionOverridesResponse virtualTransactionOverridesResponseInstance = new VirtualTransactionOverridesResponse()
    .version(version)
    .href(href)
    .instrumentEventId(instrumentEventId)
    .records(records)
    .live(live)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)