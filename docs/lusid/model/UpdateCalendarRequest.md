# com.finbourne.sdk.services.lusid.model.UpdateCalendarRequest
classname UpdateCalendarRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [default to List<Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateCalendarRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

WeekendMask weekendMask = new WeekendMask();
String sourceProvider = "example sourceProvider";
List<Property> properties = new List<Property>();


UpdateCalendarRequest updateCalendarRequestInstance = new UpdateCalendarRequest()
    .weekendMask(weekendMask)
    .sourceProvider(sourceProvider)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)