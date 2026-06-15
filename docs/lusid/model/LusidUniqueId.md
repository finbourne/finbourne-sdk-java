# com.finbourne.sdk.services.lusid.model.LusidUniqueId
classname LusidUniqueId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type for the LUSID unique id, this will depend on the type of entity found, for instance &#39;Instrument&#39; would have a value of &#39;LusidInstrumentId&#39; | [default to String]
**value** | **String** | The value for the LUSID unique id | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidUniqueId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String value = "example value";


LusidUniqueId lusidUniqueIdInstance = new LusidUniqueId()
    .type(type)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)