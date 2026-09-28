# com.finbourne.sdk.services.workflow.model.LauncherEventMatchingPattern
classname LauncherEventMatchingPattern
Which events make an Event Launcher start a run of its Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of event to listen for. The list of available event types can be discovered by calling the ListEventTypes API endpoint in the Notifications service. Note that event types published by the Workflow service itself are not supported as Launcher triggers, and giving one will be rejected. | [default to String]
**filter** | **String** | A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. An empty filter matches every event of the type | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.LauncherEventMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
@javax.annotation.Nullable String filter = "example filter";


LauncherEventMatchingPattern launcherEventMatchingPatternInstance = new LauncherEventMatchingPattern()
    .eventType(eventType)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)