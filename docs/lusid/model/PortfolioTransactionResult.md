# com.finbourne.sdk.services.lusid.model.PortfolioTransactionResult
classname PortfolioTransactionResult
Represents transaction details for a data quality check result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. Always \&quot;Transaction\&quot;. | [optional] [default to String]
**transactionView** | **String** | Whether this is an input or an output transaction | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the transaction | [optional] [default to OffsetDateTime]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The transaction date | [optional] [default to OffsetDateTime]
**transactionId** | **String** | The transaction&#39;s identifier within its portfolio | [optional] [default to String]
**entityUniqueId** | **String** | The transaction&#39;s unique identifier across portfolios | [optional] [default to String]
**sourcePortfolioScope** | **String** | The scope of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioCode** | **String** | The code of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioEntityUniqueId** | **String** | The unique identifier of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioDisplayName** | **String** | The display name of the portfolio this transaction came from | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the instrument transacted | [optional] [default to String]
**instrumentDisplayName** | **String** | The name of the instrument transacted | [optional] [default to String]
**transactionType** | **String** | The transaction type, e.g. Buy, Sell | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioTransactionResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable String transactionView = "example transactionView";
OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime transactionDate = OffsetDateTime.now();
@javax.annotation.Nullable String transactionId = "example transactionId";
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable String sourcePortfolioScope = "example sourcePortfolioScope";
@javax.annotation.Nullable String sourcePortfolioCode = "example sourcePortfolioCode";
@javax.annotation.Nullable String sourcePortfolioEntityUniqueId = "example sourcePortfolioEntityUniqueId";
@javax.annotation.Nullable String sourcePortfolioDisplayName = "example sourcePortfolioDisplayName";
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentDisplayName = "example instrumentDisplayName";
@javax.annotation.Nullable String transactionType = "example transactionType";


PortfolioTransactionResult portfolioTransactionResultInstance = new PortfolioTransactionResult()
    .entityType(entityType)
    .transactionView(transactionView)
    .asAt(asAt)
    .transactionDate(transactionDate)
    .transactionId(transactionId)
    .entityUniqueId(entityUniqueId)
    .sourcePortfolioScope(sourcePortfolioScope)
    .sourcePortfolioCode(sourcePortfolioCode)
    .sourcePortfolioEntityUniqueId(sourcePortfolioEntityUniqueId)
    .sourcePortfolioDisplayName(sourcePortfolioDisplayName)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentDisplayName(instrumentDisplayName)
    .transactionType(transactionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)