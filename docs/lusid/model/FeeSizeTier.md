# com.finbourne.sdk.services.lusid.model.FeeSizeTier
classname FeeSizeTier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**upperBound** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FeeSizeTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal lowerBound = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal upperBound = new java.math.BigDecimal("100.00");
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");


FeeSizeTier feeSizeTierInstance = new FeeSizeTier()
    .lowerBound(lowerBound)
    .upperBound(upperBound)
    .rate(rate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)