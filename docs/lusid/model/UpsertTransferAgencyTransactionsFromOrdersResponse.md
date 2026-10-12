# com.finbourne.sdk.services.lusid.model.UpsertTransferAgencyTransactionsFromOrdersResponse
classname UpsertTransferAgencyTransactionsFromOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyTransactionFromOrderResult&gt;**](TransferAgencyTransactionFromOrderResult.md) | A dictionary of successfully priced orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyTransactionFromOrderResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed order pricing attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTransferAgencyTransactionsFromOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TransferAgencyTransactionFromOrderResult> successes = new Map<String, TransferAgencyTransactionFromOrderResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertTransferAgencyTransactionsFromOrdersResponse upsertTransferAgencyTransactionsFromOrdersResponseInstance = new UpsertTransferAgencyTransactionsFromOrdersResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)