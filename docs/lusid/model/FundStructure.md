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
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. A group may span the share classes of a member and the members that invest into it through dedicated share class links. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. May be empty on create, with members added later through the members endpoint. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define how the members of the structure are linked: a member investing into a dedicated share class of another, or holding an equity, GP, LP or carry interest in another through an instrument. | [default to List<FundStructureEdge>]
**roleDataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCodes** | **List&lt;String&gt;** | The NAV types every member of the structure produces, by code. Declaring them once here gives the structure a shared Timeline. At least one is required, and every member fund must define a NAV type with each of these codes. | [optional] [default to List<String>]
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
ResourceId roleDataTypeId = new ResourceId();
@javax.annotation.Nullable List<String> navTypeCodes = new List<String>();
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
    .roleDataTypeId(roleDataTypeId)
    .navTypeCodes(navTypeCodes)
    .version(version)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)