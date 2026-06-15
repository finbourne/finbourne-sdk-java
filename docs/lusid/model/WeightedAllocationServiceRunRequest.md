# com.finbourne.sdk.services.lusid.model.WeightedAllocationServiceRunRequest
classname WeightedAllocationServiceRunRequest
The request body for the RunAllocationServiceWithWeights endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The set of Placement IDs to allocate. | [default to List<ResourceId>]
**portfolioWeights** | [**List&lt;PortfolioWeight&gt;**](PortfolioWeight.md) | The set of Portfolios and their associated weights to use for allocation. | [optional] [default to List<PortfolioWeight>]

```java
import com.finbourne.sdk.services.lusid.model.WeightedAllocationServiceRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> placementIds = new List<ResourceId>();
@javax.annotation.Nullable List<PortfolioWeight> portfolioWeights = new List<PortfolioWeight>();


WeightedAllocationServiceRunRequest weightedAllocationServiceRunRequestInstance = new WeightedAllocationServiceRunRequest()
    .placementIds(placementIds)
    .portfolioWeights(portfolioWeights);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)