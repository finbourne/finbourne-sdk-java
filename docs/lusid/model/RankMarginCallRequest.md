# com.finbourne.sdk.services.lusid.model.RankMarginCallRequest
classname RankMarginCallRequest
Ranks a margin call's collateral again against the holdings as they stand now, keeping the assets the user chose.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overrides** | [**List&lt;CollateralAllocationOverride&gt;**](CollateralAllocationOverride.md) | The assets and units the user chose, each validated against the agreement&#39;s constraints and kept with its reason when it fails one. Optional. | [optional] [default to List<CollateralAllocationOverride>]
**fillRemainder** | **Boolean** | Whether to fill what the overrides leave uncovered from the ranking, cheapest first. Defaults to true. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.RankMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<CollateralAllocationOverride> overrides = new List<CollateralAllocationOverride>();
@javax.annotation.Nullable Boolean fillRemainder = true;


RankMarginCallRequest rankMarginCallRequestInstance = new RankMarginCallRequest()
    .overrides(overrides)
    .fillRemainder(fillRemainder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)