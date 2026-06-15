# com.finbourne.sdk.services.lusid.model.ShareClassAmount
classname ShareClassAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCurrencyAmount** | **java.math.BigDecimal** | The value of the amount in the fund currency. | [optional] [default to java.math.BigDecimal]
**shareClassCurrencyAmount** | **java.math.BigDecimal** | The value of the amount in the share class currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal fundCurrencyAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal shareClassCurrencyAmount = new java.math.BigDecimal("100.00");


ShareClassAmount shareClassAmountInstance = new ShareClassAmount()
    .fundCurrencyAmount(fundCurrencyAmount)
    .shareClassCurrencyAmount(shareClassCurrencyAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)