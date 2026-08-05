# com.finbourne.sdk.services.lusid.model.TransitionRecInstanceRequest
classname TransitionRecInstanceRequest
The request to apply a lifecycle transition (re-run, lock or unlock) to a rec instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The transition to apply. Available values: ReRun, Lock, Unlock. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransitionRecInstanceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String action = "example action";


TransitionRecInstanceRequest transitionRecInstanceRequestInstance = new TransitionRecInstanceRequest()
    .action(action);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)