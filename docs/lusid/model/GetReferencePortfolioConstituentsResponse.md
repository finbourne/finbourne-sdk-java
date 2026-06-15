# com.finbourne.sdk.services.lusid.model.GetReferencePortfolioConstituentsResponse
classname GetReferencePortfolioConstituentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**weightType** | **String** | Available values: Static, Floating, Periodical. | [default to String]
**periodType** | **String** | Available values: Daily, Weekly, Monthly, Quarterly, Annually. | [optional] [default to String]
**periodCount** | **Integer** |  | [optional] [default to Integer]
**constituents** | [**List&lt;ReferencePortfolioConstituent&gt;**](ReferencePortfolioConstituent.md) | Set of constituents (instrument/weight pairings) | [default to List<ReferencePortfolioConstituent>]
**href** | [**URI**](URI.md) | The Uri that returns the same result as the original request,  but may include resolved as at time(s). | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetReferencePortfolioConstituentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveFrom = OffsetDateTime.now();
String weightType = "example weightType";
@javax.annotation.Nullable String periodType = "example periodType";
@javax.annotation.Nullable Integer periodCount = new Integer("100.00");
List<ReferencePortfolioConstituent> constituents = new List<ReferencePortfolioConstituent>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituentsResponseInstance = new GetReferencePortfolioConstituentsResponse()
    .effectiveFrom(effectiveFrom)
    .weightType(weightType)
    .periodType(periodType)
    .periodCount(periodCount)
    .constituents(constituents)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)