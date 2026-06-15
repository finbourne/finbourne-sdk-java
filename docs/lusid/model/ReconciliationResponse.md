# com.finbourne.sdk.services.lusid.model.ReconciliationResponse
classname ReconciliationResponse
Class representing the set of comparisons that result from comparing holdings and their valuations between two separate evaluations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisons** | [**List&lt;ReconciliationLine&gt;**](ReconciliationLine.md) | List of comparisons of left to right hand sides. | [optional] [default to List<ReconciliationLine>]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ReconciliationLine> comparisons = new List<ReconciliationLine>();
ResultDataSchema dataSchema = new ResultDataSchema();


ReconciliationResponse reconciliationResponseInstance = new ReconciliationResponse()
    .comparisons(comparisons)
    .dataSchema(dataSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)