# com.finbourne.sdk.services.lusid.model.UpsertInvestmentAccountRequest
classname UpsertInvestmentAccountRequest
Request to create or update an investor record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investment Account lies. | [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investment Account. | [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investment Account | [default to String]
**description** | **String** | The description of the Investment Account | [optional] [default to String]
**accountType** | **String** | The type of the of the Investment Account. Available values: Individual, Corporate, Joint, Nominee. | [default to String]
**accountHolders** | [**List&lt;AccountHolderIdentifier&gt;**](AccountHolderIdentifier.md) | The identification of the account holders associated with this investment account | [optional] [default to List<AccountHolderIdentifier>]
**investmentPortfolios** | [**List&lt;InvestmentPortfolioIdentifier&gt;**](InvestmentPortfolioIdentifier.md) | The identification of the investment portfolios associated with this investment account | [optional] [default to List<InvestmentPortfolioIdentifier>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investment Account. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInvestmentAccountRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
Map<String, Property> identifiers = new Map<String, Property>();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String accountType = "example accountType";
@javax.annotation.Nullable List<AccountHolderIdentifier> accountHolders = new List<AccountHolderIdentifier>();
@javax.annotation.Nullable List<InvestmentPortfolioIdentifier> investmentPortfolios = new List<InvestmentPortfolioIdentifier>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


UpsertInvestmentAccountRequest upsertInvestmentAccountRequestInstance = new UpsertInvestmentAccountRequest()
    .scope(scope)
    .identifiers(identifiers)
    .displayName(displayName)
    .description(description)
    .accountType(accountType)
    .accountHolders(accountHolders)
    .investmentPortfolios(investmentPortfolios)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)