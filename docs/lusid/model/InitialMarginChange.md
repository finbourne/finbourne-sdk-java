# com.finbourne.sdk.services.lusid.model.InitialMarginChange
classname InitialMarginChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePostBefore** | **java.math.BigDecimal** | What we must post to the set today, after the threshold. | [default to java.math.BigDecimal]
**wePostAfter** | **java.math.BigDecimal** | What we would post to the set after the move, after the threshold. | [default to java.math.BigDecimal]
**theyPostBefore** | **java.math.BigDecimal** | What the counterparty must post today. Null where the run does not know it, as under SIMM without their sensitivities. | [optional] [default to java.math.BigDecimal]
**theyPostAfter** | **java.math.BigDecimal** | What the counterparty would post after the move. Null where the run does not know it. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.InitialMarginChange;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal wePostBefore = new java.math.BigDecimal("100.00");
java.math.BigDecimal wePostAfter = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal theyPostBefore = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal theyPostAfter = new java.math.BigDecimal("100.00");


InitialMarginChange initialMarginChangeInstance = new InitialMarginChange()
    .wePostBefore(wePostBefore)
    .wePostAfter(wePostAfter)
    .theyPostBefore(theyPostBefore)
    .theyPostAfter(theyPostAfter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)