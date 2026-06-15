# com.finbourne.sdk.services.lusid.model.DiaryEntryRequest
classname DiaryEntryRequest
The request to add a diary entry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | The code of the diary entry. | [default to String]
**name** | **String** | The name of the diary entry. | [optional] [default to String]
**status** | **String** | The status of a Diary Entry of Type &#39;Other&#39;. Defaults to &#39;Undefined&#39; and supports &#39;Undefined&#39;, &#39;Estimate&#39;, &#39;Candidate&#39;, and &#39;Final&#39;. Available values: Undefined, Estimate, Final, Candidate, Unofficial. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.DiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String status = "example status";
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime queryAsAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


DiaryEntryRequest diaryEntryRequestInstance = new DiaryEntryRequest()
    .diaryEntryCode(diaryEntryCode)
    .name(name)
    .status(status)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)