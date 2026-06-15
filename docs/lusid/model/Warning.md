# com.finbourne.sdk.services.lusid.model.Warning
classname Warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** |  | [default to String]
**message** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Warning;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityId = "example entityId";
String message = "example message";


Warning warningInstance = new Warning()
    .entityId(entityId)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)