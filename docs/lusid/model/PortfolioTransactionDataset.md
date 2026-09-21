# com.finbourne.sdk.services.lusid.model.PortfolioTransactionDataset
classname PortfolioTransactionDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"PortfolioContents\" and datasetSchema.entityType = \"Transaction\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**fromEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The earliest transaction date to check, inclusive. Nullable. Unbounded if not provided. | [optional] [default to OffsetDateTime]
**toEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The latest transaction date to check, inclusive. Nullable — the window is unbounded above if not  provided. This value also resolves as the run&#39;s effectiveAt, so portfolios are resolved and transactions  decorated as of it; when not provided, that defaults to latest. Must be on or after fromEffectiveDate  when both are provided. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | The scope of the portfolios whose transactions to check. Nullable. Every scope is checked if not provided. | [optional] [default to String]
**portfolioSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the portfolios whose transactions are  checked. Cannot be provided without portfolioSelectorValue, and vice versa. | [optional] [default to String]
**portfolioSelectorValue** | **String** | The value of the above attribute used to narrow down the portfolios. Cannot be provided without  portfolioSelectorAttribute, and vice versa. | [optional] [default to String]
**transactionSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the transactions checked within those  portfolios. Cannot be provided without transactionSelectorValue, and vice versa. | [optional] [default to String]
**transactionSelectorValue** | **String** | The value of the above attribute used to narrow down the transactions. Cannot be provided without  transactionSelectorAttribute, and vice versa. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioTransactionDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime fromEffectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime toEffectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable String portfolioScope = "example portfolioScope";
@javax.annotation.Nullable String portfolioSelectorAttribute = "example portfolioSelectorAttribute";
@javax.annotation.Nullable String portfolioSelectorValue = "example portfolioSelectorValue";
@javax.annotation.Nullable String transactionSelectorAttribute = "example transactionSelectorAttribute";
@javax.annotation.Nullable String transactionSelectorValue = "example transactionSelectorValue";


PortfolioTransactionDataset portfolioTransactionDatasetInstance = new PortfolioTransactionDataset()
    .asAt(asAt)
    .fromEffectiveDate(fromEffectiveDate)
    .toEffectiveDate(toEffectiveDate)
    .portfolioScope(portfolioScope)
    .portfolioSelectorAttribute(portfolioSelectorAttribute)
    .portfolioSelectorValue(portfolioSelectorValue)
    .transactionSelectorAttribute(transactionSelectorAttribute)
    .transactionSelectorValue(transactionSelectorValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)