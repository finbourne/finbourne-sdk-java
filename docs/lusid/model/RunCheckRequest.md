# com.finbourne.sdk.services.lusid.model.RunCheckRequest
classname RunCheckRequest
Exactly one dataset must be provided, matching the check definition's datasetSchema.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidEntityDataset** | [**LusidEntityDataset**](LusidEntityDataset.md) |  | [optional] [default to LusidEntityDataset]
**limitIndividualBreachesPerRule** | **Integer** | The maximum number of individual breaches to return per rule. Defaults to 100 if not specified. | [optional] [default to Integer]
**portfolioHoldingDataset** | [**PortfolioHoldingDataset**](PortfolioHoldingDataset.md) |  | [optional] [default to PortfolioHoldingDataset]
**portfolioTransactionDataset** | [**PortfolioTransactionDataset**](PortfolioTransactionDataset.md) |  | [optional] [default to PortfolioTransactionDataset]
**structuredResultDataset** | [**StructuredResultDataset**](StructuredResultDataset.md) |  | [optional] [default to StructuredResultDataset]

```java
import com.finbourne.sdk.services.lusid.model.RunCheckRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidEntityDataset lusidEntityDataset = new LusidEntityDataset();
Integer limitIndividualBreachesPerRule = new Integer("100.00");
PortfolioHoldingDataset portfolioHoldingDataset = new PortfolioHoldingDataset();
PortfolioTransactionDataset portfolioTransactionDataset = new PortfolioTransactionDataset();
StructuredResultDataset structuredResultDataset = new StructuredResultDataset();


RunCheckRequest runCheckRequestInstance = new RunCheckRequest()
    .lusidEntityDataset(lusidEntityDataset)
    .limitIndividualBreachesPerRule(limitIndividualBreachesPerRule)
    .portfolioHoldingDataset(portfolioHoldingDataset)
    .portfolioTransactionDataset(portfolioTransactionDataset)
    .structuredResultDataset(structuredResultDataset);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)