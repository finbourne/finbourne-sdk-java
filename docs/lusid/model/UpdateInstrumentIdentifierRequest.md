# com.finbourne.sdk.services.lusid.model.UpdateInstrumentIdentifierRequest
classname UpdateInstrumentIdentifierRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The allowable instrument identifier to update, insert or remove e.g. &#39;Figi&#39;. | [default to String]
**value** | **String** | The new value of the allowable instrument identifier. If unspecified the identifier will be removed from the instrument. | [optional] [default to String]
**effectiveAt** | **String** | The effective datetime from which the identifier should be updated, inserted or removed. Defaults to the current LUSID system datetime if not specified. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateInstrumentIdentifierRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable String effectiveAt = "example effectiveAt";


UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequestInstance = new UpdateInstrumentIdentifierRequest()
    .type(type)
    .value(value)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)