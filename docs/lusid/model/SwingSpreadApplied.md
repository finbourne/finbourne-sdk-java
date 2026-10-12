# com.finbourne.sdk.services.lusid.model.SwingSpreadApplied
classname SwingSpreadApplied
The stored spread applied to a share class's baseline price and the tier it came from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bps** | **java.math.BigDecimal** | The spread applied, in basis points. | [default to java.math.BigDecimal]
**tierMatched** | [**SwingSpreadTierBounds**](SwingSpreadTierBounds.md) |  | [default to SwingSpreadTierBounds]

```java
import com.finbourne.sdk.services.lusid.model.SwingSpreadApplied;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal bps = new java.math.BigDecimal("100.00");
SwingSpreadTierBounds tierMatched = new SwingSpreadTierBounds();


SwingSpreadApplied swingSpreadAppliedInstance = new SwingSpreadApplied()
    .bps(bps)
    .tierMatched(tierMatched);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)