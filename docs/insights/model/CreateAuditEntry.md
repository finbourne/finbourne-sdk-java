# com.finbourne.sdk.services.insights.model.CreateAuditEntry
classname CreateAuditEntry
Details to create an audit entry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**process** | [**AuditProcess**](AuditProcess.md) |  | [default to AuditProcess]
**data** | [**AuditData**](AuditData.md) |  | [default to AuditData]

```java
import com.finbourne.sdk.services.insights.model.CreateAuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

AuditProcess process = new AuditProcess();
AuditData data = new AuditData();


CreateAuditEntry createAuditEntryInstance = new CreateAuditEntry()
    .process(process)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)