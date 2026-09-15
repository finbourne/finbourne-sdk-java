# com.finbourne.sdk.services.lusid.model.RecRunLog
classname RecRunLog
One rec type's run history within a rec instance: its most recent runs, and the total number of runs those  were taken from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runCount** | **Integer** | The total number of runs of this rec type, which is not necessarily the number returned. A value greater than ten means runs has been truncated; the runs beyond it remain retrievable from previousRuns on the rec type&#39;s result set. | [default to Integer]
**runs** | [**List&lt;RecRunLogEntry&gt;**](RecRunLogEntry.md) | The ten most recent runs of this rec type, ordered by run number descending, so the current run is always the first entry. Exactly one entry has a null supersededAsAt. | [default to List<RecRunLogEntry>]

```java
import com.finbourne.sdk.services.lusid.model.RecRunLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer runCount = new Integer("100.00");
List<RecRunLogEntry> runs = new List<RecRunLogEntry>();


RecRunLog recRunLogInstance = new RecRunLog()
    .runCount(runCount)
    .runs(runs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)