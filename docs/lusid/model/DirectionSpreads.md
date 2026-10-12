# com.finbourne.sdk.services.lusid.model.DirectionSpreads
classname DirectionSpreads
The tiers of spread for one direction of net cashflow and what their bounds measure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basis** | **String** | What the tier bounds measure: Amount, the size of the net cashflow in the fund currency, or PctOfNav, the net cashflow as a percentage of the previous valuation point&#39;s NAV. Available values: Amount, PctOfNav. | [default to String]
**tiers** | [**List&lt;SwingSpreadTier&gt;**](SwingSpreadTier.md) | The tiers, in ascending order. Each starts where the previous one ends, and only the last is unbounded above. The first tier&#39;s lower bound is the threshold: a flow at or below it does not swing. | [default to List<SwingSpreadTier>]

```java
import com.finbourne.sdk.services.lusid.model.DirectionSpreads;
import java.util.*;
import java.lang.System;
import java.net.URI;

String basis = "example basis";
List<SwingSpreadTier> tiers = new List<SwingSpreadTier>();


DirectionSpreads directionSpreadsInstance = new DirectionSpreads()
    .basis(basis)
    .tiers(tiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)