# com.finbourne.sdk.services.lusid.model.ExpandedGroup
classname ExpandedGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | The long form description of the portfolio group. | [optional] [default to String]
**values** | [**List&lt;CompletePortfolio&gt;**](CompletePortfolio.md) | The collection of resource identifiers for the portfolios contained in the portfolio group. | [optional] [default to List<CompletePortfolio>]
**subGroups** | [**List&lt;ExpandedGroup&gt;**](ExpandedGroup.md) | The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups. | [optional] [default to List<ExpandedGroup>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ExpandedGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<CompletePortfolio> values = new List<CompletePortfolio>();
@javax.annotation.Nullable List<ExpandedGroup> subGroups = new List<ExpandedGroup>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ExpandedGroup expandedGroupInstance = new ExpandedGroup()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .values(values)
    .subGroups(subGroups)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)