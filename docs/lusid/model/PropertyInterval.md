# com.finbourne.sdk.services.lusid.model.PropertyInterval
classname PropertyInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**PropertyValue**](PropertyValue.md) |  | [default to PropertyValue]
**effectiveRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**asAtRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**status** | **String** | Indicates whether the value is part of the prevailing effective date timeline for the requested asAt date, or whether it has been superseded by correctional activity | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PropertyInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

PropertyValue value = new PropertyValue();
DateRange effectiveRange = new DateRange();
DateRange asAtRange = new DateRange();
String status = "example status";


PropertyInterval propertyIntervalInstance = new PropertyInterval()
    .value(value)
    .effectiveRange(effectiveRange)
    .asAtRange(asAtRange)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)