# com.finbourne.sdk.services.horizon.model.Trigger
classname Trigger
Response defining a trigger for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**cronExpression** | **String** |  | [default to String]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.Trigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String cronExpression = "example cronExpression";
String timeZone = "example timeZone";


Trigger triggerInstance = new Trigger()
    .type(type)
    .cronExpression(cronExpression)
    .timeZone(timeZone);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)