# com.finbourne.sdk.services.lusid.model.RecInstance
classname RecInstance
The expanded view of a rec instance: its identity, lifecycle status, lock state, closed periods  (for Closed Period windows) and the time-series of runs in the run log.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recDefinitionDisplayName** | **String** | The display name of the rec definition the rec was instantiated for, as it stood as-at instantiation. Not re-synchronised if the definition is later renamed. | [default to String]
**asAtInstantiated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the instance was first created. | [default to OffsetDateTime]
**status** | **String** | The instance-level lifecycle rollup. Available values: Running, Failures, ReviewAndApproval, AllApproved, Locked. | [default to String]
**asAtLocked** | [**OffsetDateTime**](OffsetDateTime.md) | The wall-clock time the lock action was performed. Null when the instance has not been locked. | [optional] [default to OffsetDateTime]
**datesLocked** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [optional] [default to RecDatesReconciled]
**closedPeriods** | [**RecClosedPeriods**](RecClosedPeriods.md) |  | [optional] [default to RecClosedPeriods]
**runLog** | [**List&lt;RecRunLogEntry&gt;**](RecRunLogEntry.md) | A chronologically ordered list of all runs on the instance. Always contains at least one entry. | [default to List<RecRunLogEntry>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RecInstance;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId id = new RecInstanceId();
ResourceId recDefinitionId = new ResourceId();
String recDefinitionDisplayName = "example recDefinitionDisplayName";
OffsetDateTime asAtInstantiated = OffsetDateTime.now();
String status = "example status";
@javax.annotation.Nullable OffsetDateTime asAtLocked = OffsetDateTime.now();
RecDatesReconciled datesLocked = new RecDatesReconciled();
RecClosedPeriods closedPeriods = new RecClosedPeriods();
List<RecRunLogEntry> runLog = new List<RecRunLogEntry>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RecInstance recInstanceInstance = new RecInstance()
    .id(id)
    .recDefinitionId(recDefinitionId)
    .recDefinitionDisplayName(recDefinitionDisplayName)
    .asAtInstantiated(asAtInstantiated)
    .status(status)
    .asAtLocked(asAtLocked)
    .datesLocked(datesLocked)
    .closedPeriods(closedPeriods)
    .runLog(runLog)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)