# com.finbourne.sdk.services.lusid.model.Abor
classname Abor
An Abor entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Abor. | [optional] [default to String]
**description** | **String** | The description for the Abor. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. | [default to List<PortfolioEntityId>]
**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**baseCurrency** | **String** | The base currency of the abor based on contained portfolio base currencies. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Abor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<PortfolioEntityId> portfolioIds = new List<PortfolioEntityId>();
ResourceId aborConfigurationId = new ResourceId();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable List<Link> links = new List<Link>();


Abor aborInstance = new Abor()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .portfolioIds(portfolioIds)
    .aborConfigurationId(aborConfigurationId)
    .properties(properties)
    .version(version)
    .baseCurrency(baseCurrency)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)