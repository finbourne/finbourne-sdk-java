# com.finbourne.sdk.services.horizon.model.TpfTransactionSearchRequest
classname TpfTransactionSearchRequest
Request body for the POST transaction-search endpoint. Multiple values in TransactionIds and InstrumentIdentifiers are OR'd within each filter; both filters together are AND'd.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIds** | **List&lt;String&gt;** | One or more LUSID transaction IDs to search for (max 50). Values are OR&#39;d. | [optional] [default to List<String>]
**instrumentIdentifiers** | **List&lt;String&gt;** | One or more instrument identifiers in any supported format (ISIN, CUSIP, LUID, etc.) to search for (max 50). Values are OR&#39;d. | [optional] [default to List<String>]
**instanceId** | **String** | Instance ID to filter by. Omit or leave null to search all instances the caller has access to. | [optional] [default to String]
**from** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the date range (inclusive). Defaults to 30 days ago if neither From nor To is provided. | [optional] [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) | End of the date range (inclusive). Defaults to now if not provided. | [optional] [default to OffsetDateTime]
**limit** | **Integer** | Maximum number of results to return per page. | [optional] [default to Integer]
**page** | **String** | Pagination token from a previous response NextPage or PreviousPage. Omit for the first page. | [optional] [default to String]
**status** | **String** | Publication status to filter by. Valid values: Sent, Skipped, Failed. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TpfTransactionSearchRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> transactionIds = new List<String>();
@javax.annotation.Nullable List<String> instrumentIdentifiers = new List<String>();
@javax.annotation.Nullable String instanceId = "example instanceId";
@javax.annotation.Nullable OffsetDateTime from = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime to = OffsetDateTime.now();
@javax.annotation.Nullable Integer limit = new Integer("100.00");
@javax.annotation.Nullable String page = "example page";
@javax.annotation.Nullable String status = "example status";


TpfTransactionSearchRequest tpfTransactionSearchRequestInstance = new TpfTransactionSearchRequest()
    .transactionIds(transactionIds)
    .instrumentIdentifiers(instrumentIdentifiers)
    .instanceId(instanceId)
    .from(from)
    .to(to)
    .limit(limit)
    .page(page)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)