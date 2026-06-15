# com.finbourne.sdk.services.lusid.model.AccountedTransaction
classname AccountedTransaction
The Valuation Point Data Response for the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The transaction&#39;s accounting date. | [optional] [default to OffsetDateTime]
**journalEntryAction** | **String** | The journal entry line action associated with this transaction. | [optional] [default to String]
**transaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**portfolioId** | [**PortfolioId**](PortfolioId.md) |  | [optional] [default to PortfolioId]
**valuationPointOrigin** | **String** | Designates if the transaction was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point, only for transaction added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant, only for transactions added as part of a Complex Close action. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccountedTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime accountingDate = OffsetDateTime.now();
@javax.annotation.Nullable String journalEntryAction = "example journalEntryAction";
OutputTransaction transaction = new OutputTransaction();
PortfolioId portfolioId = new PortfolioId();
@javax.annotation.Nullable String valuationPointOrigin = "example valuationPointOrigin";
@javax.annotation.Nullable String addedOriginValuationPointCode = "example addedOriginValuationPointCode";
@javax.annotation.Nullable String addedOriginValuationPointVariantCode = "example addedOriginValuationPointVariantCode";


AccountedTransaction accountedTransactionInstance = new AccountedTransaction()
    .accountingDate(accountingDate)
    .journalEntryAction(journalEntryAction)
    .transaction(transaction)
    .portfolioId(portfolioId)
    .valuationPointOrigin(valuationPointOrigin)
    .addedOriginValuationPointCode(addedOriginValuationPointCode)
    .addedOriginValuationPointVariantCode(addedOriginValuationPointVariantCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)