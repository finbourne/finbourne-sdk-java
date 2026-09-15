# com.finbourne.sdk.services.lusid.model.EstimateTransferAgencyOrdersResponse
classname EstimateTransferAgencyOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyOrderEstimateResult&gt;**](TransferAgencyOrderEstimateResult.md) | A dictionary of successfully estimated orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyOrderEstimateResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed estimates, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.EstimateTransferAgencyOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TransferAgencyOrderEstimateResult> successes = new Map<String, TransferAgencyOrderEstimateResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


EstimateTransferAgencyOrdersResponse estimateTransferAgencyOrdersResponseInstance = new EstimateTransferAgencyOrdersResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)