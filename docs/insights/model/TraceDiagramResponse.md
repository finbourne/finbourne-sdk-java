# com.finbourne.sdk.services.insights.model.TraceDiagramResponse
classname TraceDiagramResponse
Represents a trace diagram composed of nodes and edges.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**List&lt;TraceDiagramNode&gt;**](TraceDiagramNode.md) | The nodes that make up the diagram. | [optional] [default to List<TraceDiagramNode>]
**edges** | [**List&lt;TraceDiagramEdge&gt;**](TraceDiagramEdge.md) | The edges that connect the nodes in the diagram. | [optional] [default to List<TraceDiagramEdge>]

```java
import com.finbourne.sdk.services.insights.model.TraceDiagramResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<TraceDiagramNode> nodes = new List<TraceDiagramNode>();
@javax.annotation.Nullable List<TraceDiagramEdge> edges = new List<TraceDiagramEdge>();


TraceDiagramResponse traceDiagramResponseInstance = new TraceDiagramResponse()
    .nodes(nodes)
    .edges(edges);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)