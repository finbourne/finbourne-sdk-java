# com.finbourne.sdk.services.lusid.model.SwingSpreadTier
classname SwingSpreadTier
One tier of spread: the band of net cashflow it covers and the spread applied when the flow falls in it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBoundExclusive** | **java.math.BigDecimal** | The size of net cashflow, as a magnitude, above which the tier applies. Zero or more; zero on the first tier swings on any net flow. | [default to java.math.BigDecimal]
**upperBoundInclusive** | **java.math.BigDecimal** | The size of net cashflow, as a magnitude, up to and including which the tier applies. Omit it on the last tier, which covers every larger flow. | [optional] [default to java.math.BigDecimal]
**bps** | **java.math.BigDecimal** | The spread, in basis points of the baseline price, applied when the net cashflow falls in the tier. Zero or more. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SwingSpreadTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal lowerBoundExclusive = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal upperBoundInclusive = new java.math.BigDecimal("100.00");
java.math.BigDecimal bps = new java.math.BigDecimal("100.00");


SwingSpreadTier swingSpreadTierInstance = new SwingSpreadTier()
    .lowerBoundExclusive(lowerBoundExclusive)
    .upperBoundInclusive(upperBoundInclusive)
    .bps(bps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)