# com.finbourne.sdk.services.lusid.model.PortfolioEntityIdWithDetails
classname PortfolioEntityIdWithDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**scope** | **String** | The scope within which the portfolio or portfolio group lives. | [default to String]
**code** | **String** | Portfolio name or code. | [default to String]
**portfolioEntityType** | **String** | String identifier for portfolio e.g. \&quot;SinglePortfolio\&quot; and \&quot;GroupPortfolio\&quot;. If not specified, it is assumed to be a single portfolio. Available values: SinglePortfolio, GroupPortfolio. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioEntityIdWithDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable String portfolioEntityType = "example portfolioEntityType";


PortfolioEntityIdWithDetails portfolioEntityIdWithDetailsInstance = new PortfolioEntityIdWithDetails()
    .displayName(displayName)
    .description(description)
    .scope(scope)
    .code(code)
    .portfolioEntityType(portfolioEntityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)