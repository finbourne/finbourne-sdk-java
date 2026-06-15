# com.finbourne.sdk.services.lusid.model.DateRange
classname DateRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.DateRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime fromDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime untilDate = OffsetDateTime.now();


DateRange dateRangeInstance = new DateRange()
    .fromDate(fromDate)
    .untilDate(untilDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)