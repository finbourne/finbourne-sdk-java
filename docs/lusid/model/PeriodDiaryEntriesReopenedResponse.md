# com.finbourne.sdk.services.lusid.model.PeriodDiaryEntriesReopenedResponse
classname PeriodDiaryEntriesReopenedResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the deletion was committed to LUSID. | [default to OffsetDateTime]
**periodDiaryEntriesRemoved** | **Integer** | Number of Diary Entries removed as a result of reopening periods | [default to Integer]
**periodDiaryEntriesFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The start point where periods were removed from | [default to OffsetDateTime]
**periodDiaryEntriesTo** | [**OffsetDateTime**](OffsetDateTime.md) | The end point where periods were removed to | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PeriodDiaryEntriesReopenedResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
Integer periodDiaryEntriesRemoved = new Integer("100.00");
OffsetDateTime periodDiaryEntriesFrom = OffsetDateTime.now();
OffsetDateTime periodDiaryEntriesTo = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PeriodDiaryEntriesReopenedResponse periodDiaryEntriesReopenedResponseInstance = new PeriodDiaryEntriesReopenedResponse()
    .href(href)
    .effectiveFrom(effectiveFrom)
    .asAt(asAt)
    .periodDiaryEntriesRemoved(periodDiaryEntriesRemoved)
    .periodDiaryEntriesFrom(periodDiaryEntriesFrom)
    .periodDiaryEntriesTo(periodDiaryEntriesTo)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)