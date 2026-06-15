# com.finbourne.sdk.services.lusid.model.TranslateInstrumentDefinitionsRequest
classname TranslateInstrumentDefinitionsRequest
A collection of instruments to translate, along with the target dialect to translate into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instruments** | [**Map&lt;String, LusidInstrument&gt;**](LusidInstrument.md) | The collection of instruments to translate.                Each instrument definition should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response.                Any instrument that is not already in the LUSID dialect should be given as an ExoticInstrument. | [default to Map<String, LusidInstrument>]
**dialect** | **String** | The target dialect that the given instruments should be translated to. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TranslateInstrumentDefinitionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, LusidInstrument> instruments = new Map<String, LusidInstrument>();
String dialect = "example dialect";


TranslateInstrumentDefinitionsRequest translateInstrumentDefinitionsRequestInstance = new TranslateInstrumentDefinitionsRequest()
    .instruments(instruments)
    .dialect(dialect);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)