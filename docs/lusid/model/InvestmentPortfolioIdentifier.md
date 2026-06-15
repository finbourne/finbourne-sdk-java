# com.finbourne.sdk.services.lusid.model.InvestmentPortfolioIdentifier
classname InvestmentPortfolioIdentifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Investment Portfolio, unique within the Investment Account | [default to String]
**scope** | **String** | The scope of the Investment Portfolio. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The code identifier of the Investment Portfolio. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.InvestmentPortfolioIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String scope = "example scope";
Map<String, String> identifiers = new Map<String, String>();


InvestmentPortfolioIdentifier investmentPortfolioIdentifierInstance = new InvestmentPortfolioIdentifier()
    .key(key)
    .scope(scope)
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)