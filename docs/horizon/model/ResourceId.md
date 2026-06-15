# com.finbourne.sdk.services.horizon.model.ResourceId
classname ResourceId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";


ResourceId resourceIdInstance = new ResourceId()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)