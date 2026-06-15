# com.finbourne.sdk.services.lusid.model.ReferencePortfolioConstituentRequest
classname ReferencePortfolioConstituentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**weight** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReferencePortfolioConstituentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String currency = "example currency";


ReferencePortfolioConstituentRequest referencePortfolioConstituentRequestInstance = new ReferencePortfolioConstituentRequest()
    .instrumentIdentifiers(instrumentIdentifiers)
    .properties(properties)
    .weight(weight)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)