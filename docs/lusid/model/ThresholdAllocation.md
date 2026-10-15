# com.finbourne.sdk.services.lusid.model.ThresholdAllocation
classname ThresholdAllocation
How a threshold is split between the two parties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**we** | **java.math.BigDecimal** | Our share of the threshold. | [default to java.math.BigDecimal]
**they** | **java.math.BigDecimal** | The counterparty&#39;s share of the threshold. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ThresholdAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal we = new java.math.BigDecimal("100.00");
java.math.BigDecimal they = new java.math.BigDecimal("100.00");


ThresholdAllocation thresholdAllocationInstance = new ThresholdAllocation()
    .we(we)
    .they(they);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)