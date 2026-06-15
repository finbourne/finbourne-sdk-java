# com.finbourne.sdk.services.lusid.model.AggregatedTransactionsRequest
classname AggregatedTransactionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolio or portfolio group identifiers containing the relevant transactions. | [optional] [default to List<PortfolioEntityId>]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) |  | [default to List<AggregateSpec>]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) |  | [optional] [default to List<PropertyFilter>]
**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) |  | [optional] [default to List<OrderBySpec>]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime fromTransactionDate = OffsetDateTime.now();
OffsetDateTime toTransactionDate = OffsetDateTime.now();
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
List<AggregateSpec> metrics = new List<AggregateSpec>();
@javax.annotation.Nullable List<String> groupBy = new List<String>();
@javax.annotation.Nullable List<PropertyFilter> filters = new List<PropertyFilter>();
@javax.annotation.Nullable List<OrderBySpec> sort = new List<OrderBySpec>();


AggregatedTransactionsRequest aggregatedTransactionsRequestInstance = new AggregatedTransactionsRequest()
    .fromTransactionDate(fromTransactionDate)
    .toTransactionDate(toTransactionDate)
    .portfolioId(portfolioId)
    .portfolioEntityIds(portfolioEntityIds)
    .asAt(asAt)
    .metrics(metrics)
    .groupBy(groupBy)
    .filters(filters)
    .sort(sort);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)