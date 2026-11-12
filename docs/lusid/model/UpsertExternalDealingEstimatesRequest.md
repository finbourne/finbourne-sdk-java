# com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimatesRequest
classname UpsertExternalDealingEstimatesRequest
One dealing point's dealing estimates for the fund named in the route, as a third-party transfer agent sends them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingPoint** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**source** | [**ExternalDealingEstimateSource**](ExternalDealingEstimateSource.md) |  | [default to ExternalDealingEstimateSource]
**complete** | **Boolean** |  | [optional] [default to Boolean]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**lines** | [**Map&lt;String, ExternalDealingEstimateLine&gt;**](ExternalDealingEstimateLine.md) |  | [default to Map<String, ExternalDealingEstimateLine>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimatesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime dealingPoint = OffsetDateTime.now();
ExternalDealingEstimateSource source = new ExternalDealingEstimateSource();
Boolean complete = true;
@javax.annotation.Nullable OffsetDateTime sentAt = OffsetDateTime.now();
Map<String, ExternalDealingEstimateLine> lines = new Map<String, ExternalDealingEstimateLine>();


UpsertExternalDealingEstimatesRequest upsertExternalDealingEstimatesRequestInstance = new UpsertExternalDealingEstimatesRequest()
    .dealingPoint(dealingPoint)
    .source(source)
    .complete(complete)
    .sentAt(sentAt)
    .lines(lines);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)