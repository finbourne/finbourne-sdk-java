# com.finbourne.sdk.services.workflow.model.ActionLogOrigin
classname ActionLogOrigin
The Action Log Origin contains information about how the Action was created

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | [**UUID**](UUID.md) | The Id of the Task that created this Action | [optional] [default to UUID]
**requestId** | **String** | The request Id of the request that caused this Action to be triggered. This could be the original request that caused a sequence of Actions that resulted in this Action | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ActionLogOrigin;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable UUID taskId = "example taskId";
String requestId = "example requestId";


ActionLogOrigin actionLogOriginInstance = new ActionLogOrigin()
    .taskId(taskId)
    .requestId(requestId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)