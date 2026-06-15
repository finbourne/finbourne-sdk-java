# com.finbourne.sdk.services.lusid.model.WorkspaceItemCreationRequest
classname WorkspaceItemCreationRequest
A request to create an item in a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**name** | **String** | A workspace item&#39;s name. | [default to String]
**group** | **String** | The group containing a workspace item. | [default to String]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**type** | **String** | The type of the workspace item. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WorkspaceItemCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer format = new Integer("100.00");
String name = "example name";
String group = "example group";
String description = "example description";
@javax.annotation.Nullable Object String type = "example type";


WorkspaceItemCreationRequest workspaceItemCreationRequestInstance = new WorkspaceItemCreationRequest()
    .format(format)
    .name(name)
    .group(group)
    .description(description)
    .content(content)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)