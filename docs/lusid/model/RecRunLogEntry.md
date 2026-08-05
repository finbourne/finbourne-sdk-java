# com.finbourne.sdk.services.lusid.model.RecRunLogEntry
classname RecRunLogEntry
A single run within an instance's run log. All runs share the same effective dates (frozen at  instantiation); each has a different asAt, advanced on re-run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**supersededAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this run was superseded by a subsequent run. | [optional] [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]

```java
import com.finbourne.sdk.services.lusid.model.RecRunLogEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer runNumber = new Integer("100.00");
OffsetDateTime runAsAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime supersededAsAt = OffsetDateTime.now();
RecDatesReconciled datesReconciled = new RecDatesReconciled();


RecRunLogEntry recRunLogEntryInstance = new RecRunLogEntry()
    .runNumber(runNumber)
    .runAsAt(runAsAt)
    .supersededAsAt(supersededAsAt)
    .datesReconciled(datesReconciled);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)