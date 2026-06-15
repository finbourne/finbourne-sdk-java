# com.finbourne.sdk.services.lusid.model.QueryApplicableInstrumentEventsRequest
classname QueryApplicableInstrumentEventsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date that splits query window into two parts: factual period and forecast period | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**forecastingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.QueryApplicableInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
OffsetDateTime effectiveAt = OffsetDateTime.now();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
ResourceId forecastingRecipeId = new ResourceId();


QueryApplicableInstrumentEventsRequest queryApplicableInstrumentEventsRequestInstance = new QueryApplicableInstrumentEventsRequest()
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .effectiveAt(effectiveAt)
    .portfolioEntityIds(portfolioEntityIds)
    .forecastingRecipeId(forecastingRecipeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)