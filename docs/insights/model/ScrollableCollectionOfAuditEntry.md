# com.finbourne.sdk.services.insights.model.ScrollableCollectionOfAuditEntry
classname ScrollableCollectionOfAuditEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List&lt;AuditEntry&gt;**](AuditEntry.md) |  | [optional] [default to List<AuditEntry>]
**state** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.ScrollableCollectionOfAuditEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<AuditEntry> data = new List<AuditEntry>();
@javax.annotation.Nullable String state = "example state";


ScrollableCollectionOfAuditEntry scrollableCollectionOfAuditEntryInstance = new ScrollableCollectionOfAuditEntry()
    .data(data)
    .state(state);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)