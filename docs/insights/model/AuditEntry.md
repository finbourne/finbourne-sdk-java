# com.finbourne.sdk.services.insights.model.AuditEntry
classname AuditEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**process** | [**AuditProcess**](AuditProcess.md) |  | [default to AuditProcess]
**data** | [**AuditData**](AuditData.md) |  | [default to AuditData]
**notes** | [**List&lt;AuditEntryNote&gt;**](AuditEntryNote.md) |  | [optional] [default to List<AuditEntryNote>]

```java
import com.finbourne.sdk.services.insights.model.AuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
OffsetDateTime date = OffsetDateTime.now();
AuditProcess process = new AuditProcess();
AuditData data = new AuditData();
@javax.annotation.Nullable List<AuditEntryNote> notes = new List<AuditEntryNote>();


AuditEntry auditEntryInstance = new AuditEntry()
    .id(id)
    .date(date)
    .process(process)
    .data(data)
    .notes(notes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)