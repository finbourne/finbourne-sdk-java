# com.finbourne.sdk.services.lusid.model.EventDateRange
classname EventDateRange
A standard representation of the effective date range for the event, used for display, filtering and windowing use cases.  The start and end values for the eventDateRange are mapped from the particular dates contained within the specific  InstrumentEvent schema.  Note that the start and end values may be identical for some types of events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.EventDateRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime start = OffsetDateTime.now();
OffsetDateTime end = OffsetDateTime.now();


EventDateRange eventDateRangeInstance = new EventDateRange()
    .start(start)
    .end(end);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)