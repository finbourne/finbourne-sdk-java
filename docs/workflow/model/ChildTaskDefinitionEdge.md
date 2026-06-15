# com.finbourne.sdk.services.workflow.model.ChildTaskDefinitionEdge
classname ChildTaskDefinitionEdge
Represents a parent-child relationship between two Task Definitions in a Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parent** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]
**child** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]

```java
import com.finbourne.sdk.services.workflow.model.ChildTaskDefinitionEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

VersionedTaskDefinitionId parent = new VersionedTaskDefinitionId();
VersionedTaskDefinitionId child = new VersionedTaskDefinitionId();


ChildTaskDefinitionEdge childTaskDefinitionEdgeInstance = new ChildTaskDefinitionEdge()
    .parent(parent)
    .child(child);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)