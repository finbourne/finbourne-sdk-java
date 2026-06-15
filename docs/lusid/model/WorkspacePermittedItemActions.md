# com.finbourne.sdk.services.lusid.model.WorkspacePermittedItemActions
classname WorkspacePermittedItemActions
The workspace item actions a user is permitted to perform within a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readItem** | **Boolean** | Whether the user is permitted to read workspace items. | [optional] [default to Boolean]
**addItem** | **Boolean** | Whether the user is permitted to add workspace items. | [optional] [default to Boolean]
**updateItem** | **Boolean** | Whether the user is permitted to update workspace items. | [optional] [default to Boolean]
**deleteItem** | **Boolean** | Whether the user is permitted to delete workspace items. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.WorkspacePermittedItemActions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean readItem = true;
Boolean addItem = true;
Boolean updateItem = true;
Boolean deleteItem = true;


WorkspacePermittedItemActions workspacePermittedItemActionsInstance = new WorkspacePermittedItemActions()
    .readItem(readItem)
    .addItem(addItem)
    .updateItem(updateItem)
    .deleteItem(deleteItem);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)