# com.finbourne.sdk.services.lusid.model.CreateCalendarRequest
classname CreateCalendarRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**calendarType** | **String** |  | [default to String]
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [optional] [default to List<Property>]

```java
import com.finbourne.sdk.services.lusid.model.CreateCalendarRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId calendarId = new ResourceId();
String calendarType = "example calendarType";
WeekendMask weekendMask = new WeekendMask();
String sourceProvider = "example sourceProvider";
@javax.annotation.Nullable List<Property> properties = new List<Property>();


CreateCalendarRequest createCalendarRequestInstance = new CreateCalendarRequest()
    .calendarId(calendarId)
    .calendarType(calendarType)
    .weekendMask(weekendMask)
    .sourceProvider(sourceProvider)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)