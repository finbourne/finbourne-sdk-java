# com.finbourne.sdk.services.workflow.model.UpdateWorkerRequest
classname UpdateWorkerRequest
Request to Update a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | **Object** | Information about how the worker should be executed | [default to Object]

```java
import com.finbourne.sdk.services.workflow.model.UpdateWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Object 

UpdateWorkerRequest updateWorkerRequestInstance = new UpdateWorkerRequest()
    .displayName(displayName)
    .description(description)
    .workerConfiguration(workerConfiguration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)