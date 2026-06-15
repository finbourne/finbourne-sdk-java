# com.finbourne.sdk.services.insights.model.TraceDiagramEdge
classname TraceDiagramEdge
Represents an edge connecting two nodes within a trace diagram.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Sequential identifier of the edge. | [optional] [default to Integer]
**nodeId** | **String** | Identifier of the parent node. | [optional] [default to String]
**childNodeId** | **String** | Identifier of the child node. | [optional] [default to String]
**label** | **String** | Label displayed for the edge. | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.TraceDiagramEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer id = new Integer("100.00");
@javax.annotation.Nullable String nodeId = "example nodeId";
@javax.annotation.Nullable String childNodeId = "example childNodeId";
@javax.annotation.Nullable String label = "example label";


TraceDiagramEdge traceDiagramEdgeInstance = new TraceDiagramEdge()
    .id(id)
    .nodeId(nodeId)
    .childNodeId(childNodeId)
    .label(label);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)