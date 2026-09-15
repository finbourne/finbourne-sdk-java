# com.finbourne.sdk.services.workflow.model.PortfolioHoldingDataQualityCheck
classname PortfolioHoldingDataQualityCheck
Configuration for a Worker that runs a portfolio holding Data quality check in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.PortfolioHoldingDataQualityCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


PortfolioHoldingDataQualityCheck portfolioHoldingDataQualityCheckInstance = new PortfolioHoldingDataQualityCheck()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)