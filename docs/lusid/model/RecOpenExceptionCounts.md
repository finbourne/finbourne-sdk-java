# com.finbourne.sdk.services.lusid.model.RecOpenExceptionCounts
classname RecOpenExceptionCounts
Counts for results that are exceptions with an Open status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byResultType** | [**RecExceptionCountByResultType**](RecExceptionCountByResultType.md) |  | [default to RecExceptionCountByResultType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.sdk.services.lusid.model.RecOpenExceptionCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer total = new Integer("100.00");
RecExceptionCountByResultType byResultType = new RecExceptionCountByResultType();
RecResultCountByReviewStatus byReviewStatus = new RecResultCountByReviewStatus();


RecOpenExceptionCounts recOpenExceptionCountsInstance = new RecOpenExceptionCounts()
    .total(total)
    .byResultType(byResultType)
    .byReviewStatus(byReviewStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)