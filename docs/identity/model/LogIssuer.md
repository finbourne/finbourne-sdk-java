# com.finbourne.sdk.services.identity.model.LogIssuer
classname LogIssuer
Represents a LogIssuer resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LogIssuer;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String type = "example type";


LogIssuer logIssuerInstance = new LogIssuer()
    .id(id)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)