# com.finbourne.sdk.services.lusid.model.UnsettledTransaction
classname UnsettledTransaction
A transaction that remains unsettled as at the valuation point, with per-bucket settlement status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**portfolioId** | [**PortfolioId**](PortfolioId.md) |  | [optional] [default to PortfolioId]
**overallSettlementStatus** | **String** | The overall settlement status of the transaction (Unsettled, PartSettled, Settled, None). | [optional] [default to String]
**overallIsOverdue** | **Boolean** | Whether the transaction is overdue for settlement. | [optional] [default to Boolean]
**cashSettlementStatus** | **String** | The settlement status of the cash component. | [optional] [default to String]
**cashIsOverdue** | **Boolean** | Whether the cash component is overdue for settlement. | [optional] [default to Boolean]
**stockSettlementStatus** | **String** | The settlement status of the stock component. | [optional] [default to String]
**stockIsOverdue** | **Boolean** | Whether the stock component is overdue for settlement. | [optional] [default to Boolean]
**deferredCashSettlementStatus** | **String** | The settlement status of the deferred cash component. | [optional] [default to String]
**deferredCashIsOverdue** | **Boolean** | Whether the deferred cash component is overdue for settlement. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.UnsettledTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OutputTransaction transaction = new OutputTransaction();
PortfolioId portfolioId = new PortfolioId();
@javax.annotation.Nullable String overallSettlementStatus = "example overallSettlementStatus";
Boolean overallIsOverdue = true;
@javax.annotation.Nullable String cashSettlementStatus = "example cashSettlementStatus";
Boolean cashIsOverdue = true;
@javax.annotation.Nullable String stockSettlementStatus = "example stockSettlementStatus";
Boolean stockIsOverdue = true;
@javax.annotation.Nullable String deferredCashSettlementStatus = "example deferredCashSettlementStatus";
Boolean deferredCashIsOverdue = true;


UnsettledTransaction unsettledTransactionInstance = new UnsettledTransaction()
    .transaction(transaction)
    .portfolioId(portfolioId)
    .overallSettlementStatus(overallSettlementStatus)
    .overallIsOverdue(overallIsOverdue)
    .cashSettlementStatus(cashSettlementStatus)
    .cashIsOverdue(cashIsOverdue)
    .stockSettlementStatus(stockSettlementStatus)
    .stockIsOverdue(stockIsOverdue)
    .deferredCashSettlementStatus(deferredCashSettlementStatus)
    .deferredCashIsOverdue(deferredCashIsOverdue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)