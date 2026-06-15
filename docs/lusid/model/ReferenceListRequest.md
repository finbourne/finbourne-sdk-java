# com.finbourne.sdk.services.lusid.model.ReferenceListRequest
classname ReferenceListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The name of the reference list. | [default to String]
**description** | **String** | The description of the reference list. | [optional] [default to String]
**tags** | **List&lt;String&gt;** | The tags associated with the reference list. | [optional] [default to List<String>]
**referenceList** | [**ReferenceList**](ReferenceList.md) |  | [default to ReferenceList]

```java
import com.finbourne.sdk.services.lusid.model.ReferenceListRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> tags = new List<String>();
ReferenceList referenceList = new ReferenceList();


ReferenceListRequest referenceListRequestInstance = new ReferenceListRequest()
    .id(id)
    .name(name)
    .description(description)
    .tags(tags)
    .referenceList(referenceList);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)