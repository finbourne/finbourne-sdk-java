# com.finbourne.sdk.services.lusid.model.Workspace
classname Workspace
A workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A workspace&#39;s name. | [default to String]
**description** | **String** | A friendly description for the workspace. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**permittedItemActions** | [**WorkspacePermittedItemActions**](WorkspacePermittedItemActions.md) |  | [optional] [default to WorkspacePermittedItemActions]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Workspace;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String description = "example description";
Version version = new Version();
WorkspacePermittedItemActions permittedItemActions = new WorkspacePermittedItemActions();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Workspace workspaceInstance = new Workspace()
    .name(name)
    .description(description)
    .version(version)
    .permittedItemActions(permittedItemActions)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)