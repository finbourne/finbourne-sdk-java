# com.finbourne.sdk.services.lusid.model.InvestmentPortfolio
classname InvestmentPortfolio
An Investment Portfolio of an Investment Account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Investment Portfolio, unique within the Investment Account | [optional] [default to String]
**scope** | **String** | The scope of the Investment Portfolio | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The code identifier of the Investment Portfolio | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique Portfolio entity identifier | [optional] [default to String]
**portfolio** | [**Portfolio**](Portfolio.md) |  | [optional] [default to Portfolio]

```java
import com.finbourne.sdk.services.lusid.model.InvestmentPortfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String key = "example key";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
Portfolio portfolio = new Portfolio();


InvestmentPortfolio investmentPortfolioInstance = new InvestmentPortfolio()
    .key(key)
    .scope(scope)
    .identifiers(identifiers)
    .entityUniqueId(entityUniqueId)
    .portfolio(portfolio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)