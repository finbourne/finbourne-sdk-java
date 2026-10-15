# com.finbourne.sdk.services.lusid.model.MarginRounding
classname MarginRounding
The increment margin calls are rounded to, and the direction for deliveries and returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The increment margin calls are rounded to. Must be greater than zero. | [default to java.math.BigDecimal]
**deliveries** | **String** | How amounts we deliver are rounded. One of Up or Nearest. Available values: Up, Down, Nearest. | [default to String]
**returns** | **String** | How amounts we receive back are rounded. One of Down or Nearest. Available values: Up, Down, Nearest. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginRounding;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String deliveries = "example deliveries";
String returns = "example returns";


MarginRounding marginRoundingInstance = new MarginRounding()
    .amount(amount)
    .deliveries(deliveries)
    .returns(returns);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)