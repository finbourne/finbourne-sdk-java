# com.finbourne.sdk.services.lusid.model.FeeRateTier
classname FeeRateTier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**threshold** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FeeRateTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal threshold = new java.math.BigDecimal("100.00");


FeeRateTier feeRateTierInstance = new FeeRateTier()
    .rate(rate)
    .threshold(threshold);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)