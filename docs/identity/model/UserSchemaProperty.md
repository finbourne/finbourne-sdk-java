# com.finbourne.sdk.services.identity.model.UserSchemaProperty
classname UserSchemaProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**description** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.identity.model.UserSchemaProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String description = "example description";


UserSchemaProperty userSchemaPropertyInstance = new UserSchemaProperty()
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)