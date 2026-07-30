# com.finbourne.sdk.services.lusid.model.RecMatchCounts
classname RecMatchCounts
Counts for non-exception results (Match, Cross).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byResultType** | [**RecMatchCountByResultType**](RecMatchCountByResultType.md) |  | [default to RecMatchCountByResultType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.sdk.services.lusid.model.RecMatchCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer total = new Integer("100.00");
RecMatchCountByResultType byResultType = new RecMatchCountByResultType();
RecResultCountByReviewStatus byReviewStatus = new RecResultCountByReviewStatus();


RecMatchCounts recMatchCountsInstance = new RecMatchCounts()
    .total(total)
    .byResultType(byResultType)
    .byReviewStatus(byReviewStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)