# com.finbourne.sdk.services.workflow.model.SpecifiedTime
classname SpecifiedTime
A specified time in the day

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hours** | **Integer** | Hours | [default to Integer]
**minutes** | **Integer** | Minutes | [default to Integer]
**type** | **String** | The type of Time of Day | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.SpecifiedTime;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer hours = new Integer("100.00");
Integer minutes = new Integer("100.00");
String type = "example type";


SpecifiedTime specifiedTimeInstance = new SpecifiedTime()
    .hours(hours)
    .minutes(minutes)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)