# com.finbourne.sdk.services.lusid.model.WorkspaceCreationRequest
classname WorkspaceCreationRequest
A request to create an empty workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A workspace&#39;s name. | [default to String]
**description** | **String** | A friendly description for the workspace. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WorkspaceCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String description = "example description";


WorkspaceCreationRequest workspaceCreationRequestInstance = new WorkspaceCreationRequest()
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)