# com.finbourne.sdk.services.insights.model.AuditProcessSummary
classname AuditProcessSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**process** | [**AuditProcess**](AuditProcess.md) |  | [optional] [default to AuditProcess]
**latestEntry** | [**AuditData**](AuditData.md) |  | [optional] [default to AuditData]
**summary** | [**AuditDataSummary**](AuditDataSummary.md) |  | [optional] [default to AuditDataSummary]

```java
import com.finbourne.sdk.services.insights.model.AuditProcessSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

AuditProcess process = new AuditProcess();
AuditData latestEntry = new AuditData();
AuditDataSummary summary = new AuditDataSummary();


AuditProcessSummary auditProcessSummaryInstance = new AuditProcessSummary()
    .process(process)
    .latestEntry(latestEntry)
    .summary(summary);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)