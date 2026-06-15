# com.finbourne.sdk.services.lusid.model.CompletePortfolio
classname CompletePortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**displayName** | **String** | The name of the portfolio. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [optional] [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [readonly] [default to Boolean]
**type** | **String** | The type of the portfolio. Available values: Transaction, Reference, DerivedTransaction, SimplePosition. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to List<Property>]
**baseCurrency** | **String** | If the portfolio is a transaction portfolio or derived transaction portfolio, this is the base currency of the portfolio. | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | The sub holding key properties configured for the portfolio | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CompletePortfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String displayName = "example displayName";
OffsetDateTime created = OffsetDateTime.now();
ResourceId parentPortfolioId = new ResourceId();
Boolean isDerived = true;
String type = "example type";
Version version = new Version();
@javax.annotation.Nullable List<Property> properties = new List<Property>();
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";
@javax.annotation.Nullable List<String> subHoldingKeys = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CompletePortfolio completePortfolioInstance = new CompletePortfolio()
    .id(id)
    .href(href)
    .description(description)
    .displayName(displayName)
    .created(created)
    .parentPortfolioId(parentPortfolioId)
    .isDerived(isDerived)
    .type(type)
    .version(version)
    .properties(properties)
    .baseCurrency(baseCurrency)
    .subHoldingKeys(subHoldingKeys)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)