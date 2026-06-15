# com.finbourne.sdk.services.lusid.model.CompositeBreakdown
classname CompositeBreakdown
A list of Composite Breakdowns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the calculation. | [default to OffsetDateTime]
**composite** | [**PortfolioReturnBreakdown**](PortfolioReturnBreakdown.md) |  | [optional] [default to PortfolioReturnBreakdown]
**constituents** | [**List&lt;PortfolioReturnBreakdown&gt;**](PortfolioReturnBreakdown.md) | The constituents with their information which are part of the composite. | [optional] [default to List<PortfolioReturnBreakdown>]

```java
import com.finbourne.sdk.services.lusid.model.CompositeBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
PortfolioReturnBreakdown composite = new PortfolioReturnBreakdown();
@javax.annotation.Nullable List<PortfolioReturnBreakdown> constituents = new List<PortfolioReturnBreakdown>();


CompositeBreakdown compositeBreakdownInstance = new CompositeBreakdown()
    .effectiveAt(effectiveAt)
    .composite(composite)
    .constituents(constituents);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)