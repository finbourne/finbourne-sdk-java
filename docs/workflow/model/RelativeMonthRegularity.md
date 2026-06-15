# com.finbourne.sdk.services.workflow.model.RelativeMonthRegularity
classname RelativeMonthRegularity
Relative Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Relative Month Regularity. For example, a value of 2 indicates every 2 months | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week. One or more of - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday | [default to List<String>]
**index** | **String** | Relative index in the month. One of - First, Second, Third, Fourth, Last. For example, to specify the second Tuesday of every month, set DaysOfWeek to [\&quot;Tuesday\&quot;] and Index to \&quot;Second\&quot; | [default to String]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.RelativeMonthRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer frequency = new Integer("100.00");
List<String> daysOfWeek = new List<String>();
String index = "example index";
String type = "example type";


RelativeMonthRegularity relativeMonthRegularityInstance = new RelativeMonthRegularity()
    .frequency(frequency)
    .daysOfWeek(daysOfWeek)
    .index(index)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)