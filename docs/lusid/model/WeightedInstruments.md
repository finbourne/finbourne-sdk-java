# com.finbourne.sdk.services.lusid.model.WeightedInstruments
classname WeightedInstruments
Class that models a set of instruments of which each has some quantity and can be identified by a unique label.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instruments** | [**List&lt;WeightedInstrument&gt;**](WeightedInstrument.md) | The instruments that are held in the set. | [default to List<WeightedInstrument>]

```java
import com.finbourne.sdk.services.lusid.model.WeightedInstruments;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<WeightedInstrument> instruments = new List<WeightedInstrument>();


WeightedInstruments weightedInstrumentsInstance = new WeightedInstruments()
    .instruments(instruments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)