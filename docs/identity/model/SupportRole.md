# com.finbourne.sdk.services.identity.model.SupportRole
classname SupportRole

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**roleIdentifier** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**internalIdentifier** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.SupportRole;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String label = "example label";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, String> roleIdentifier = new Map<String, String>();
@javax.annotation.Nullable String internalIdentifier = "example internalIdentifier";


SupportRole supportRoleInstance = new SupportRole()
    .label(label)
    .description(description)
    .roleIdentifier(roleIdentifier)
    .internalIdentifier(internalIdentifier);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)