# com.finbourne.sdk.services.workflow.model.YearRegularity
classname YearRegularity
Year Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dates** | [**List&lt;DayOfYear&gt;**](DayOfYear.md) | The dates in the year | [default to List<DayOfYear>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.YearRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<DayOfYear> dates = new List<DayOfYear>();
String type = "example type";


YearRegularity yearRegularityInstance = new YearRegularity()
    .dates(dates)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)