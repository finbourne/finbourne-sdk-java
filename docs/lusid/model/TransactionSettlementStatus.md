# com.finbourne.sdk.services.lusid.model.TransactionSettlementStatus
classname TransactionSettlementStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | [default to String]
**settlementBuckets** | [**List&lt;TransactionSettlementBucket&gt;**](TransactionSettlementBucket.md) | The transaction&#39;s external movements (ie: with SettlementMode&#x3D;External) are grouped into buckets with each bucket uniquely defined by the combination of SettlementCategory, LusidInstrumentId, InstrumentScope and ContractualSettlementDate. | [optional] [default to List<TransactionSettlementBucket>]
**invalidInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | Invalid settlement instructions where the referenced transaction exists but the settlement bucket implied by the settlement instruction does not exist. | [optional] [default to List<TransactionSettlementInstruction>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSettlementStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
@javax.annotation.Nullable List<TransactionSettlementBucket> settlementBuckets = new List<TransactionSettlementBucket>();
@javax.annotation.Nullable List<TransactionSettlementInstruction> invalidInstructions = new List<TransactionSettlementInstruction>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionSettlementStatus transactionSettlementStatusInstance = new TransactionSettlementStatus()
    .transactionId(transactionId)
    .settlementBuckets(settlementBuckets)
    .invalidInstructions(invalidInstructions)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)