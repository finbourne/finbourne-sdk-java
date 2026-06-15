# com.finbourne.sdk.services.workflow.model.SpecificMonthRegularity
classname SpecificMonthRegularity
Specific Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Specific Month Regularity. For example, a value of 2 indicates every 2 months | [default to Integer]
**daysOfMonth** | **List&lt;Integer&gt;** | Days of the month. For example, to specify the 1st and 15th of every month, set DaysOfMonth to [1, 15] | [default to List<Integer>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.SpecificMonthRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer frequency = new Integer("100.00");
List<Integer> daysOfMonth = new List<Integer>();
String type = "example type";


SpecificMonthRegularity specificMonthRegularityInstance = new SpecificMonthRegularity()
    .frequency(frequency)
    .daysOfMonth(daysOfMonth)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)