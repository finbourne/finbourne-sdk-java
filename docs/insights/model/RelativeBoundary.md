# com.finbourne.sdk.services.insights.model.RelativeBoundary
classname RelativeBoundary
One end of a relative time range. Exactly one of the options must be set: Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Now (the current instant), Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Midnight (the start of the current day in the range's time zone), Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Offset (a duration back from now) or Finbourne.Insights.WebApi.Dtos.Querying.RelativeBoundary.Absolute (an explicit instant).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**now** | **Boolean** | When &#x60;true&#x60;, this boundary is the current instant (\&quot;now\&quot;). | [optional] [default to Boolean]
**midnight** | **Boolean** | When &#x60;true&#x60;, this boundary is the start of the current day (midnight) in the range&#39;s time zone. | [optional] [default to Boolean]
**offset** | [**RelativeOffset**](RelativeOffset.md) |  | [optional] [default to RelativeOffset]
**absolute** | [**OffsetDateTime**](OffsetDateTime.md) | An explicit absolute instant. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.insights.model.RelativeBoundary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean now = true;
Boolean midnight = true;
RelativeOffset offset = new RelativeOffset();
@javax.annotation.Nullable OffsetDateTime absolute = OffsetDateTime.now();


RelativeBoundary relativeBoundaryInstance = new RelativeBoundary()
    .now(now)
    .midnight(midnight)
    .offset(offset)
    .absolute(absolute);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)