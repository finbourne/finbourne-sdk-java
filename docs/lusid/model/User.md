# com.finbourne.sdk.services.lusid.model.User
classname User
The unique id of the user that issued the command.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique id of the user. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.User;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";


User userInstance = new User()
    .id(id);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)