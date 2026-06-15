# com.finbourne.sdk.services.lusid.model.ItemAndWorkspace
classname ItemAndWorkspace
An item plus its containing workspace name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workspaceName** | **String** | A workspace&#39;s name. | [default to String]
**workspaceItem** | [**WorkspaceItem**](WorkspaceItem.md) |  | [default to WorkspaceItem]

```java
import com.finbourne.sdk.services.lusid.model.ItemAndWorkspace;
import java.util.*;
import java.lang.System;
import java.net.URI;

String workspaceName = "example workspaceName";
WorkspaceItem workspaceItem = new WorkspaceItem();


ItemAndWorkspace itemAndWorkspaceInstance = new ItemAndWorkspace()
    .workspaceName(workspaceName)
    .workspaceItem(workspaceItem);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)