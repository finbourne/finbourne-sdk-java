# com.finbourne.sdk.services.lusid.model.Operation
classname Operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **Object** |  | [optional] [default to Object]
**path** | **String** |  | [default to String]
**op** | **String** | Available values: add, remove. | [default to String]
**from** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Operation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Object String path = "example path";
String op = "example op";
@javax.annotation.Nullable String from = "example from";


Operation operationInstance = new Operation()
    .value(value)
    .path(path)
    .op(op)
    .from(from);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)