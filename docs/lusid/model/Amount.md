# com.finbourne.sdk.services.lusid.model.Amount
classname Amount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.Amount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");


Amount amountInstance = new Amount()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)