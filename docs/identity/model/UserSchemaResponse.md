# com.finbourne.sdk.services.identity.model.UserSchemaResponse
classname UserSchemaResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternativeUserIds** | [**List&lt;UserSchemaProperty&gt;**](UserSchemaProperty.md) |  | [optional] [default to List<UserSchemaProperty>]

```java
import com.finbourne.sdk.services.identity.model.UserSchemaResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<UserSchemaProperty> alternativeUserIds = new List<UserSchemaProperty>();


UserSchemaResponse userSchemaResponseInstance = new UserSchemaResponse()
    .alternativeUserIds(alternativeUserIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)