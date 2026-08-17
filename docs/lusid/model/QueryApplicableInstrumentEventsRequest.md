# com.finbourne.sdk.services.lusid.model.QueryApplicableInstrumentEventsRequest
classname QueryApplicableInstrumentEventsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date that splits query window into two parts: factual period and forecast period. Optional - a timeline (with an optional closed period) may be supplied instead to derive the effective date. | [optional] [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**forecastingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**timelineScope** | **String** | The scope of the timeline to be used when building the instrument events. | [optional] [default to String]
**timelineCode** | **String** | The code of the timeline to be used when building the instrument events. This can optionally include a colon, followed by the Closed Period Id to use at the head of the timeline, for a timeline with unconfirmed periods. | [optional] [default to String]
**closedPeriodId** | **String** | The id of the closed period, on the given timeline, to be used when building the instrument events. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QueryApplicableInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
ResourceId forecastingRecipeId = new ResourceId();
@javax.annotation.Nullable String timelineScope = "example timelineScope";
@javax.annotation.Nullable String timelineCode = "example timelineCode";
@javax.annotation.Nullable String closedPeriodId = "example closedPeriodId";


QueryApplicableInstrumentEventsRequest queryApplicableInstrumentEventsRequestInstance = new QueryApplicableInstrumentEventsRequest()
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .effectiveAt(effectiveAt)
    .portfolioEntityIds(portfolioEntityIds)
    .forecastingRecipeId(forecastingRecipeId)
    .timelineScope(timelineScope)
    .timelineCode(timelineCode)
    .closedPeriodId(closedPeriodId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)