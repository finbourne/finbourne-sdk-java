# com.finbourne.sdk.services.lusid.model.FundTaxScope
classname FundTaxScope
The UK chargeable-gains tax scope of a fund at a point in time: the portfolios inside the regime and what the  regime's figures leave out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The portfolios within the UK chargeable-gains regime. A fund portfolio is in scope when its own details elect the regime. A NAV type that elects the regime puts its derived portfolio for each fund portfolio in scope. | [default to List<ResourceId>]
**exclusions** | [**FundTaxScopeExclusions**](FundTaxScopeExclusions.md) |  | [default to FundTaxScopeExclusions]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the tax scope was read. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the tax scope was read. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FundTaxScope;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
List<ResourceId> portfolios = new List<ResourceId>();
FundTaxScopeExclusions exclusions = new FundTaxScopeExclusions();
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FundTaxScope fundTaxScopeInstance = new FundTaxScope()
    .href(href)
    .portfolios(portfolios)
    .exclusions(exclusions)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)