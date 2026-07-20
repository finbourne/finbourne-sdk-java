# com.finbourne.sdk.services.lusid.model.FundStructureRequest
classname FundStructureRequest
The request used to create a Fund Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Fund Structure. | [default to String]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**existingFunds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<ResourceId>]
**newFunds** | [**List&lt;FundDefinitionRequest&gt;**](FundDefinitionRequest.md) | An optional list of Fund definitions to be created inline as part of the structure. | [optional] [default to List<FundDefinitionRequest>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. Only classes and feeder funds linked to the master fund specified are allowed. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define the relationships between feeder and master nodes in the structure. | [default to List<FundStructureEdge>]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<ResourceId> existingFunds = new List<ResourceId>();
@javax.annotation.Nullable List<FundDefinitionRequest> newFunds = new List<FundDefinitionRequest>();
@javax.annotation.Nullable List<AllocationGroup> allocationGroups = new List<AllocationGroup>();
List<FundStructureNode> nodes = new List<FundStructureNode>();
List<FundStructureEdge> edges = new List<FundStructureEdge>();


FundStructureRequest fundStructureRequestInstance = new FundStructureRequest()
    .code(code)
    .name(name)
    .description(description)
    .existingFunds(existingFunds)
    .newFunds(newFunds)
    .allocationGroups(allocationGroups)
    .nodes(nodes)
    .edges(edges);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)