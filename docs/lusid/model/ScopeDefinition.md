# com.finbourne.sdk.services.lusid.model.ScopeDefinition
classname ScopeDefinition
A list of scopes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The unique identifier for the scope. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ScopeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";


ScopeDefinition scopeDefinitionInstance = new ScopeDefinition()
    .scope(scope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)