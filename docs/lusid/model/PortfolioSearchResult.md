# com.finbourne.sdk.services.lusid.model.PortfolioSearchResult
classname PortfolioSearchResult
A list of portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the portfolio. Available values: Transaction, Reference, DerivedTransaction, SimplePosition. | [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**displayName** | **String** | The name of the portfolio. | [default to String]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [readonly] [default to Boolean]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**baseCurrency** | **String** | The base currency of the portfolio. | [optional] [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to List<Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String type = "example type";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String description = "example description";
String displayName = "example displayName";
Boolean isDerived = true;
OffsetDateTime created = OffsetDateTime.now();
ResourceId parentPortfolioId = new ResourceId();
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable List<Property> properties = new List<Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioSearchResult portfolioSearchResultInstance = new PortfolioSearchResult()
    .id(id)
    .type(type)
    .href(href)
    .description(description)
    .displayName(displayName)
    .isDerived(isDerived)
    .created(created)
    .parentPortfolioId(parentPortfolioId)
    .baseCurrency(baseCurrency)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)