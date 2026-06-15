# com.finbourne.sdk.services.drive.model.AccessControlledResource
classname AccessControlledResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [optional] [default to String]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [default to String]
**actions** | [**List&lt;AccessControlledAction&gt;**](AccessControlledAction.md) |  | [default to List<AccessControlledAction>]
**identifierParts** | [**List&lt;IdentifierPartSchema&gt;**](IdentifierPartSchema.md) |  | [optional] [default to List<IdentifierPartSchema>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.drive.model.AccessControlledResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String application = "example application";
@javax.annotation.Nullable String name = "example name";
String description = "example description";
List<AccessControlledAction> actions = new List<AccessControlledAction>();
@javax.annotation.Nullable List<IdentifierPartSchema> identifierParts = new List<IdentifierPartSchema>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AccessControlledResource accessControlledResourceInstance = new AccessControlledResource()
    .application(application)
    .name(name)
    .description(description)
    .actions(actions)
    .identifierParts(identifierParts)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)