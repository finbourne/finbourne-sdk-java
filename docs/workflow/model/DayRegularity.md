# com.finbourne.sdk.services.workflow.model.DayRegularity
classname DayRegularity
Day Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Day Regularity. For example, a value of 2 indicates every 2 days | [default to Integer]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.DayRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer frequency = new Integer("100.00");
String type = "example type";


DayRegularity dayRegularityInstance = new DayRegularity()
    .frequency(frequency)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)