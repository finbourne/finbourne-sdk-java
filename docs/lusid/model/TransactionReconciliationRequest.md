# com.finbourne.sdk.services.lusid.model.TransactionReconciliationRequest
classname TransactionReconciliationRequest
Specifies the parameter to be use when performing a Transaction Reconciliation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**rightPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fromTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**propertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId leftPortfolioId = new ResourceId();
ResourceId rightPortfolioId = new ResourceId();
ResourceId mappingId = new ResourceId();
OffsetDateTime fromTransactionDate = OffsetDateTime.now();
OffsetDateTime toTransactionDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable List<String> propertyKeys = new List<String>();


TransactionReconciliationRequest transactionReconciliationRequestInstance = new TransactionReconciliationRequest()
    .leftPortfolioId(leftPortfolioId)
    .rightPortfolioId(rightPortfolioId)
    .mappingId(mappingId)
    .fromTransactionDate(fromTransactionDate)
    .toTransactionDate(toTransactionDate)
    .asAt(asAt)
    .propertyKeys(propertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)