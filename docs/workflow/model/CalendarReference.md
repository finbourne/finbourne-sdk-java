# com.finbourne.sdk.services.workflow.model.CalendarReference
classname CalendarReference
Reference to a Calendar in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the Calendar | [default to String]
**code** | **String** | The code of the Calendar | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.CalendarReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";


CalendarReference calendarReferenceInstance = new CalendarReference()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)