# com.finbourne.sdk.services.scheduler.model.ResourceId
classname ResourceId
Resource Id

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope of the resource | [default to String]
**code** | **String** | Code of the resource | [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.ResourceId;
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