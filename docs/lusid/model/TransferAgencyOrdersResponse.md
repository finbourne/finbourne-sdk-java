# com.finbourne.sdk.services.lusid.model.TransferAgencyOrdersResponse
classname TransferAgencyOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyOrderResult&gt;**](TransferAgencyOrderResult.md) | A dictionary of successfully processed orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyOrderResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed order processing attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TransferAgencyOrderResult> successes = new Map<String, TransferAgencyOrderResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransferAgencyOrdersResponse transferAgencyOrdersResponseInstance = new TransferAgencyOrdersResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)