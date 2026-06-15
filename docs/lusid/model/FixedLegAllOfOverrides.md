# com.finbourne.sdk.services.lusid.model.FixedLegAllOfOverrides
classname FixedLegAllOfOverrides
Any overriding data for notionals, spreads or rates that would affect generation of a leg.  This supports the case where an amortisation schedule is given but otherwise generation is allowed as usual.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amortization** | **List&lt;java.math.BigDecimal&gt;** |  | [optional] [default to List<java.math.BigDecimal>]
**spreads** | **List&lt;java.math.BigDecimal&gt;** |  | [optional] [default to List<java.math.BigDecimal>]

```java
import com.finbourne.sdk.services.lusid.model.FixedLegAllOfOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<java.math.BigDecimal> amortization = new List<java.math.BigDecimal>();
List<java.math.BigDecimal> spreads = new List<java.math.BigDecimal>();


FixedLegAllOfOverrides fixedLegAllOfOverridesInstance = new FixedLegAllOfOverrides()
    .amortization(amortization)
    .spreads(spreads);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)