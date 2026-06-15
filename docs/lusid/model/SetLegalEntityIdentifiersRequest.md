# com.finbourne.sdk.services.lusid.model.SetLegalEntityIdentifiersRequest
classname SetLegalEntityIdentifiersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Identifiers to set for a Legal Entity. Identifiers not included in the request will not be amended. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.SetLegalEntityIdentifiersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Property> identifiers = new Map<String, Property>();


SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequestInstance = new SetLegalEntityIdentifiersRequest()
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)