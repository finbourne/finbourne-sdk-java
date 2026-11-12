# com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimateResult
classname UpsertExternalDealingEstimateResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**late** | **Boolean** |  | [optional] [default to Boolean]
**upsertedEstimates** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]
**deletedEstimates** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
OffsetDateTime dealingPoint = OffsetDateTime.now();
Boolean late = true;
@javax.annotation.Nullable List<ResourceId> upsertedEstimates = new List<ResourceId>();
@javax.annotation.Nullable List<ResourceId> deletedEstimates = new List<ResourceId>();


UpsertExternalDealingEstimateResult upsertExternalDealingEstimateResultInstance = new UpsertExternalDealingEstimateResult()
    .fundId(fundId)
    .dealingPoint(dealingPoint)
    .late(late)
    .upsertedEstimates(upsertedEstimates)
    .deletedEstimates(deletedEstimates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)