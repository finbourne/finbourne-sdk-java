# com.finbourne.sdk.services.identity.model.UpsertMcpToolRequest
classname UpsertMcpToolRequest
Request to create or update an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the MCP tool (alphanumeric, underscore, and hyphen) | [default to String]
**title** | **String** | The title of the MCP tool | [default to String]
**description** | **String** | The description of the MCP tool | [default to String]
**destructive** | **Boolean** | Whether the tool is destructive. When true, DestructiveActionSummaryTemplate is required and is shown to the user at the destructive-action consent gate before the tool runs. | [optional] [default to Boolean]
**idempotent** | **Boolean** | Whether the tool is idempotent | [optional] [default to Boolean]
**openWorld** | **Boolean** | Whether the tool operates in open world | [optional] [default to Boolean]
**readOnly** | **Boolean** | Whether the tool is read-only | [optional] [default to Boolean]
**parameters** | [**List&lt;McpToolParameter&gt;**](McpToolParameter.md) | The parameters for this MCP tool | [optional] [default to List<McpToolParameter>]
**luminescePayload** | [**McpToolLuminescePayload**](McpToolLuminescePayload.md) |  | [optional] [default to McpToolLuminescePayload]
**schedulerPayload** | [**McpToolSchedulerPayload**](McpToolSchedulerPayload.md) |  | [optional] [default to McpToolSchedulerPayload]
**destructiveActionSummaryTemplate** | **String** | Template for human-readable destructive action summary. Uses {paramName} single-brace placeholders (e.g. \&quot;Delete file &#39;{filePath}&#39;\&quot;). Required when Destructive is true. | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.UpsertMcpToolRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String title = "example title";
String description = "example description";
Boolean destructive = true;
Boolean idempotent = true;
Boolean openWorld = true;
Boolean readOnly = true;
@javax.annotation.Nullable List<McpToolParameter> parameters = new List<McpToolParameter>();
McpToolLuminescePayload luminescePayload = new McpToolLuminescePayload();
McpToolSchedulerPayload schedulerPayload = new McpToolSchedulerPayload();
@javax.annotation.Nullable String destructiveActionSummaryTemplate = "example destructiveActionSummaryTemplate";


UpsertMcpToolRequest upsertMcpToolRequestInstance = new UpsertMcpToolRequest()
    .name(name)
    .title(title)
    .description(description)
    .destructive(destructive)
    .idempotent(idempotent)
    .openWorld(openWorld)
    .readOnly(readOnly)
    .parameters(parameters)
    .luminescePayload(luminescePayload)
    .schedulerPayload(schedulerPayload)
    .destructiveActionSummaryTemplate(destructiveActionSummaryTemplate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)