# com.finbourne.sdk.services.lusid.model.ClosePeriodDiaryEntryRequest
classname ClosePeriodDiaryEntryRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank a code will be created by the system in the format &#39;yyyyMMDD&#39;. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the period. Where left blank, the system will generate a name in the format &#39;yyyyMMDD&#39;. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [optional] [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**status** | **String** | The status of a Diary Entry of Type &#39;PeriodBoundary&#39;. Defaults to &#39;Estimate&#39; when closing a period, and supports &#39;Estimate&#39; and &#39;Final&#39; for closing periods and &#39;Final&#39; for locking periods. Available values: Undefined, Estimate, Final, Candidate, Unofficial. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**closingOptions** | **List&lt;String&gt;** | The options which will be executed once a period is closed or locked. Available values: ApplyClearDown. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ClosePeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime queryAsAt = OffsetDateTime.now();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<String> closingOptions = new List<String>();


ClosePeriodDiaryEntryRequest closePeriodDiaryEntryRequestInstance = new ClosePeriodDiaryEntryRequest()
    .diaryEntryCode(diaryEntryCode)
    .name(name)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .status(status)
    .properties(properties)
    .closingOptions(closingOptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)