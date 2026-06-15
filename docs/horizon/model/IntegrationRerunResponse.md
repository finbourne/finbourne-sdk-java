# com.finbourne.sdk.services.horizon.model.IntegrationRerunResponse
classname IntegrationRerunResponse
No content is returned when an instance is rerun.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**InstanceExecutionReferenceId**](InstanceExecutionReferenceId.md) |  | [default to InstanceExecutionReferenceId]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationRerunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

InstanceExecutionReferenceId runId = new InstanceExecutionReferenceId();


IntegrationRerunResponse integrationRerunResponseInstance = new IntegrationRerunResponse()
    .runId(runId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)