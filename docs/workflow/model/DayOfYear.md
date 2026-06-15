# com.finbourne.sdk.services.workflow.model.DayOfYear
classname DayOfYear
A day in the year

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**month** | **Integer** | Month in the year | [default to Integer]
**day** | **Integer** | Day in the month | [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.DayOfYear;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer month = new Integer("100.00");
Integer day = new Integer("100.00");


DayOfYear dayOfYearInstance = new DayOfYear()
    .month(month)
    .day(day);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)