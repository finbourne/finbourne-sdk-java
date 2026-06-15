# com.finbourne.sdk.services.access.model.PolicyCollectionId
classname PolicyCollectionId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [optional] [default to String]
**code** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.access.model.PolicyCollectionId;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
String code = "example code";


PolicyCollectionId policyCollectionIdInstance = new PolicyCollectionId()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)