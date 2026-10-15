# com.finbourne.sdk.services.lusid.model.CollateralAgreementApplicability
classname CollateralAgreementApplicability
The portfolios a collateral agreement currently covers, according to its applicability filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**applicabilityFilter** | **String** | The applicability filter that was evaluated. Only its clauses on portfolio fields are applied to select the portfolios returned. | [default to String]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The portfolios matching the applicability filter, up to the requested limit. | [default to List<ResourceId>]
**hasMorePortfolios** | **Boolean** | Whether more portfolios match the filter than were returned. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAgreementApplicability;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String applicabilityFilter = "example applicabilityFilter";
List<ResourceId> portfolios = new List<ResourceId>();
Boolean hasMorePortfolios = true;


CollateralAgreementApplicability collateralAgreementApplicabilityInstance = new CollateralAgreementApplicability()
    .id(id)
    .applicabilityFilter(applicabilityFilter)
    .portfolios(portfolios)
    .hasMorePortfolios(hasMorePortfolios);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)