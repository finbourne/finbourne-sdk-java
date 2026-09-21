# com.finbourne.sdk.services.lusid.model.FractionalUnitsTrueUpConfiguration
classname FractionalUnitsTrueUpConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fractionalUnitsHandling** | **String** | The fractional-units handling scheme for the portfolio&#39;s corporate-action processing. This can be: LotLevelRounding or CustodianLevelTrueUp. Defaults to LotLevelRounding, today&#39;s per-lot-only processing, if not specified. Available values: LotLevelRounding, CustodianLevelTrueUp. | [optional] [default to String]
**nominatedSubHoldingKey** | **String** | The sub-holding key (from the &#39;Transaction&#39; domain) that custodian-level fractional-units true-ups are booked to. The key must be one of the portfolio&#39;s sub-holding keys, must have a pre-defined property definition, and event processing never creates it. | [optional] [default to String]
**nominatedSubHoldingKeyValue** | **String** | The value of the nominated sub-holding key under which the true-up holding is booked, for example the bucket that quarantines fractional rounding true-ups. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FractionalUnitsTrueUpConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String fractionalUnitsHandling = "example fractionalUnitsHandling";
@javax.annotation.Nullable String nominatedSubHoldingKey = "example nominatedSubHoldingKey";
@javax.annotation.Nullable String nominatedSubHoldingKeyValue = "example nominatedSubHoldingKeyValue";


FractionalUnitsTrueUpConfiguration fractionalUnitsTrueUpConfigurationInstance = new FractionalUnitsTrueUpConfiguration()
    .fractionalUnitsHandling(fractionalUnitsHandling)
    .nominatedSubHoldingKey(nominatedSubHoldingKey)
    .nominatedSubHoldingKeyValue(nominatedSubHoldingKeyValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)