# com.finbourne.sdk.services.workflow.model.RunWorkerRequest
classname RunWorkerRequest
Request to Create a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | [**List&lt;ParameterValue&gt;**](ParameterValue.md) | The Parameter and their values. | [default to List<ParameterValue>]
**workerTimeout** | **Integer** | The timeout in seconds for the worker | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.RunWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ParameterValue> parameters = new List<ParameterValue>();
@javax.annotation.Nullable Integer workerTimeout = new Integer("100.00");


RunWorkerRequest runWorkerRequestInstance = new RunWorkerRequest()
    .parameters(parameters)
    .workerTimeout(workerTimeout);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)