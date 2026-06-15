# com.finbourne.sdk.services.lusid.model.PortfolioId
classname PortfolioId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**DataScope**](DataScope.md) |  | [optional] [default to DataScope]
**identifier** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioId;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataScope scope = new DataScope();
@javax.annotation.Nullable String identifier = "example identifier";


PortfolioId portfolioIdInstance = new PortfolioId()
    .scope(scope)
    .identifier(identifier);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)