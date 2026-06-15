# com.finbourne.sdk.services.lusid.model.CreateTimelineRequest
classname CreateTimelineRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Timeline. | [default to String]
**description** | **String** | A description for the Timeline. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Timelines properties. These will be from the &#39;Timeline&#39; domain. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.CreateTimelineRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


CreateTimelineRequest createTimelineRequestInstance = new CreateTimelineRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)