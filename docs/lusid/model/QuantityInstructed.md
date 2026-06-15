# com.finbourne.sdk.services.lusid.model.QuantityInstructed
classname QuantityInstructed
The quantity of the event that was instructed, represented either as a percentage of the overall holdings or the number of units instructed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of quantity instructed. Available values: Percentage, Units, Invalid. | [default to String]
**amount** | **java.math.BigDecimal** | The actual amount instructed. For Type Percentage, this is between 0 and 100. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.QuantityInstructed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


QuantityInstructed quantityInstructedInstance = new QuantityInstructed()
    .type(type)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)