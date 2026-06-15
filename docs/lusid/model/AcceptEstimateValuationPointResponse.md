# com.finbourne.sdk.services.lusid.model.AcceptEstimateValuationPointResponse
classname AcceptEstimateValuationPointResponse
The Valuation Point Data Response for AcceptEstimate called on the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**candidateValuationPoint** | [**ValuationPointDataResponse**](ValuationPointDataResponse.md) |  | [default to ValuationPointDataResponse]
**latestValuationPoint** | [**ValuationPointDataResponse**](ValuationPointDataResponse.md) |  | [optional] [default to ValuationPointDataResponse]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AcceptEstimateValuationPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ValuationPointDataResponse candidateValuationPoint = new ValuationPointDataResponse();
ValuationPointDataResponse latestValuationPoint = new ValuationPointDataResponse();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AcceptEstimateValuationPointResponse acceptEstimateValuationPointResponseInstance = new AcceptEstimateValuationPointResponse()
    .href(href)
    .candidateValuationPoint(candidateValuationPoint)
    .latestValuationPoint(latestValuationPoint)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)