# com.finbourne.sdk.services.lusid.model.CancelTransferAgencyTransactionsResponse
classname CancelTransferAgencyTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyTransactionCancellationResult&gt;**](TransferAgencyTransactionCancellationResult.md) | A dictionary of successfully un-priced orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyTransactionCancellationResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed un-pricing attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CancelTransferAgencyTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TransferAgencyTransactionCancellationResult> successes = new Map<String, TransferAgencyTransactionCancellationResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CancelTransferAgencyTransactionsResponse cancelTransferAgencyTransactionsResponseInstance = new CancelTransferAgencyTransactionsResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)