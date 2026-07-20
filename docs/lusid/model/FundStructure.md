# com.finbourne.sdk.services.lusid.model.FundStructure
classname FundStructure
Definition of the structure of a fund

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**funds** | [**List&lt;Fund&gt;**](Fund.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<Fund>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. Only classes and feeder funds linked to the master fund specified are allowed. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define the relationships between feeder and master nodes in the structure. | [default to List<FundStructureEdge>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Fund Structure. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FundStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<Fund> funds = new List<Fund>();
@javax.annotation.Nullable List<AllocationGroup> allocationGroups = new List<AllocationGroup>();
List<FundStructureNode> nodes = new List<FundStructureNode>();
List<FundStructureEdge> edges = new List<FundStructureEdge>();
Version version = new Version();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FundStructure fundStructureInstance = new FundStructure()
    .href(href)
    .id(id)
    .name(name)
    .description(description)
    .funds(funds)
    .allocationGroups(allocationGroups)
    .nodes(nodes)
    .edges(edges)
    .version(version)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)