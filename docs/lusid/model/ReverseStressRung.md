# com.finbourne.sdk.services.lusid.model.ReverseStressRung
classname ReverseStressRung
One evaluated factor and what the portfolio was worth under it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scale** | **java.math.BigDecimal** | The factor the scenario&#39;s shifts were multiplied by. | [optional] [default to java.math.BigDecimal]
**value** | **java.math.BigDecimal** | The value of the measure under the scaled scenario. | [optional] [default to java.math.BigDecimal]
**pnl** | **java.math.BigDecimal** | The change from the unstressed value. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ReverseStressRung;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal scale = new java.math.BigDecimal("100.00");
java.math.BigDecimal value = new java.math.BigDecimal("100.00");
java.math.BigDecimal pnl = new java.math.BigDecimal("100.00");


ReverseStressRung reverseStressRungInstance = new ReverseStressRung()
    .scale(scale)
    .value(value)
    .pnl(pnl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)