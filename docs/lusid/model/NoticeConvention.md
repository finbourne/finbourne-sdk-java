# com.finbourne.sdk.services.lusid.model.NoticeConvention
classname NoticeConvention
Defines the notice period by which a cancellation election must be made ahead of the  cancel effective date, else the option lapses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendars** | **List&lt;String&gt;** | Holiday calendar code(s) used to resolve business days, required when the day type is Business. | [optional] [default to List<String>]
**dayType** | **String** | Indicates whether the notice days are counted using business days or calendar days.                Supported string (enumeration) values are: [Business, Calendar]. Available values: Business, Calendar. | [default to String]
**noticeDays** | **Integer** | The number of days prior to the cancel effective date by which the election must be made.                Defaults to 2 if not set. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.NoticeConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> calendars = new List<String>();
String dayType = "example dayType";
Integer noticeDays = new Integer("100.00");


NoticeConvention noticeConventionInstance = new NoticeConvention()
    .calendars(calendars)
    .dayType(dayType)
    .noticeDays(noticeDays);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)