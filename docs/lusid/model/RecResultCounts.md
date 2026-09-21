# com.finbourne.sdk.services.lusid.model.RecResultCounts
classname RecResultCounts
Counts of results broken down by the structural categories that align with the review configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this result set, across all categories. | [default to Integer]
**openExceptions** | [**RecOpenExceptionCounts**](RecOpenExceptionCounts.md) |  | [default to RecOpenExceptionCounts]
**closedExceptions** | [**RecClosedExceptionCounts**](RecClosedExceptionCounts.md) |  | [default to RecClosedExceptionCounts]
**matches** | [**RecMatchCounts**](RecMatchCounts.md) |  | [default to RecMatchCounts]

```java
import com.finbourne.sdk.services.lusid.model.RecResultCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer total = new Integer("100.00");
RecOpenExceptionCounts openExceptions = new RecOpenExceptionCounts();
RecClosedExceptionCounts closedExceptions = new RecClosedExceptionCounts();
RecMatchCounts matches = new RecMatchCounts();


RecResultCounts recResultCountsInstance = new RecResultCounts()
    .total(total)
    .openExceptions(openExceptions)
    .closedExceptions(closedExceptions)
    .matches(matches);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)