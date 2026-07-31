# com.finbourne.sdk.services.insights.model.RelativeOffset
classname RelativeOffset
A relative offset back from \"now\", e.g. `{ Amount = 2, Unit = Hours }` meaning two hours before now.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | The number of units to go back from now. Must be at least 1. | [default to Integer]
**unit** | **String** | The unit of the offset. One of the Finbourne.Insights.WebApi.Dtos.Querying.RelativeTimeUnit values. | [default to String]

```java
import com.finbourne.sdk.services.insights.model.RelativeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer amount = new Integer("100.00");
String unit = "example unit";


RelativeOffset relativeOffsetInstance = new RelativeOffset()
    .amount(amount)
    .unit(unit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)