# com.finbourne.sdk.services.lusid.model.QueryTradeTicketsRequest
classname QueryTradeTicketsRequest
Query for tradetickets resulting from events on instrument that are taken from one or more portfolios

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for tradetickets. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date used in the valuation of the tradetickets. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.QueryTradeTicketsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
ResourceId recipeId = new ResourceId();
OffsetDateTime effectiveAt = OffsetDateTime.now();


QueryTradeTicketsRequest queryTradeTicketsRequestInstance = new QueryTradeTicketsRequest()
    .asAt(asAt)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .portfolioEntityIds(portfolioEntityIds)
    .recipeId(recipeId)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)