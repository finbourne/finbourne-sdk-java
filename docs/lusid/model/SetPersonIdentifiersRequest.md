# com.finbourne.sdk.services.lusid.model.SetPersonIdentifiersRequest
classname SetPersonIdentifiersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Identifiers to set for a Person. Identifiers not included in the request will not be amended. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.SetPersonIdentifiersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Property> identifiers = new Map<String, Property>();


SetPersonIdentifiersRequest setPersonIdentifiersRequestInstance = new SetPersonIdentifiersRequest()
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)