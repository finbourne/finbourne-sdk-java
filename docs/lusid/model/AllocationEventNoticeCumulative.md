# com.finbourne.sdk.services.lusid.model.AllocationEventNoticeCumulative
classname AllocationEventNoticeCumulative
Cumulative balances to date for a partner on a notice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contributions** | **java.math.BigDecimal** | Cumulative contributions after the event. | [default to java.math.BigDecimal]
**distributions** | **java.math.BigDecimal** | Cumulative distributions after the event. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | Cumulative recallable distributions after the event. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticeCumulative;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal contributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal distributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal recallable = new java.math.BigDecimal("100.00");


AllocationEventNoticeCumulative allocationEventNoticeCumulativeInstance = new AllocationEventNoticeCumulative()
    .contributions(contributions)
    .distributions(distributions)
    .recallable(recallable);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)