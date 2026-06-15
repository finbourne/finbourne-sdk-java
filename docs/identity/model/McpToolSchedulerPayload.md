# com.finbourne.sdk.services.identity.model.McpToolSchedulerPayload
classname McpToolSchedulerPayload
Payload data for a Scheduler job MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobScope** | **String** | The scope of the scheduler job to run | [default to String]
**jobCode** | **String** | The code of the scheduler job to run | [default to String]
**arguments** | **Map&lt;String, String&gt;** | Arguments to pass to the scheduler job (key-value pairs) | [optional] [default to Map<String, String>]
**runAs** | **String** | Optional service user identifier to run the job as (if not the current user) | [optional] [default to String]
**notifications** | [**List&lt;McpToolSchedulerNotification&gt;**](McpToolSchedulerNotification.md) | Optional additional notifications for the job | [optional] [default to List<McpToolSchedulerNotification>]

```java
import com.finbourne.sdk.services.identity.model.McpToolSchedulerPayload;
import java.util.*;
import java.lang.System;
import java.net.URI;

String jobScope = "example jobScope";
String jobCode = "example jobCode";
@javax.annotation.Nullable Map<String, String> arguments = new Map<String, String>();
@javax.annotation.Nullable String runAs = "example runAs";
@javax.annotation.Nullable List<McpToolSchedulerNotification> notifications = new List<McpToolSchedulerNotification>();


McpToolSchedulerPayload mcpToolSchedulerPayloadInstance = new McpToolSchedulerPayload()
    .jobScope(jobScope)
    .jobCode(jobCode)
    .arguments(arguments)
    .runAs(runAs)
    .notifications(notifications);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)