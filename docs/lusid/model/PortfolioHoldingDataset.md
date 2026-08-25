# com.finbourne.sdk.services.lusid.model.PortfolioHoldingDataset
classname PortfolioHoldingDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"PortfolioContents\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | The scope of the portfolios whose holdings to check. Nullable. Every scope is checked if not provided. | [optional] [default to String]
**portfolioSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the portfolios whose holdings are checked. | [optional] [default to String]
**portfolioSelectorValue** | **String** | The value of the above attribute used to narrow down the portfolios. | [optional] [default to String]
**holdingSelectorAttribute** | **String** | An attribute (field name, propertyKey or sub-holding key) to use to narrow down the holdings checked  within those portfolios. | [optional] [default to String]
**holdingSelectorValue** | **String** | The value of the above attribute used to narrow down the holdings. | [optional] [default to String]
**byTaxlots** | **Boolean** | Whether to expand holdings to their underlying tax lots. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioHoldingDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String portfolioScope = "example portfolioScope";
@javax.annotation.Nullable String portfolioSelectorAttribute = "example portfolioSelectorAttribute";
@javax.annotation.Nullable String portfolioSelectorValue = "example portfolioSelectorValue";
@javax.annotation.Nullable String holdingSelectorAttribute = "example holdingSelectorAttribute";
@javax.annotation.Nullable String holdingSelectorValue = "example holdingSelectorValue";
Boolean byTaxlots = true;


PortfolioHoldingDataset portfolioHoldingDatasetInstance = new PortfolioHoldingDataset()
    .asAt(asAt)
    .effectiveAt(effectiveAt)
    .portfolioScope(portfolioScope)
    .portfolioSelectorAttribute(portfolioSelectorAttribute)
    .portfolioSelectorValue(portfolioSelectorValue)
    .holdingSelectorAttribute(holdingSelectorAttribute)
    .holdingSelectorValue(holdingSelectorValue)
    .byTaxlots(byTaxlots);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)