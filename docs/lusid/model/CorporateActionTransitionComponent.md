# com.finbourne.sdk.services.lusid.model.CorporateActionTransitionComponent
classname CorporateActionTransitionComponent
A single transition component, when grouped with other components a corporate action transition is formed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [default to String]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CorporateActionTransitionComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentScope = "example instrumentScope";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
String instrumentUid = "example instrumentUid";
java.math.BigDecimal unitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");


CorporateActionTransitionComponent corporateActionTransitionComponentInstance = new CorporateActionTransitionComponent()
    .instrumentScope(instrumentScope)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instrumentUid(instrumentUid)
    .unitsFactor(unitsFactor)
    .costFactor(costFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)