# com.finbourne.sdk.services.lusid.model.DayMonth
classname DayMonth

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**day** | **Integer** | Day part of Day, Month for Year End date specification. | [default to Integer]
**month** | **Integer** | Month part of Day, Month for Year End date specification. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.DayMonth;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer day = new Integer("100.00");
Integer month = new Integer("100.00");


DayMonth dayMonthInstance = new DayMonth()
    .day(day)
    .month(month);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)