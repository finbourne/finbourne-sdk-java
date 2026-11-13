# com.finbourne.sdk.services.lusid.model.TaxDeemedDisposalsResponse
classname TaxDeemedDisposalsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**disposals** | [**List&lt;TaxDeemedDisposalResponse&gt;**](TaxDeemedDisposalResponse.md) | The deemed disposals at the end of the period. | [optional] [default to List<TaxDeemedDisposalResponse>]
**vintages** | [**List&lt;TaxReturnVintage&gt;**](TaxReturnVintage.md) | The deemed-disposal vintages, one per period, that feed line D. | [optional] [default to List<TaxReturnVintage>]
**matrix** | [**List&lt;TaxReturnSpreadInstalment&gt;**](TaxReturnSpreadInstalment.md) | The seven-period spreading matrix for the vintages. | [optional] [default to List<TaxReturnSpreadInstalment>]

```java
import com.finbourne.sdk.services.lusid.model.TaxDeemedDisposalsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
TaxAccountingPeriod period = new TaxAccountingPeriod();
@javax.annotation.Nullable List<TaxDeemedDisposalResponse> disposals = new List<TaxDeemedDisposalResponse>();
@javax.annotation.Nullable List<TaxReturnVintage> vintages = new List<TaxReturnVintage>();
@javax.annotation.Nullable List<TaxReturnSpreadInstalment> matrix = new List<TaxReturnSpreadInstalment>();


TaxDeemedDisposalsResponse taxDeemedDisposalsResponseInstance = new TaxDeemedDisposalsResponse()
    .fundId(fundId)
    .period(period)
    .disposals(disposals)
    .vintages(vintages)
    .matrix(matrix);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)