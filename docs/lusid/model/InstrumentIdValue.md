# com.finbourne.sdk.services.lusid.model.InstrumentIdValue
classname InstrumentIdValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value of the identifier. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the identifier will be valid. If left unspecified the default value is the beginning of time. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentIdValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
OffsetDateTime effectiveAt = OffsetDateTime.now();


InstrumentIdValue instrumentIdValueInstance = new InstrumentIdValue()
    .value(value)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)