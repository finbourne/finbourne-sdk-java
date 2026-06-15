# com.finbourne.sdk.services.lusid.model.ListAggregationReconciliation
classname ListAggregationReconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ListAggregationResponse**](ListAggregationResponse.md) |  | [optional] [default to ListAggregationResponse]
**right** | [**ListAggregationResponse**](ListAggregationResponse.md) |  | [optional] [default to ListAggregationResponse]
**diff** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, Object>>]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]

```java
import com.finbourne.sdk.services.lusid.model.ListAggregationReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ListAggregationResponse left = new ListAggregationResponse();
ListAggregationResponse right = new ListAggregationResponse();
@javax.annotation.Nullable List<Map<String, Object>> diff = new List<Map<String, Object>>();
ResultDataSchema dataSchema = new ResultDataSchema();


ListAggregationReconciliation listAggregationReconciliationInstance = new ListAggregationReconciliation()
    .left(left)
    .right(right)
    .diff(diff)
    .dataSchema(dataSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)