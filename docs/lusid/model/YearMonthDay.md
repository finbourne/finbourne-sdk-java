# com.finbourne.sdk.services.lusid.model.YearMonthDay
classname YearMonthDay
A date in component form.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Integer** | The year of the date. | [default to Integer]
**month** | **Integer** | The month of the date. | [default to Integer]
**day** | **Integer** | The day in month of the date. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.YearMonthDay;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer year = new Integer("100.00");
Integer month = new Integer("100.00");
Integer day = new Integer("100.00");


YearMonthDay yearMonthDayInstance = new YearMonthDay()
    .year(year)
    .month(month)
    .day(day);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)