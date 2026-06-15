# com.finbourne.sdk.services.lusid.model.CorporateActionTransitionComponentRequest
classname CorporateActionTransitionComponentRequest
A single transition component request, when grouped with other transition component requests a corporate action  transition request is formed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CorporateActionTransitionComponentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal unitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");


CorporateActionTransitionComponentRequest corporateActionTransitionComponentRequestInstance = new CorporateActionTransitionComponentRequest()
    .instrumentIdentifiers(instrumentIdentifiers)
    .unitsFactor(unitsFactor)
    .costFactor(costFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)