# com.finbourne.sdk.services.lusid.model.DataScope
classname DataScope

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | [**Client**](Client.md) |  | [optional] [default to Client]
**scope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DataScope;
import java.util.*;
import java.lang.System;
import java.net.URI;

Client client = new Client();
@javax.annotation.Nullable String scope = "example scope";


DataScope dataScopeInstance = new DataScope()
    .client(client)
    .scope(scope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)