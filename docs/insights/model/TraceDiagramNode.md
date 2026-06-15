# com.finbourne.sdk.services.insights.model.TraceDiagramNode
classname TraceDiagramNode
Represents a node within a trace diagram.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the node. | [optional] [default to String]
**displayName** | **String** | Display name of the node. | [optional] [default to String]
**level** | **Integer** | Depth level of the node within the diagram. | [optional] [default to Integer]
**parent** | **String** | Identifier of the node&#39;s parent. This is null for the root node. | [optional] [default to String]
**type** | **String** | Type classification of the node. | [optional] [default to String]
**agentScope** | **String** | The scope of the agent. | [optional] [default to String]
**agentVersion** | **Integer** | The version of the agent. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.insights.model.TraceDiagramNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String displayName = "example displayName";
Integer level = new Integer("100.00");
@javax.annotation.Nullable String parent = "example parent";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String agentScope = "example agentScope";
Integer agentVersion = new Integer("100.00");


TraceDiagramNode traceDiagramNodeInstance = new TraceDiagramNode()
    .id(id)
    .displayName(displayName)
    .level(level)
    .parent(parent)
    .type(type)
    .agentScope(agentScope)
    .agentVersion(agentVersion);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)