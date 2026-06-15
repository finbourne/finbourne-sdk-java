# com.finbourne.sdk.services.lusid.model.NewInstrument
classname NewInstrument
Set of identifiers of an existing instrument that will be the subject or distribution of a corporate action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**domCcy** | **String** | The domestic currency of the instrument, resolved from the instrument identifiers. | [optional] [readonly] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NewInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String domCcy = "example domCcy";


NewInstrument newInstrumentInstance = new NewInstrument()
    .instrumentIdentifiers(instrumentIdentifiers)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .domCcy(domCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)