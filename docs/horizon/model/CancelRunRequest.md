# com.finbourne.sdk.services.horizon.model.CancelRunRequest
classname CancelRunRequest
A request to cancel the specified instance execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runIds** | **List&lt;String&gt;** | The instance run ids to be cancelled. | [default to List<String>]
**message** | **String** | The user provided message as to why the instance executions were cancelled. | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.CancelRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> runIds = new List<String>();
@javax.annotation.Nullable String message = "example message";


CancelRunRequest cancelRunRequestInstance = new CancelRunRequest()
    .runIds(runIds)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)