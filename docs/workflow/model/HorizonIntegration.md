# com.finbourne.sdk.services.workflow.model.HorizonIntegration
classname HorizonIntegration
Configuration for a Worker that executes a Horizon integration instance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.HorizonIntegration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String integrationInstanceId = "example integrationInstanceId";


HorizonIntegration horizonIntegrationInstance = new HorizonIntegration()
    .type(type)
    .integrationInstanceId(integrationInstanceId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)