# com.finbourne.sdk.services.lusid.model.AccessMetadataOperation
classname AccessMetadataOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) |  | [default to List<AccessMetadataValue>]
**path** | **String** |  | [default to String]
**op** | **String** | Available values: add, remove. | [default to String]
**from** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccessMetadataOperation;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AccessMetadataValue> value = new List<AccessMetadataValue>();
String path = "example path";
String op = "example op";
@javax.annotation.Nullable String from = "example from";


AccessMetadataOperation accessMetadataOperationInstance = new AccessMetadataOperation()
    .value(value)
    .path(path)
    .op(op)
    .from(from);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)