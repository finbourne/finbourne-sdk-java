# com.finbourne.sdk.services.luminesce.model.AccessControlledResource
classname AccessControlledResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [optional] [default to String]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**actions** | [**List&lt;AccessControlledAction&gt;**](AccessControlledAction.md) |  | [optional] [default to List<AccessControlledAction>]
**identifierParts** | [**List&lt;AccessControlledResourceIdentifierPartSchemaAttribute&gt;**](AccessControlledResourceIdentifierPartSchemaAttribute.md) |  | [optional] [default to List<AccessControlledResourceIdentifierPartSchemaAttribute>]

```java
import com.finbourne.sdk.services.luminesce.model.AccessControlledResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String application = "example application";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<AccessControlledAction> actions = new List<AccessControlledAction>();
@javax.annotation.Nullable List<AccessControlledResourceIdentifierPartSchemaAttribute> identifierParts = new List<AccessControlledResourceIdentifierPartSchemaAttribute>();


AccessControlledResource accessControlledResourceInstance = new AccessControlledResource()
    .application(application)
    .name(name)
    .description(description)
    .actions(actions)
    .identifierParts(identifierParts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)