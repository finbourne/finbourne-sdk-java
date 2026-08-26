# com.finbourne.sdk.services.workflow.model.HorizonIntegrationResponse
classname HorizonIntegrationResponse
Readonly configuration for the Horizon Integration Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. Null on the library worker. | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.HorizonIntegrationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String integrationInstanceId = "example integrationInstanceId";


HorizonIntegrationResponse horizonIntegrationResponseInstance = new HorizonIntegrationResponse()
    .type(type)
    .integrationInstanceId(integrationInstanceId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)