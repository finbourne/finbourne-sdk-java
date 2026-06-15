# com.finbourne.sdk.services.horizon.model.IntegrationRunResponse
classname IntegrationRunResponse
Integration run response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**refRunId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**attempt** | **Integer** |  | [default to Integer]
**instanceId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**instanceName** | **String** |  | [optional] [default to String]
**status** | **String** |  | [optional] [default to String]
**message** | **String** |  | [optional] [default to String]
**integration** | [**IntegrationRunIntegration**](IntegrationRunIntegration.md) |  | [default to IntegrationRunIntegration]
**version** | [**IntegrationRunVersion**](IntegrationRunVersion.md) |  | [default to IntegrationRunVersion]
**integrationLogs** | [**Map&lt;String, Map&lt;String, IntegrationRunLog&gt;&gt;**](Map.md) |  | [optional] [default to Map<String, Map<String, IntegrationRunLog>>]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID runId = "example runId";
@javax.annotation.Nullable UUID refRunId = "example refRunId";
Integer attempt = new Integer("100.00");
@javax.annotation.Nullable UUID instanceId = "example instanceId";
@javax.annotation.Nullable String instanceName = "example instanceName";
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String message = "example message";
IntegrationRunIntegration integration = new IntegrationRunIntegration();
IntegrationRunVersion version = new IntegrationRunVersion();
@javax.annotation.Nullable Map<String, Map<String, IntegrationRunLog>> integrationLogs = new Map<String, Map<String, IntegrationRunLog>>();


IntegrationRunResponse integrationRunResponseInstance = new IntegrationRunResponse()
    .runId(runId)
    .refRunId(refRunId)
    .attempt(attempt)
    .instanceId(instanceId)
    .instanceName(instanceName)
    .status(status)
    .message(message)
    .integration(integration)
    .version(version)
    .integrationLogs(integrationLogs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)