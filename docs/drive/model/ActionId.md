# com.finbourne.sdk.services.drive.model.ActionId
classname ActionId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**activity** | **String** |  | [default to String]
**entity** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.drive.model.ActionId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String activity = "example activity";
String entity = "example entity";


ActionId actionIdInstance = new ActionId()
    .scope(scope)
    .activity(activity)
    .entity(entity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)