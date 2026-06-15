# com.finbourne.sdk.services.lusid.model.LevelStep
classname LevelStep
Item which is stepped in level/quantity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the level should apply. | [default to OffsetDateTime]
**quantity** | **java.math.BigDecimal** | The quantity which is applied. This might be an absolute, percentage, fractional or other value. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.LevelStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");


LevelStep levelStepInstance = new LevelStep()
    .date(date)
    .quantity(quantity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)