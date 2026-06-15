# com.finbourne.sdk.services.lusid.model.ComplianceRunInfoV2
classname ComplianceRunInfoV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**instigatedBy** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRunInfoV2;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
String instigatedBy = "example instigatedBy";


ComplianceRunInfoV2 complianceRunInfoV2Instance = new ComplianceRunInfoV2()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .instigatedBy(instigatedBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)