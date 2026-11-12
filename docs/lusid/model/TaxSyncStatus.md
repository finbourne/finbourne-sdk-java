# com.finbourne.sdk.services.lusid.model.TaxSyncStatus
classname TaxSyncStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolios** | [**List&lt;TaxPortfolioSyncStatus&gt;**](TaxPortfolioSyncStatus.md) | The sync position of each portfolio in the Fund. | [default to List<TaxPortfolioSyncStatus>]

```java
import com.finbourne.sdk.services.lusid.model.TaxSyncStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TaxPortfolioSyncStatus> portfolios = new List<TaxPortfolioSyncStatus>();


TaxSyncStatus taxSyncStatusInstance = new TaxSyncStatus()
    .portfolios(portfolios);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)