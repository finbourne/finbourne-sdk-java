# com.finbourne.sdk.services.lusid.model.WorkspaceItem
classname WorkspaceItem
An item stored in a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the workspace item. | [default to String]
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**name** | **String** | A workspace item&#39;s name. | [default to String]
**group** | **String** | The group containing a workspace item. | [default to String]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.WorkspaceItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
Integer format = new Integer("100.00");
String name = "example name";
String group = "example group";
String description = "example description";
@javax.annotation.Nullable Object Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


WorkspaceItem workspaceItemInstance = new WorkspaceItem()
    .type(type)
    .format(format)
    .name(name)
    .group(group)
    .description(description)
    .content(content)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)