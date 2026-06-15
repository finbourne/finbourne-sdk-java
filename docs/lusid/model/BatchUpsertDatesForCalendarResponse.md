# com.finbourne.sdk.services.lusid.model.BatchUpsertDatesForCalendarResponse
classname BatchUpsertDatesForCalendarResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, CalendarDate&gt;**](CalendarDate.md) | The dates which have been successfully upserted. | [optional] [default to Map<String, CalendarDate>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The dates that could not be upserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to the upserted dates | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertDatesForCalendarResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, CalendarDate> values = new Map<String, CalendarDate>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertDatesForCalendarResponse batchUpsertDatesForCalendarResponseInstance = new BatchUpsertDatesForCalendarResponse()
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)