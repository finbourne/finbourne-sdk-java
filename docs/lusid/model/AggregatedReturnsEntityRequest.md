# com.finbourne.sdk.services.lusid.model.AggregatedReturnsEntityRequest
classname AggregatedReturnsEntityRequest
The request body for the aggregated-returns (TWR) endpoint: the entity to calculate returns for, the  Returns entity that configures the calculation, the effective window, the metrics to calculate and the  period grid granularity. Supports a single `Portfolio` entity, the period `Return` metric and  a `Daily` grid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**AggregatedReturnsEntityId**](AggregatedReturnsEntityId.md) |  | [default to AggregatedReturnsEntityId]
**returnsScope** | **String** |  | [default to String]
**returnsCode** | **String** |  | [default to String]
**metrics** | [**List&lt;ReturnsMetric&gt;**](ReturnsMetric.md) |  | [default to List<ReturnsMetric>]
**period** | **String** | Available values: Daily, Monthly. | [optional] [default to String]
**fromEffectiveAt** | **String** |  | [optional] [default to String]
**toEffectiveAt** | **String** |  | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedReturnsEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregatedReturnsEntityId entity = new AggregatedReturnsEntityId();
String returnsScope = "example returnsScope";
String returnsCode = "example returnsCode";
List<ReturnsMetric> metrics = new List<ReturnsMetric>();
@javax.annotation.Nullable String period = "example period";
@javax.annotation.Nullable String fromEffectiveAt = "example fromEffectiveAt";
@javax.annotation.Nullable String toEffectiveAt = "example toEffectiveAt";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


AggregatedReturnsEntityRequest aggregatedReturnsEntityRequestInstance = new AggregatedReturnsEntityRequest()
    .entity(entity)
    .returnsScope(returnsScope)
    .returnsCode(returnsCode)
    .metrics(metrics)
    .period(period)
    .fromEffectiveAt(fromEffectiveAt)
    .toEffectiveAt(toEffectiveAt)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)