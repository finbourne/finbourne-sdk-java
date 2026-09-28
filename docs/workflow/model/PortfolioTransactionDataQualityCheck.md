# com.finbourne.sdk.services.workflow.model.PortfolioTransactionDataQualityCheck
classname PortfolioTransactionDataQualityCheck
Configuration for a Worker that runs a portfolio transaction Data quality check in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.PortfolioTransactionDataQualityCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


PortfolioTransactionDataQualityCheck portfolioTransactionDataQualityCheckInstance = new PortfolioTransactionDataQualityCheck()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)