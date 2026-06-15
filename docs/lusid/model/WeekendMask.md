# com.finbourne.sdk.services.lusid.model.WeekendMask
classname WeekendMask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | [**List&lt;DayOfWeek&gt;**](DayOfWeek.md) |  | [default to List<DayOfWeek>]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WeekendMask;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<DayOfWeek> days = new List<DayOfWeek>();
String timeZone = "example timeZone";


WeekendMask weekendMaskInstance = new WeekendMask()
    .days(days)
    .timeZone(timeZone);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)