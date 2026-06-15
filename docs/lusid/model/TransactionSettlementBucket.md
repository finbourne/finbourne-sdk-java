# com.finbourne.sdk.services.lusid.model.TransactionSettlementBucket
classname TransactionSettlementBucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. Available values: StockSettlement, CashSettlement, DeferredCashReceipt. | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. | [default to String]
**instrumentScope** | **String** | The Scope of the instrument being settled. | [default to String]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date. Used to match the instruction to the correct settlement bucket. | [optional] [default to OffsetDateTime]
**contractedUnits** | **java.math.BigDecimal** | The contracted units. | [optional] [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** | The settled units. | [optional] [default to java.math.BigDecimal]
**unsettledUnits** | **java.math.BigDecimal** | The unsettled units. | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** | The overdue units. | [optional] [default to java.math.BigDecimal]
**configuredSettlement** | **String** | The effective method of settlement for the settlement bucket. This reflects any transaction-level settlement method overrides, falling back to the portfolio&#39;s SettlementConfiguration if no override applies. Available values: Automatic, Instructed, NotApplicable. | [optional] [default to String]
**status** | **String** | The Status of the settlement bucket - &#39;Settled&#39;, &#39;Part Settled&#39; or &#39;Unsettled&#39;. Available values: Unsettled, PartSettled, Settled, None. | [default to String]
**settlementInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | The settlement instructions received for this settlement bucket. | [optional] [default to List<TransactionSettlementInstruction>]
**movements** | [**List&lt;TransactionSettlementMovement&gt;**](TransactionSettlementMovement.md) | The movements for the settlement bucket. | [optional] [default to List<TransactionSettlementMovement>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSettlementBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String settlementCategory = "example settlementCategory";
String lusidInstrumentId = "example lusidInstrumentId";
String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable OffsetDateTime contractualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal contractedUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal settledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal unsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal overdueUnits = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String configuredSettlement = "example configuredSettlement";
String status = "example status";
@javax.annotation.Nullable List<TransactionSettlementInstruction> settlementInstructions = new List<TransactionSettlementInstruction>();
@javax.annotation.Nullable List<TransactionSettlementMovement> movements = new List<TransactionSettlementMovement>();


TransactionSettlementBucket transactionSettlementBucketInstance = new TransactionSettlementBucket()
    .settlementCategory(settlementCategory)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .contractualSettlementDate(contractualSettlementDate)
    .contractedUnits(contractedUnits)
    .settledUnits(settledUnits)
    .unsettledUnits(unsettledUnits)
    .overdueUnits(overdueUnits)
    .configuredSettlement(configuredSettlement)
    .status(status)
    .settlementInstructions(settlementInstructions)
    .movements(movements);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)