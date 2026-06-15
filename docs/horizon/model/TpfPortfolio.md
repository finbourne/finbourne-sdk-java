# com.finbourne.sdk.services.horizon.model.TpfPortfolio
classname TpfPortfolio
record containing details of a TPF portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TpfPortfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";


TpfPortfolio tpfPortfolioInstance = new TpfPortfolio()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)