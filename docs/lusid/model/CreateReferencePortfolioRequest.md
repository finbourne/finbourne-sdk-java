# com.finbourne.sdk.services.lusid.model.CreateReferencePortfolioRequest
classname CreateReferencePortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the reference portfolio. | [default to String]
**description** | **String** | A long form text description of the portfolio. | [optional] [default to String]
**code** | **String** | Unique identifier for the portfolio. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The original creation date, defaults to today if not specified when creating a portfolio. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Portfolio properties to add to the portfolio. | [optional] [default to Map<String, Property>]
**instrumentScopes** | **List&lt;String&gt;** | Instrument Scopes. | [optional] [default to List<String>]
**baseCurrency** | **String** | The base currency of the transaction portfolio in ISO 4217 currency code format. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateReferencePortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String code = "example code";
@javax.annotation.Nullable OffsetDateTime created = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
@javax.annotation.Nullable String baseCurrency = "example baseCurrency";


CreateReferencePortfolioRequest createReferencePortfolioRequestInstance = new CreateReferencePortfolioRequest()
    .displayName(displayName)
    .description(description)
    .code(code)
    .created(created)
    .properties(properties)
    .instrumentScopes(instrumentScopes)
    .baseCurrency(baseCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)