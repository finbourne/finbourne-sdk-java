# com.finbourne.sdk.services.lusid.model.PortfolioReconciliationRequest
classname PortfolioReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | **String** | The effective date of the portfolio | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The AsAt date of the portfolio | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
String effectiveAt = "example effectiveAt";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


PortfolioReconciliationRequest portfolioReconciliationRequestInstance = new PortfolioReconciliationRequest()
    .portfolioId(portfolioId)
    .effectiveAt(effectiveAt)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)