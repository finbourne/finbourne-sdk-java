# com.finbourne.sdk.services.lusid.model.TransactionSettlementSummary
classname TransactionSettlementSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overallStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**stockStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**cashStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**deferredCashReceiptStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSettlementSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

CategorySettlementStatus overallStatus = new CategorySettlementStatus();
CategorySettlementStatus stockStatus = new CategorySettlementStatus();
CategorySettlementStatus cashStatus = new CategorySettlementStatus();
CategorySettlementStatus deferredCashReceiptStatus = new CategorySettlementStatus();


TransactionSettlementSummary transactionSettlementSummaryInstance = new TransactionSettlementSummary()
    .overallStatus(overallStatus)
    .stockStatus(stockStatus)
    .cashStatus(cashStatus)
    .deferredCashReceiptStatus(deferredCashReceiptStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)