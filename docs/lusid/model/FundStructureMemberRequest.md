# com.finbourne.sdk.services.lusid.model.FundStructureMemberRequest
classname FundStructureMemberRequest
A member to add to a Fund Structure: the node, and the links that join it to members already in the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | [**FundStructureNode**](FundStructureNode.md) |  | [default to FundStructureNode]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The links joining the new node to members already in the structure. May be empty for a member that is linked later. | [optional] [default to List<FundStructureEdge>]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureMemberRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

FundStructureNode node = new FundStructureNode();
@javax.annotation.Nullable List<FundStructureEdge> edges = new List<FundStructureEdge>();


FundStructureMemberRequest fundStructureMemberRequestInstance = new FundStructureMemberRequest()
    .node(node)
    .edges(edges);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)