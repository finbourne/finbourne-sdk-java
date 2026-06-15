# com.finbourne.sdk.services.insights.model.TraceLog
classname TraceLog
Holds metadata for a trace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceId** | **String** | The identifier of the trace. | [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the trace was created. | [default to OffsetDateTime]
**userId** | **String** | The id of the user who created the trace. | [default to String]
**description** | **String** | The description of the trace. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.TraceLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String traceId = "example traceId";
OffsetDateTime createdAt = OffsetDateTime.now();
String userId = "example userId";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<Link> links = new List<Link>();


TraceLog traceLogInstance = new TraceLog()
    .traceId(traceId)
    .createdAt(createdAt)
    .userId(userId)
    .description(description)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)