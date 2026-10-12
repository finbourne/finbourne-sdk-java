# com.finbourne.sdk.services.lusid.model.SwingPolicy
classname SwingPolicy
The baseline a Single fund's dealing price starts from, the spreads it swings by and, for a Market swing, the  triggers that say when it swings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseline** | [**SwingBaseline**](SwingBaseline.md) |  | [default to SwingBaseline]
**defaultSpreadSource** | **String** | Where the swing comes from. Stored swings by the tiers in spreads. Market swings to the bid or offer, including notional dealing costs, that the valuation recipe of each active NAV type publishes, when the net cashflow passes inflowTrigger or outflowTrigger. Omit it for a fund that never swings and always deals at its baseline. Available values: Stored, Market. | [optional] [default to String]
**spreads** | [**SwingSpreads**](SwingSpreads.md) |  | [optional] [default to SwingSpreads]
**inflowTrigger** | [**SwingTrigger**](SwingTrigger.md) |  | [optional] [default to SwingTrigger]
**outflowTrigger** | [**SwingTrigger**](SwingTrigger.md) |  | [optional] [default to SwingTrigger]

```java
import com.finbourne.sdk.services.lusid.model.SwingPolicy;
import java.util.*;
import java.lang.System;
import java.net.URI;

SwingBaseline baseline = new SwingBaseline();
@javax.annotation.Nullable String defaultSpreadSource = "example defaultSpreadSource";
SwingSpreads spreads = new SwingSpreads();
SwingTrigger inflowTrigger = new SwingTrigger();
SwingTrigger outflowTrigger = new SwingTrigger();


SwingPolicy swingPolicyInstance = new SwingPolicy()
    .baseline(baseline)
    .defaultSpreadSource(defaultSpreadSource)
    .spreads(spreads)
    .inflowTrigger(inflowTrigger)
    .outflowTrigger(outflowTrigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)