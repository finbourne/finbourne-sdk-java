# com.finbourne.sdk.services.lusid.model.TaxPortfolioSyncStatus
classname TaxPortfolioSyncStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**lastTransactionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the latest transaction was booked to the portfolio. Absent when the portfolio has no transactions. | [optional] [default to OffsetDateTime]
**lastTaxAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the tax engine last processed the Fund, taken from its latest valuation point. Absent when no valuation point has been run. | [optional] [default to OffsetDateTime]
**inSync** | **Boolean** | True when the tax position is no older than the latest booked transaction, or the portfolio has no transactions. | [default to Boolean]
**assetClass** | **String** | The asset class of the portfolio&#39;s holdings where the holding data carries one. Optional. | [optional] [default to String]
**countryOfDomicile** | **String** | The country of domicile of the portfolio&#39;s holdings where the holding data carries one. Optional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxPortfolioSyncStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime lastTransactionAsAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime lastTaxAsAt = OffsetDateTime.now();
Boolean inSync = true;
@javax.annotation.Nullable String assetClass = "example assetClass";
@javax.annotation.Nullable String countryOfDomicile = "example countryOfDomicile";


TaxPortfolioSyncStatus taxPortfolioSyncStatusInstance = new TaxPortfolioSyncStatus()
    .portfolioId(portfolioId)
    .lastTransactionAsAt(lastTransactionAsAt)
    .lastTaxAsAt(lastTaxAsAt)
    .inSync(inSync)
    .assetClass(assetClass)
    .countryOfDomicile(countryOfDomicile);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)