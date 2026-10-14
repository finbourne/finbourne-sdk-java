# com.finbourne.sdk.services.lusid.model.CarryParameters
classname CarryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carryRate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**preferredReturnRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**catchUpRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**waterfallType** | **String** | Available values: WholeOfFund, DealByDeal. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CarryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal carryRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal preferredReturnRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal catchUpRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String waterfallType = "example waterfallType";


CarryParameters carryParametersInstance = new CarryParameters()
    .carryRate(carryRate)
    .preferredReturnRate(preferredReturnRate)
    .catchUpRate(catchUpRate)
    .waterfallType(waterfallType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)