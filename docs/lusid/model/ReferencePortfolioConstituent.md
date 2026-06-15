# com.finbourne.sdk.services.lusid.model.ReferencePortfolioConstituent
classname ReferencePortfolioConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [optional] [default to Map<String, String>]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [default to String]
**currency** | **String** |  | [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties associated with the constituent | [optional] [default to Map<String, PerpetualProperty>]
**weight** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**floatingWeight** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**instrumentScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReferencePortfolioConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
String instrumentUid = "example instrumentUid";
String currency = "example currency";
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal floatingWeight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";


ReferencePortfolioConstituent referencePortfolioConstituentInstance = new ReferencePortfolioConstituent()
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentUid(instrumentUid)
    .currency(currency)
    .properties(properties)
    .weight(weight)
    .floatingWeight(floatingWeight)
    .instrumentScope(instrumentScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)