# com.finbourne.sdk.services.lusid.model.ScriptMapReference
classname ScriptMapReference
Provides information about the location of a script map within the configuration store

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the configuration store entry where the translation map is located. | [default to String]
**code** | **String** | The code of the configuration store entry where the translation map is located. | [default to String]
**key** | **String** | The key of the configuration store entry where the translation map is located. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ScriptMapReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String key = "example key";


ScriptMapReference scriptMapReferenceInstance = new ScriptMapReference()
    .scope(scope)
    .code(code)
    .key(key);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)