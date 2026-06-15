# com.finbourne.sdk.services.lusid.model.OutputTransition
classname OutputTransition
A 'transition' within a corporate action, representing an output transition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [readonly] [default to String]
**rounding** | [**RoundingConfiguration**](RoundingConfiguration.md) |  | [optional] [default to RoundingConfiguration]

```java
import com.finbourne.sdk.services.lusid.model.OutputTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal unitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
RoundingConfiguration rounding = new RoundingConfiguration();


OutputTransition outputTransitionInstance = new OutputTransition()
    .instrumentIdentifiers(instrumentIdentifiers)
    .unitsFactor(unitsFactor)
    .costFactor(costFactor)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .rounding(rounding);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)