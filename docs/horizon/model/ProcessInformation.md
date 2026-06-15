# com.finbourne.sdk.services.horizon.model.ProcessInformation
classname ProcessInformation
Required information for each process

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** |  | [default to String]
**processName** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**dataAction** | **String** |  | [default to String]
**schemaVersion** | **String** |  | [optional] [default to String]
**userId** | **String** |  | [default to String]
**processSummary** | [**ProcessSummary**](ProcessSummary.md) |  | [optional] [default to ProcessSummary]

```java
import com.finbourne.sdk.services.horizon.model.ProcessInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domain = "example domain";
String processName = "example processName";
String runId = "example runId";
OffsetDateTime startTime = OffsetDateTime.now();
String dataAction = "example dataAction";
@javax.annotation.Nullable String schemaVersion = "example schemaVersion";
String userId = "example userId";
ProcessSummary processSummary = new ProcessSummary();


ProcessInformation processInformationInstance = new ProcessInformation()
    .domain(domain)
    .processName(processName)
    .runId(runId)
    .startTime(startTime)
    .dataAction(dataAction)
    .schemaVersion(schemaVersion)
    .userId(userId)
    .processSummary(processSummary);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)