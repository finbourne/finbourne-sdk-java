# com.finbourne.sdk.services.lusid.model.ManagementFeeTotals
classname ManagementFeeTotals
The management fee totals over every partner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gross** | **java.math.BigDecimal** | The fee before offsets. | [default to java.math.BigDecimal]
**offset** | **java.math.BigDecimal** | The offset applied to the fee. | [default to java.math.BigDecimal]
**net** | **java.math.BigDecimal** | The fee after offsets. | [default to java.math.BigDecimal]
**carriedForward** | **java.math.BigDecimal** | Offset in excess of the fee, carried forward to the next period. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ManagementFeeTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal gross = new java.math.BigDecimal("100.00");
java.math.BigDecimal offset = new java.math.BigDecimal("100.00");
java.math.BigDecimal net = new java.math.BigDecimal("100.00");
java.math.BigDecimal carriedForward = new java.math.BigDecimal("100.00");


ManagementFeeTotals managementFeeTotalsInstance = new ManagementFeeTotals()
    .gross(gross)
    .offset(offset)
    .net(net)
    .carriedForward(carriedForward);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)