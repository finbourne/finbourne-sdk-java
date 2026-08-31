# com.finbourne.sdk.services.lusid.model.RecInstanceSummary
classname RecInstanceSummary
A lightweight view of the rec instance, nested on each result set. It carries the instance-level  status, which is how a result set surfaces the instance's running/locked state to the dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recDefinitionDisplayName** | **String** | The display name of the rec definition the rec was instantiated for, as it stood as-at instantiation. Not re-synchronised if the definition is later renamed. | [default to String]
**asAtInstantiated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the instance was first created. | [default to OffsetDateTime]
**status** | **String** | The instance-level lifecycle rollup. Available values: Running, Failures, ReviewAndApproval, AllApproved, Locked. | [default to String]
**asAtLocked** | [**OffsetDateTime**](OffsetDateTime.md) | The wall-clock time the lock action was performed. Null when the instance has not been locked. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecInstanceSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId id = new RecInstanceId();
ResourceId recDefinitionId = new ResourceId();
String recDefinitionDisplayName = "example recDefinitionDisplayName";
OffsetDateTime asAtInstantiated = OffsetDateTime.now();
String status = "example status";
@javax.annotation.Nullable OffsetDateTime asAtLocked = OffsetDateTime.now();


RecInstanceSummary recInstanceSummaryInstance = new RecInstanceSummary()
    .id(id)
    .recDefinitionId(recDefinitionId)
    .recDefinitionDisplayName(recDefinitionDisplayName)
    .asAtInstantiated(asAtInstantiated)
    .status(status)
    .asAtLocked(asAtLocked);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)