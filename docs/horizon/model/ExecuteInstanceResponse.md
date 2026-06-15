# com.finbourne.sdk.services.horizon.model.ExecuteInstanceResponse
classname ExecuteInstanceResponse
Response for executing an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | Identifier for the execution of the integration instance | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ExecuteInstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String executionId = "example executionId";


ExecuteInstanceResponse executeInstanceResponseInstance = new ExecuteInstanceResponse()
    .executionId(executionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)