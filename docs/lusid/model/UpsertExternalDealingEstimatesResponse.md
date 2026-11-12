# com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimatesResponse
classname UpsertExternalDealingEstimatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, UpsertExternalDealingEstimateResult&gt;**](UpsertExternalDealingEstimateResult.md) | A dictionary of successfully loaded sets, keyed by the request key. | [optional] [default to Map<String, UpsertExternalDealingEstimateResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of sets that could not be loaded, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertExternalDealingEstimatesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, UpsertExternalDealingEstimateResult> successes = new Map<String, UpsertExternalDealingEstimateResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertExternalDealingEstimatesResponse upsertExternalDealingEstimatesResponseInstance = new UpsertExternalDealingEstimatesResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)