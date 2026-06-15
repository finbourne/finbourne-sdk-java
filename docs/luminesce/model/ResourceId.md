# com.finbourne.sdk.services.luminesce.model.ResourceId
classname ResourceId
Unique identifier for a resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used to identify a resource | [default to String]
**code** | **String** | The code used to identify a resource | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
@javax.annotation.Nullable String code = "example code";


ResourceId resourceIdInstance = new ResourceId()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)