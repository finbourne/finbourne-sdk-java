# com.finbourne.sdk.services.lusid.model.VersionedResourceListWithWarningsOfPortfolioHolding
classname VersionedResourceListWithWarningsOfPortfolioHolding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;PortfolioHolding&gt;**](PortfolioHolding.md) | The resources to list. | [default to List<PortfolioHolding>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**nextPage** | **String** | The next page of results. | [optional] [default to String]
**previousPage** | **String** | The previous page of results. | [optional] [default to String]
**warnings** | [**List&lt;Warning&gt;**](Warning.md) |  | [optional] [default to List<Warning>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VersionedResourceListWithWarningsOfPortfolioHolding;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
List<PortfolioHolding> values = new List<PortfolioHolding>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Warning> warnings = new List<Warning>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


VersionedResourceListWithWarningsOfPortfolioHolding versionedResourceListWithWarningsOfPortfolioHoldingInstance = new VersionedResourceListWithWarningsOfPortfolioHolding()
    .version(version)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .warnings(warnings)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)