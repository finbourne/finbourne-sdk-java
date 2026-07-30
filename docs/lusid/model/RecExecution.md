# com.finbourne.sdk.services.lusid.model.RecExecution
classname RecExecution
The execution outcome for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outcome** | **String** | The execution outcome. Available values: Succeeded, Failed. | [default to String]
**errorDetail** | **String** | Detail of the execution failure. Populated when outcome is Failed. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecExecution;
import java.util.*;
import java.lang.System;
import java.net.URI;

String outcome = "example outcome";
@javax.annotation.Nullable String errorDetail = "example errorDetail";


RecExecution recExecutionInstance = new RecExecution()
    .outcome(outcome)
    .errorDetail(errorDetail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)