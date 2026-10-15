# com.finbourne.sdk.services.lusid.model.EligibleCollateralAssetSelectorRequest
classname EligibleCollateralAssetSelectorRequest
The assets an eligible collateral row applies to, as supplied when a schedule is created or upserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | What the selector matches. One of BaseCurrencyCash, Cash or Instrument. Available values: BaseCurrencyCash, Cash, Instrument. | [default to String]
**currency** | **String** | The currency of the cash. Required for a Cash selector and not allowed otherwise. | [optional] [default to String]
**instrumentFilter** | **String** | A filter selecting the instruments. Required for an Instrument selector and not allowed otherwise. Checked for structure only when the schedule is stored. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EligibleCollateralAssetSelectorRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String kind = "example kind";
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String instrumentFilter = "example instrumentFilter";


EligibleCollateralAssetSelectorRequest eligibleCollateralAssetSelectorRequestInstance = new EligibleCollateralAssetSelectorRequest()
    .kind(kind)
    .currency(currency)
    .instrumentFilter(instrumentFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)