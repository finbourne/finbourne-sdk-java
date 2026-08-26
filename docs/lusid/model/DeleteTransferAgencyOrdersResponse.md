# com.finbourne.sdk.services.lusid.model.DeleteTransferAgencyOrdersResponse
classname DeleteTransferAgencyOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, DeleteTransferAgencyOrderResult&gt;**](DeleteTransferAgencyOrderResult.md) | A dictionary of successfully deleted orders, keyed by the request key. | [optional] [default to Map<String, DeleteTransferAgencyOrderResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed order deletion attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteTransferAgencyOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, DeleteTransferAgencyOrderResult> successes = new Map<String, DeleteTransferAgencyOrderResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteTransferAgencyOrdersResponse deleteTransferAgencyOrdersResponseInstance = new DeleteTransferAgencyOrdersResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)