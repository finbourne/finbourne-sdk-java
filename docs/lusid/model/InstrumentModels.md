# com.finbourne.sdk.services.lusid.model.InstrumentModels
classname InstrumentModels
Supported pricing models for an instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. | [optional] [default to String]
**supportedModels** | **List&lt;String&gt;** | The pricing models supported by the instrument e.g. &#39;Discounting&#39;. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentModels;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable List<String> supportedModels = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


InstrumentModels instrumentModelsInstance = new InstrumentModels()
    .instrumentId(instrumentId)
    .supportedModels(supportedModels)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)