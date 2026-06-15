# com.finbourne.sdk.services.lusid.model.PortfoliosReconciliationRequest
classname PortfoliosReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**PortfolioReconciliationRequest**](PortfolioReconciliationRequest.md) |  | [default to PortfolioReconciliationRequest]
**right** | [**PortfolioReconciliationRequest**](PortfolioReconciliationRequest.md) |  | [default to PortfolioReconciliationRequest]
**instrumentPropertyKeys** | **List&lt;String&gt;** | Instrument properties to be included with any identified breaks. These properties will be in the effective and AsAt dates of the left portfolio | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.PortfoliosReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

PortfolioReconciliationRequest left = new PortfolioReconciliationRequest();
PortfolioReconciliationRequest right = new PortfolioReconciliationRequest();
List<String> instrumentPropertyKeys = new List<String>();


PortfoliosReconciliationRequest portfoliosReconciliationRequestInstance = new PortfoliosReconciliationRequest()
    .left(left)
    .right(right)
    .instrumentPropertyKeys(instrumentPropertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)