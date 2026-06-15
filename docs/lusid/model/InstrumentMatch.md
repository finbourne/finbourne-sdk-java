# com.finbourne.sdk.services.lusid.model.InstrumentMatch
classname InstrumentMatch
A collection of instrument search results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**masteredInstruments** | [**List&lt;InstrumentDefinition&gt;**](InstrumentDefinition.md) | The collection of instruments found by the search which have been mastered within LUSID. | [optional] [default to List<InstrumentDefinition>]
**externalInstruments** | [**List&lt;InstrumentDefinition&gt;**](InstrumentDefinition.md) | The collection of instruments found by the search which have not been mastered within LUSID and instead found via OpenFIGI. | [optional] [default to List<InstrumentDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<InstrumentDefinition> masteredInstruments = new List<InstrumentDefinition>();
@javax.annotation.Nullable List<InstrumentDefinition> externalInstruments = new List<InstrumentDefinition>();


InstrumentMatch instrumentMatchInstance = new InstrumentMatch()
    .masteredInstruments(masteredInstruments)
    .externalInstruments(externalInstruments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)