# com.finbourne.sdk.services.horizon.model.ProcessUpdateResult
classname ProcessUpdateResult
Shows details relevant to update events for a query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** |  | [default to String]
**entryId** | **String** |  | [default to String]
**processName** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**entryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**status** | **String** |  | [default to String]
**message** | **String** |  | [default to String]
**schemaVersion** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ProcessUpdateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domain = "example domain";
String entryId = "example entryId";
String processName = "example processName";
String runId = "example runId";
OffsetDateTime entryDate = OffsetDateTime.now();
String status = "example status";
String message = "example message";
@javax.annotation.Nullable String schemaVersion = "example schemaVersion";


ProcessUpdateResult processUpdateResultInstance = new ProcessUpdateResult()
    .domain(domain)
    .entryId(entryId)
    .processName(processName)
    .runId(runId)
    .entryDate(entryDate)
    .status(status)
    .message(message)
    .schemaVersion(schemaVersion);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)