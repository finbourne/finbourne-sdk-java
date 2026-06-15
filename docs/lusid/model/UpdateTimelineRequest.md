# com.finbourne.sdk.services.lusid.model.UpdateTimelineRequest
classname UpdateTimelineRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Timeline. | [default to String]
**description** | **String** | A description for the Timeline. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Timelines properties. These will be from the &#39;Timeline&#39; domain. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateTimelineRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


UpdateTimelineRequest updateTimelineRequestInstance = new UpdateTimelineRequest()
    .displayName(displayName)
    .description(description)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)