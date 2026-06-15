# com.finbourne.sdk.services.lusid.model.PortfolioEntityId
classname PortfolioEntityId
Specification of a portfolio or portfolio group id, its scope and which it is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope within which the portfolio or portfolio group lives. | [default to String]
**code** | **String** | Portfolio name or code. | [default to String]
**portfolioEntityType** | **String** | String identifier for portfolio e.g. \&quot;SinglePortfolio\&quot; and \&quot;GroupPortfolio\&quot;. If not specified, it is assumed to be a single portfolio. Available values: SinglePortfolio, GroupPortfolio. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable String portfolioEntityType = "example portfolioEntityType";


PortfolioEntityId portfolioEntityIdInstance = new PortfolioEntityId()
    .scope(scope)
    .code(code)
    .portfolioEntityType(portfolioEntityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)