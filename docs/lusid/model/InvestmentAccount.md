# com.finbourne.sdk.services.lusid.model.InvestmentAccount
classname InvestmentAccount
Representation of an Investment Account on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investment Account lies. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investment Account. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investment Account | [optional] [default to String]
**description** | **String** | The description of the Investment Account | [optional] [default to String]
**accountType** | **String** | The type of the of the Investment Account. | [optional] [default to String]
**accountHolders** | [**List&lt;AccountHolder&gt;**](AccountHolder.md) | The Account Holders of the Investment Account. | [optional] [default to List<AccountHolder>]
**investmentPortfolios** | [**List&lt;InvestmentPortfolio&gt;**](InvestmentPortfolio.md) | The Investment Portfolios of the Investment Account. | [optional] [default to List<InvestmentPortfolio>]
**lusidInvestmentAccountId** | **String** | The unique LUSID Investment Account Identifier of the Investment Account. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investment Account. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Investment Account. | [optional] [default to List<Relationship>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InvestmentAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String accountType = "example accountType";
@javax.annotation.Nullable List<AccountHolder> accountHolders = new List<AccountHolder>();
@javax.annotation.Nullable List<InvestmentPortfolio> investmentPortfolios = new List<InvestmentPortfolio>();
@javax.annotation.Nullable String lusidInvestmentAccountId = "example lusidInvestmentAccountId";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


InvestmentAccount investmentAccountInstance = new InvestmentAccount()
    .scope(scope)
    .identifiers(identifiers)
    .displayName(displayName)
    .description(description)
    .accountType(accountType)
    .accountHolders(accountHolders)
    .investmentPortfolios(investmentPortfolios)
    .lusidInvestmentAccountId(lusidInvestmentAccountId)
    .properties(properties)
    .relationships(relationships)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)