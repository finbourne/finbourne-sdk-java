# com.finbourne.sdk.services.lusid.model.ResourceId
classname ResourceId
Identifiers of an entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used to identify an entity | [default to String]
**code** | **String** | The code used to identify an entity | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceId;
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