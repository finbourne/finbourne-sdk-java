# com.finbourne.sdk.services.lusid.model.SwingSpreadTierBounds
classname SwingSpreadTierBounds
The bounds of the spread tier a net cashflow fell in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBoundExclusive** | **java.math.BigDecimal** | The tier&#39;s lower bound, which the net cashflow was above. | [default to java.math.BigDecimal]
**upperBoundInclusive** | **java.math.BigDecimal** | The tier&#39;s upper bound, which the net cashflow was at or below. Absent for the unbounded last tier. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SwingSpreadTierBounds;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal lowerBoundExclusive = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal upperBoundInclusive = new java.math.BigDecimal("100.00");


SwingSpreadTierBounds swingSpreadTierBoundsInstance = new SwingSpreadTierBounds()
    .lowerBoundExclusive(lowerBoundExclusive)
    .upperBoundInclusive(upperBoundInclusive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)