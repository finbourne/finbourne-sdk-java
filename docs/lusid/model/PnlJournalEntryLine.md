# com.finbourne.sdk.services.lusid.model.PnlJournalEntryLine
classname PnlJournalEntryLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pnlBucket** | **String** | The Filter ID of the grouping used from the Fund Configuration PnL filters | [optional] [default to String]
**journalEntryLine** | [**JournalEntryLine**](JournalEntryLine.md) |  | [optional] [default to JournalEntryLine]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PnlJournalEntryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String pnlBucket = "example pnlBucket";
JournalEntryLine journalEntryLine = new JournalEntryLine();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PnlJournalEntryLine pnlJournalEntryLineInstance = new PnlJournalEntryLine()
    .pnlBucket(pnlBucket)
    .journalEntryLine(journalEntryLine)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)