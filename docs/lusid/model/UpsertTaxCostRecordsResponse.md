# com.finbourne.sdk.services.lusid.model.UpsertTaxCostRecordsResponse
classname UpsertTaxCostRecordsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TaxCostRecord&gt;**](TaxCostRecord.md) | The Tax Cost Records that were successfully upserted, keyed by the code supplied in the request. | [optional] [default to Map<String, TaxCostRecord>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The Tax Cost Records that failed to upsert, keyed by the code supplied in the request, with the reason for each failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTaxCostRecordsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TaxCostRecord> successes = new Map<String, TaxCostRecord>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertTaxCostRecordsResponse upsertTaxCostRecordsResponseInstance = new UpsertTaxCostRecordsResponse()
    .successes(successes)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)