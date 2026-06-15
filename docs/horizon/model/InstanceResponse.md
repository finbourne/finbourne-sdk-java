# com.finbourne.sdk.services.horizon.model.InstanceResponse
classname InstanceResponse
record containing details of a single instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | [default to UUID]
**name** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**portfolios** | [**List&lt;TpfPortfolio&gt;**](TpfPortfolio.md) |  | [default to List<TpfPortfolio>]
**schedule** | **String** |  | [optional] [default to String]
**scheduleTimezone** | **String** |  | [optional] [default to String]
**lastRunAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**lastRunStatus** | **String** |  | [optional] [default to String]
**latestRunsIn24Hours** | **String** |  | [optional] [default to String]
**destinations** | [**List&lt;InstanceDestinations&gt;**](InstanceDestinations.md) |  | [default to List<InstanceDestinations>]

```java
import com.finbourne.sdk.services.horizon.model.InstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID id = "example id";
String name = "example name";
Boolean enabled = true;
List<TpfPortfolio> portfolios = new List<TpfPortfolio>();
@javax.annotation.Nullable String schedule = "example schedule";
@javax.annotation.Nullable String scheduleTimezone = "example scheduleTimezone";
@javax.annotation.Nullable OffsetDateTime lastRunAt = OffsetDateTime.now();
@javax.annotation.Nullable String lastRunStatus = "example lastRunStatus";
@javax.annotation.Nullable String latestRunsIn24Hours = "example latestRunsIn24Hours";
List<InstanceDestinations> destinations = new List<InstanceDestinations>();


InstanceResponse instanceResponseInstance = new InstanceResponse()
    .id(id)
    .name(name)
    .enabled(enabled)
    .portfolios(portfolios)
    .schedule(schedule)
    .scheduleTimezone(scheduleTimezone)
    .lastRunAt(lastRunAt)
    .lastRunStatus(lastRunStatus)
    .latestRunsIn24Hours(latestRunsIn24Hours)
    .destinations(destinations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)