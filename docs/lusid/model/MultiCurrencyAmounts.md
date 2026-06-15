# com.finbourne.sdk.services.lusid.model.MultiCurrencyAmounts
classname MultiCurrencyAmounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**baseAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MultiCurrencyAmounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal localAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal baseAmount = new java.math.BigDecimal("100.00");


MultiCurrencyAmounts multiCurrencyAmountsInstance = new MultiCurrencyAmounts()
    .localAmount(localAmount)
    .baseAmount(baseAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)