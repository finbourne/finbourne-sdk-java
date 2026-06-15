# com.finbourne.sdk.services.lusid.model.PortfolioWeight
classname PortfolioWeight
Represents a portfolio and its target allocation weight.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**weight** | **java.math.BigDecimal** | The relative weight of the Portfolio compared to the other Portfolios specified, used to determine the allocation split between Portfolios when there are no Orders within the Block to allocate to. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioWeight;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");


PortfolioWeight portfolioWeightInstance = new PortfolioWeight()
    .portfolioId(portfolioId)
    .weight(weight);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)