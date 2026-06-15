# com.finbourne.sdk.services.lusid.model.PortfolioGroup
classname PortfolioGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | The long form description of the portfolio group. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. No portfolios or sub groups can be added to the group before this date. | [optional] [default to OffsetDateTime]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolios contained in the portfolio group. | [optional] [default to List<ResourceId>]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups. | [optional] [default to List<ResourceId>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A collection of properties from the &#39;PortfolioGroup&#39; domain decorating the portfolio group. Returned only when the request specifies propertyKeys. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the portfolio group. | [optional] [default to List<Relationship>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime created = OffsetDateTime.now();
@javax.annotation.Nullable List<ResourceId> portfolios = new List<ResourceId>();
@javax.annotation.Nullable List<ResourceId> subGroups = new List<ResourceId>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioGroup portfolioGroupInstance = new PortfolioGroup()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .created(created)
    .portfolios(portfolios)
    .subGroups(subGroups)
    .properties(properties)
    .relationships(relationships)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)