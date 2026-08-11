# com.finbourne.sdk.services.workflow.model.EventMatchingPattern
classname EventMatchingPattern
The matching event pattern object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of event to subscribe to. The list of available event types can be discovered by calling the ListEventTypes API endpoint in the Notifications service. Note that event types published by the Workflow service itself (such as TaskCreated, TaskUpdated, TaskDeleted, TaskDefinitionCreated, TaskDefinitionUpdated and TaskDefinitionDeleted) are not supported as Event Handler triggers, and specifying one will be rejected. | [default to String]
**filter** | **String** | A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. If not provided, all events will be matched. | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.EventMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
@javax.annotation.Nullable String filter = "example filter";


EventMatchingPattern eventMatchingPatternInstance = new EventMatchingPattern()
    .eventType(eventType)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)