# com.finbourne.sdk.services.lusid.model.BatchUpsertTransactionSettlementInstructionResponse
classname BatchUpsertTransactionSettlementInstructionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | The settlement instructions which have been successfully upserted. | [optional] [default to Map<String, TransactionSettlementInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The request ids of the settlement instructions which could not be upserted, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertTransactionSettlementInstructionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, TransactionSettlementInstruction> values = new Map<String, TransactionSettlementInstruction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertTransactionSettlementInstructionResponse batchUpsertTransactionSettlementInstructionResponseInstance = new BatchUpsertTransactionSettlementInstructionResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)