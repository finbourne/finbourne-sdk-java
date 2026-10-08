# com.finbourne.sdk.services.lusid.model.DecoratedComplianceRunSummaryRequest
classname DecoratedComplianceRunSummaryRequest
Specification for retrieving a decorated compliance run summary, optionally restricted to a  set of portfolios and/or portfolio groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) |  | [optional] [default to List<PortfolioEntityId>]
**propertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.DecoratedComplianceRunSummaryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
@javax.annotation.Nullable List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
@javax.annotation.Nullable List<String> propertyKeys = new List<String>();


DecoratedComplianceRunSummaryRequest decoratedComplianceRunSummaryRequestInstance = new DecoratedComplianceRunSummaryRequest()
    .runId(runId)
    .portfolioEntityIds(portfolioEntityIds)
    .propertyKeys(propertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)