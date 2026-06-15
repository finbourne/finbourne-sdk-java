# com.finbourne.sdk.services.workflow.model.WeekRegularity
classname WeekRegularity
Week Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Week Regularity. For example, a value of 2 indicates every 2 weeks | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week. One or more of - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday | [default to List<String>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.WeekRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer frequency = new Integer("100.00");
List<String> daysOfWeek = new List<String>();
String type = "example type";


WeekRegularity weekRegularityInstance = new WeekRegularity()
    .frequency(frequency)
    .daysOfWeek(daysOfWeek)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)