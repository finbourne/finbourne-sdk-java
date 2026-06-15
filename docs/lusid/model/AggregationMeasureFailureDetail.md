# com.finbourne.sdk.services.lusid.model.AggregationMeasureFailureDetail
classname AggregationMeasureFailureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**measure** | **String** |  | [optional] [default to String]
**reason** | **String** |  | [optional] [default to String]
**detail** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregationMeasureFailureDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String measure = "example measure";
@javax.annotation.Nullable String reason = "example reason";
@javax.annotation.Nullable String detail = "example detail";


AggregationMeasureFailureDetail aggregationMeasureFailureDetailInstance = new AggregationMeasureFailureDetail()
    .id(id)
    .effectiveAt(effectiveAt)
    .measure(measure)
    .reason(reason)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)