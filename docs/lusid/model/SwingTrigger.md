# com.finbourne.sdk.services.lusid.model.SwingTrigger
classname SwingTrigger
When a Market swing fires in one direction: the net cashflow measure and the size it must exceed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | What the threshold measures: NetCashflowAbsolute, the size of the net cashflow in the fund currency, or NetCashflowPctOfNav, the net cashflow as a percentage of the previous valuation point&#39;s NAV. A NetCashflowPctOfNav trigger does not fire when there is no previous NAV. Available values: NetCashflowAbsolute, NetCashflowPctOfNav. | [default to String]
**threshold** | **java.math.BigDecimal** | The size of net cashflow, as a magnitude, the flow must be above for the trigger to fire. Above zero. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SwingTrigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
java.math.BigDecimal threshold = new java.math.BigDecimal("100.00");


SwingTrigger swingTriggerInstance = new SwingTrigger()
    .type(type)
    .threshold(threshold);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)