# com.finbourne.sdk.services.workflow.model.LauncherSummaries
classname LauncherSummaries
Sentences that say what a Launcher does, meant to be shown to a person.              These are rendered on read from the stored Launcher details. They are never stored and never accepted on a write, so the same Launcher always reads back the same summaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | **String** | A sentence that says when the Launcher starts a run, for example \&quot;Weekly on Mon at 09:00, rolled forward to the next business day\&quot;.              Null for an Event Launcher, which has no schedule | [optional] [default to String]
**fields** | **Map&lt;String, String&gt;** | A sentence for each field of the root task the Launcher fills, keyed by the field name on the root task definition. Empty when the Launcher fills no fields | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.workflow.model.LauncherSummaries;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String schedule = "example schedule";
@javax.annotation.Nullable Map<String, String> fields = new Map<String, String>();


LauncherSummaries launcherSummariesInstance = new LauncherSummaries()
    .schedule(schedule)
    .fields(fields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)