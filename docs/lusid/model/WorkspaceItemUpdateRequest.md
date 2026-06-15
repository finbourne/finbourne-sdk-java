# com.finbourne.sdk.services.lusid.model.WorkspaceItemUpdateRequest
classname WorkspaceItemUpdateRequest
A request to update a workspace item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**type** | **String** | The type of the workspace item. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WorkspaceItemUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer format = new Integer("100.00");
String description = "example description";
@javax.annotation.Nullable Object String type = "example type";


WorkspaceItemUpdateRequest workspaceItemUpdateRequestInstance = new WorkspaceItemUpdateRequest()
    .format(format)
    .description(description)
    .content(content)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)