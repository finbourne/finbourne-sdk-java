# com.finbourne.sdk.services.lusid.model.RecClosedExceptionCounts
classname RecClosedExceptionCounts
Counts for results that are exceptions with a Closed status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byClosureType** | [**RecExceptionCountByClosureType**](RecExceptionCountByClosureType.md) |  | [default to RecExceptionCountByClosureType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.sdk.services.lusid.model.RecClosedExceptionCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer total = new Integer("100.00");
RecExceptionCountByClosureType byClosureType = new RecExceptionCountByClosureType();
RecResultCountByReviewStatus byReviewStatus = new RecResultCountByReviewStatus();


RecClosedExceptionCounts recClosedExceptionCountsInstance = new RecClosedExceptionCounts()
    .total(total)
    .byClosureType(byClosureType)
    .byReviewStatus(byReviewStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)