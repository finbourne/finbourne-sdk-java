# com.finbourne.sdk.services.horizon.model.AuditCompleteResponse
classname AuditCompleteResponse
Response type for Horizon Audit Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processName** | **String** | The name of the Process the events will be visible under | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.AuditCompleteResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String processName = "example processName";


AuditCompleteResponse auditCompleteResponseInstance = new AuditCompleteResponse()
    .processName(processName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)