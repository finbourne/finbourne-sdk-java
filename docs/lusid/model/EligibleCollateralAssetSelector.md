# com.finbourne.sdk.services.lusid.model.EligibleCollateralAssetSelector
classname EligibleCollateralAssetSelector
The assets an eligible collateral row applies to, as stored on a schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | What the selector matches. One of BaseCurrencyCash, Cash or Instrument. Available values: BaseCurrencyCash, Cash, Instrument. | [default to String]
**currency** | **String** | The currency of the cash. Required for a Cash selector and not allowed otherwise. | [optional] [default to String]
**instrumentFilter** | **String** | A filter selecting the instruments. Required for an Instrument selector and not allowed otherwise. Checked for structure only when the schedule is stored. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EligibleCollateralAssetSelector;
import java.util.*;
import java.lang.System;
import java.net.URI;

String kind = "example kind";
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String instrumentFilter = "example instrumentFilter";


EligibleCollateralAssetSelector eligibleCollateralAssetSelectorInstance = new EligibleCollateralAssetSelector()
    .kind(kind)
    .currency(currency)
    .instrumentFilter(instrumentFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)