# com.finbourne.sdk.services.identity.model.McpToolResponse
classname McpToolResponse
The response representation of an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the MCP tool | [optional] [default to String]
**code** | **String** | The code of the MCP tool | [optional] [default to String]
**name** | **String** | The name of the MCP tool | [optional] [default to String]
**version** | **Integer** | The version number of this MCP tool | [optional] [default to Integer]
**title** | **String** | The title of the MCP tool | [optional] [default to String]
**description** | **String** | The description of the MCP tool | [optional] [default to String]
**destructive** | **Boolean** | Whether the tool is destructive | [optional] [default to Boolean]
**idempotent** | **Boolean** | Whether the tool is idempotent | [optional] [default to Boolean]
**openWorld** | **Boolean** | Whether the tool operates in open world | [optional] [default to Boolean]
**readOnly** | **Boolean** | Whether the tool is read-only | [optional] [default to Boolean]
**parameters** | [**List&lt;McpToolParameter&gt;**](McpToolParameter.md) | The parameters for this MCP tool | [optional] [default to List<McpToolParameter>]
**payloadType** | **String** | The type of payload (Luminesce or Scheduler) | [optional] [default to String]
**luminescePayload** | [**McpToolLuminescePayload**](McpToolLuminescePayload.md) |  | [optional] [default to McpToolLuminescePayload]
**schedulerPayload** | [**McpToolSchedulerPayload**](McpToolSchedulerPayload.md) |  | [optional] [default to McpToolSchedulerPayload]
**destructiveActionSummaryTemplate** | **String** | Template for human-readable destructive action summary. Uses {paramName} single-brace placeholders (e.g. \&quot;Delete file &#39;{filePath}&#39;\&quot;). Required when Destructive is true. | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the MCP tool was created | [optional] [default to OffsetDateTime]
**createdBy** | **String** | Who created the MCP tool | [optional] [default to String]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the MCP tool was last updated | [optional] [default to OffsetDateTime]
**updatedBy** | **String** | Who last updated the MCP tool | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.McpToolResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String name = "example name";
Integer version = new Integer("100.00");
@javax.annotation.Nullable String title = "example title";
@javax.annotation.Nullable String description = "example description";
Boolean destructive = true;
Boolean idempotent = true;
Boolean openWorld = true;
Boolean readOnly = true;
@javax.annotation.Nullable List<McpToolParameter> parameters = new List<McpToolParameter>();
@javax.annotation.Nullable String payloadType = "example payloadType";
McpToolLuminescePayload luminescePayload = new McpToolLuminescePayload();
McpToolSchedulerPayload schedulerPayload = new McpToolSchedulerPayload();
@javax.annotation.Nullable String destructiveActionSummaryTemplate = "example destructiveActionSummaryTemplate";
OffsetDateTime createdAt = OffsetDateTime.now();
@javax.annotation.Nullable String createdBy = "example createdBy";
OffsetDateTime updatedAt = OffsetDateTime.now();
@javax.annotation.Nullable String updatedBy = "example updatedBy";


McpToolResponse mcpToolResponseInstance = new McpToolResponse()
    .scope(scope)
    .code(code)
    .name(name)
    .version(version)
    .title(title)
    .description(description)
    .destructive(destructive)
    .idempotent(idempotent)
    .openWorld(openWorld)
    .readOnly(readOnly)
    .parameters(parameters)
    .payloadType(payloadType)
    .luminescePayload(luminescePayload)
    .schedulerPayload(schedulerPayload)
    .destructiveActionSummaryTemplate(destructiveActionSummaryTemplate)
    .createdAt(createdAt)
    .createdBy(createdBy)
    .updatedAt(updatedAt)
    .updatedBy(updatedBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)