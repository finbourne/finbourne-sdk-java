# com.finbourne.sdk.services.insights.model.TimeRange
classname TimeRange
A server-resolved time window for a query, as an alternative to supplying absolute StartAt/EndAt. Supply either a Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.Preset (e.g. LastWeek, CurrentMonth) or a relative range via Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.From and Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.To. The window is resolved on the server at query time, so a saved query re-runs against a sliding window. Calendar boundaries are anchored in Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.TimeZone (default UTC); weeks start on Monday.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | **String** | A named preset window. One of the Finbourne.Insights.WebApi.Dtos.Querying.TimeRangePreset values. Mutually exclusive with Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.From/Finbourne.Insights.WebApi.Dtos.Querying.TimeRange.To. | [optional] [default to String]
**from** | [**RelativeBoundary**](RelativeBoundary.md) |  | [optional] [default to RelativeBoundary]
**to** | [**RelativeBoundary**](RelativeBoundary.md) |  | [optional] [default to RelativeBoundary]
**timeZone** | **String** | Optional IANA time-zone identifier (e.g. \&quot;Europe/London\&quot;) used to anchor calendar boundaries (start of day/week/month/quarter/year). Defaults to UTC when not supplied. | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.TimeRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String preset = "example preset";
RelativeBoundary from = new RelativeBoundary();
RelativeBoundary to = new RelativeBoundary();
@javax.annotation.Nullable String timeZone = "example timeZone";


TimeRange timeRangeInstance = new TimeRange()
    .preset(preset)
    .from(from)
    .to(to)
    .timeZone(timeZone);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)