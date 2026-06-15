# com.finbourne.sdk.services.identity.model.UpdateUserSchemaRequest
classname UpdateUserSchemaRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternativeUserIds** | [**List&lt;UserSchemaProperty&gt;**](UserSchemaProperty.md) |  | [default to List<UserSchemaProperty>]

```java
import com.finbourne.sdk.services.identity.model.UpdateUserSchemaRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<UserSchemaProperty> alternativeUserIds = new List<UserSchemaProperty>();


UpdateUserSchemaRequest updateUserSchemaRequestInstance = new UpdateUserSchemaRequest()
    .alternativeUserIds(alternativeUserIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)