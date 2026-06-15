# com.finbourne.sdk.services.lusid.model.WorkspaceUpdateRequest
classname WorkspaceUpdateRequest
A request to update a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A friendly description for the workspace. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WorkspaceUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String description = "example description";


WorkspaceUpdateRequest workspaceUpdateRequestInstance = new WorkspaceUpdateRequest()
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)