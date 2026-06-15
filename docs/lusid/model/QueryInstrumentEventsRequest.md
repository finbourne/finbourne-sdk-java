# com.finbourne.sdk.services.lusid.model.QueryInstrumentEventsRequest
classname QueryInstrumentEventsRequest
Instrument event query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date used in the valuation of the cashflows. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**filterInstrumentEvents** | **String** | Expression to filter the result set. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QueryInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime effectiveAt = OffsetDateTime.now();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String filterInstrumentEvents = "example filterInstrumentEvents";


QueryInstrumentEventsRequest queryInstrumentEventsRequestInstance = new QueryInstrumentEventsRequest()
    .asAt(asAt)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .portfolioEntityIds(portfolioEntityIds)
    .effectiveAt(effectiveAt)
    .recipeId(recipeId)
    .filterInstrumentEvents(filterInstrumentEvents);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)