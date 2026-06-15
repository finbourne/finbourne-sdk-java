# com.finbourne.sdk.services.lusid.model.UpsertInstrumentPropertyRequest
classname UpsertInstrumentPropertyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierType** | **String** | The unique identifier type to search for the instrument, for example &#39;Figi&#39;. | [default to String]
**identifier** | **String** | A value of that type to identify the instrument to upsert properties for, for example &#39;BBG000BLNNV0&#39;. | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) | A set of instrument properties and associated values to store for the instrument. Each property must be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInstrumentPropertyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String identifierType = "example identifierType";
String identifier = "example identifier";
@javax.annotation.Nullable List<Property> properties = new List<Property>();


UpsertInstrumentPropertyRequest upsertInstrumentPropertyRequestInstance = new UpsertInstrumentPropertyRequest()
    .identifierType(identifierType)
    .identifier(identifier)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)