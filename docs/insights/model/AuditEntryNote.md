# com.finbourne.sdk.services.insights.model.AuditEntryNote
classname AuditEntryNote

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  | [default to String]
**text** | **String** |  | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.insights.model.AuditEntryNote;
import java.util.*;
import java.lang.System;
import java.net.URI;

String userId = "example userId";
String text = "example text";
OffsetDateTime date = OffsetDateTime.now();


AuditEntryNote auditEntryNoteInstance = new AuditEntryNote()
    .userId(userId)
    .text(text)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)