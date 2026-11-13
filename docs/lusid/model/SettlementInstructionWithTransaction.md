# com.finbourne.sdk.services.lusid.model.SettlementInstructionWithTransaction
classname SettlementInstructionWithTransaction
A Settlement Instruction with its Matched Transaction (if any)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstruction** | [**TransactionSettlementInstruction**](TransactionSettlementInstruction.md) |  | [optional] [default to TransactionSettlementInstruction]
**matchedTransaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**settlementFx** | [**SettlementFx**](SettlementFx.md) |  | [optional] [default to SettlementFx]

```java
import com.finbourne.sdk.services.lusid.model.SettlementInstructionWithTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

TransactionSettlementInstruction settlementInstruction = new TransactionSettlementInstruction();
OutputTransaction matchedTransaction = new OutputTransaction();
SettlementFx settlementFx = new SettlementFx();


SettlementInstructionWithTransaction settlementInstructionWithTransactionInstance = new SettlementInstructionWithTransaction()
    .settlementInstruction(settlementInstruction)
    .matchedTransaction(matchedTransaction)
    .settlementFx(settlementFx);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)