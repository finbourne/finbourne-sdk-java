# com.finbourne.sdk.services.lusid.model.FundAmount
classname FundAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** | The value of the amount in the fund currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FundAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");


FundAmount fundAmountInstance = new FundAmount()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)