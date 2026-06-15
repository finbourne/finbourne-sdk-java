# com.finbourne.sdk.services.insights.model.TraceEventLog
classname TraceEventLog
Holds information about a trace event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceEventId** | **String** | The identifier of the trace event. | [default to String]
**traceId** | **String** | The identifier of the parent trace. | [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the trace event was created. | [default to OffsetDateTime]
**eventType** | **String** | The type of the trace event. | [default to String]
**origin** | **String** | Whether the event originated from the AI or the user | [default to String]
**content** | **String** | The content of the trace event. | [default to String]
**agentScope** | **String** | The scope of the agent currently being interacted with | [default to String]
**agentCode** | **String** | The code identifier of the agent currently being interacted with | [default to String]
**agentVersion** | **Integer** | The version of the circuit in which the trace event occurred. | [default to Integer]
**nodeId** | **String** | The ID of the circuit&#39;s node at which the trace event occured. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.TraceEventLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String traceEventId = "example traceEventId";
String traceId = "example traceId";
OffsetDateTime createdAt = OffsetDateTime.now();
String eventType = "example eventType";
String origin = "example origin";
String content = "example content";
String agentScope = "example agentScope";
String agentCode = "example agentCode";
Integer agentVersion = new Integer("100.00");
String nodeId = "example nodeId";
@javax.annotation.Nullable List<Link> links = new List<Link>();


TraceEventLog traceEventLogInstance = new TraceEventLog()
    .traceEventId(traceEventId)
    .traceId(traceId)
    .createdAt(createdAt)
    .eventType(eventType)
    .origin(origin)
    .content(content)
    .agentScope(agentScope)
    .agentCode(agentCode)
    .agentVersion(agentVersion)
    .nodeId(nodeId)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)